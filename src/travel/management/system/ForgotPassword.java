package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class ForgotPassword extends JFrame implements ActionListener {
    
    JTextField tfusername, tfname, tfsqus, tfans, tfpass;
    JButton back, search, retrieve;
    
    
    ForgotPassword(){
        setBounds(350, 200, 900, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,300);
        add(p1);
        
        JLabel lbltitle = new JLabel("Retrieve Your Password");
        lbltitle.setFont(new Font("Tahoma", Font.BOLD, 25));
        lbltitle.setBounds(60, 10, 500, 25);
        p1.add(lbltitle);
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblusername.setBounds(20, 60, 100, 25);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(130,60,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name:");
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblname.setBounds(20, 100, 100, 25);
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(130,100,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblsqus = new JLabel("Sec. Qus.:");
        lblsqus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblsqus.setBounds(20, 140, 100, 25);
        p1.add(lblsqus);
        
        tfsqus = new JTextField();
        tfsqus.setBounds(130,140,200,25);
        tfsqus.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsqus);
        
        JLabel lblans = new JLabel("Answer:");
        lblans.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblans.setBounds(20, 180, 100, 25);
        p1.add(lblans);
        
        tfans = new JTextField();
        tfans.setBounds(130,180,200,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);
        
        JLabel lblpass = new JLabel("Password:");
        lblpass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpass.setBounds(20, 220, 100, 25);
        p1.add(lblpass);
        
        tfpass = new JTextField();
        tfpass.setBounds(130,220,200,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);
        
        back = new JButton("Back");
        back.setBackground(new Color(100,150,200));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(170, 255, 100, 25);
        back.addActionListener(this);
        p1.add(back);
        
        search = new JButton("Search");
        search.setBackground(new Color(100,150,200));
        search.setForeground(Color.white);
        search.setFont(new Font("Tahoma",Font.BOLD,14));
        search.setBounds(350, 60, 100, 25);
        search.addActionListener(this);
        p1.add(search);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(new Color(100,150,200));
        retrieve.setForeground(Color.white);
        retrieve.setFont(new Font("Tahoma",Font.BOLD,14));
        retrieve.setBounds(350, 180, 100, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== search){
           //hit query
           try {
               String query = "select * from account where username = '"+tfusername.getText()+"'";
               connect c = new connect();
               
               ResultSet rs = c.s.executeQuery(query);
               //now,looping the object(rs) of ResultSet to find feilds
               while(rs.next()){
                   tfname.setText(rs.getString("name"));
                   tfsqus.setText(rs.getString("security"));
                   rs.getString("security");  
               }
           }catch(Exception e){
               e.printStackTrace();
           }
        }else if(ae.getSource()==retrieve){
             //hit query
            try {
               String query = "select * from account where username = '"+tfusername.getText()+"' AND answer = '"+tfans.getText()+"'";
               connect c = new connect();
               
               ResultSet rs = c.s.executeQuery(query);
               //now,looping the object(rs) of ResultSet to find feilds
               while(rs.next()){
                   tfpass.setText(rs.getString("password"));  
               }
           }catch(Exception e){
               e.printStackTrace();
           }
            
        }else {
        setVisible(false);
        new Login();
    }
    }
    public static void main(String[] args){
        new ForgotPassword();
    }
}
        
        
        