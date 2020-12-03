package two.console.command;

import java.util.ArrayList;
import two.graph.Graph;

public class ListCitiesCommand implements CommandHandler {
    private static final String COMMAND_NAME = "lc";
    private static final String COMMAND_DESCRIPTION = "list of cities";

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
        ArrayList<String> cities = new ArrayList<>(Graph.getInstance().getGraph().keySet());
        if (cities.size() == 0) {
            System.out.println();
            System.out.println("List cities is empty");
        } else {
            cities.forEach(System.out::println);
        }
    }
}
