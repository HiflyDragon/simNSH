package util;
 
import java.awt.Color;
 
public class ColorUtil {
    public static Color blueColor = Color.decode("#3399FF");
    public static Color purpleColor=Color.decode("#8A2BE2");
 
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