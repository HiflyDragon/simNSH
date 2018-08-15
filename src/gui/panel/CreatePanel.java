package gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class CreatePanel extends JPanel{
	public CreatePanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel createtool = new JPanel();
		add(createtool, BorderLayout.CENTER);
	}

}
