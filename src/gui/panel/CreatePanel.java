package gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
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

public class CreatePanel extends JPanel{
	public static CreatePanel instance=new CreatePanel();
	public JButton btnCreate = new JButton("Éú³É");
	public JButton btnKeep = new JButton("±£Áô");
	
	private CreatePanel() {
		setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0,0,700,520);
		splitPane.setDividerLocation(350);
		add(splitPane);
		
		JPanel choosePanel = new JPanel();
		//choosePanel.setBounds(0, 0, 350, 520);
		//add(choosePanel);
		splitPane.setLeftComponent(choosePanel);
		choosePanel.setLayout(null);
		
		JPanel panelTop = new JPanel();
		panelTop.setBounds(0, 0, 300, 33);
		choosePanel.add(panelTop);
		panelTop.setLayout(null);
		
		JLabel lblName = new JLabel("\u540D\u79F0\uFF1A");
		lblName.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblName.setBounds(10, 9, 36, 15);
		panelTop.add(lblName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBox.setBounds(50, 6, 103, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u853D\u6708\u56DE\u96EA\u7F0E"}));
		panelTop.add(comboBox);
		
		JCheckBox chckbxSmelting = new JCheckBox("\u767E\u70BC");
		chckbxSmelting.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
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
		
		JLabel lblQuality = new JLabel("\u54C1\u8D28\uFF1A");
		lblQuality.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblQuality.setBounds(10, 10, 48, 15);
		panelChoose.add(lblQuality);
		
		JComboBox comboBoxQuality = new JComboBox();
		comboBoxQuality.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBoxQuality.setBounds(56, 3, 62, 21);
		panelChoose.add(comboBoxQuality);
		comboBoxQuality.setModel(new DefaultComboBoxModel(new String[] {"\u7D2B"}));
		
		JLabel lblPart = new JLabel("\u90E8\u4F4D\uFF1A");
		lblPart.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblPart.setBounds(126, 7, 48, 15);
		panelChoose.add(lblPart);
		
		JComboBox comboBoxPart = new JComboBox();
		comboBoxPart.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBoxPart.setBounds(166, 3, 77, 21);
		panelChoose.add(comboBoxPart);
		comboBoxPart.setModel(new DefaultComboBoxModel(new String[] {"\u6B66\u5668"}));
		
		JLabel lblLevel = new JLabel("\u7B49\u7EA7\uFF1A");
		lblLevel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblLevel.setBounds(10, 35, 48, 15);
		panelChoose.add(lblLevel);
		
		JComboBox comboBoxLevel = new JComboBox();
		comboBoxLevel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBoxLevel.setBounds(56, 29, 63, 21);
		panelChoose.add(comboBoxLevel);
		comboBoxLevel.setModel(new DefaultComboBoxModel(new String[] {"60"}));
		
		JLabel lblSect = new JLabel("\u6D41\u6D3E\uFF1A");
		lblSect.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblSect.setBounds(126, 32, 48, 15);
		panelChoose.add(lblSect);
		
		JComboBox comboBoxSect = new JComboBox();
		comboBoxSect.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBoxSect.setBounds(166, 29, 77, 21);
		panelChoose.add(comboBoxSect);
		comboBoxSect.setModel(new DefaultComboBoxModel(new String[] {"\u7D20\u95EE"}));
		
		JPanel panelAttrib = new JPanel();
		panelAttrib.setBounds(0, 60, 300, 210);
		panelMid.add(panelAttrib);
		panelAttrib.setLayout(null);
		
		JPanel panelBasicAttrib = new JPanel();
		panelBasicAttrib.setBounds(0, 0, 300, 74);
		panelAttrib.add(panelBasicAttrib);
		panelBasicAttrib.setLayout(null);
		
		JLabel lblAttrib1 = new JLabel("\u5916\u529F\u653B\u51FB\uFF1A193-453[223-520]");
		lblAttrib1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblAttrib1.setBounds(10, 5, 195, 15);
		panelBasicAttrib.add(lblAttrib1);
		
		JLabel lblAttrib2 = new JLabel("\u5185\u529F\u653B\u51FB\uFF1A212-428[223-520]");
		lblAttrib2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblAttrib2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblAttrib2.setBounds(10, 20, 195, 15);
		panelBasicAttrib.add(lblAttrib2);
		
		JLabel lblAttrib3 = new JLabel("");
		lblAttrib3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblAttrib3.setBounds(10, 35, 195, 15);
		panelBasicAttrib.add(lblAttrib3);
		
		JLabel lblAttrib4 = new JLabel("");
		lblAttrib4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
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
		
		JLabel lblAttackSpeed = new JLabel("\u653B\u51FB\u901F\u5EA6\uFF1A1.02[1.06]");
		lblAttackSpeed.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblAttackSpeed.setBounds(10, 5, 120, 15);
		panelBlock1.add(lblAttackSpeed);
		
		JLabel lblBlock1 = new JLabel("\u5206\u5757\u4E00\uFF1A");
		lblBlock1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblBlock1.setBounds(136, 5, 60, 15);
		panelBlock1.add(lblBlock1);
		
		JComboBox comboBlock1 = new JComboBox();
		comboBlock1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBlock1.setBounds(179, 2, 121, 21);
		comboBlock1.setModel(new DefaultComboBoxModel(new String[] {"\u5218\u6D93\u5B50\u00B7\u971C\u5929\u62A4\u8155"}));
		panelBlock1.add(comboBlock1);
		
		JPanel panelBlock2 = new JPanel();
		panelBlock2.setBounds(0, 30, 300, 30);
		panelWeaponAttrib.add(panelBlock2);
		panelBlock2.setLayout(null);
		
		JLabel lblAttackRange = new JLabel("\u653B\u51FB\u8303\u56F4\uFF1A0.93[0.96]");
		lblAttackRange.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblAttackRange.setBounds(10, 5, 121, 15);
		panelBlock2.add(lblAttackRange);
		
		JLabel lblBlock2 = new JLabel("\u5206\u5757\u4E8C\uFF1A");
		lblBlock2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblBlock2.setBounds(136, 5, 60, 15);
		panelBlock2.add(lblBlock2);
		
		JComboBox comboBlock2 = new JComboBox();
		comboBlock2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBlock2.setBounds(179, 2, 121, 21);
		comboBlock2.setModel(new DefaultComboBoxModel(new String[] {"\u5218\u6D93\u5B50\u00B7\u78A7\u7259\u7EF8\u7F0E"}));
		panelBlock2.add(comboBlock2);
		
		JPanel panelBlock3 = new JPanel();
		panelBlock3.setBounds(0, 60, 300, 76);
		panelWeaponAttrib.add(panelBlock3);
		panelBlock3.setLayout(null);
		
		JLabel lblBlock3 = new JLabel("\u5206\u5757\u4E09\uFF1A");
		lblBlock3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblBlock3.setBounds(136, 58, 60, 15);
		panelBlock3.add(lblBlock3);
		
		JComboBox comboBlock3 = new JComboBox();
		comboBlock3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		comboBlock3.setBounds(179, 55, 121, 21);
		comboBlock3.setModel(new DefaultComboBoxModel(new String[] {"\u5218\u6D93\u5B50\u00B7\u78A7\u7259\u5760\u73AF"}));
		panelBlock3.add(comboBlock3);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea.setLineWrap(true);
		textArea.setText("\u653B\u51FB\u6548\u679C\uFF1A\u6BCF\u6B21\u65BD\u6CD5\u67095.00%\u51E0\u7387\u89E6\u53D16\u79D26\u7EA7\u6CBB\u7597\u52A0\u6210\u6548\u679C");
		textArea.setBounds(10, 5, 280, 41);
		panelBlock3.add(textArea);
		
		JPanel panelAffix = new JPanel();
		panelAffix.setBounds(0, 269, 300, 101);
		panelMid.add(panelAffix);
		panelAffix.setLayout(null);
		
		JLabel label = new JLabel("\u6C14\u6D77:+12");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label.setBounds(10, 10, 195, 15);
		panelAffix.add(label);
		
		JLabel label_1 = new JLabel("\u6700\u5C0F\u5185\u529F\u653B\u51FB:+90\uFF0C\u6700\u5927\u5185\u529F\u653B\u51FB:+140");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_1.setAlignmentY(1.0f);
		label_1.setBounds(10, 25, 239, 15);
		panelAffix.add(label_1);
		
		JLabel label_2 = new JLabel("\u7D20\u95EE\u6280\u80FD\u300C\u60DC\u6625\u300D:+4");
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_2.setAlignmentY(1.0f);
		label_2.setBounds(10, 55, 239, 15);
		panelAffix.add(label_2);
		
		JLabel label_3 = new JLabel("\u7D20\u95EE\u5FC3\u6CD5\u300C\u9EDB\u9999\u300D:+4");
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_3.setBounds(10, 40, 195, 15);
		panelAffix.add(label_3);
		
		JPanel panelFoot = new JPanel();
		panelFoot.setBounds(0, 414, 300, 76);
		choosePanel.add(panelFoot);
		panelFoot.setLayout(null);
		
		JCheckBox chckbxKeep = new JCheckBox("\u751F\u6210\u540E\u76F4\u63A5\u4FDD\u7559");
		chckbxKeep.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		chckbxKeep.setBounds(0, 0, 150, 23);
		panelFoot.add(chckbxKeep);
		
		JLabel lblNull = new JLabel("");
		lblNull.setBounds(150, 0, 150, 23);
		panelFoot.add(lblNull);
		
		
		btnCreate.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		btnCreate.setBounds(0, 23, 131, 43);
		panelFoot.add(btnCreate);

		btnKeep.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		btnKeep.setBounds(160, 23, 140, 43);
		panelFoot.add(btnKeep);
		
		JPanel showPanel = new JPanel();
		splitPane.setRightComponent(showPanel);
		showPanel.setLayout(new BorderLayout(0, 0));
		
//		JLabel showIcon=new JLabel("Test");
//		showIcon.setHorizontalAlignment(SwingConstants.CENTER);
//		showIcon.setIcon(new ImageIcon("E:\\project\\simNSH\\img\\item.png"));
//		showPanel.add(showIcon,BorderLayout.NORTH);
		
		JTextPane jtp = new JTextPane();
		jtp.setContentType("text/html");
		jtp.setEditable(false);
		//txtpnThisIsA.setText("This is where show text");
		//txtpnThisIsA.setText("<html>Hello6<br>Hi6</html>");
		jtp.setText("<html>\r\n" + 
				"	<style>\r\n" + 
				"		div.border{\r\n" + 
				"			width:248px;\r\n" + 
				"			border:5px solid #8A2BE2;\r\n" + 
				"			padding:0 10 10 10;\r\n" + 
				"			background-color:black;\r\n" + 
				"			}\r\n" + 
				"		div.top {			\r\n" + 
				"			width:248px;\r\n" + 
				"			background-color:#8A2BE2;\r\n" + 
				"			font-size:25px;\r\n" + 
				"			color:white;\r\n" + 
				"			}\r\n" + 
				"		span.solid{\r\n" + 
				"			border:solid red;\r\n" + 
				"			color:red;\r\n" + 
				"		}\r\n" + 
				"		span.title{\r\n" + 
				"			color:#fdf3b9;\r\n" + 
				"		}\r\n" + 
				"		span.value{\r\n" + 
				"			color:white;\r\n" + 
				"		}\r\n" + 
				"		span.alignright{\r\n" + 
				"			float:right;\r\n" + 
				"			color:white;\r\n" + 
				"		}\r\n" + 
				"	</style>\r\n" + 
				"	<body>\r\n" + 
				"		<div class='top'>&emsp;Áõä¸×Ó¡¤±ÕÔÂ»ØÑ©¶Ð</div>\r\n" + 
				"	<div class='border'>		\r\n" + 
				"		<div class='1st'>\r\n" + 
				"		<br>\r\n" + 
				"			<span class='alignright'><span class='solid'><strong>°ÙÁ¶</strong></span></span><br>\r\n" + 
				"		<br>\r\n" + 
				"			<span class='title'>µÈ¼¶ÒªÇó£º</span><span class='value'>60</span><span class='alignright'>Ë¿´ø</span>\r\n" + 
				"		<br>\r\n" + 
				"			<span class='title'>Ö°ÒµÒªÇó£º</span><span class='value'>ËØÎÊ</span><br>\r\n" + 
				"		</div>\r\n" + 
				"		<hr>\r\n" + 
				"			<span class='title'>Íâ¹¦¹¥»÷£º</span><span class='value'>193-453</span><span class='title'>(223-520)</span><br>\r\n" + 
				"			<span class='title'>ÄÚ¹¦¹¥»÷£º</span><span class='value'>212-520</span><span class='title'>(223-520)</span><br>\r\n" + 
				"			<span class='title'>¹¥»÷ËÙ¶È£º</span><span class='value'>1.02</span>\r\n" + 
				"				<span class='title'>(1.06 <span class='block'><font color='red'>Áõä¸×Ó¡¤ËªÌì»¤Íó</font></span>)</span><br>\r\n" + 
				"			<span class='title'>¹¥»÷·¶Î§£º</span><span class='value'>0.93</span>\r\n" + 
				"				<span class='title'>(0.96 <span class='block'><font color='red'>Áõä¸×Ó¡¤±ÌÑÀ³ñ¶Ð</font></span>)</span><br>\r\n" + 
				"			<span class='title'>¹¥»÷Ð§¹û£º</span><span class='value'><font color='#8A2BE2'>Ã¿´ÎÊ©·¨ÓÐ5.00%¼¸ÂÊ´¥·¢6Ãë6¼¶ÖÎÁÆ¼Ó³ÉÐ§¹û</font></span>\r\n" + 
				"				<span class='title'>(1.06 <span class='block'><font color='red'>Áõä¸×Ó¡¤±ÌÑÀ×¹»·</font></span>)</span><br>\r\n" + 
				"		<hr>\r\n" + 
				"			<font color='#8A2BE2'>Æøº££º+12<br>×îÐ¡ÄÚ¹¦¹¥»÷£º+90£¬×î´óÄÚ¹¦¹¥»÷+140<br>ËØÎÊÐÄ·¨¡¸÷ìÏã¡¹£º+3<br>ËØÎÊ¼¼ÄÜ¡¸Ï§´º¡¹£º+3</font><br>\r\n" + 
				"			<font color='#7CFC00'>[Áõä¸×Ó]<br>¡Ú¶ÏÓñ¡Û×î´ó»ù´¡ÄÚ¹¦¹¥»÷ +12.0%</font><br>\r\n" + 
				"			<font color='red'>ÎäÆ÷ÆõºÏ<br>×îÐ¡ÄÚ¹¦¹¥»÷ +110£¬×î´óÄÚ¹¦¹¥»÷ +169</font><br>\r\n" + 
				"	</div>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
		
		showPanel.add(jtp, BorderLayout.CENTER);		
		
		addListener();
	}
	public static void main(String args[]) {
		GUIUtil.showPanel(CreatePanel.instance,1,700,520);
	}
	
	public void addListener() {
		CreateListener l=new CreateListener();
		btnCreate.addActionListener(l);
	}
}
