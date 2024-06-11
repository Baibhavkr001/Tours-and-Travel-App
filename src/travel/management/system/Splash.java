
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash(){
        setSize(900,400);
        setLocation(350,200);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/travel.gif"));
        Image i2 = i1.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        add(Image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        
    }
    public void run(){
        try {
          thread.sleep(4500);
          setVisible(false);
          new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Splash();
    }
    
}
