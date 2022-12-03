import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlaceOrder {
    JFrame frame;
    JLabel title, product, price, quantity, Total, item1, item2, item3, item4, item5,
    price1, price2, price3, price4, price5, Price;
    JTextField quan1, quan2, quan3, quan4, quan5, total1, total2, total3, total4, total5, total, 
    Bill;
    JButton back, bill, clear, next;
    int proceed;
    PlaceOrder(){
        frame = new JFrame("Place Order");
        title = new JLabel("Place Order");
        title.setBounds(10,10,300,30);
        title.setFont(new Font(null,Font.BOLD,25));
        title.setForeground(Color.white);
        back = new JButton("Back");
        back.setBounds(580,10,80,30);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                Dashboard.main(new String[] {});
            }
        });
        product = new JLabel("Product");
        product.setBounds(30,50,100,20);
        product.setFont(new Font(null,Font.BOLD,15));
        product.setForeground(Color.white);
        item1 = new JLabel("Milk");
        item1.setBounds(30,90,100,20);
        item1.setFont(new Font(null,Font.PLAIN,15));
        item1.setForeground(Color.white);
        item2 = new JLabel("Eggs");
        item2.setBounds(30,120,100,20);
        item2.setFont(new Font(null,Font.PLAIN,15));
        item2.setForeground(Color.white);
        item3 = new JLabel("Biscuits");
        item3.setBounds(30,150,100,20);
        item3.setFont(new Font(null,Font.PLAIN,15));
        item3.setForeground(Color.white);
        item4 = new JLabel("Soft Drinks");
        item4.setBounds(30,180,100,20);
        item4.setFont(new Font(null,Font.PLAIN,15));
        item4.setForeground(Color.white);
        item5 = new JLabel("Bread");
        item5.setBounds(30,210,100,20);
        item5.setFont(new Font(null,Font.PLAIN,15));
        item5.setForeground(Color.white);
        price = new JLabel("Price");
        price.setBounds(180,50,100,20);
        price.setFont(new Font(null,Font.BOLD,15));
        price.setForeground(Color.white);
        price1 = new JLabel("Rs.150");
        price1.setBounds(180,90,100,20);
        price1.setFont(new Font(null,Font.PLAIN,15));
        price1.setForeground(Color.white);
        price2 = new JLabel("Rs.15");
        price2.setBounds(180,120,100,20);
        price2.setFont(new Font(null,Font.PLAIN,15));
        price2.setForeground(Color.white);
        price3 = new JLabel("Rs.30");
        price3.setBounds(180,150,100,20);
        price3.setFont(new Font(null,Font.PLAIN,15));
        price3.setForeground(Color.white);
        price4 = new JLabel("Rs.120");
        price4.setBounds(180,180,100,20);
        price4.setFont(new Font(null,Font.PLAIN,15));
        price4.setForeground(Color.white);
        price5 = new JLabel("Rs.90");
        price5.setBounds(180,210,100,20);
        price5.setFont(new Font(null,Font.PLAIN,15));
        price5.setForeground(Color.white);
        quantity = new JLabel("Quantity");
        quantity.setBounds(330,50,100,20);
        quantity.setFont(new Font(null,Font.BOLD,15));
        quantity.setForeground(Color.white);
        quan1 = new JTextField();
        quan1.setBounds(330,90,65,20);
        quan1.setFont(new Font(null,Font.BOLD,15));
        quan1.setText("0");
        quan2 = new JTextField();
        quan2.setBounds(330,120,65,20);
        quan2.setFont(new Font(null,Font.BOLD,15));
        quan2.setText("0");
        quan3 = new JTextField();
        quan3.setBounds(330,150,65,20);
        quan3.setFont(new Font(null,Font.BOLD,15));
        quan3.setText("0");
        quan4 = new JTextField();
        quan4.setBounds(330,180,65,20);
        quan4.setFont(new Font(null,Font.BOLD,15));
        quan4.setText("0");
        quan5 = new JTextField();
        quan5.setBounds(330,210,65,20);
        quan5.setFont(new Font(null,Font.BOLD,15));
        quan5.setText("0");
        Price = new JLabel("Sub Total");
        Price.setBounds(480,50,100,20);
        Price.setFont(new Font(null,Font.BOLD,15));
        Price.setForeground(Color.white);
        total1 = new JTextField();
        total1.setBounds(480,90,65,20);
        total1.setFont(new Font(null,Font.BOLD,15));
        total1.setText("0");
        total1.setEditable(false);
        total2 = new JTextField();
        total2.setBounds(480,120,65,20);
        total2.setFont(new Font(null,Font.BOLD,15));
        total2.setText("0");
        total2.setEditable(false);
        total3 = new JTextField();
        total3.setBounds(480,150,65,20);
        total3.setFont(new Font(null,Font.BOLD,15));
        total3.setText("0");
        total3.setEditable(false);
        total4 = new JTextField();
        total4.setBounds(480,180,65,20);
        total4.setFont(new Font(null,Font.BOLD,15));
        total4.setText("0");
        total4.setEditable(false);
        total5 = new JTextField();
        total5.setBounds(480,210,65,20);
        total5.setFont(new Font(null,Font.BOLD,15));
        total5.setText("0");
        total5.setEditable(false);
        Total = new JLabel("Total");
        Total.setBounds(180,300,300,30);
        Total.setFont(new Font(null,Font.BOLD,25));
        Total.setForeground(Color.white);
        total = new JTextField();
        total.setBounds(330,300,85,30);
        total.setFont(new Font(null,Font.BOLD,25));
        total.setText("0");
        total.setEditable(false);
        Bill = new JTextField();
        Bill.setBounds(460,300,85,30);
        Bill.setFont(new Font(null,Font.BOLD,25));
        Bill.setText("0");
        Bill.setEditable(false);
        bill = new JButton("Calculate");
        bill.setBounds(580,300,100,30);
        bill.setFont(new Font(null,Font.BOLD,13));
        bill.setFocusable(false);
        bill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int p1, p2, p3, p4, p5, quantity, cost;
                String s1 = quan1.getText();
                String s2 = quan2.getText();
                String s3 = quan3.getText();
                String s4 = quan4.getText();
                String s5 = quan5.getText();
                p1 = Integer.parseInt(s1) * 150;
                p2 = Integer.parseInt(s2) * 15;
                p3 = Integer.parseInt(s3) * 30;
                p4 = Integer.parseInt(s4) * 120;
                p5 = Integer.parseInt(s5) * 90;
                String c1 = String.valueOf(p1);
                String c2 = String.valueOf(p2);
                String c3 = String.valueOf(p3);
                String c4 = String.valueOf(p4);
                String c5 = String.valueOf(p5);
                quantity = 
                Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3)+
                Integer.parseInt(s4)+Integer.parseInt(s5);
                cost = p1 + p2 + p3 + p4 + p5;
                proceed = cost;
                total1.setText(c1);
                total2.setText(c2);
                total3.setText(c3);
                total4.setText(c4);
                total5.setText(c5);
                String c6 = String.valueOf(quantity);
                total.setText(c6);
                String c7 = String.valueOf(cost);
                Bill.setText(c7);
            }
        });
        clear = new JButton("Clear");
        clear.setBounds(580,50,80,30);
        clear.setFocusable(false);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                quan1.setText("0");
                quan2.setText("0");
                quan3.setText("0");
                quan4.setText("0");
                quan5.setText("0");
                total1.setText("0");
                total2.setText("0");
                total3.setText("0");
                total4.setText("0");
                total5.setText("0");
                total.setText("0");
                Bill.setText("0");
            }
        });
        next = new JButton("Next");
        next.setBounds(580,340,100,30);
        next.setFocusable(false);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(proceed == 0) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(frame, "Please buy something.");
                }
                else {
                    Ending.main(new String[] {});
                    frame.dispose();
                }
            }
        });
        frame.add(title); frame.add(back); frame.add(bill);
        frame.add(clear); frame.add(next);
        frame.add(product); frame.add(price); frame.add(quantity);
        frame.add(item1); frame.add(item2); frame.add(item3);
        frame.add(item4); frame.add(item5);
        frame.add(price1); frame.add(price2); frame.add(price3);
        frame.add(price4); frame.add(price5);
        frame.add(quan1); frame.add(quan2); frame.add(quan3);
        frame.add(quan4); frame.add(quan5);
        frame.add(total1); frame.add(total2); frame.add(total3);
        frame.add(total4); frame.add(total5);
        frame.add(Total); frame.add(total); frame.add(Price); 
        frame.add(Bill);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,500);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        frame.setLayout(null);
        frame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
    }
    public static void main(String[] args) {
        new PlaceOrder();
    }
}