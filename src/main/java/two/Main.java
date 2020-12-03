package two;

import two.console.Console;
import two.console.inject.InjectCities;

/**
    You are given a list of cities. Each direct connection between
    two cities has its transportation cost (an integer bigger than 0).
    The goal is to find the paths of minimum cost between pairs of
    cities. Assume that the cost of each path (which is the sum of costs
    of all direct connections belonging to this path) is at most 200000.
    The name of a city is a string containing characters a,...,z and is
    at most 10 characters long.2)
 */

public class Main {
    public static void main(String[] args) {
        new InjectCities().inject();
        new Console().run();
    }
}
