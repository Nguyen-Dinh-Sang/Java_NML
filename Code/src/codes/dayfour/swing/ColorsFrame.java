package codes.dayfour.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorsFrame extends JFrame {
    private JLabel jLabel;
    private JButton jButtonRed;
    private JButton jButtonBlue;
    private JButton jButtonYellow;
    private JPanel jPanel;

    public ColorsFrame() {
        jLabel = new JLabel("Click a button to select a color");
        jButtonRed = new JButton("Red");
        jButtonRed.addActionListener(new RedButtonListener());
        jButtonBlue = new JButton("Blue");
        jButtonYellow = new JButton("Yellow");

        jPanel = new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jButtonRed);
        jPanel.add(jButtonBlue);
        jPanel.add(jButtonYellow);

        add(jPanel);

        setTitle("Colors");
        setSize(200, 125);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class RedButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.RED);
            jLabel.setForeground(Color.BLUE);
        }
    }


    public static void main(String[] args) {
        ColorsFrame colorsFrame = new ColorsFrame();
    }
}


