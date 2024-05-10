package View;
import java.awt.Color;
import java.awt.Font;

public class JLabel extends javax.swing.JLabel
{
    public JLabel(String text , int textSize , Color color, int style)
    {
        Font font = new Font("Segoe UI", style, textSize);
        setFont(font);
        setText(text);
        setForeground(color);
    }
}




