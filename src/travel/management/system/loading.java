
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try {
            for(int i = 1; i <=101; i++){
                int max = bar.getMaximum(); //maximum is 100
                int value = bar.getValue(); //current value
                
                if(value < max){ //101<100
                    bar.setValue(bar.getValue() + 1);
                }else {
                    setVisible(false);
                    //new class object
                    new Dashboard(username);
                }
                Thread.sleep(40);
                
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    loading(String username){
        this.username = username;
        t = new Thread(this); //thread class object
        
        
        setBounds(350,200,900,400);
        //setBackground(Color.GRAY);
        getContentPane().setBackground(new Color(100,150,200));
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/loading.GIF"));
       Image i2 = i1.getImage().getScaledInstance(250, 220, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(530,30,350,320);
       add(image);
        
        JLabel text = new JLabel("Tours & Travel Application");
        text.setBounds(50, 50, 600, 40);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(120, 160, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading,Please wait...");
        loading.setBounds(180, 200, 500, 30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway",Font.BOLD,15));
        add(loading);
        
        JLabel lblusername = new JLabel("Welcome " +username); //concate to username
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(Color.black);
        lblusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblusername);
        
        t.start();//call start method
        setVisible(true);
    }
    public static void main(String[] args){
        new loading("");
    }
}
