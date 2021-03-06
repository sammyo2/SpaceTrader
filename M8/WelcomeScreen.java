import javax.swing.*;
import java.awt.*;

public class WelcomeScreen {
    public WelcomeScreen() {
        JFrame frame = new JFrame("Welcome Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        JLabel label = new JLabel("Welcome to Space Trader!", SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.NORTH);
        JButton startButton = new JButton("Click to Start");
        startButton.setPreferredSize(new Dimension(100, 20));
        startButton.addActionListener(e ->
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                            ConfigurationScreen app = new ConfigurationScreen();
                            frame.dispose();
                    }
                }));
        frame.getContentPane().add(startButton, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WelcomeScreen app = new WelcomeScreen();
            }
        });
    }
}