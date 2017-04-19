package kharkivregion.graph;

import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * Created by Olena Batura,
 * Date: 19.04.2017,
 * Time: 0:11.
 */
public class CustomEdge extends DefaultWeightedEdge {
    @Override
    public String toString() {
        return String.valueOf(getWeight());
    }
}
