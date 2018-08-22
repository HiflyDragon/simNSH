package gui.panel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;

import util.GUIUtil;

import java.util.HashMap;
import java.util.Map;


public class BagPanel extends JPanel{
	
	public static BagPanel instance=new BagPanel(600,100);
	
	public BagPanel(int xPixels,int yPixels) {
		setLayout(null);
		
		JPanel bagpanel = new JPanel();
		JScrollPane scrollPane=new JScrollPane(bagpanel);
		bagpanel.setPreferredSize(new Dimension(xPixels, yPixels));// 这是关键的2句
		scrollPane.setPreferredSize(new Dimension(xPixels, yPixels));
	
	/*	
	 * {
		count++;
		JButton button=new JButton("b"+count);
		button.setPreferredSize(new Dimension(50,50));
		bagpanel.add(button);
		
	    int column = (bagpanel.getWidth()) / 200;
		double row= = count / column;
		int d = (int)Math.ceil(row);
		bagpanel.setPreferredSize(new Dimension(600,(int)(d*205)));
		bagpanel.revalidate();
		bagpanel.repaint();
	 * }
	 */
		
		
	//	bagpanel.setBounds(0, 0, 600, 100);
		bagpanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		add(bagpanel);
		add(scrollPane);
		
		setSize(xPixels,yPixels);
		setVisible(true);
		
	/*
	 * 	 
	    Map<String, JButton> b = new HashMap<String, JButton>();
	 
		for (int i=1;i<=30;i++) {
			b.put("b"+i,new JButton());
			GUIUtil.setItemIcon(b.get("b"+i), "item.png","Testb"+i);
			bagpanel.add(b.get("b"+i));				
	       }
	*			
	*/
					
	}
	
	public static void main(String args[]) {
		GUIUtil.showPanel(BagPanel.instance);
	}
}
