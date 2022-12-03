import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage implements ActionListener{
    JFrame frame = new JFrame("Login");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    JLabel title = new JLabel("Login Here");

    LoginPage(){
        title.setBounds(150,50,120,25);
        title.setForeground(Color.white);
        title.setFont(new Font(null,Font.BOLD,16));
        userIDLabel.setBounds(50,100,75,25);
        userIDLabel.setForeground(Color.white);
        userPasswordLabel.setBounds(50,150,75,25);
        userPasswordLabel.setForeground(Color.white);
        messageLabel.setBounds(50,240,350,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,16));
        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);
        loginButton.setBounds(125,200,90,30);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        resetButton.setBounds(235,200,90,30);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        frame.add(title);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380,320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x2A3457));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-
        frame.getSize().height/2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            String Username [] = {"Bilal","Taha", "Saif", "Talha", "Sajid"};
            String Password [] = {"Bilal","Taha", "Saif", "Talha", "Sajid"};

            for(int i = 0; i<Password.length; i++) {
                if(userID.equalsIgnoreCase(Username [i]) && password.equalsIgnoreCase(Password [i])) {
                    frame.dispose();
                    Dashboard.main(new String[]{});
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Username and Password do not match");
                }
            }
        }
    }
    public static void main(String args[]) {
        new LoginPage();
    }
}
