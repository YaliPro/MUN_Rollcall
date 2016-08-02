package views.ui.panel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Quentin on 7/29/16.
 */
public class RolecallPanel extends JPanel {

    private static final long serialVersionUID = -4222192180915610202L;

    private JButton b1 = new JButton("r1");
    private JButton b2 = new JButton("r2");

    public RolecallPanel(views.ui.Window window) {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        setVisible(true);
    }
}
