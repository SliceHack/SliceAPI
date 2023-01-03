package com.sliceclient.api.module;

import com.sliceclient.api.module.data.Category;
import com.sliceclient.api.module.data.ModuleInfo;
import com.sliceclient.api.exceptions.ModuleInfoNotFoundException;
import lombok.Getter;
import net.minecraft.client.Minecraft;

/**
 * This is the base for scripted Modules.
 *
 * @author Nick
 * @since 1/2/2023
 */
@Getter
@SuppressWarnings("unused")
public class Module {

    /* Module fields */
    protected Minecraft mc = Minecraft.getMinecraft();

    /** the info of the module */
    private final ModuleInfo info = getClass().getAnnotation(ModuleInfo.class);

    /** the name and description of the module */
    private final String name, description;

    /** the category of the module */
    private final Category category;

    public Module() {
        try {
            if (info == null) {
                throw new ModuleInfoNotFoundException("Module " + getClass().getSimpleName() + " is missing the ModuleInfo annotation.");
            }

            name = info.name();
            description = info.description();
            category = info.category();
        } catch (ModuleInfoNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void onEnable() {}
    public void onDisable() {}
}