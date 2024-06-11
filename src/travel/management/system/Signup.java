package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //package for actionlistener who is use to triger the action button

public class Signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfusername, tfname, tfpass, tfans;
    Choice squs;
    
    Signup(){
        setBounds(350,200,900,400);
        setBackground(Color.WHITE);
        setBackground(new Color(100, 150, 200));
        setLayout(null);
        
        //getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(100, 150, 200));
        p1.setBounds(500,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup1.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,80,200,200);
        image.setBorder(BorderFactory.createEmptyBorder());
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 30, 450, 300);
        add(p2);
        
        JLabel lBlusername = new JLabel("Username:");
        lBlusername.setBounds(25,10,100,25);
        lBlusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(140,10,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lBlname = new JLabel("Full Name:");
        lBlname.setBounds(25,55,100,25);
        lBlname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlname);
        
        tfname = new JTextField();
        tfname.setBounds(140,55,300,30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfname);
        
        JLabel lBlpass = new JLabel("Password:");
        lBlpass.setBounds(25,100,100,25);
        lBlpass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlpass);
        
        tfpass = new JTextField();
        tfpass.setBounds(140,100,300,30);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpass);
        
        JLabel lBlsqus = new JLabel("Security Qustion:");
        lBlsqus.setBounds(25,145,200,25);
        lBlsqus.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlsqus);
        
        squs = new Choice();
        squs.add("Place of Birth");
        squs.add("Year of Birth");
        squs.add("Favourite Color");
        squs.add("Childhood Name");
        squs.setBounds(240, 145, 200, 25);
        p2.add(squs);
        
        JLabel lBlans = new JLabel("Answer:");
        lBlans.setBounds(25,190,200,25);
        lBlans.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lBlans);
        
        tfans = new JTextField();
        tfans.setBounds(140,190,300,30);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfans);
        
        create = new JButton("Create");
        create.setBackground(new Color(100,150,200));
        create.setForeground(Color.white);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(140, 260, 100, 30);
        create.addActionListener(this);
        p2.add(create);
        
        back = new JButton("Back");
        back.setBackground(new Color(100,150,200));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(280, 260, 100, 30);
        back.addActionListener(this);
        p2.add(back);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpass.getText();
            String security = squs.getSelectedItem();
            String answer = tfans.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            try {
               connect c = new connect();
               c.s.executeUpdate(query);
               
               JOptionPane.showConfirmDialog(null, "Account Created Successfully");
               
               setVisible(false);
               new Login();
            } catch (Exception e){ 
                e.printStackTrace();
            }
        } else if (ae.getSource() == back){
           setVisible(false);
           new Login();
        }
        
            
    }
    
    public static void main(String[] args){
        new Signup();
    }
    
}
