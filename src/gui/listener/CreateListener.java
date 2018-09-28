package gui.listener;

import java.awt.event.ActionEvent;
import entity.*;
import java.awt.event.ActionListener;

import gui.panel.CreatePanel;
import gui.panel.BagPanel;

public class CreateListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(CreatePanel.instance.comboBoxName.getSelectedIndex()!=0) {
			System.out.print(CreatePanel.instance.comboBoxName.getSelectedItem()+" ");
			System.out.println(CreatePanel.instance.comboBoxName.getSelectedIndex());
		}

		System.out.print(CreatePanel.instance.comboBoxQuality.getSelectedItem()+" ");
		System.out.println(CreatePanel.instance.comboBoxQuality.getSelectedIndex());
		
		if(CreatePanel.instance.chckbxSmelting.isSelected())
			System.out.println("∞Ÿ¡∂");
		
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
		BagPanel.addItem();
	}

}
