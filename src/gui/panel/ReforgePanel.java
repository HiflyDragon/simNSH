package gui.panel;

import javax.swing.JPanel;

import util.GUIUtil;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class ReforgePanel extends JPanel{

	public static ReforgePanel instance=new ReforgePanel();
	
	private ReforgePanel() {
		setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 700, 520);
		add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 179, 518);
		lblNewLabel.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\sampleleft.png"));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 179, 518);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\sampleright.png"));
		panel_2.add(lblNewLabel_1);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("         预览一          ", createTextPanel("TAB 01"));
		tabbedPane.addTab("          预览二         ", createTextPanel("TAB 02"));
		tabbedPane.setFont(new Font("微软雅黑", Font.BOLD,18));
		tabbedPane.setSelectedIndex(1);
		splitPane_1.setLeftComponent(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		splitPane_1.setRightComponent(panel_3);
		
		JButton button = new JButton("\u91CD\u953B");
		panel_3.add(button);
		splitPane_1.setDividerLocation(400);
		splitPane.setDividerLocation(360);
		
	}
	
	  private static JComponent createTextPanel(String text) {
	        // 创建面板, 使用一个 1 行 1 列的网格布局（为了让标签的宽高自动撑满面板）
	        JPanel panel = new JPanel(new GridLayout(1, 1));

	        // 创建标签
	        JLabel label = new JLabel(text);
	        label.setFont(new Font(null, Font.PLAIN, 50));
	        label.setHorizontalAlignment(SwingConstants.CENTER);

	        // 添加标签到面板
	        panel.add(label);

	        return panel;
	    }
	
	public static void main(String[] args) {
		GUIUtil.showPanel(ReforgePanel.instance,1,700,500);
	}

}
