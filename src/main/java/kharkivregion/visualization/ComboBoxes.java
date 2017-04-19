package kharkivregion.visualization;

import kharkivregion.constants.Cities;
import kharkivregion.constants.Monuments;
import kharkivregion.graph.CustomEdge;
import kharkivregion.graph.GraphCreator;
import org.jgrapht.Graphs;
import org.jgrapht.ListenableGraph;
import org.jgrapht.alg.DijkstraShortestPath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by: Olena_Batura,
 * Date:  4/19/2017,
 * Time: 10:58 AM.
 */

public class ComboBoxes extends JApplet {
    private ListenableGraph<String, CustomEdge> graph = GraphCreator.buildGraph();
    private java.util.List<String> monuments = new ArrayList<String>() {{
        add(Monuments.SHAROVKA);
        add(Monuments.MALINIVKA);
        add(Monuments.SVYATOGORSKY_MONASTERY);
        add(Monuments.MERCHIK);
        add(Monuments.IZIUM);
        add(Monuments.STARYJ_SALTIV);
        add(Monuments.KHARKIV);
    }};

    private java.util.List<String> cities = new ArrayList<String>() {{
        add(Cities.BALAKLEYA);
        add(Cities.BARVINKOVE);
        add(Cities.BOHODUKHIV);
        add(Cities.VALKY);
        add(Cities.VOVCHANSK);
        add(Cities.CHUGUYIV);
        add(Cities.DERHACHI);
        add(Cities.ZMIIV);
        add(Cities.KRASNOHRAD);
        add(Cities.KUPIANSK);
        add(Cities.LOZOVAJA);
        add(Cities.LYUBOTIN);
        add(Cities.MEREPHA);
        add(Cities.PERVOMAJSKIY);
        add(Cities.PIVDENNE);
    }};

    private final static String SHORTEST_PATH_PATTERN = "The shortest path between %s and %s: \n%s and length %s km";

    private JTextField textField = new JTextField(100);

    private JComboBox monumentsDropDown = new JComboBox();

    private JButton button = new JButton("Select cities");

    private JComboBox citiesDropDown = new JComboBox();

    public void init() {
        for (String list : monuments)
            monumentsDropDown.addItem(list);
        for (String list : cities)
            citiesDropDown.addItem(list);

        textField.setEditable(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(graph, (String) citiesDropDown.getSelectedItem(), (String) monumentsDropDown.getSelectedItem());
                Graphs.getPathVertexList(dijkstraShortestPath.getPath());
                textField.setText(String.format(SHORTEST_PATH_PATTERN, citiesDropDown.getSelectedItem(), monumentsDropDown.getSelectedItem(), Graphs.getPathVertexList(dijkstraShortestPath.getPath())
                        .stream().map(Object::toString).collect(Collectors.joining(" -> ")), Math.round(dijkstraShortestPath.getPathLength())));


            }
        });
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(textField);
        cp.add(monumentsDropDown);
        cp.add(citiesDropDown);
        cp.add(button);
    }

    public static void run(JApplet applet, int width, int height) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.setSize(width, height);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}

