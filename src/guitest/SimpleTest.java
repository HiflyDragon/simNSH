package guitest;
 
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import util.GUIUtil;
 
public class SimpleTest extends JFrame {
	
	double count = 0;
	
	public SimpleTest(int xPixels, int yPixels) {
		super("SimpleTest");
		JButton button;
		JPanel buttonPanel;
		JPanel imagePanel;
		JScrollPane scrollPane;
		
		int bWidth=75;
		int bHeight=90;
		Map<String,JButton> b=new HashMap<String,JButton>();
 
		button = new JButton("Add Image");
		button.setPreferredSize(new Dimension(80, 25));
		button.setMargin(new Insets(0, 5, 0, 5));
 
		imagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		scrollPane = new JScrollPane(imagePanel);
		imagePanel.setPreferredSize(new Dimension(xPixels, yPixels));// ���ǹؼ���2��
		scrollPane.setPreferredSize(new Dimension(xPixels, yPixels));
 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
			//	JButton button = new JButton("bu" + count);
			//	button.setPreferredSize(new Dimension(200, 200));
			//	imagePanel.add(button);
				b.put("b"+count, new JButton("b"+count));
			//	b.get("b"+count).setPreferredSize(new Dimension(bWidth,bHeight));
			    GUIUtil.setItemIcon(b.get("b"+count), "item.png", "B"+count, bWidth, bHeight);
				imagePanel.add(b.get("b"+count));
 
				System.out.println( "��ȣ�"	+ imagePanel.getWidth()+" �߶ȣ�"+imagePanel.getHeight());
				System.out.println("��ť������ " + (int)count);
				int column = (imagePanel.getWidth()) / bWidth;				
				System.out.println("��ǰ����µ����������/ÿ����ť�Ŀ�ȣ� ��" + column);
				double row = count / column;
				System.out.println("��������ť����/��������" + row);
				int d = (int) Math.ceil(row);
			    System.out.println("��������ȡ�� ��" +d );
				imagePanel.setPreferredSize(new Dimension(xPixels,(int) (d * (bHeight+5)+10)));//
				//
				imagePanel.revalidate();
				imagePanel.repaint();
				
			}
		});
 
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		buttonPanel.add(button);
 
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
 
		setSize(xPixels, yPixels);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		new SimpleTest(600, 300);
	}
}
