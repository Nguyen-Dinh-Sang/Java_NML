package codes.dayfour.swing;

import javax.swing.*;   // Needed for Swing classes
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class extends the JFrame class. Its constructor displays
 * a simple window with a title. The application exits when the
 * user clicks the close button.
 */

public class SimpleWindow extends JFrame {
    /**
     * Constructor
     */


    private JLabel message;
    private JTextField kilometers;
    private JButton calcButton;
    private JPanel panel;

    public SimpleWindow() {
        message = new JLabel("Enter a distance in kilometers");
        kilometers = new JTextField(20);

        calcButton = new JButton("Calculate");
        calcButton.setForeground(Color.RED);
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Đã nhấn");
            }
        });

        JRadioButton hours = new JRadioButton("Hours");
        JRadioButton minutes = new JRadioButton("Minutes");
        JRadioButton seconds = new JRadioButton("Seconds");
        JRadioButton days = new JRadioButton("Days");
        JRadioButton months = new JRadioButton("Months");
        JRadioButton years = new JRadioButton("Years");

        ButtonGroup timeOfDayButtonGroup = new ButtonGroup();
        ButtonGroup dateButtonGroup = new ButtonGroup();

        timeOfDayButtonGroup.add(hours);
        timeOfDayButtonGroup.add(minutes);
        timeOfDayButtonGroup.add(seconds);

        dateButtonGroup.add(days);
        dateButtonGroup.add(months);
        dateButtonGroup.add(years);

        JCheckBox jCheckBox = new JCheckBox("ABC");

        panel = new JPanel();
        panel.add(message);
        panel.add(kilometers);
        panel.add(calcButton);
        panel.add(hours);
        panel.add(minutes);
        panel.add(seconds);
        panel.add(days);
        panel.add(months);
        panel.add(years);
        panel.add(jCheckBox);

        final int WINDOW_WIDTH = 350;   // Window width in pixels
        final int WINDOW_HEIGHT = 250;  // Window height in pixels

        add(panel);

        // Set this window's title.
        setTitle("A Simple Window");

        // Set the size of this window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        setVisible(true);
    }
}
