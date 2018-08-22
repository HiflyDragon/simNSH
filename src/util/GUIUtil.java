package util;
 
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class GUIUtil {
    private static String imageFolder = "E:\\project\\simNSH\\img";
 
    public static void setImageIcon(JButton b, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(61, 81));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }
    
    //显示物品图标及名称
    public static void setItemIcon(JButton b,String fileName,String tip,int Width,int Height) {
    	 ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
         b.setIcon(i);
         b.setPreferredSize(new Dimension(Width,Height));
         b.setToolTipText(tip);//鼠标指在按钮上显示的文字，可以用来显示装备信息
         b.setVerticalTextPosition(JButton.BOTTOM);
         b.setHorizontalTextPosition(JButton.CENTER);
         b.setText(tip);
    }
 
    public static void setColor(Color color, JComponent... cs) {
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }

    /**
     *
     * @param p
     * @param strechRate 拉伸比例1表示满屏幕
     */
    public static void showPanel(JPanel p,double strechRate,int width,int height) {
        JFrame f = new JFrame();
        f.setSize(width,height);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strechRate);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        cp.show(p);
    }
     
    public static void showPanel(JPanel p) {
        showPanel(p,0.85,400,500);
    }  
  
    public static void showPanel(JPanel p,double strechRate) {
    	showPanel(p,strechRate,400,500);
    }
 
    public static boolean checkNumber(JTextField tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + " 需要是整数");
            tf.grabFocus();
            return false;
        }
    }
 
    public static boolean checkZero(JTextField tf, String input) {
        if (!checkNumber(tf, input))
            return false;
        String text = tf.getText().trim();
 
        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " 不能为零");
            tf.grabFocus();
            return false;
        }
        return true;
    }
 
    public static boolean checkEmpty(JTextField tf, String input) {
        String text = tf.getText().trim();
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + " 不能为空");
            tf.grabFocus();
            return false;
        }
        return true;
 
    }
 
    public static int getInt(JTextField tf) {
        return Integer.parseInt(tf.getText());
    }

}