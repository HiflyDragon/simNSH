package gui.listener;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;

import gui.panel.CreatePanel;
import gui.panel.InlayPanel;
import gui.panel.MainPanel;
import gui.panel.RecombinePanel;
import gui.panel.RefinePanel;
import gui.panel.ReforgePanel;
import gui.panel.StrengthenPanel;

 
public class ToolBarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel p = MainPanel.instance;
        JButton b = (JButton) e.getSource();
        if (b == p.bCreate)
            p.workingPanel.show(CreatePanel.instance);
        if (b == p.bStrengthen)
            p.workingPanel.show(StrengthenPanel.instance);
        if (b == p.bInlay)
            p.workingPanel.show(InlayPanel.instance);
        if (b == p.bRefine)
            p.workingPanel.show(RefinePanel.instance);
        if (b == p.bRecombine)
            p.workingPanel.show(RecombinePanel.instance);
        if (b == p.bReforge)
            p.workingPanel.show(ReforgePanel.instance);
 
    }
}