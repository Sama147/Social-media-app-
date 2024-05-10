package View;
import java.awt.*;
import javax.swing.JLabel;

public class JButton  extends JLabel
{
    private Shape shape;
    private int raduis;

    public JButton(String text, int raduis, int textSize)
    {
        super(text);
        this.raduis = raduis;
        Font font = new Font("Segoe UI", Font.BOLD, textSize);
        setFont(font);
        setOpaque(false);
        setForeground(GUIconstants.blue);
        setHorizontalAlignment(CENTER);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setForeground(GUIconstants.blue);

    }
}
