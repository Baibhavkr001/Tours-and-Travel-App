package travel.management.system;

import javax.swing.*;
import java.awt.*;
//import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, fpass;
    JTextField tfusername, tfpass;
    
    Login() {
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        
        //getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(100, 150, 200));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.png"));
        Image a2 = a1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image = new JLabel(a3);
        image.setBounds(100,80,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        JLabel lBlusername = new JLabel("Username:");
        lBlusername.setBounds(60,20,100,25);
        lBlusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60,50,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lBlpass = new JLabel("Password:");
        lBlpass.setBounds(60,100,100,25);
        lBlpass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlpass);
        
        tfpass = new JTextField();
        tfpass.setBounds(60,130,300,30);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpass);
        
        login = new JButton("Login");
        login.setBounds(60,190,130,30);
        login.setBackground(new Color(100,150,200));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        p2.add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(230,190,130,30);
        signup.setBackground(new Color(100,150,200));
        signup.setForeground(Color.WHITE);
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.addActionListener(this);
        p2.add(signup);
        
        fpass = new JButton("Forgot Password");
        fpass.setBounds(150,245,130,30);
        fpass.setBackground(new Color(100,150,200));
        fpass.setForeground(Color.WHITE);
        fpass.setBorder(BorderFactory.createEmptyBorder());
        fpass.addActionListener(this);
        p2.add(fpass);
        
        //JLabel text = new JLabel("Trouble in login...");
        //text.setBounds(300,250,150,20);
        //text.setForeground(Color.red);
        //p2.add(text);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){ 
            if(ae.getSource()== login){
                try {
                    String username = tfusername.getText();
                    String password = tfpass.getText();
                    
                    String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
                    connect c = new connect();
                    ResultSet rs = c.s.executeQuery(query);
                    if(rs.next()){
                        setVisible(false);
                        new loading(username);
                    }else {
                        JOptionPane.showMessageDialog(null, "Incorrect username or password");
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            
        }else if(ae.getSource()== signup){
            setVisible(false);
            new Signup();
        }else {
            setVisible(false);
            new ForgotPassword();
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
