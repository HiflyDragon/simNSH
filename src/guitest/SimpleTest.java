package guitest;
 
import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
public class SimpleTest extends JFrame {
	
	
	private JButton button;
	private JPanel buttonPanel, imagePanel;
	private JScrollPane scrollPane;
	double count = 0;
 
	public SimpleTest(int xPixels, int yPixels) {
		super("Add Image");
 
		button = new JButton("Add Image");
		button.setPreferredSize(new Dimension(80, 25));
		button.setMargin(new Insets(0, 5, 0, 5));
 
		
		imagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		scrollPane = new JScrollPane(imagePanel);
		imagePanel.setPreferredSize(new Dimension(xPixels, yPixels));// 这是关键的2句
		scrollPane.setPreferredSize(new Dimension(xPixels, yPixels));
		System.out.println(imagePanel.getHeight() + " OOO  "
				+ imagePanel.getWidth());
 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				System.out.println("dfdsds");
				JButton button = new JButton("bu" + count);
				button.setPreferredSize(new Dimension(200, 200));
				imagePanel.add(button);
 
				System.out.println(imagePanel.getHeight() + " "
						+ imagePanel.getWidth());
				int column = (imagePanel.getWidth()) / 200;
				System.out.println("count " + count);
				System.out.println("列数  " + column);
				double row = count / column;
				System.out.println("行数 " + row);
				int d = (int) Math.ceil(row);
			    System.out.println("行数进一 " +d );
				imagePanel.setPreferredSize(new Dimension(500,(int) (d * 205)));//
				//
				imagePanel.revalidate();
				imagePanel.repaint();
				
			}
		});
 
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		buttonPanel.add(button);
 
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
 
		setSize(xPixels, yPixels);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		new SimpleTest(320, 400);
	}
}
