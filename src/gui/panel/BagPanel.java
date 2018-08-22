package gui.panel;
 
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import util.GUIUtil;
 
public class BagPanel extends JPanel {
	
	public static BagPanel instance=new BagPanel(600,300);
	double count = 0;
	
	public BagPanel(int xPixels, int yPixels) {
		JButton button;
		JPanel buttonPanel;
		JPanel bagPanel;
		JScrollPane scrollPane;
		
		int bWidth=75;
		int bHeight=90;
		int gap=5;
		Map<String,JButton> b=new HashMap<String,JButton>();
 
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
				count++;
			
				b.put("b"+count, new JButton("b"+count));
			    GUIUtil.setItemIcon(b.get("b"+count), "item.png", "B"+count, bWidth, bHeight);
				bagPanel.add(b.get("b"+count));
 
				int column = (bagPanel.getWidth()) / (bWidth+gap);				
				double row = count / column;
				int d = (int) Math.ceil(row);
				bagPanel.setPreferredSize(new Dimension(xPixels,(int) ((d+1) * (bHeight+gap))));//
				//
				bagPanel.revalidate();
				bagPanel.repaint();
				
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
		GUIUtil.showPanel(BagPanel.instance,1,600,300);
	}
}
