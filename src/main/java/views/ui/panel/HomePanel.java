package views.ui.panel;

import model.objects.Conference;
import config.GraphicsConfig;
import views.interfaces.PanelSwitch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>Subclass of JPanel for rendering home page.
 * Components in this page include name of Conference,
 * settings, session start, and statistics of Conference</p>
 */
public class HomePanel extends JPanel {

    private static final long serialVersionUID = -2977633553899021068L;

    private JLabel la_ConfName;
    private JLabel la_ConfTopic;
    private PanelSwitch frame;

    private JButton bt_roleCallStart;
    private JButton bt_settings;

    private ActionListener lis_roleCallStart = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            frame.switch_to_rolecallPanel();
        }
    };

    private ActionListener lis_settings = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            frame.switch_to_settingPanel();
        }
    };

    //// FIXME: 7/31/16 component to be added
    private Conference conferenceSetting;


    public HomePanel(PanelSwitch frame) {
        this.frame = frame;

        setLayout(new BorderLayout());

        initTextField();
        initButtons();
        initProductInfo();

//        validate();
//        setVisible(true);
    }

    private void initTextField() {
        la_ConfName = new JLabel();
        la_ConfName.setFont(GraphicsConfig.getTitleFont());
        la_ConfName.setVisible(true);

        la_ConfTopic = new JLabel();
        la_ConfTopic.setFont(GraphicsConfig.getTitleFont());
        la_ConfTopic.setVisible(true);

        //// FIXME: 7/30/16
//        la_ConfName.setText(conferenceSetting.getName());
        la_ConfName.setText("Title");
//        la_ConfTopic.setText(conferenceSetting.getTopic());
        la_ConfTopic.setText("subTitle");

        JPanel confInfo = new JPanel();
        confInfo.setLayout(new BoxLayout(confInfo, BoxLayout.Y_AXIS));
        confInfo.add(la_ConfName);
        confInfo.add(Box.createVerticalStrut(12));
        confInfo.add(la_ConfTopic);
        add(BorderLayout.NORTH, confInfo);
    }

    private void initButtons() {
        bt_roleCallStart = new JButton("Start Session");
        bt_roleCallStart.addActionListener(lis_roleCallStart);

        bt_settings = new JButton("Settings");
        bt_settings.addActionListener(lis_settings);

        JPanel buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
        buttons.add(bt_settings);
        buttons.add(Box.createVerticalStrut(12));
        buttons.add(bt_roleCallStart);
        add(buttons, BorderLayout.EAST);
        add(BorderLayout.EAST, buttons);
    }

    private void initProductInfo() {
        JLabel groupInfo = new JLabel("Product designed by");
        JLabel groupPhoto = new JLabel("Photo");

        JPanel info = new JPanel();
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
        info.add(groupInfo);
        info.add(Box.createVerticalGlue());
        info.add(groupPhoto);
        add(BorderLayout.WEST, info);
    }

}