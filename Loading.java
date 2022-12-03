import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
public class Loading {
    JFrame frame = new JFrame("Please Wait");
    JLabel title = new JLabel("Super Market Billing System");
    JProgressBar bar = new JProgressBar();
    Loading(){
        title.setBounds(50,50,450,40);
        title.setForeground(Color.white);
        title.setFont(new Font(null,Font.BOLD,29));
        bar.setValue(0);
        bar.setBounds(50,150,385,20);
        bar.setForeground(new Color(0x16235A));
        bar.setBackground(Color.white);
        frame.add(title);
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
        fill();
    }
    public void fill() {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter +=1;
        }
        frame.dispose();
        LoginPage.main(new String[]{});
    }
    public static void main(String args[]) {
        new Loading();
    }
}