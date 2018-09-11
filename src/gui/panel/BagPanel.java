package gui.panel;
 
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import util.GUIUtil;
 
public class BagPanel extends JPanel {
	
	public static BagPanel instance=new BagPanel(700,180);
	double count = 0;
	
	private BagPanel(int xPixels, int yPixels) {
		JButton button;
		JPanel buttonPanel;
		JPanel bagPanel;
		JScrollPane scrollPane;
		
		int bWidth=75;
		int bHeight=90;
		int gap=5;
		Map<String,JButton> b=new HashMap<String,JButton>();
 
		button = new JButton("Add Item");
		button.setPreferredSize(new Dimension(80, 25));
		button.setMargin(new Insets(0, 5, 0, 5));
 
		bagPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, gap, gap));
		scrollPane = new JScrollPane(bagPanel);
		scrollPane.setHorizontalScrollBar(null);
		bagPanel.setPreferredSize(new Dimension(xPixels, yPixels));
		scrollPane.setPreferredSize(new Dimension(xPixels, yPixels));
 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
			
				b.put("b"+count, new JButton("b"+count));
			    GUIUtil.setItemIcon(b.get("b"+count), "item.png", "B"+count, bWidth, bHeight);
			    //ͨ��setToolTipText����ʾ��ϸ��Ϣ
	//		    b.get("b"+count).setToolTipText("<html>Hello"+count+"<br>Hi"+count+"</html>");
			    b.get("b"+count).setToolTipText("<html>\r\n" + 
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
						"		<div class='top'>&emsp;����ӡ����»�ѩ��</div>\r\n" + 
						"	<div class='border'>		\r\n" + 
						"		<div class='1st'>\r\n" + 
						"		<br>\r\n" + 
						"			<span class='alignright'><span class='solid'><strong>����</strong></span></span><br>\r\n" + 
						"		<br>\r\n" + 
						"			<span class='title'>�ȼ�Ҫ��</span><span class='value'>60</span><span class='alignright'>˿��</span>\r\n" + 
						"		<br>\r\n" + 
						"			<span class='title'>ְҵҪ��</span><span class='value'>����</span><br>\r\n" + 
						"		</div>\r\n" + 
						"		<hr>\r\n" + 
						"			<span class='title'>�⹦������</span><span class='value'>193-453</span><span class='title'>(223-520)</span><br>\r\n" + 
						"			<span class='title'>�ڹ�������</span><span class='value'>212-520</span><span class='title'>(223-520)</span><br>\r\n" + 
						"			<span class='title'>�����ٶȣ�</span><span class='value'>1.02</span>\r\n" + 
						"				<span class='title'>(1.06 <span class='block'><font color='red'>����ӡ�˪�커��</font></span>)</span><br>\r\n" + 
						"			<span class='title'>������Χ��</span><span class='value'>0.93</span>\r\n" + 
						"				<span class='title'>(0.96 <span class='block'><font color='red'>����ӡ��������</font></span>)</span><br>\r\n" + 
						"			<span class='title'>����Ч����</span><span class='value'><font color='#8A2BE2'>ÿ��ʩ����5.00%���ʴ���6��6�����Ƽӳ�Ч��</font></span>\r\n" + 
						"				<span class='title'>(1.06 <span class='block'><font color='red'>����ӡ�����׹��</font></span>)</span><br>\r\n" + 
						"		<hr>\r\n" + 
						"			<font color='#8A2BE2'>������+12<br>��С�ڹ�������+90������ڹ�����+140<br>�����ķ������㡹��+3<br>���ʼ��ܡ�ϧ������+3</font><br>\r\n" + 
						"			<font color='#7CFC00'>[�����]<br>�ڶ�����������ڹ����� +12.0%</font><br>\r\n" + 
						"			<font color='red'>��������<br>��С�ڹ����� +110������ڹ����� +169</font><br>\r\n" + 
						"	</div>\r\n" + 
						"	</body>\r\n" + 
						"</html>");
				bagPanel.add(b.get("b"+count));
 
				int column = (bagPanel.getWidth()) / (bWidth+gap);				
				double row = count / column;
				int d = (int) Math.ceil(row);
				bagPanel.setPreferredSize(new Dimension(xPixels,(int) ((d+1) * (bHeight+gap))));//
				
				bagPanel.revalidate();
				bagPanel.repaint();
				
			}
		});
 
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		buttonPanel.add(button);
 
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
 
		setSize(xPixels, yPixels);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		GUIUtil.showPanel(BagPanel.instance,1,700,180);
	}
}
