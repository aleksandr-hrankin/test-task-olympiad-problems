package two.console.inject;

import two.graph.Graph;

public class InjectCities {
    public void inject() {
        Graph graph = Graph.getInstance();

        graph.addCity("Lvov");
        graph.addCity("Kyiv");
        graph.addCity("Kharkiv");
        graph.addCity("Uzhgorod");
        graph.addCity("Dnepr");
        graph.addCity("Luhansk");
        graph.addCity("Ternopil");
        graph.addCity("Kherson");
        graph.addCity("Donetsk");
        graph.addCity("Odessa");

        graph.addPath("Lvov", "Kyiv", 534);
        graph.addPath("Lvov", "Uzhgorod", 277.5);

        graph.addPath("Kyiv", "Lvov", 534);
        graph.addPath("Kyiv", "Dnepr", 476.6);
        graph.addPath("Kyiv", "Kharkiv", 468);

        graph.addPath("Kharkiv", "Kyiv", 468);
        graph.addPath("Kharkiv", "Luhansk", 321.9);

        graph.addPath("Uzhgorod", "Lvov", 277.5);
        graph.addPath("Uzhgorod", "Dnepr", 1281.4);
        graph.addPath("Uzhgorod", "Ternopil", 394);

        graph.addPath("Dnepr", "Kyiv", 476.6);
        graph.addPath("Dnepr", "Uzhgorod", 1281.4);
        graph.addPath("Dnepr", "Luhansk", 455.5);
        graph.addPath("Dnepr", "Kherson", 261.5);

        graph.addPath("Luhansk", "Kharkiv", 321.9);
        graph.addPath("Luhansk", "Dnepr", 455.5);
        graph.addPath("Luhansk", "Donetsk", 168.2);

        graph.addPath("Ternopil", "Uzhgorod", 394);
        graph.addPath("Ternopil", "Kherson", 758);
        graph.addPath("Ternopil", "Odessa", 683);

        graph.addPath("Kherson", "Dnepr", 261.5);
        graph.addPath("Kherson", "Ternopil", 758);
        graph.addPath("Kherson", "Donetsk", 546);

        graph.addPath("Donetsk", "Luhansk", 168.2);
        graph.addPath("Donetsk", "Kherson", 546);

        graph.addPath("Odessa", "Ternopil", 683);
    }
}
