package kharkivregion.visualization;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.swing.mxGraphComponent;
import kharkivregion.graph.CustomEdge;
import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;


import javax.swing.*;

/**
 * Created by Olena Batura,
 * Date: 18.04.2017,
 * Time: 22:53.
 */
public class GraphDisplayer {

    public static void showGraph(Graph<String, CustomEdge> graph) {
        JFrame frame = new JFrame("DemoGraph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JGraphXAdapter<String, CustomEdge> graphAdapter =
                new JGraphXAdapter<>(graph);

        mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

        frame.add(new mxGraphComponent(graphAdapter));

        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
