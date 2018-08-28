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
		ring.setId(0);//��Ż�
		ring.setName("����������۽�");
		ring.setLevel(67);
		ring.setQuality(5);//��ɫ
		ring.setSect(6);//All
		ring.setComponent(9);//��ָ
		ring.setInternal(false);//�⹦
		
		
		ring.setStrable(true);//��ǿ��
		ring.setStrengthen(0);//ǿ������0
		ring.setSmelting(false);//�ǰ���
		
		ring.show();
		
	}

}
