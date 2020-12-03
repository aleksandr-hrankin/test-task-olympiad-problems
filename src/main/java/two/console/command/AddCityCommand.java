package two.console.command;

import two.graph.Graph;

public class AddCityCommand implements CommandHandler {
    private static final String COMMAND_NAME = "ac";
    private static final String COMMAND_DESCRIPTION = "Add city. Template: [ac Kyiv]";

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
        Graph.getInstance().addCity(value);
        showSuccessMessage(value);
    }

    private void showSuccessMessage(String value) {
        System.out.println();
        System.out.println(value + " was successfully added");
    }
}
