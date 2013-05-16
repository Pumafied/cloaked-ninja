package Function;

import java.awt.Container;
import java.awt.Point;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Graph {

	private JFrame frame;
	private static Panel panel;
	private Graph graph;

	public Graph() {
		fillWindow();
		showFrame();
	}

	private void fillWindow() {
		frame = new JFrame("Graph");
		frame.setResizable(false);
		Point[] points = new Point[5];
		points[0] = new Point(-1, 2);
		points[1] = new Point(0, 0);
		points[2] = new Point(7, 5);
		points[3] = new Point(2, 2);
		points[4] = new Point(3, 8);
		Container cPane = frame.getContentPane();
		panel = new Panel(graph, points);
		// Use vertical layout
		cPane.setLayout(new BoxLayout(cPane, BoxLayout.Y_AXIS));

		// Add components
		cPane.add(panel);
	}

	private void showFrame() {
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Panel(new Graph());
	}

	public int getHeight() {
		return frame.getHeight();
	}

	public int getWidth() {
		return frame.getWidth();
	}
}
