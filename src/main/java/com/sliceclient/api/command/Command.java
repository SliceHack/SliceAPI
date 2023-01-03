package com.sliceclient.api.command;

import com.sliceclient.api.command.data.CommandInfo;
import com.sliceclient.api.exceptions.CommandInfoNotFoundException;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a command.
 *
 * @author Nick
 * @since 1/3/23
 */
@Getter @Setter
public abstract class Command {

    private CommandInfo info = getClass().getAnnotation(CommandInfo.class);

    private String name, description;
    private String[] aliases;

    /**
     * Constructs a new Command.
     */
    public Command() {
        try {
            if (info == null) {
                throw new CommandInfoNotFoundException("Command class must have @CommandInfo annotation");
            }

            this.name = info.name();
            this.description = info.description();
            this.aliases = info.aliases();
        } catch (CommandInfoNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Sends a message to the chat.
     *
     * @param message the message to send
     * */
    public void addMessage(String message){}

    /**
     * Adds an alias to the command.
     *
     * @param alias the alias to add
     * */
    public void addAlias(String alias) {}

    /**
     * Handles the command.
     *
     * @param name the name of the command
     * @param args the arguments of the command
     * @return true if the command was handled successfully
     * */
    public abstract boolean handle(String name, String[] args);

}
