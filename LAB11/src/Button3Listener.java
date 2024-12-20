import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Button3Listener implements ActionListener {
    JPanel panel1;
    JPanel panel2;

    public Button3Listener(JPanel panel1, JPanel panel2) {
        this.panel1 = panel1;
        this.panel2 = panel2;
    }

    private Color setNewColor(int i){
        Color c = Color.BLACK;
        switch (i){
            case 0:
                c = Color.RED;
                break;
            case 1:
                c = Color.GREEN;
                break;
            case 2:
                c = Color.BLUE;
                break;
            case 3:
                c = Color.YELLOW;
                break;
            case 4:
                c = Color.MAGENTA;
                break;
            default:
                c = Color.BLACK;
                break;
        }
        return c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        panel1.setBackground(setNewColor(rand.nextInt(4)));
        panel2.setBackground(setNewColor(rand.nextInt(4)));
    }
}
