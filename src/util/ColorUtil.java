package util;
 
import java.awt.Color;
 
public class ColorUtil {
    public static Color blueColor = Color.decode("#3399FF");
    public static Color grayColor = Color.decode("#999999");
    public static Color purpleColor=Color.decode("#c333ff");
    public static Color goldenrodColor=Color.decode("#FFC125");
    public static Color deepredColor=Color.decode("#CD0000");
    public static Color pinkColor=Color.decode("#FF3E96");
    public static Color cyanColor=Color.decode("#00FFFF");
    public static Color backgroundColor = Color.decode("#eeeeee");
    public static Color warningColor = Color.decode("#FF3333");
 
    public static Color getByPercentage(int per) {
        if (per > 100)
            per = 100;
        int r = 51;
        int g = 255;
        int b = 51;
        float rate = per / 100f;
        r = (int) ((255 - 51) * rate + 51);
        g = 255 - r + 51;
        Color color = new Color(r, g, b);
        return color;
    }
}