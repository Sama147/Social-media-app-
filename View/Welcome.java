package View;
import java.awt.*;
import javax.swing.*;


public class Welcome
{
    public Welcome()
    {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(53,84,76,84));
        panel.setBackground(null);
        panel.add(new JLabel("Welcome", 40, GUIconstants.blue, Font.BOLD) , BorderLayout.NORTH);
        JPanel center = new JPanel(new GridLayout(6,1,10,10));
        center.setBackground(null);
        center.setBorder(BorderFactory.createEmptyBorder(22,231,17,231));

        JTextField username = new JTextField("Username");
        center.add(username);

        JTextField password = new JTextField("Password");
        center.add(password);

        JTextField confirmPassword = new JTextField("Confirm Password");
        center.add(confirmPassword);

        JTextField bio = new JTextField("Bio");
        center.add(bio);

        JButton createAcc = new JButton("Create Account",45, 20);

        center.add(createAcc);

        panel.add(center, BorderLayout.CENTER);

        JLabel login = new JLabel("Have an account? Login", 20 , GUIconstants.black, Font.BOLD);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setHorizontalAlignment(JLabel.CENTER);
        panel.add(login, BorderLayout.SOUTH);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
        frame.requestFocus();

    }
}

