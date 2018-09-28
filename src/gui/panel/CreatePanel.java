package gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import util.GUIUtil;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.JTextPane;

import gui.listener.CreateListener;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import util.Data;

public class CreatePanel extends JPanel {
	public static CreatePanel instance = new CreatePanel();
	public JButton btnCreate = new JButton("生成");
	public JButton btnKeep = new JButton("保留");


	public JComboBox comboBoxName = new JComboBox();
	public JComboBox comboBoxQuality = new JComboBox();
	public JCheckBox chckbxSmelting = new JCheckBox("百炼");
	public JComboBox comboBoxPart = new JComboBox();
	public JComboBox comboBoxLevel = new JComboBox();
	public JComboBox comboBoxSect = new JComboBox();
	public JLabel lblAttrib1 = new JLabel();
	public JLabel lblAttrib2 = new JLabel();
	public JLabel lblAttrib3 = new JLabel();
	public JLabel lblAttrib4 = new JLabel();
	public JComboBox comboBlock1 = new JComboBox();
	public JComboBox comboBlock2 = new JComboBox();
	public JComboBox comboBlock3 = new JComboBox();
	public JComboBox affix1=new JComboBox();
	public JComboBox affix2=new JComboBox();
	public JComboBox affix3=new JComboBox();
	public JComboBox affix4=new JComboBox();
	public JTextPane jtp = new JTextPane();
	

	public CreatePanel() {
		setLayout(null);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 700, 520);
		splitPane.setDividerLocation(350);
		add(splitPane);

		JPanel choosePanel = new JPanel();
		splitPane.setLeftComponent(choosePanel);
		choosePanel.setLayout(null);

		JPanel panelTop = new JPanel();
		panelTop.setBounds(0, 0, 300, 33);
		choosePanel.add(panelTop);
		panelTop.setLayout(null);

		JLabel lblName = new JLabel("名称：");
		lblName.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblName.setBounds(10, 9, 36, 15);
		panelTop.add(lblName);

		comboBoxName.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBoxName.setBounds(50, 6, 103, 21);
		comboBoxName.setModel(new DefaultComboBoxModel(Data.NameRange));
		panelTop.add(comboBoxName);

		chckbxSmelting.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		chckbxSmelting.setBounds(169, 5, 68, 23);
		panelTop.add(chckbxSmelting);

		JPanel panelMid = new JPanel();
		panelMid.setBounds(0, 33, 300, 371);
		choosePanel.add(panelMid);
		panelMid.setLayout(null);

		JPanel panelChoose = new JPanel();
		panelChoose.setBounds(0, 0, 300, 61);
		panelMid.add(panelChoose);
		panelChoose.setLayout(null);

		JLabel lblQuality = new JLabel("品质：");
		lblQuality.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblQuality.setBounds(10, 10, 48, 15);
		panelChoose.add(lblQuality);

		comboBoxQuality.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBoxQuality.setBounds(50, 7, 77, 21);
		panelChoose.add(comboBoxQuality);
		comboBoxQuality.setModel(new DefaultComboBoxModel(Data.QualityRange));

		JLabel lblPart = new JLabel("部位：");
		lblPart.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblPart.setBounds(152, 10, 36, 15);
		panelChoose.add(lblPart);

		comboBoxPart.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBoxPart.setBounds(186, 7, 77, 21);
		panelChoose.add(comboBoxPart);
		comboBoxPart.setModel(new DefaultComboBoxModel(Data.PartRange));

		JLabel lblLevel = new JLabel("等级：");
		lblLevel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblLevel.setBounds(10, 35, 48, 15);
		panelChoose.add(lblLevel);

		comboBoxLevel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBoxLevel.setBounds(50, 29, 77, 21);
		panelChoose.add(comboBoxLevel);
		comboBoxLevel.setModel(new DefaultComboBoxModel(Data.LevelRange));

		JLabel lblSect = new JLabel("流派：");
		lblSect.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblSect.setBounds(152, 35, 36, 15);
		panelChoose.add(lblSect);

		comboBoxSect.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBoxSect.setBounds(186, 32, 77, 21);
		panelChoose.add(comboBoxSect);
		comboBoxSect.setModel(new DefaultComboBoxModel(Data.SectRange));

		JPanel panelAttrib = new JPanel();
		panelAttrib.setBounds(0, 60, 300, 210);
		panelMid.add(panelAttrib);
		panelAttrib.setLayout(null);

		JPanel panelBasicAttrib = new JPanel();
		panelBasicAttrib.setBounds(0, 0, 300, 74);
		panelAttrib.add(panelBasicAttrib);
		panelBasicAttrib.setLayout(null);

		lblAttrib1.setText("待定");
		lblAttrib1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttrib1.setBounds(10, 5, 195, 15);
		panelBasicAttrib.add(lblAttrib1);

		lblAttrib2.setText("待定");
		lblAttrib2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttrib2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblAttrib2.setBounds(10, 20, 195, 15);
		panelBasicAttrib.add(lblAttrib2);

		lblAttrib3.setText("待定");
		lblAttrib3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttrib3.setBounds(10, 35, 195, 15);
		panelBasicAttrib.add(lblAttrib3);

		lblAttrib4.setText("待定");
		lblAttrib4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttrib4.setBounds(10, 50, 195, 15);
		panelBasicAttrib.add(lblAttrib4);

		JPanel panelWeaponAttrib = new JPanel();
		panelWeaponAttrib.setBounds(0, 73, 300, 137);
		panelAttrib.add(panelWeaponAttrib);
		panelWeaponAttrib.setLayout(null);

		JPanel panelBlock1 = new JPanel();
		panelBlock1.setBounds(0, 0, 300, 30);
		panelWeaponAttrib.add(panelBlock1);
		panelBlock1.setLayout(null);

		JLabel lblAttackSpeed = new JLabel("攻击速度：1.02[1.06]");
		lblAttackSpeed.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttackSpeed.setBounds(10, 5, 120, 15);
		panelBlock1.add(lblAttackSpeed);

		JLabel lblBlock1 = new JLabel("分块一：");
		lblBlock1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblBlock1.setBounds(136, 5, 60, 15);
		panelBlock1.add(lblBlock1);

		comboBlock1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBlock1.setBounds(179, 2, 121, 21);
		comboBlock1.setModel(new DefaultComboBoxModel(Data.suwen60Block1));
		comboBlock1.setEnabled(false);
		panelBlock1.add(comboBlock1);

		JPanel panelBlock2 = new JPanel();
		panelBlock2.setBounds(0, 30, 300, 30);
		panelWeaponAttrib.add(panelBlock2);
		panelBlock2.setLayout(null);

		JLabel lblAttackRange = new JLabel("攻击范围：0.93[0.96]");
		lblAttackRange.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblAttackRange.setBounds(10, 5, 121, 15);
		panelBlock2.add(lblAttackRange);

		JLabel lblBlock2 = new JLabel("分块二：");
		lblBlock2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblBlock2.setBounds(136, 5, 60, 15);
		panelBlock2.add(lblBlock2);

		comboBlock2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBlock2.setBounds(179, 2, 121, 21);
		comboBlock2.setModel(new DefaultComboBoxModel(Data.suwen60Block2));
		comboBlock2.setEnabled(false);
		panelBlock2.add(comboBlock2);

		JPanel panelBlock3 = new JPanel();
		panelBlock3.setBounds(0, 60, 300, 76);
		panelWeaponAttrib.add(panelBlock3);
		panelBlock3.setLayout(null);

		JLabel lblBlock3 = new JLabel("分块三：");
		lblBlock3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblBlock3.setBounds(136, 58, 60, 15);
		panelBlock3.add(lblBlock3);

		comboBlock3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBlock3.setBounds(179, 55, 121, 21);
		comboBlock3.setModel(new DefaultComboBoxModel(Data.suwen60Block3));
		comboBlock3.setEnabled(false);
		panelBlock3.add(comboBlock3);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		textArea.setLineWrap(true);
		textArea.setText("攻击效果：每次施法有5.00%几率触发6秒6级治疗加成效果");
		textArea.setBounds(10, 5, 280, 41);
		panelBlock3.add(textArea);

		JPanel panelAffix = new JPanel();
		panelAffix.setBounds(0, 269, 300, 101);
		panelMid.add(panelAffix);
		panelAffix.setLayout(null);

		JLabel label = new JLabel("气海：+12");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label.setBounds(10, 10, 250, 15);
		panelAffix.add(label);

		JLabel label_1 = new JLabel("最小内功攻击：+90，最大内功攻击：+140");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_1.setBounds(10, 25, 250, 15);
		panelAffix.add(label_1);

		JLabel label_2 = new JLabel("素问技能「惜春」:+3");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_2.setBounds(10, 40, 250, 15);
		panelAffix.add(label_2);

		JLabel label_3 = new JLabel("素问心法「黛香」:+3");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_3.setBounds(10, 55, 250, 15);
		panelAffix.add(label_3);

		JPanel panelFoot = new JPanel();
		panelFoot.setBounds(0, 414, 300, 76);
		choosePanel.add(panelFoot);
		panelFoot.setLayout(null);

		JCheckBox chckbxKeep = new JCheckBox("生成后直接保留");
		chckbxKeep.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		chckbxKeep.setBounds(0, 0, 150, 23);
		panelFoot.add(chckbxKeep);

		JLabel lblNull = new JLabel("");
		lblNull.setBounds(150, 0, 150, 23);
		panelFoot.add(lblNull);

		btnCreate.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnCreate.setBounds(0, 23, 131, 43);
		panelFoot.add(btnCreate);

		btnKeep.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnKeep.setBounds(160, 23, 140, 43);
		panelFoot.add(btnKeep);

		JPanel showPanel = new JPanel();
		splitPane.setRightComponent(showPanel);
		showPanel.setLayout(new BorderLayout(0, 0));

//		JLabel showIcon=new JLabel("Test");
//		showIcon.setHorizontalAlignment(SwingConstants.CENTER);
//		showIcon.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\item.png"));
//		showPanel.add(showIcon,BorderLayout.NORTH);

		jtp.setContentType("text/html");
		jtp.setEditable(false);
		// txtpnThisIsA.setText("This is where show text");
		// txtpnThisIsA.setText("<html>Hello6<br>Hi6</html>");

		showPanel.add(jtp, BorderLayout.CENTER);

		addListener();

		// 百炼装备品质为紫
		aLimitb(chckbxSmelting, comboBoxQuality, 4);
		// 选定名称后品质、等级、部位、流派也即确定
		aLimitb(comboBoxName, 1, comboBoxQuality, 4);
		aLimitb(comboBoxName, 1, comboBoxLevel, 0);
		aLimitb(comboBoxName, 1, comboBoxPart, 1);
		aLimitb(comboBoxName, 1, comboBoxSect, 5);
		// 只有部位选定为紫色武器时，分块一二三才可选
		comboBoxQuality.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activeBlock();
			}
		});
		comboBoxPart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activeBlock();
			}
		});
	}

	public static void main(String args[]) {
		GUIUtil.showPanel(CreatePanel.instance, 1, 700, 520);
	}

	public boolean activeBlock() {
		if ((comboBoxQuality.getSelectedItem() == "紫") && (comboBoxPart.getSelectedItem() == "武器")) {
			comboBlock1.setEnabled(true);
			comboBlock1.setModel(new DefaultComboBoxModel(Data.suwen60Block1));
			comboBlock2.setEnabled(true);
			comboBlock2.setModel(new DefaultComboBoxModel(Data.suwen60Block3));
			comboBlock3.setEnabled(true);
			comboBlock3.setModel(new DefaultComboBoxModel(Data.suwen60Block3));
			return true;
		}else {
			comboBlock1.setEnabled(false);
			comboBlock2.setEnabled(false);
			comboBlock3.setEnabled(false);
			return false;
		}
	}

	public void addListener() {
		CreateListener l = new CreateListener();
		btnCreate.addActionListener(l);
	}

	/*
	 * CheckBox a control ComboBox b b.setSelectedIndex(index)
	 * 复选框a控制下拉选择框b，b被锁定并选取一个由index所指的内容 ;应当给index加一个超出b包含选项长度的检测，以后再说
	 */
	public void aLimitb(JCheckBox a, JComboBox b, int index) {
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a.isSelected()) {
					b.setSelectedIndex(index);
					b.setEnabled(false);
				} else
					b.setEnabled(true);
			}
		});
	}

	/*
	 * 下拉选择框a控制下拉选择框b 当下拉选择框a选择了indexa，那么下拉选择框b被锁定并选择indexb所指的内容
	 */
	public void aLimitb(JComboBox a, int indexa, JComboBox b, int indexb) {
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a.getSelectedIndex() == indexa) {
					b.setSelectedIndex(indexb);
					b.setEnabled(false);
				} else
					b.setEnabled(true);
			}
		});
	}

}
