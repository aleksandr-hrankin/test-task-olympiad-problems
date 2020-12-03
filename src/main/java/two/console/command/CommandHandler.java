package two.console.command;

public interface CommandHandler {
    String getCommandName();

    String getCommandDescription();

    void executeCommand(String value);
}
