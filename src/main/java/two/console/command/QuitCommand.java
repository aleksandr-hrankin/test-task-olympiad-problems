package two.console.command;

public class QuitCommand implements CommandHandler {
    private static final String COMMAND_NAME = "q";
    private static final String COMMAND_DESCRIPTION = "quit";

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
        System.exit(0);
    }
}
