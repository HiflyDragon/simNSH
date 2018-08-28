package gui.listener;

import java.awt.event.ActionEvent;
import entity.*;
import java.awt.event.ActionListener;

import gui.panel.CreatePanel;

public class CreateListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		CreatePanel p=CreatePanel.instance;
		
		Jewelry ring=new Jewelry();
		ring.setId(0);//零号机
		ring.setName("阳春曲·青帝戒");
		ring.setLevel(67);
		ring.setQuality(5);//紫色
		ring.setSect(6);//All
		ring.setComponent(9);//戒指
		ring.setInternal(false);//外功
		
		
		ring.setStrable(true);//可强化
		ring.setStrengthen(0);//强化级别0
		ring.setSmelting(false);//非百炼
		
		ring.show();
		
	}

}
