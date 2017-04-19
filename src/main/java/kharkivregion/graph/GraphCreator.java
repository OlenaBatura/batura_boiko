package kharkivregion.graph;

import kharkivregion.constants.Cities;
import kharkivregion.constants.Monuments;
import org.jgrapht.ListenableGraph;
import org.jgrapht.graph.ListenableDirectedWeightedGraph;

/**
 * Created by Olena Batura,
 * Date: 18.04.2017,
 * Time: 22:50.
 */
public class GraphCreator {
    public static ListenableGraph<String, CustomEdge> buildGraph() {
        ListenableDirectedWeightedGraph<String, CustomEdge> graph =
                new ListenableDirectedWeightedGraph<>(CustomEdge.class);

        graph.addVertex(Monuments.SHAROVKA);
        graph.addVertex(Monuments.IZIUM);
        graph.addVertex(Monuments.KHARKIV);
        graph.addVertex(Monuments.MALINIVKA);
        graph.addVertex(Monuments.STARYJ_SALTIV);
        graph.addVertex(Monuments.SVYATOGORSKY_MONASTERY);
        graph.addVertex(Monuments.MERCHIK);
        graph.addVertex(Cities.BALAKLEYA);
        graph.addVertex(Cities.BARVINKOVE);
        graph.addVertex(Cities.BOHODUKHIV);
        graph.addVertex(Cities.VALKY);
        graph.addVertex(Cities.VOVCHANSK);
        graph.addVertex(Cities.DERHACHI);
        graph.addVertex(Cities.ZMIIV);
        graph.addVertex(Cities.KRASNOHRAD);
        graph.addVertex(Cities.KUPIANSK);
        graph.addVertex(Cities.LOZOVAJA);
        graph.addVertex(Cities.LYUBOTIN);
        graph.addVertex(Cities.MEREPHA);
        graph.addVertex(Cities.PERVOMAJSKIY);
        graph.addVertex(Cities.PIVDENNE);
        graph.addVertex(Cities.CHUGUYIV);

        graph.setEdgeWeight(graph.addEdge(Cities.BOHODUKHIV, Monuments.SHAROVKA), 25.5);
        graph.setEdgeWeight(graph.addEdge(Monuments.SHAROVKA, Cities.BOHODUKHIV), 25.5);
        graph.setEdgeWeight(graph.addEdge(Cities.VALKY, Monuments.SHAROVKA), 59.9);
        graph.setEdgeWeight(graph.addEdge(Cities.KUPIANSK, Monuments.MALINIVKA), 76.7);
        graph.setEdgeWeight(graph.addEdge(Monuments.MALINIVKA, Cities.KUPIANSK), 76.7);
        graph.setEdgeWeight(graph.addEdge(Cities.CHUGUYIV, Monuments.MALINIVKA), 7.5);
        graph.setEdgeWeight(graph.addEdge(Monuments.MALINIVKA, Cities.CHUGUYIV), 7.5);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Monuments.SVYATOGORSKY_MONASTERY), 169);
        graph.setEdgeWeight(graph.addEdge(Monuments.SVYATOGORSKY_MONASTERY, Monuments.KHARKIV), 169);
        graph.setEdgeWeight(graph.addEdge(Cities.VALKY, Monuments.MERCHIK), 31.0);
        graph.setEdgeWeight(graph.addEdge(Monuments.MERCHIK, Cities.VALKY), 31.0);
        graph.setEdgeWeight(graph.addEdge(Cities.LYUBOTIN, Monuments.MERCHIK), 19.8);
        graph.setEdgeWeight(graph.addEdge(Monuments.MERCHIK, Cities.LYUBOTIN), 19.8);
        graph.setEdgeWeight(graph.addEdge(Cities.VOVCHANSK, Monuments.STARYJ_SALTIV), 30.8);
        graph.setEdgeWeight(graph.addEdge(Monuments.STARYJ_SALTIV, Cities.VOVCHANSK), 30.8);
        graph.setEdgeWeight(graph.addEdge(Cities.BALAKLEYA, Cities.ZMIIV), 54.4);
        graph.setEdgeWeight(graph.addEdge(Cities.ZMIIV, Cities.BALAKLEYA), 54.4);
        graph.setEdgeWeight(graph.addEdge(Cities.BARVINKOVE, Monuments.IZIUM), 56.7);
        graph.setEdgeWeight(graph.addEdge(Monuments.IZIUM, Cities.BARVINKOVE), 56.7);
        graph.setEdgeWeight(graph.addEdge(Cities.BOHODUKHIV, Cities.VALKY), 42.6);
        graph.setEdgeWeight(graph.addEdge(Cities.VALKY, Cities.BOHODUKHIV), 42.6);
        graph.setEdgeWeight(graph.addEdge(Cities.BOHODUKHIV, Monuments.KHARKIV), 62.6);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.BOHODUKHIV), 62.6);
        graph.setEdgeWeight(graph.addEdge(Cities.VALKY, Cities.LYUBOTIN), 34.4);
        graph.setEdgeWeight(graph.addEdge(Cities.LYUBOTIN, Cities.VALKY), 34.4);
        graph.setEdgeWeight(graph.addEdge(Cities.DERHACHI, Monuments.KHARKIV), 16.2);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.DERHACHI), 16.2);
        graph.setEdgeWeight(graph.addEdge(Monuments.IZIUM, Cities.KUPIANSK), 82.0);
        graph.setEdgeWeight(graph.addEdge(Cities.KUPIANSK, Monuments.IZIUM), 82.0);
        graph.setEdgeWeight(graph.addEdge(Monuments.IZIUM, Cities.CHUGUYIV), 87.8);
        graph.setEdgeWeight(graph.addEdge(Cities.CHUGUYIV, Monuments.IZIUM), 87.8);
        graph.setEdgeWeight(graph.addEdge(Cities.LOZOVAJA, Cities.PERVOMAJSKIY), 62.7);
        graph.setEdgeWeight(graph.addEdge(Cities.PERVOMAJSKIY, Cities.LOZOVAJA), 62.7);
        graph.setEdgeWeight(graph.addEdge(Cities.LYUBOTIN, Cities.KRASNOHRAD), 93.4);
        graph.setEdgeWeight(graph.addEdge(Cities.KRASNOHRAD, Cities.LYUBOTIN), 93.4);
        graph.setEdgeWeight(graph.addEdge(Cities.LYUBOTIN, Monuments.KHARKIV), 26.3);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.LYUBOTIN), 26.3);
        graph.setEdgeWeight(graph.addEdge(Cities.MEREPHA, Monuments.KHARKIV), 31.6);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.MEREPHA), 31.6);
        graph.setEdgeWeight(graph.addEdge(Cities.PERVOMAJSKIY, Cities.MEREPHA), 12.4);
        graph.setEdgeWeight(graph.addEdge(Cities.PIVDENNE, Monuments.KHARKIV), 27.6);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.PIVDENNE), 27.6);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Monuments.IZIUM), 124);
        graph.setEdgeWeight(graph.addEdge(Monuments.IZIUM, Monuments.KHARKIV), 124);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.KRASNOHRAD), 107);
        graph.setEdgeWeight(graph.addEdge(Cities.KRASNOHRAD, Monuments.KHARKIV), 107);
        graph.setEdgeWeight(graph.addEdge(Cities.CHUGUYIV, Monuments.KHARKIV), 38.5);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Cities.CHUGUYIV), 38.5);
        graph.setEdgeWeight(graph.addEdge(Cities.CHUGUYIV, Cities.VALKY), 103);
        graph.setEdgeWeight(graph.addEdge(Cities.VALKY, Cities.CHUGUYIV), 103);
        graph.setEdgeWeight(graph.addEdge(Monuments.KHARKIV, Monuments.STARYJ_SALTIV), 42.2);
        graph.setEdgeWeight(graph.addEdge(Monuments.STARYJ_SALTIV, Monuments.KHARKIV), 42.2);
        graph.setEdgeWeight(graph.addEdge(Monuments.MALINIVKA, Cities.ZMIIV), 52.9);
        graph.setEdgeWeight(graph.addEdge(Cities.ZMIIV, Monuments.MALINIVKA), 52.9);


        return graph;
    }
}
