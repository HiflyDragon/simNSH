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
	
	private MainPanel() {
		GUIUtil.setImageIcon(bCreate, "temp.png","����");
		GUIUtil.setImageIcon(bStrengthen, "temp.png","ǿ��");
		GUIUtil.setImageIcon(bInlay, "temp.png","��Ƕ");
		GUIUtil.setImageIcon(bRefine, "temp.png","ϴ��");
		GUIUtil.setImageIcon(bRecombine, "temp.png","���");
		GUIUtil.setImageIcon(bReforge, "temp.png","�ض�");
		
		tb.setLayout(new GridLayout(6,1));
		tb.add(bCreate);
		tb.add(bStrengthen);
		tb.add(bInlay);
		tb.add(bRefine);
		tb.add(bRecombine);
		tb.add(bReforge);
		
		tb.setFloatable(false);
		
		workingPanel=new CenterPanel(0.8);
		
		setLayout(new BorderLayout());
		add(tb,BorderLayout.WEST);
		add(workingPanel,BorderLayout.CENTER);
	}
	
	public static void main(String args[]) {
		GUIUtil.showPanel(MainPanel.instance, 1);
	}
}
