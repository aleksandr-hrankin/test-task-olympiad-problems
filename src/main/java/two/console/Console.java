package two.console;

import java.util.Map;
import java.util.Scanner;
import two.console.command.CommandHandler;
import two.console.inject.InjectorCommand;

public class Console {
    private static final String CURSOR_NAME = "Enter command or [h]: ";
    private static final String UNKNOWN_COMMAND_MESSAGE
            = "Unknown command. [h] - help; [q] - close application";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Map<String, CommandHandler> COMMANDS
            = InjectorCommand.getInstance().getCommands();

    public void run() {
        while (true) {
            showCursor();
            executeCommand(SCANNER.nextLine());
        }
    }

    private void showCursor() {
        System.out.println();
        System.out.print(CURSOR_NAME);
    }

    private void executeCommand(String line) {
        try {
            COMMANDS.get(getCommandFromLine(line)).executeCommand(getValueFromLine(line));
        } catch (Exception e) {
            showMessageWrongCommand();
        }
    }

    private void showMessageWrongCommand() {
        System.out.println();
        System.out.println(UNKNOWN_COMMAND_MESSAGE);
    }

    private String getCommandFromLine(String line) {
        return line.split(" ")[0].trim().toLowerCase();
    }

    private String getValueFromLine(String command) {
        return command.replace(getCommandFromLine(command), "").trim();
    }
}
