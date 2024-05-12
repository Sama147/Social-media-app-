package org.example.yallaBena;
import javafx.scene.control.TextFormatter;
import java.util.function.UnaryOperator;

public class PasswordFormatter extends TextFormatter<String> {


    public PasswordFormatter(UnaryOperator<Change> unaryOperator) {
        super((UnaryOperator<TextFormatter.Change>) change -> {
            String newText = change.getControlNewText();
            StringBuilder stars = new StringBuilder();

            for (int i = 0; i < newText.length(); i++) {
                stars.append("*");
            }
            change.setText(stars.toString());
            change.setRange(0, newText.length());
            change.setCaretPosition(newText.length());
            change.setAnchor(newText.length());
            return change;
        });
    }

}
