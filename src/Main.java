import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        ImageIcon icon = new ImageIcon(new URL("https://i.pinimg.com/originals/c5/17/da/c517da1b29ac7d142f40f489fb9d32ce.jpg"));
        icon.setImage(icon.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT));
        JPanel panel = new JPanel();
        JLabel bild = new JLabel(icon);
        panel.add(bild);

        JOptionPane.showMessageDialog(
                null, panel,
                "Bild Beispiel", JOptionPane.PLAIN_MESSAGE
        );

    }
}
