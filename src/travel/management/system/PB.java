package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //package for actionlistener who is use to triger the action button

public class PB extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfusername, tfname, tfpass, tfans;
    Choice squs;
    
    PB(){
        setBounds(293,88,1092,640);
        setBackground(Color.WHITE);
        setBackground(new Color(100, 150, 200));
        setLayout(null);
        
        //getContentPane().setBackground(Color.white);
        
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/bookhotel.jpg"));
        Image b = a.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT);
        ImageIcon d = new ImageIcon(b);
        JLabel desk = new JLabel(d);
        desk.setBounds(0,0,1092,640);
        add(desk);
        
//        JLabel lBlusername = new JLabel("Username:");
//        lBlusername.setBounds(25,10,100,25);
//        lBlusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
//        p2.add(lBlusername);
//        
//        tfusername = new JTextField();
//        tfusername.setBounds(140,10,300,30);
//        tfusername.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(tfusername);
//        
//        JLabel lBlname = new JLabel("Full Name:");
//        lBlname.setBounds(25,55,100,25);
//        lBlname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
//        p2.add(lBlname);
//        
//        tfname = new JTextField();
//        tfname.setBounds(140,55,300,30);
//        tfname.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(tfname);
//        
//        JLabel lBlpass = new JLabel("Password:");
//        lBlpass.setBounds(25,100,100,25);
//        lBlpass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
//        p2.add(lBlpass);
//        
//        tfpass = new JTextField();
//        tfpass.setBounds(140,100,300,30);
//        tfpass.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(tfpass);
//        
//        JLabel lBlsqus = new JLabel("Security Qustion:");
//        lBlsqus.setBounds(25,145,200,25);
//        lBlsqus.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
//        p2.add(lBlsqus);
//        
//        
//        JLabel lBlans = new JLabel("Answer:");
//        lBlans.setBounds(25,190,200,25);
//        lBlans.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
//        p2.add(lBlans);
//        
//        tfans = new JTextField();
//        tfans.setBounds(140,190,300,30);
//        tfans.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(tfans);
//        
//        create = new JButton("Create");
//        create.setBackground(new Color(100,150,200));
//        create.setForeground(Color.white);
//        create.setFont(new Font("Tahoma",Font.BOLD,14));
//        create.setBounds(140, 260, 100, 30);
//        create.addActionListener(this);
//        p2.add(create);
//        
//        back = new JButton("Back");
//        back.setBackground(new Color(100,150,200));
//        back.setForeground(Color.white);
//        back.setFont(new Font("Tahoma",Font.BOLD,14));
//        back.setBounds(280, 260, 100, 30);
//        back.addActionListener(this);
//        p2.add(back);
//        
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
        new PB();
    }
    
}
