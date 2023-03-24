import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics graphics) {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color color = new Color(red, green, blue);

        Image image = new ImageIcon("abc.png").getImage();
        graphics.drawImage(image, 3, 4, this);

        graphics.setColor(color);
        graphics.fillOval(70, 70, 100, 100);
    }
}
