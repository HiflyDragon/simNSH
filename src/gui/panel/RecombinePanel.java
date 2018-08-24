package gui.panel;

import javax.swing.JPanel;

import util.GUIUtil;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RecombinePanel extends JPanel{

	public static RecombinePanel instance=new RecombinePanel();
	
	private RecombinePanel() {
		setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 700, 520);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("合成装备");
		label.setBounds(138, 5, 72, 24);
		panel_1.add(label);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label.setAlignmentX(0.5f);
		
		JButton btnNewButton = new JButton("拆分");
		btnNewButton.setBounds(138, 386, 93, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("武器分块");
		label_1.setBounds(158, 5, 72, 24);
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_1.setAlignmentX(0.5f);
		panel_2.add(label_1);
		
		JButton btnNewButton_1 = new JButton("组合");
		btnNewButton_1.setBounds(158, 386, 93, 23);
		panel_2.add(btnNewButton_1);
		splitPane.setDividerLocation(420);
		
	}
	
	public static void main(String[] args) {
		GUIUtil.showPanel(RecombinePanel.instance,1,700,500);
	}
}
