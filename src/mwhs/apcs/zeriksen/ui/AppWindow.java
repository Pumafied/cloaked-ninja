package mwhs.apcs.zeriksen.ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mwhs.apcs.zeriksen.postfix.InfixToPostfix;
import mwhs.apcs.zeriksen.postfix.PostfixExpression;
import net.miginfocom.swing.MigLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JMenu;

public class AppWindow implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private boolean evaluate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel MainPanel = new JPanel();
		frame.getContentPane().add(MainPanel, BorderLayout.CENTER);
		MainPanel.setLayout(new MigLayout("", "[grow][]", "[][][][][][][]"));
		frame.getRootPane().setBorder(
				BorderFactory.createLineBorder(Color.GREEN, 2));

		textField = new JTextField();
		MainPanel.add(textField, "cell 0 0 1 2,growx");
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);

		JButton LeftPeran = new JButton("(");
		MainPanel.add(LeftPeran, "flowx,cell 0 2");
		LeftPeran.addActionListener(this);

		JButton RightPeran = new JButton(")");
		MainPanel.add(RightPeran, "cell 0 2");
		RightPeran.addActionListener(this);

		JButton BackSpace = new JButton("\u2190");
		MainPanel.add(BackSpace, "cell 0 2");
		BackSpace.addActionListener(this);

		JButton one = new JButton("1");
		MainPanel.add(one, "flowx,cell 0 3");
		one.addActionListener(this);

		JButton two = new JButton("2");
		MainPanel.add(two, "cell 0 3");
		two.addActionListener(this);

		JButton Clear = new JButton("C");
		MainPanel.add(Clear, "cell 0 2");
		Clear.addActionListener(this);

		JButton button = new JButton("3");
		MainPanel.add(button, "cell 0 3");
		button.addActionListener(this);

		JButton button_1 = new JButton("+");
		MainPanel.add(button_1, "cell 0 3");
		button_1.addActionListener(this);

		JButton button_2 = new JButton("4");
		MainPanel.add(button_2, "flowx,cell 0 4");
		button_2.addActionListener(this);

		JButton button_3 = new JButton("5");
		MainPanel.add(button_3, "cell 0 4");
		button_3.addActionListener(this);

		JButton button_4 = new JButton("6");
		MainPanel.add(button_4, "cell 0 4");
		button_4.addActionListener(this);

		JButton button_5 = new JButton("-");
		MainPanel.add(button_5, "cell 0 4");
		button_5.addActionListener(this);

		JButton button_6 = new JButton("7");
		MainPanel.add(button_6, "flowx,cell 0 5");
		button_6.addActionListener(this);

		JButton button_7 = new JButton("8");
		MainPanel.add(button_7, "cell 0 5");
		button_7.addActionListener(this);

		JButton button_8 = new JButton("9");
		MainPanel.add(button_8, "cell 0 5");
		button_8.addActionListener(this);

		JButton five = new JButton("*");
		MainPanel.add(five, "cell 0 5");
		five.addActionListener(this);

		JButton zero = new JButton("0");
		MainPanel.add(zero, "flowx,cell 0 6");
		// Add ActionListener
		zero.addActionListener(this);

		JButton button_11 = new JButton(".");
		MainPanel.add(button_11, "cell 0 6");
		button_11.addActionListener(this);
		
		JButton button_13 = new JButton("\u03C0");
		MainPanel.add(button_13, "cell 0 6");
		button_13.addActionListener(this);

		JButton button_12 = new JButton("=");
		MainPanel.add(button_12, "cell 0 6");
		button_12.addActionListener(this);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArea = new JMenu("Area");
		menuBar.add(mnArea);
		
		JMenuItem mntTriangle = new JMenuItem("Triangle");
		mnArea.add(mntTriangle);
		
		JMenuItem menuItem = new JMenuItem("Square");
		mnArea.add(menuItem);
		
		JMenuItem mntmRectangle = new JMenuItem("Rectangle");
		mnArea.add(mntmRectangle);
		
		JMenuItem mntmParallelogram = new JMenuItem("Parallelogram");
		mnArea.add(mntmParallelogram);
		
		JMenuItem mntmTrapezoid = new JMenuItem("Trapezoid");
		mnArea.add(mntmTrapezoid);
		
		JMenuItem mntmCircle = new JMenuItem("Circle");
		mnArea.add(mntmCircle);
		
		JMenuItem mntmElipse = new JMenuItem("Elipse");
		mnArea.add(mntmElipse);
		
		JMenu mnPerimeter = new JMenu("Perimeter");
		menuBar.add(mnPerimeter);
		
		JMenuItem mntmCircle_1 = new JMenuItem("Circle");
		mnPerimeter.add(mntmCircle_1);
		
		JMenuItem mntmSquare = new JMenuItem("Square");
		mnPerimeter.add(mntmSquare);
		
		JMenuItem mntmRectangle_1 = new JMenuItem("Rectangle");
		mnPerimeter.add(mntmRectangle_1);
		
		JMenuItem mntmTriangle = new JMenuItem("Triangle");
		mnPerimeter.add(mntmTriangle);
		
		JMenu mnVolume = new JMenu("Volume");
		menuBar.add(mnVolume);
		
		JMenuItem mntmCube = new JMenuItem("Cube");
		mnVolume.add(mntmCube);
		
		JMenuItem mntmRectangularPrism = new JMenuItem("Rectangular Prism");
		mnVolume.add(mntmRectangularPrism);
		
		JMenuItem mntmCylinder = new JMenuItem("Cylinder");
		mnVolume.add(mntmCylinder);
		
		JMenuItem mntmCone = new JMenuItem("Cone");
		mnVolume.add(mntmCone);
		
		JMenuItem mntmSphere = new JMenuItem("Sphere");
		mnVolume.add(mntmSphere);
		
		JMenuItem mntmEllipsoid = new JMenuItem("Ellipsoid");
		mnVolume.add(mntmEllipsoid);
		
		JMenu mnSurfaceArea = new JMenu("Surface Area");
		menuBar.add(mnSurfaceArea);
		
		JMenuItem mntmCube_1 = new JMenuItem("Cube");
		mnSurfaceArea.add(mntmCube_1);
		
		JMenuItem mntmRectangularPrism_1 = new JMenuItem("Rectangular Prism");
		mnSurfaceArea.add(mntmRectangularPrism_1);
		
		JMenuItem mntmSphere_1 = new JMenuItem("Sphere");
		mnSurfaceArea.add(mntmSphere_1);
		
		JMenuItem mntmCylinder_1 = new JMenuItem("Cylinder");
		mnSurfaceArea.add(mntmCylinder_1);
		
		JMenu mnInterest = new JMenu("Interest");
		menuBar.add(mnInterest);
		
		JMenuItem mntmSimpleInterest = new JMenuItem("Simple Interest");
		mnInterest.add(mntmSimpleInterest);
		
		JMenuItem mntmCompoundInterest = new JMenuItem("Compound Interest");
		mnInterest.add(mntmCompoundInterest);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getText() == "C") {
			textField.setText("");
			frame.getRootPane().setBorder(
					BorderFactory.createLineBorder(Color.GREEN, 2));
		} else if (button.getText() == "\u2190") {
			try {
			textField.setText(textField.getText().substring(0,
					textField.getText().length() - 1));
			frame.getRootPane().setBorder(
					BorderFactory.createLineBorder(Color.GREEN, 2));
			} catch (Exception e2) {
				
			}
		} else if (button.getText() == "=") {
			try {
				evaluate = true;
				InfixToPostfix equal = new InfixToPostfix(textField.getText());
				PostfixExpression post = new PostfixExpression(equal.toPost());
				textField.setText("" + post.evaluate());
				frame.getRootPane().setBorder(
						BorderFactory.createLineBorder(Color.GREEN, 2));
			} catch (Exception e2) {
				frame.getRootPane().setBorder(
						BorderFactory.createLineBorder(Color.RED, 2));
			}
		}else if (button.getText() == "\u03C0"){
			if (evaluate == true)textField.setText("");
			textField.setText(textField.getText() + Math.PI);
			evaluate = false;
		} else {
			// If they solved the equasion then clear it for the next number
			// when they
			// press it
			if (evaluate == true)textField.setText("");
			textField.setText(textField.getText() + button.getText());
			evaluate = false;
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
