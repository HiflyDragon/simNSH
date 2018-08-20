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
	public JPanel bag=new JPanel();
   
    
	private BagPanel() {
		setLayout(null);		 
		
		bag.setBounds(0, 0, 278, 478);
//		bag.setPreferredSize(new Dimension(278,478));
		
//		JScrollPane jsp=new JScrollPane(bag);
		//getContentPane().add(jsp);
//		setSize(300,500);
		
		 Map<String, JButton> b = new HashMap<String, JButton>();
		 for (int i=1;i<=30;i++) {
				b.put("b"+i,new JButton());
				GUIUtil.setItemIcon(b.get("b"+i), "item.png","²âÊÔ");
				bag.add(b.get("b"+i));
			}				
		
		bag.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		add(bag);
		
//		
//		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//		scroll.setPreferredSize(new Dimension(300,600));
//		scroll.getViewport();
	
		
		
	}

	public static void main(String args[]) {
		GUIUtil.showPanel(BagPanel.instance,1,300,500);
	}
}
