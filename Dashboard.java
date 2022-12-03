import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard {
    JFrame frame;
    JLabel title, title2, pic;
    JButton placeOrder, sellProduct, about, logout;
    Image image = new ImageIcon(this.getClass().getResource("/Images/image.png")).getImage();

    Dashboard(){
        frame = new JFrame("Dashboard: Super Market Billing System");
        title = new JLabel("Super Market Billing System");
        title.setBounds(200,30,300,25);
        title.setFont(new Font(null,Font.BOLD,16));
        title.setForeground(Color.white);
        title2 = new JLabel("Admin Dashboard");
        title2.setBounds(40,60,130,35);
        title2.setFont(new Font(null,Font.BOLD,14));
        title2.setForeground(Color.white);
        pic = new JLabel();
        pic.setBounds(200,70,300,300);
        pic.setIcon(new ImageIcon(image));
        pic.setFocusable(false);
        placeOrder = new JButton("Place Order");
        placeOrder.setBounds(40,100,130,20);
        placeOrder.setFocusable(false);

        placeOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                PlaceOrder.main(new String [] {});
            }
        });

        about = new JButton("About Project");
        about.setBounds(40,130,130,20);
        about.setFocusable(false);

        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                About.main(new String[]{});
            }
        });

        logout = new JButton("Logout and Exit");
        logout.setBounds(40,160,130,20);
        logout.setFocusable(false);

        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();  
            }
        });
        
        frame.add(title);
        frame.add(title2);
        frame.add(pic);
        frame.add(placeOrder);
        frame.add(about);
        frame.add(logout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
    }
    public static void main(String args[]) {
        new Dashboard();
    }
}