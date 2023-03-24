import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Demo {
    JFrame frame;
    JLabel label;
    public static void main (String[] args) {
        Demo demo = new Demo();
        demo.go();
    }

    public void go() {
        JPanel panel = new JPanel();
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        JButton labelButton = new JButton();
        JButton colorButton = new JButton();
        label = new JLabel("I'm a label.");

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorButton.setText("Click to Change Color");
        labelButton.setText("Click to Change Label");

        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(labelButton);
        panel.add(colorButton);

        frame.getContentPane().add(BorderLayout.EAST,  panel);
        frame.getContentPane().add(BorderLayout.WEST,  label);
        frame.getContentPane().add(BorderLayout.CENTER,  myDrawPanel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch");
        }
    }
}
