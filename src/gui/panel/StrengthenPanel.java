package gui.panel;

import javax.swing.JPanel;

import util.GUIUtil;
import javax.swing.JSplitPane;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;

public class StrengthenPanel extends JPanel{
	
	public static StrengthenPanel instance=new StrengthenPanel();
	
	public StrengthenPanel() {
		
		setSize(700,520);
		setLayout(null);
		
		JSplitPane sp2=new JSplitPane();
		add(sp2);
		sp2.setBounds(0, 0, 700, 520);
		sp2.setDividerLocation(220);
		//	add(sp2);
			
			JPanel panel_right = new JPanel();
			sp2.setRightComponent(panel_right);
			panel_right.setLayout(new BoxLayout(panel_right, BoxLayout.Y_AXIS));
			
			JPanel panel_1 = new JPanel();
			panel_right.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lbl_lvl1 = new JLabel("<html>等<br>级<br>一");
			lbl_lvl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_lvl1.setFont(new Font("微软雅黑", Font.BOLD, 14));
			lbl_lvl1.setBounds(0, 0, 33, 117);
			lbl_lvl1.setBorder(BorderFactory.createLineBorder(Color.black,2));
			panel_1.add(lbl_lvl1);
			
			JProgressBar progressBar_1 = new JProgressBar();
			progressBar_1.setValue(100);
			progressBar_1.setBounds(43, 72, 230, 16);
			panel_1.add(progressBar_1);
			
			JLabel img_1 = new JLabel("");
			img_1.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\jys.png"));
			img_1.setBounds(283, 32, 58, 55);
			panel_1.add(img_1);
			
			JButton button_1 = new JButton("强化\\补缀");
			button_1.setBounds(351, 63, 93, 23);
			panel_1.add(button_1);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\perfect.png"));
			label.setBounds(351, 32, 93, 23);
			panel_1.add(label);
			Component verticalStrut_1 = Box.createVerticalStrut(10);
			panel_right.add(verticalStrut_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_right.add(panel_2);
			
			JLabel label_1 = new JLabel("<html>等<br>级<br>二");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("微软雅黑", Font.BOLD, 14));
			label_1.setBorder(BorderFactory.createLineBorder(Color.black,2));
			label_1.setBounds(0, 0, 33, 117);
			panel_2.add(label_1);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setValue(100);
			progressBar.setBounds(43, 72, 230, 16);
			panel_2.add(progressBar);
			
			JLabel label_2 = new JLabel("");
			label_2.setBounds(283, 32, 58, 55);
			panel_2.add(label_2);
			
			JButton button = new JButton("强化\\\\补缀");
			button.setBounds(351, 63, 93, 23);
			panel_2.add(button);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\perfect.png"));
			label_3.setBounds(351, 32, 93, 23);
			panel_2.add(label_3);
			
			Component verticalStrut_2 = Box.createVerticalStrut(10);
			panel_right.add(verticalStrut_2);
			
			JPanel panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_right.add(panel_3);
			
			JLabel label_4 = new JLabel("<html>等<br>级<br>三");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setFont(new Font("微软雅黑", Font.BOLD, 14));
			label_4.setBorder(BorderFactory.createLineBorder(Color.black,2));
			label_4.setBounds(0, 0, 33, 117);
			panel_3.add(label_4);
			
			JProgressBar progressBar_2 = new JProgressBar();
			progressBar_2.setValue(100);
			progressBar_2.setBounds(43, 72, 230, 16);
			panel_3.add(progressBar_2);
			
			JLabel label_5 = new JLabel("");
			label_5.setBounds(283, 32, 58, 55);
			panel_3.add(label_5);
			
			JButton button_2 = new JButton("强化\\\\补缀");
			button_2.setBounds(351, 63, 93, 23);
			panel_3.add(button_2);
			
			JLabel label_6 = new JLabel("");
			label_6.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\perfect.png"));
			label_6.setBounds(351, 32, 93, 23);
			panel_3.add(label_6);
			
			Component verticalStrut_3 = Box.createVerticalStrut(10);
			panel_right.add(verticalStrut_3);
			
			JPanel panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_right.add(panel_4);
			
			JLabel label_7 = new JLabel("<html>等<br>级<br>四");
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setFont(new Font("微软雅黑", Font.BOLD, 14));
			label_7.setBorder(BorderFactory.createLineBorder(Color.black,2));
			label_7.setBounds(0, 0, 33, 117);
			panel_4.add(label_7);
			
			JProgressBar progressBar_3 = new JProgressBar();
			progressBar_3.setValue(50);
			progressBar_3.setBounds(43, 72, 230, 16);
			panel_4.add(progressBar_3);
			
			JLabel label_8 = new JLabel("");
			label_8.setBounds(283, 32, 58, 55);
			panel_4.add(label_8);
			
			JButton button_3 = new JButton("强化\\\\补缀");
			button_3.setBounds(351, 63, 93, 23);
			panel_4.add(button_3);
			
			JLabel label_9 = new JLabel("");
			label_9.setBounds(351, 32, 93, 23);
			panel_4.add(label_9);
	}
	
	public static void main(String args[]) {
		GUIUtil.showPanel(StrengthenPanel.instance,1,700,500);
	}
}
