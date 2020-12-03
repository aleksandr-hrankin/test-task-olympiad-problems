package two.console.inject;

import java.util.HashMap;
import java.util.Map;
import two.console.command.AddCityCommand;
import two.console.command.AddNeighbor;
import two.console.command.CommandHandler;
import two.console.command.FindShortPathsCommand;
import two.console.command.HelpCommand;
import two.console.command.ListCitiesCommand;
import two.console.command.QuitCommand;

public class InjectorCommand {
    private static InjectorCommand instance;
    private Map<String, CommandHandler> commands = new HashMap<>();

    public InjectorCommand() {
        initCommands();
    }

    public static synchronized InjectorCommand getInstance() {
        if (instance == null) {
            instance = new InjectorCommand();
        }
        return instance;
    }

    private void initCommands() {
        CommandHandler help = new HelpCommand();
        CommandHandler quit = new QuitCommand();
        CommandHandler addCity = new AddCityCommand();
        CommandHandler listCities = new ListCitiesCommand();
        CommandHandler addNeighbor = new AddNeighbor();
        CommandHandler findShortPathCommand = new FindShortPathsCommand();

        commands.put(help.getCommandName(), help);
        commands.put(quit.getCommandName(), quit);
        commands.put(addCity.getCommandName(), addCity);
        commands.put(listCities.getCommandName(), listCities);
        commands.put(addNeighbor.getCommandName(), addNeighbor);
        commands.put(findShortPathCommand.getCommandName(), findShortPathCommand);
    }

    public Map<String, CommandHandler> getCommands() {
        return commands;
    }
}
