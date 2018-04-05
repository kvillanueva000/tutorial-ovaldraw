import javax.swing.JFrame;

public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");

        JFrame myFrame = new JFrame();
        myFrame.setTitle("OvalDraw");
        myFrame.setBounds(200,200,300,400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}