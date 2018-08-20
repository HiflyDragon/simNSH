package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import util.CenterPanel;
import util.GUIUtil;

public class MainPanel extends JPanel{
	public static MainPanel instance=new MainPanel();
	public JToolBar tb=new JToolBar();
	public JButton bCreate=new JButton();
	public JButton bStrengthen=new JButton();
	public JButton bInlay=new JButton();
	public JButton bRefine=new JButton();
	public JButton bRecombine=new JButton();
	public JButton bReforge=new JButton();
	
	public CenterPanel workingPanel;
	public CenterPanel ItemPanel;
	
	private MainPanel() {
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
		
		setLayout(new BorderLayout());
		add(tb,BorderLayout.WEST);
		add(workingPanel,BorderLayout.CENTER);
		add(ItemPanel,BorderLayout.EAST);
	}
	
	public static void main(String args[]) {
		GUIUtil.showPanel(MainPanel.instance, 1);
	}
}
