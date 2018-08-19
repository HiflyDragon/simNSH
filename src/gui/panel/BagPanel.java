package gui.panel;

import javax.swing.JPanel;

import util.GUIUtil;

public class BagPanel extends JPanel {

	public static BagPanel instance=new BagPanel();
	
	public BagPanel() {
		setLayout(null);
		
		
		JPanel bag = new JPanel();
		bag.setBounds(0,0,300,500);
		add(bag);
		bag.setLayout(null);

	}

	public static void main(String args[]) {
		GUIUtil.showPanel(CreatePanel.instance,1,300,500);
	}
}
