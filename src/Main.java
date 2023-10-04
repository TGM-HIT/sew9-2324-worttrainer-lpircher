import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean weiter = true;
        while(weiter) {

            Paar p = new Paar("C:\\Users\\Lisa\\Desktop\\5DHIT\\SEW\\Workspace\\Worttrainer2\\src\\wortpaare.json");

            String auswahl = p.zufallsauswahl();

            //System.out.println(auswahl);

            String bezeichnung = "";
            String url = "";

            String[] parts = auswahl.split(" - ");

            if (parts.length == 2) {
                bezeichnung = parts[0];
                url = parts[1];
            } else {
                System.err.println("Ungültiges Format: " + auswahl);
            }

            ImageIcon icon = new ImageIcon(new URL(url));
            icon.setImage(icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));

            JPanel panel = new JPanel(new BorderLayout());
            JLabel bild = new JLabel(icon);
            JTextField eingabe = new JTextField(10);
            panel.add(eingabe, BorderLayout.CENTER);
            panel.add(bild, BorderLayout.NORTH);
            int result = JOptionPane.showOptionDialog(
                    null, panel, "Worttrainer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null
            );
            if (result == JOptionPane.CANCEL_OPTION || result == JOptionPane.CLOSED_OPTION) {
                weiter = false;
            } else {

            }

        }
    }
}
