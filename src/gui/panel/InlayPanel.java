package gui.panel;

import javax.swing.JPanel;

import util.GUIUtil;

import javax.swing.JLabel;
import java.awt.Font;

public class InlayPanel extends JPanel{
	
	public static InlayPanel instance=new InlayPanel();
	
	private InlayPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("Ê©¹¤ing");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		label.setBounds(313, 168, 121, 135);
		add(label);
	}

	public static void main(String[] args) {
		GUIUtil.showPanel(InlayPanel.instance,1,700,520);
	}

}
