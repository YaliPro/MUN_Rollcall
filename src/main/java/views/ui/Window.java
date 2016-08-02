package views.ui;

import views.interfaces.PanelSwitch;
import views.ui.panel.HomePanel;
import views.ui.panel.RolecallPanel;
import views.ui.panel.SessionPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Window for displaying panels
 */
public class Window extends JFrame implements PanelSwitch {

    private static final long serialVersionUID = -1629925106866926779L;

    private static final String CARD_HOME = "home";
    private static final String CARD_ROLECALL = "roleCall";
    private static final String CARD_SESSION = "session";
    private static final String CARD_SETTING = "setting";

    private JPanel homePanel;
    private JPanel rolecallPanel;
    private JPanel sessionPanel;
    private JPanel settingPanel;

    private JPanel mainPanel = new JPanel();

//    private Conference conference;

    public Window() {
        initPanel();
        initFrame();

    }

    private void initPanel() {
        homePanel = new HomePanel(this);
        rolecallPanel = new RolecallPanel(this);
        sessionPanel = new SessionPanel(this);
        settingPanel = new SessionPanel(this);
    }

    private void initFrame() {
        mainPanel.setLayout(new CardLayout());

        mainPanel.add(homePanel, CARD_HOME);
        mainPanel.add(rolecallPanel, CARD_ROLECALL);
        mainPanel.add(sessionPanel, CARD_SESSION);
        mainPanel.add(settingPanel, CARD_SETTING);

        getContentPane().add(mainPanel);
        pack();
    }

    public void switch_to_rolecallPanel() {
        showPage(CARD_ROLECALL);
    }

    public void switch_to_sessionPanel() {
        showPage(CARD_SESSION);
    }

    public void switch_to_homePanel() {
        showPage(CARD_HOME);
    }

    public void switch_to_settingPanel() {
        showPage(CARD_SETTING);
    }

    private void showPage(String panelName) {
        ((CardLayout) mainPanel.getLayout())
                .show(mainPanel, panelName);
    }

    public static void main(String [] args) {
        SwingConsole.run(new Window());
    }
}
