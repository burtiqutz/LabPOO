import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Listener implements ActionListener {

    private int count;
    JLabel label;
    public Button1Listener(JLabel label) {
        count = 0;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        this.label.setText(count + "");
    }
}
