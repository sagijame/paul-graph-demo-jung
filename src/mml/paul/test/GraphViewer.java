package mml.paul.test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;

@SuppressWarnings({ "rawtypes", "unchecked" ,"serial" })
public class GraphViewer extends JPanel {
	
	private VisualizationViewer<Integer, Number> vv;
	private DirectedSparseMultigraph<Number, Number> g;
	
	public GraphViewer() {
		g = new DirectedSparseMultigraph<Number, Number>(); //TestGraphs.getOneComponentGraph();
		
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		
		g.addEdge(1, 1, 2);
		g.addEdge(2, 1, 3);
		g.addEdge(3, 1, 4);
		g.addEdge(4, 4, 2);	
		g.addEdge(5, 2, 1);
		
		vv = new VisualizationViewer<Integer, Number>(new FRLayout(g));
		
		this.add(vv);
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
        jf.getContentPane().add(new GraphViewer());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
	
}
