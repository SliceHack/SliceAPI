package com.sliceclient.exceptions;

import com.sliceclient.module.data.ModuleInfo;

/**
 * Thrown when a module is missing the {@link ModuleInfo} annotation.
 *
 * @author Nick
 * @since 1/2/23
 */
public class ModuleInfoNotFoundException extends Exception {

    /**
     * Constructs a new ModuleInfoNotFoundException with the specified detail message.
     *
     * @param message the detail message
     */
    public ModuleInfoNotFoundException(String message) {
        super(message);
    }

}
