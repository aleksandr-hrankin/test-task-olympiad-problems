package two.console.command;

import two.graph.Graph;

public class AddNeighbor implements CommandHandler {
    private static final String COMMAND_NAME = "an";
    private static final String COMMAND_DESCRIPTION = "Add neighbor. Template: [an Kyiv/Lvov 10]";

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
        try {
            String startCity = getStartCity(value);
            String endCity = getEndCity(value);
            double distance = getDistance(value);
            addCityToGraph(startCity, endCity, distance);
            showSuccessMessage(startCity, endCity, distance);
        } catch (Exception e) {
            showErrorMessage(value);
        }
    }

    private void addCityToGraph(String startCity, String endCity, double distance) {
        Graph.getInstance().addPath(startCity, endCity, distance);
        Graph.getInstance().addPath(endCity, startCity, distance);
    }

    private void showSuccessMessage(String startCity, String endCity, double distance) {
        System.out.println();
        System.out.println(startCity + " -- " + distance + " --> " + endCity
                + " was successfully added");
        System.out.println(startCity + " <-- " + distance + " -- " + endCity
                + " was successfully added");
    }

    private void showErrorMessage(String value) {
        System.out.println();
        System.out.println("[" + value + "] wrong command.");
        System.out.println("Select cities from the list by city [lc]. Template: [an Kyiv/Lvov 10]");
    }

    private String getStartCity(String value) {
        return value.split("/")[0].trim();
    }

    private String getEndCity(String value) {
        return value.split("/")[1].split(" ")[0].trim();
    }

    private double getDistance(String value) {
        return Double.parseDouble(value.split("/")[1].split(" ")[1].trim());
    }

}
