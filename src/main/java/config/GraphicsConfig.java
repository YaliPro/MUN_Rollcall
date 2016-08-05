package config;

import java.awt.*;

/**
 * Utility class for querying screen width and height;
 */
public class GraphicsConfig {
    private static Dimension screenSize =
            Toolkit.getDefaultToolkit().getScreenSize();
    private static int width = (int) screenSize.getWidth();
    private static int height = (int) screenSize.getHeight();

    private static Font title = new Font("TimesRoman", Font.BOLD, 30);

    public static Dimension getScreenSize() {
        return screenSize;
    }

    public static int getScreenWidth() {
        return width;
    }

    public static int getScreenHeight() {
        return height;
    }

    public static Font getTitleFont() {
        return title;
    }
}
