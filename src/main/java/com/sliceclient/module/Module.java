package com.sliceclient.module;

import com.sliceclient.exceptions.ModuleInfoNotFoundException;
import com.sliceclient.module.data.Category;
import com.sliceclient.module.data.ModuleInfo;
import lombok.Getter;

/**
 * This is the base for scripted Modules.
 *
 * @author Nick
 * @since 1/2/2023
 */
@Getter
@SuppressWarnings("unused")
public class Module {

    /** the info of the module */
    private final ModuleInfo info = getClass().getAnnotation(ModuleInfo.class);

    private final String name, description;
    private final Category category;

    public Module() throws ModuleInfoNotFoundException {
        if (info == null) throw new ModuleInfoNotFoundException("Module " + getClass().getSimpleName() + " is missing the ModuleInfo annotation.");

        name = info.name();
        description = info.description();
        category = info.category();
    }

    public void onEnable() {}
    public void onDisable() {}
}