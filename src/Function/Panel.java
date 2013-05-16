package Function;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private Graph graph;
	private Point[] points;

	public Panel(Graph graph, Point[] points) {
		this.graph = graph;
		this.points = points;

		// Set the size of our Graph
		Dimension size = new Dimension(500, 500);
		setPreferredSize(size);
	}

	public Panel(Graph graph) {
		this.graph = graph;
		// Set the size of our Graph
		Dimension size = new Dimension(500, 500);
		setPreferredSize(size);
	}

	public void paint(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		// Clear the Graph
		g.clearRect(0, 0, getWidth(), getHeight());

		// Draw the Graph
		drawGraph(g);

		draw(g);
	}

	private void draw(Graphics g) {
		for (int i = 0; i < points.length; i++) {
			g.fillOval((points[i].x * 20) + (getWidth() / 2)-2, (points[i].y * -20)+ (getHeight() / 2)-2, 4, 4);
		}
	}

	private void drawGraph(Graphics g) {
		for (int i = 10; i < getWidth(); i += 20) {
			g.drawLine(i, (getHeight() / 2 + 5), i, (getHeight() / 2 - 5));
		}
		for (int i = 10; i < getHeight(); i += 20) {
			g.drawLine(getWidth() / 2 + 5, i, (getWidth() / 2 - 5), i);
		}
		g.setColor(Color.BLACK);
		g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
	}
}
