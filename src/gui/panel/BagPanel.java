package gui.panel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.HashMap;
import java.util.Map;

import util.GUIUtil;

import javax.swing.JToolBar;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JScrollBar;

public class BagPanel extends JPanel {

	public static BagPanel instance=new BagPanel();
    
	private BagPanel() {
		setLayout(null);
		
		JPanel bag=new JPanel();
		bag.setBounds(0, 0, 350, 600);
		add(bag);
		bag.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
//		bag.setPreferredSize(new Dimension(278,478));
		
//		JScrollPane jsp=new JScrollPane(bag);
		//getContentPane().add(jsp);
//		setSize(300,500);
		
		 Map<String, JButton> b = new HashMap<String, JButton>();
		 JButton b0=new JButton();
		 GUIUtil.setItemIcon(b0, "item.png", "b0");
		 bag.add(b0);
		 for (int i=1;i<=30;i++) {
				b.put("b"+i,new JButton());
				GUIUtil.setItemIcon(b.get("b"+i), "item.png","b"+i);
				bag.add(b.get("b"+i));
			}				
	
//		
//		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//		scroll.setPreferredSize(new Dimension(300,600));
//		scroll.getViewport();
	
	}

	public static void main(String args[]) {
		GUIUtil.showPanel(BagPanel.instance,1,350,600);
	}
}
