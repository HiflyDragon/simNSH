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
		//清屏
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
		
//接受选择的数据
		if(CreatePanel.instance.comboBoxName.getSelectedIndex()!=0) {
			System.out.print(CreatePanel.instance.comboBoxName.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBoxName.getSelectedIndex());
		}

		System.out.print(CreatePanel.instance.comboBoxQuality.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxQuality.getSelectedIndex());
		
		{
		//根据选择的范围产生随机的品质
		currentQuality=CreatePanel.instance.comboBoxQuality.getSelectedIndex();
		if (currentQuality==0) currentQuality=(int)Math.rint(2*Math.random()+2);
		if (currentQuality==1) currentQuality=(int)Math.rint(1*Math.random()+3);
		if (currentQuality==2) currentColor="blue";
		if (currentQuality==3) currentColor="red";	
		if (currentQuality==4) currentColor="#8A2BE2";
		}
		
		if(CreatePanel.instance.chckbxSmelting.isSelected())
			System.out.println("百炼");
		
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
		//在CreatePanel的右侧面板显示物品信息 以后专门写一个类生成HTML格式内容
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
				"		<div class='top'>&emsp;刘涓子·闭月回雪缎</div>\r\n" + 
				"	<div class='border'>\r\n" + 
				"			<font color='red'><strong>百炼</strong></font><br>\r\n" + 
				"			<font color='white'>丝带</font><br>\r\n" + 
				"			<span class='title'>等级要求：</span><span class='value'>60</span><br>		\r\n" + 
				"			<span class='title'>职业要求：</span><span class='value'>"+CreatePanel.instance.comboBoxSect.getSelectedItem()+"</span><br>\r\n" + 
				"		<hr>\r\n" + 
				"			<span class='title'>外功攻击：</span><span class='value'>193-453</span><span class='title'>(223-520)</span><br>\r\n" + 
				"			<span class='title'>内功攻击：</span><span class='value'>212-520</span><span class='title'>(223-520)</span><br>\r\n" + 
				"			<span class='title'>攻击速度：</span><span class='value'>1.02</span>\r\n" + 
				"				<span class='title'>(1.06 <span class='block'><font color='red'>刘涓子·霜天护腕</font></span>)</span><br>\r\n" + 
				"			<span class='title'>攻击范围：</span><span class='value'>0.93</span>\r\n" + 
				"				<span class='title'>(0.96 <span class='block'><font color='red'>刘涓子·碧牙绸缎</font></span>)</span><br>\r\n" + 
				"			<span class='title'>攻击效果：</span><span class='value'><font color='#8A2BE2'>每次施法有5.00%几率触发6秒6级治疗加成效果</font></span>\r\n" + 
				"				<span class='title'>(1.06 <span class='block'><font color='red'>刘涓子·碧牙坠环</font></span>)</span><br>\r\n" + 
				"		<hr>\r\n" + 
				"			<font color='#8A2BE2'>气海：+12<br>最小内功攻击：+90，最大内功攻击+140<br>素问心法「黛香」：+3<br>素问技能「惜春」：+3</font><br>\r\n" + 
				"			<font color='#7CFC00'>[刘涓子]<br>≮断玉≯最大基础内功攻击 +12.0%</font><br>\r\n" + 
				"			<font color='red'>武器契合<br>最小内功攻击 +110，最大内功攻击 +169</font><br>\r\n" + 
				"		<br>\r\n" + 
				"	</div>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
		//向背包中添加物品
		BagPanel.addItem();
		
	}

}
