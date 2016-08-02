package views.ui;

import config.GraphicsConfig;

import javax.swing.*;

/**
 * Created by Quentin on 7/29/16.
 *
 * Utility class for Swing components
 */
public class SwingConsole {
    public static void run(
            final JFrame frame) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame.setTitle("MUN");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setSize(GraphicsConfig.getScreenSize());
                frame.setVisible(true);
            }
        });
    }
}
