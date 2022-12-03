import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ending {
    Ending(){
        JFrame frame = new JFrame("Payment");
        JLabel title = new JLabel("Payment Method");
        JTextArea title2 = new JTextArea();
        JButton logout, back;
        JRadioButton rb1, rb2, rb3;
        ButtonGroup b1 = new ButtonGroup();
        title.setBounds(20,10,450,40);
        title.setForeground(Color.white);
        title.setFont(new Font(null,Font.BOLD,25));
        rb1 = new JRadioButton("Cash");
        rb1.setBounds(30,50,100,30);
        rb1.setBackground(new Color(0x2A3457));
        rb1.setForeground(Color.white);
        rb1.setFont(new Font(null,Font.PLAIN,15));
        rb1.setFocusable(false);
        rb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                title2.setBounds(30,150,450,80);
                title2.setText("Please pay by cash on the Counter."+"\nThankyou for shopping.");
                title2.setFont(new Font(null, Font.PLAIN, 16));
                title2.setForeground(Color.white);
                title2.setBackground(new Color(0x2A3457));
                title2.setEditable(false);
                title2.setFont(new Font(null,Font.PLAIN,20));
            }
        });
        rb2 = new JRadioButton("EasyPaisa");
        rb2.setBounds(30,80,100,30);
        rb2.setBackground(new Color(0x2A3457));
        rb2.setForeground(Color.white);
        rb2.setFont(new Font(null,Font.PLAIN,15));
        rb2.setFocusable(false);
        rb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                title2.setBounds(30,150,450,80);
                title2.setText("Please pay by EasyPaisa on 03485925003."+"\nThankyou for shopping.");
                title2.setFont(new Font(null, Font.PLAIN, 16));
                title2.setForeground(Color.white);
                title2.setBackground(new Color(0x2A3457));
                title2.setEditable(false);
                title2.setFont(new Font(null,Font.PLAIN,20));
            }
        });
        rb3 = new JRadioButton("JazzCash");
        rb3.setBounds(30,110,100,30);
        rb3.setBackground(new Color(0x2A3457));
        rb3.setForeground(Color.white);
        rb3.setFont(new Font(null,Font.PLAIN,15));
        rb3.setFocusable(false);
        rb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                title2.setBounds(30,150,450,80);
                title2.setText("Please pay by JazzCash on 03063042420."+"\nThankyou for shopping.");
                title2.setFont(new Font(null, Font.PLAIN, 16));
                title2.setForeground(Color.white);
                title2.setBackground(new Color(0x2A3457));
                title2.setEditable(false);
                title2.setFont(new Font(null,Font.PLAIN,20));
            }
        });
        b1.add(rb1); b1.add(rb2); b1.add(rb3);
        logout = new JButton("Logout and Exit");
        logout.setBounds(300,50,130,30);
        logout.setFocusable(false);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
            }
        });
        back = new JButton("Back");
        back.setBounds(300,90,130,30);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                PlaceOrder.main(new String[] {});
                frame.dispose();
            }
        });
        frame.add(title); frame.add(title2);
        frame.add(rb1); frame.add(rb2); frame.add(rb3);
        frame.add(logout); frame.add(back);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ending();
    }
}
