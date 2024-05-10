package View;

public class JFrame extends javax.swing.JFrame
{
    public JFrame()
        {
            super ("Social media platform");
            getContentPane().setBackground(GUIconstants.background);
            setSize(1000,700);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }
}

