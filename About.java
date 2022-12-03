import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class About {
    JFrame frame;
    JLabel title1, pic, made, saif, taha, talha, sajid;
    JButton close;
    Image image = new ImageIcon(this.getClass().getResource("/Images/image.png")).getImage();

    About(){
        frame = new JFrame("About project");
        title1 = new JLabel("About Super Market Billing System");
        title1.setBounds(30,30,400,30);
        title1.setFont(new Font(null,Font.BOLD,20));
        title1.setForeground(Color.white);
        pic = new JLabel();
        pic.setBounds(30,70,300,300);
        pic.setIcon(new ImageIcon(image));
        pic.setFocusable(false);

        JTextArea textArea = new JTextArea(
            "This software project is a supermarket\nbilling system. This system is built for\n" + "bill generation. This system includes\nmany product name, prices and other\n" + "specific data. This system is built to help\nsupermarkets calculate and display bills."
        );
        
        textArea.setFont(new Font(null, Font.PLAIN, 16));
        textArea.setForeground(Color.white);
        textArea.setBackground(new Color(0x2A3457));
        textArea.setBounds(350,70,300,130);
        textArea.setEditable(false);
        made = new JLabel("Made by:");
        made.setFont(new Font(null, Font.BOLD, 16));
        made.setForeground(Color.white);
        made.setBounds(350,200,80,30);
        talha = new JLabel("~ Muhammad Talha");
        talha.setFont(new Font(null, Font.PLAIN, 16));
        talha.setForeground(Color.white);
        talha.setBounds(350,240,200,20);
        saif = new JLabel("~ Saif Ullah");
        saif.setFont(new Font(null, Font.PLAIN, 16));
        saif.setForeground(Color.white);
        saif.setBounds(350,270,200,20);
        taha = new JLabel("~ Muhammad Taha");
        taha.setFont(new Font(null, Font.PLAIN, 16));
        taha.setForeground(Color.white);
        taha.setBounds(350,300,200,20);
        sajid = new JLabel("~ Sajid Saleem");
        sajid.setFont(new Font(null, Font.PLAIN, 16));
        sajid.setForeground(Color.white);
        sajid.setBounds(350,330,200,20);
        close = new JButton("Close");
        close.setBounds(555,360,80,20);
        close.setFocusable(false);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                Dashboard.main(new String [] {});
            }
        });

        frame.add(title1);
        frame.add(pic);
        frame.add(textArea);
        frame.add(made);
        frame.add(talha);
        frame.add(saif);
        frame.add(taha);
        frame.add(sajid);
        frame.add(close);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,450);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        frame.setLayout(null);
        frame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
    }
    public static void main(String[] args) {
        new About();
    }
}
