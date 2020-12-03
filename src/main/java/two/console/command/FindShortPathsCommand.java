package two.console.command;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import two.graph.FinderPaths;
import two.graph.Graph;

public class FindShortPathsCommand implements CommandHandler {
    private static final String COMMAND_NAME = "f";
    private static final String COMMAND_DESCRIPTION
            = "Find the shortest paths. Template: [f Kyiv/Lvov]";

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
            int numberOfPaths = getNumberOfPaths(value);

            FinderPaths finderPaths = new FinderPaths(Graph.getInstance());

            Map<List<String>,Double> allPaths = finderPaths.getAllPaths(startCity, endCity);
            List<Map.Entry<List<String>, Double>> shortestPaths
                    = returnShortestPaths(allPaths, numberOfPaths);
            showShortestPaths(shortestPaths);
        } catch (Exception e) {
            showErrorMessage(value);
        }
    }

    private void showShortestPaths(List<Map.Entry<List<String>, Double>> paths) {
        paths.forEach(System.out::println);
    }

    private List<Map.Entry<List<String>, Double>> returnShortestPaths(
            Map<List<String>,Double> paths, int quantity) {
        return paths.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(quantity)
                .collect(Collectors.toList());
    }

    private String getStartCity(String value) {
        return value.split("/")[0].trim();
    }

    private String getEndCity(String value) {
        return value.split("/")[1].split(" ")[0].trim();
    }

    private int getNumberOfPaths(String value) {
        return Integer.parseInt(value.split("/")[1].split(" ")[1].trim());
    }

    private void showErrorMessage(String value) {
        System.out.println();
        System.out.println("[" + value + "] wrong command.");
        System.out.println("Select cities from the list by city [lc]. "
                + "Template: [f Kyiv/Lvov 5], 5 - number of short paths");
    }
}
