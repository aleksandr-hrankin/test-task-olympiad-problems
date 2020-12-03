package two.console.command;

import java.util.Map;
import two.console.inject.InjectorCommand;

public class HelpCommand implements CommandHandler {
    private static final String COMMAND_NAME = "h";
    private static final String COMMAND_DESCRIPTION = "help";

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public String getCommandDescription() {
        return COMMAND_DESCRIPTION;
    }

    @Override
    public void executeCommand(String value) {
        System.out.println();
        Map<String, CommandHandler> commands = InjectorCommand.getInstance().getCommands();
        commands.forEach((key, command)
                -> System.out.println("[" + key + "] - " + command.getCommandDescription()));
    }
}
