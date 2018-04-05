import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;

class Oval extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(new Color(0,0,255));
        g.fillOval(0,0,panelWidth,panelHeight);
    }
}

public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");

        JFrame myFrame = new JFrame();
        myFrame.setTitle("OvalDraw");
        myFrame.setBounds(200,200,300,400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval();
        Container contentPane = myFrame.getContentPane();
        contentPane.add(myOval);
    }
}