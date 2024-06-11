/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class profile extends JFrame implements ActionListener {
    
    JButton back;
    JLabel labelemail;
    profile(String username){
        setBounds(293,88,1092,640);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(50, 50, 150, 25);
        add(lblusername);
       
        JLabel labelusername = new JLabel();
        labelusername.setBounds(240,50,150,25);
        add(labelusername);
        
        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(50, 90, 150, 25);
        add(lblname);
       
        JLabel labelname = new JLabel();
        labelname.setBounds(240,90,150,25);
        add(labelname);
        
        JLabel lblid = new JLabel("ID :");
        lblid.setBounds(50, 130, 150, 25);
        add(lblid);
       
        JLabel labelid = new JLabel();
        labelid.setBounds(240,130,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number :");
        lblnumber.setBounds(50, 170, 150, 25);
        add(lblnumber);
       
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(240,170,150,25);
        add(labelnumber);
        
        JLabel lblgender = new JLabel("Gender :");
        lblgender.setBounds(50, 210, 150, 25);
        add(lblgender);
       
        JLabel labelgender = new JLabel();
        labelgender.setBounds(240,210,150,25);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country :");
        lblcountry.setBounds(50, 250, 150, 25);
        add(lblcountry);
       
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(240,250,150,25);
        add(labelcountry);
        
        JLabel lbladdress = new JLabel("Address :");
        lbladdress.setBounds(50, 290, 150, 25);
        add(lbladdress);
       
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(240,290,150,25);
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone no. :");
        lblphone.setBounds(50, 330, 150, 25);
        add(lblphone);
       
        JLabel labelphone = new JLabel();
        labelphone.setBounds(240,330,150,25);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email :");
        lblemail.setBounds(50, 370, 150, 25);
        add(lblemail);
       
        labelemail = new JLabel();
        labelemail.setBounds(240,370,250,25);
        add(labelemail);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(280,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icons/viewall.jpg")); 
        Image i2 = i1.getImage().getScaledInstance (600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel image = new JLabel (i3);
        image.setBounds (450, 400, 600,200);
        add (image);
        
//        ImageIcon i4 = new ImageIcon (ClassLoader.getSystemResource ("icons/viewall.jpg")); 
//        Image i5 = i4.getImage().getScaledInstance (600, 200, Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon (i5);
//        JLabel image2 = new JLabel (i6);
//        image.setBounds (600, 400, 600,200);
//        add (image);
        
        try {
            connect c = new connect();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
        }
        } catch (Exception e){
            e.printStackTrace();
        }

        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[]args){
        new profile("");
    }
    
}
