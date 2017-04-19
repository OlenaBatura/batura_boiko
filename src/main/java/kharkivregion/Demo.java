package kharkivregion;

import kharkivregion.graph.CustomEdge;
import kharkivregion.graph.GraphCreator;
import kharkivregion.visualization.ComboBoxes;
import kharkivregion.visualization.GraphDisplayer;
import org.jgrapht.ListenableGraph;

/**
 * Created by Olena Batura,
 * Date: 18.04.2017,
 * Time: 22:52.
 */
public class Demo {
    public static void main(String[] args) {
        ListenableGraph<String, CustomEdge> graph = GraphCreator.buildGraph();
        GraphDisplayer.showGraph(graph);
        ComboBoxes.run(new ComboBoxes(),2400,200);

    }
}
