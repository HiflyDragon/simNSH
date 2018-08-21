package gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import util.CenterPanel;
import util.GUIUtil;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;

public class MainPanel extends JPanel{
	public static MainPanel instance=new MainPanel();
	public JToolBar tb=new JToolBar();
	public JButton bCreate=new JButton();
	public JButton bStrengthen=new JButton();
	public JButton bInlay=new JButton();
	public JButton bRefine=new JButton();
	public JButton bRecombine=new JButton();
	public JButton bReforge=new JButton();
	
	public static CenterPanel workingPanel;
	public static CenterPanel ItemPanel;
	public JSplitPane sp;
	
	private MainPanel() {
		
		setLayout(new BorderLayout());
		GUIUtil.setImageIcon(bCreate, "button.png","生成");
		GUIUtil.setImageIcon(bStrengthen, "button.png","强化");
		GUIUtil.setImageIcon(bInlay, "button.png","镶嵌");
		GUIUtil.setImageIcon(bRefine, "button.png","洗练");
		GUIUtil.setImageIcon(bRecombine, "button.png","组合");
		GUIUtil.setImageIcon(bReforge, "button.png","重锻");
		
		tb.setLayout(new GridLayout(6,1));
		tb.add(bCreate);
		tb.add(bStrengthen);
		tb.add(bInlay);
		tb.add(bRefine);
		tb.add(bRecombine);
		tb.add(bReforge);
		
		tb.setFloatable(false);
		
		workingPanel=new CenterPanel(1);
		ItemPanel=new CenterPanel(1);
		
		sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, workingPanel, ItemPanel);
		sp.setDividerLocation(490);
		
		add(tb,BorderLayout.WEST);		
		add(sp, BorderLayout.CENTER);
	//	add(workingPanel,BorderLayout.CENTER);
	//	add(ItemPanel,BorderLayout.EAST);
		
	}
	
	public static void main(String args[]) {
		workingPanel.setBounds(50, 50, 300, 60);
		workingPanel.show(CreatePanel.instance);
		ItemPanel.setBounds(10, 150, 300, 60);
		ItemPanel.show(BagPanel.instance);
		GUIUtil.showPanel(MainPanel.instance, 1);
	}
}
