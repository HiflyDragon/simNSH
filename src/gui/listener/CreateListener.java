package gui.listener;

import java.awt.event.ActionEvent;
import entity.*;
import java.awt.event.ActionListener;

import gui.panel.CreatePanel;
import gui.panel.BagPanel;

public class CreateListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(CreatePanel.instance.comboBoxQuality.getSelectedItem());
		System.out.println(CreatePanel.instance.comboBoxQuality.getSelectedIndex());
		
		System.out.println(CreatePanel.instance.comboBoxPart.getSelectedItem());
		System.out.println(CreatePanel.instance.comboBoxPart.getSelectedIndex());
		
		System.out.println(CreatePanel.instance.comboBoxLevel.getSelectedItem());
		System.out.println(CreatePanel.instance.comboBoxLevel.getSelectedIndex());
		
		System.out.println(CreatePanel.instance.comboBoxSect.getSelectedItem());
		System.out.println(CreatePanel.instance.comboBoxSect.getSelectedIndex());
		
		BagPanel.addItem();
	}

}
