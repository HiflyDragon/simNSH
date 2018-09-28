package gui.listener;

import java.awt.event.ActionEvent;
import entity.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import gui.panel.CreatePanel;
import gui.panel.BagPanel;

public class CreateListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int currentQuality;
		String currentColor="white";
		//����
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
		
//����ѡ�������
		if(CreatePanel.instance.comboBoxName.getSelectedIndex()!=0) {
			System.out.print(CreatePanel.instance.comboBoxName.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBoxName.getSelectedIndex());
		}

		System.out.print(CreatePanel.instance.comboBoxQuality.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxQuality.getSelectedIndex());
		
		{
		//����ѡ��ķ�Χ���������Ʒ��
		currentQuality=CreatePanel.instance.comboBoxQuality.getSelectedIndex();
		if (currentQuality==0) currentQuality=(int)Math.rint(2*Math.random()+2);
		if (currentQuality==1) currentQuality=(int)Math.rint(1*Math.random()+3);
		if (currentQuality==2) currentColor="blue";
		if (currentQuality==3) currentColor="red";	
		if (currentQuality==4) currentColor="#8A2BE2";
		}
		
		if(CreatePanel.instance.chckbxSmelting.isSelected())
			System.out.println("����");
		
		System.out.print(CreatePanel.instance.comboBoxPart.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxPart.getSelectedIndex());
		
		System.out.print(CreatePanel.instance.comboBoxLevel.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxLevel.getSelectedIndex());
		
		System.out.print(CreatePanel.instance.comboBoxSect.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxSect.getSelectedIndex());
		
		if(CreatePanel.instance.activeBlock()) {
			System.out.print(CreatePanel.instance.comboBlock1.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBlock1.getSelectedIndex());
			System.out.print(CreatePanel.instance.comboBlock2.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBlock2.getSelectedIndex());
			System.out.print(CreatePanel.instance.comboBlock3.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBlock3.getSelectedIndex());
		}
		//��CreatePanel���Ҳ������ʾ��Ʒ��Ϣ �Ժ�ר��дһ��������HTML��ʽ����
		CreatePanel.instance.jtp.setText("<html>\r\n" + 
				"	<style>\r\n" + 
				"		div.border{\r\n" + 
				"			width:245px;\r\n" + 
				"			border:5px solid "+currentColor+";\r\n" + 
				"			padding:0 10 10 10;\r\n" + 
				"			background-color:black;\r\n" + 
				"			}\r\n" + 
				"		div.top {\r\n" + 
				"			width:245px;\r\n" + 
				"			background-color:"+currentColor+";\r\n" + 
				"			font-size:25px;\r\n" + 
				"			color:white;\r\n" + 
				"			}\r\n" + 
				"		span.title{\r\n" + 
				"			color:#fdf3b9;\r\n" + 
				"		}\r\n" + 
				"		span.value{\r\n" + 
				"			color:white;\r\n" + 
				"		}\r\n" + 
				"	</style>\r\n" + 
				"	<body>\r\n" + 
				"		<div class='top'>&emsp;����ӡ����»�ѩ��</div>\r\n" + 
				"	<div class='border'>\r\n" + 
				"			<font color='red'><strong>����</strong></font><br>\r\n" + 
				"			<font color='white'>˿��</font><br>\r\n" + 
				"			<span class='title'>�ȼ�Ҫ��</span><span class='value'>60</span><br>		\r\n" + 
				"			<span class='title'>ְҵҪ��</span><span class='value'>"+CreatePanel.instance.comboBoxSect.getSelectedItem()+"</span><br>\r\n" + 
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
				"		<br>\r\n" + 
				"	</div>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
		//�򱳰��������Ʒ
		BagPanel.addItem();
		
	}

}
