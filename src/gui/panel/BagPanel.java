package gui.panel;
 
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import util.GUIUtil;
 
public class BagPanel extends JPanel {
	

	public static BagPanel instance=new BagPanel(700,180);
	
	public static double count=0;
	static int bWidth=75;
	static int bHeight=90;
	static int gap=5;
	static int xP=700;
	static JPanel bagPanel;
	static Map<String,JButton> b=new HashMap<String,JButton>();
	
	private BagPanel(int xPixels, int yPixels) {
		JButton button;
		JPanel buttonPanel;
		JScrollPane scrollPane;
 
		button = new JButton("Add Item");
		button.setPreferredSize(new Dimension(80, 25));
		button.setMargin(new Insets(0, 5, 0, 5));		
 
		bagPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, gap, gap));
		scrollPane = new JScrollPane(bagPanel);
		scrollPane.setHorizontalScrollBar(null);
		bagPanel.setPreferredSize(new Dimension(xPixels, yPixels));
		scrollPane.setPreferredSize(new Dimension(xPixels, yPixels));
 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addItem();
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
		GUIUtil.showPanel(BagPanel.instance,1,700,180);
	}
	
	public static void addItem() {
		count++;
	
		b.put("b"+count, new JButton("b"+count));
	    GUIUtil.setItemIcon(b.get("b"+count), "item.png", "B"+count, bWidth, bHeight);
	    b.get("b"+count).setToolTipText(
	    		"1");
		bagPanel.add(b.get("b"+count));

		int column = (instance.getWidth()) / (bWidth+gap);				
		double row = count / column;
		int d = (int) Math.ceil(row);
		bagPanel.setPreferredSize(new Dimension(xP,(int) ((d+1) * (bHeight+gap))));//
		
		bagPanel.revalidate();
		bagPanel.repaint();		
	}
}
