package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton logout, addPersonDetails, viewprofile; 
    JButton viewpackages, viewhotels,bookPack,checkpackages,bookpackages;
    String username;
    Dashboard(String username){
        this.username = username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // defoult screen size
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(100,150,200));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(10, 0, 70, 70);
        p1.add(icon);
        
        ImageIcon i0 = new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpeg"));
        Image i4 = i0.getImage().getScaledInstance(1200,1600,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel image = new JLabel(i5);
        image.setBounds(0, 0, 1600, 65);
        add(image);
        
        JLabel heading = new JLabel("Tours & Travel Application");
        heading.setBounds(80, 10, 500, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        logout = new JButton("logout");
        logout.setBounds(1200,16,80,30);
        logout.setBackground(new Color(255,255,255));
        logout.setForeground(Color.blue);
        logout.setFont(new Font("Tahoma", Font.PLAIN, 15));
        logout.addActionListener(this);
        p1.add(logout);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/desk.jpg"));
        Image b = a.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon d = new ImageIcon(b);
        JLabel desk = new JLabel(d);
        desk.setBounds(293,65,1092,640);
        add(desk);
        
        addPersonDetails = new JButton("Add Details");
        addPersonDetails.setBounds(0,0,300,50);
        addPersonDetails.setBackground(new Color(100,150,200));
        addPersonDetails.setForeground(Color.white);
        addPersonDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //addPersonDetails.setMargin(new Insets(0,0,0,60)); //allign line to right from 60.(import package first);
        addPersonDetails.addActionListener(this);
        p2.add(addPersonDetails);
        
        viewprofile = new JButton("Profile");
        viewprofile.setBounds(0,50,300,50);
        viewprofile.setBackground(new Color(100,150,200));
        viewprofile.setForeground(Color.white);
        viewprofile.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewprofile.addActionListener(this);
        p2.add(viewprofile);
        
        viewpackages = new JButton("View Package");
        viewpackages.setBounds(0,100,300,50);
        viewpackages.setBackground(new Color(100,150,200));
        viewpackages.setForeground(Color.white);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotel");
        viewhotels.setBounds(0,150,300,50);
        viewhotels.setBackground(new Color(100,150,200));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookPack = new JButton("Book Hotel");
        bookPack.setBounds(0,200,300,50);
        bookPack.setBackground(new Color(100,150,200));
        bookPack.setForeground(Color.white);
        bookPack.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPack.addActionListener(this);
        p2.add(bookPack);
        
        checkpackages = new JButton("Book Package");
        checkpackages.setBounds(0,250,300,50);
        checkpackages.setBackground(new Color(100,150,200));
        checkpackages.setForeground(Color.white);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Payments");
        bookpackages.setBounds(0,300,300,50);
        bookpackages.setBackground(new Color(100,150,200));
        bookpackages.setForeground(Color.white);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        JButton feedback = new JButton("Feedback");
        feedback.setBounds(0,350,300,50);
        feedback.setBackground(new Color(100,150,200));
        feedback.setForeground(Color.white);
        feedback.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //feedback.addActionListener(this);
        p2.add(feedback);
        
        JButton tourguide = new JButton("Tour Guide");
        tourguide.setBounds(0,400,300,50);
        tourguide.setBackground(new Color(100,150,200));
        tourguide.setForeground(Color.white);
        tourguide.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //tourguide.addActionListener(this);
        p2.add(tourguide);
        
        JButton bookhotel = new JButton("Contact us");
        bookhotel.setBounds(0,450,300,50);
        bookhotel.setBackground(new Color(100,150,200));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(bookhotel);
        
        JButton viewbookhotel = new JButton("About us");
        viewbookhotel.setBounds(0,500,300,50);
        viewbookhotel.setBackground(new Color(100,150,200));
        viewbookhotel.setForeground(Color.white);
        viewbookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(viewbookhotel);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==logout){
            setVisible(false);
            new Login();
        }else if(ae.getSource()== addPersonDetails){
            setVisible(true);
            new Updateinfo("");
        }else if(ae.getSource()== viewprofile){
            setVisible(true);
            new profile("");
        }else if(ae.getSource()== viewpackages){
            setVisible(true);
            new viewpackage();
        }else if(ae.getSource()== viewhotels){
            setVisible(true);
            new HB();
        }else if(ae.getSource()== bookPack){
            setVisible(true);
            new PB();
        }else if(ae.getSource()== checkpackages){
            setVisible(true);
            new fpackage();
        }else if(ae.getSource()== bookpackages){
            setVisible(true);
            new pay();
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}
