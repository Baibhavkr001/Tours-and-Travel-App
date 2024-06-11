
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Updateinfo extends JFrame implements ActionListener{
    
    JLabel lblusername, lblname;
    JComboBox comboid;
    JTextField tfidnumber, tfcountry, tfaddress, tfphoneno, tfemail;
    JRadioButton rmale,rfemale;
    JButton add, back;
    Updateinfo(String username){
       setBounds(293,88,1092,640);
       setLayout(null);
       getContentPane().setBackground(new Color(150,200,250));
       
       JLabel iblusername = new JLabel("Username :");
       iblusername.setBounds(50,50,150,40);
       iblusername.setForeground(Color.white);
       iblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(iblusername);
       
       lblusername = new JLabel();
       lblusername.setBounds(200,50,150,40);
       //iblusername.setForeground(Color.white);
       //iblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lblusername);
       
        
       JLabel iblname = new JLabel("Name :");
       iblname.setBounds(88,90,150,40);
       iblname.setForeground(Color.white);
       iblname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(iblname);
       
       lblname = new JLabel();
       lblname.setBounds(200,90,150,40);
       add(lblname);
       
       JLabel iblid = new JLabel("Select ID :");
       iblid.setBounds(57,130,150,40);
       iblid.setForeground(Color.white);
       iblid.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(iblid);
       
       comboid = new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Ration Card"});
       comboid.setBounds(200,135,180,30);
       comboid.setBackground(Color.white);
       add(comboid);
       
       JLabel lblidnumber = new JLabel("ID Number :");
       lblidnumber.setBounds(45,170,150,40);
       lblidnumber.setForeground(Color.white);
       lblidnumber.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lblidnumber);
       
       tfidnumber = new JTextField();
       tfidnumber.setBounds(200,175,180,30);
       add(tfidnumber);
       
       JLabel iblgender = new JLabel("Gender :");
       iblgender.setBounds(70,210,150,40);
       iblgender.setForeground(Color.white);
       iblgender.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(iblgender);
       
       rmale = new JRadioButton("Male");
       rmale.setBounds(200, 220, 70, 25);
       rmale.setBackground(Color.white);
       add(rmale);
       rfemale = new JRadioButton("Female");
       rfemale.setBounds(290, 220, 70, 25);
       rfemale.setBackground(Color.white);
       add(rfemale);
       //group both radio button so that select one of them at a time
       ButtonGroup bg = new ButtonGroup();
       bg.add(rmale);
       bg.add(rfemale);
       
       JLabel lblcountry = new JLabel("Country :");
       lblcountry.setBounds(65,250,150,40);
       lblcountry.setForeground(Color.white);
       lblcountry.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lblcountry);
       
       tfcountry = new JTextField();
       tfcountry.setBounds(200,260,180,30);
       add(tfcountry);
       
       JLabel lbladdress = new JLabel("Address :");
       lbladdress.setBounds(70,300,150,40);
       lbladdress.setForeground(Color.white);
       lbladdress.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lbladdress);
       
       tfaddress = new JTextField();
       tfaddress.setBounds(200,300,180,30);
       add(tfaddress);
       
       JLabel lblphoneno = new JLabel("Phone No. :");
       lblphoneno.setBounds(50,340,150,40);
       lblphoneno.setForeground(Color.white);
       lblphoneno.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lblphoneno);
       
       tfphoneno = new JTextField();
       tfphoneno.setBounds(200,340,180,30);
       add(tfphoneno);
       
       JLabel lblemail = new JLabel("Email :");
       lblemail.setBounds(80,380,150,40);
       lblemail.setForeground(Color.white);
       lblemail.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       add(lblemail);
       
       tfemail = new JTextField();
       tfemail.setBounds(200,380,180,30);
       add(tfemail);
       
       add = new JButton("Update Details");
       add.setBounds(100,460,150,40);
       add.setBackground(Color.black);
       add.setForeground(Color.white);
       add.addActionListener(this);
       add(add);
       
       back = new JButton("Back");
       back.setBounds(300,460,150,40);
       back.setBackground(Color.black);
       back.setForeground(Color.white);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/updateprofile.PNG"));
       Image i2 = i1.getImage().getScaledInstance(500, 470, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(500,60,600,400);
       add(image);
       
       try {
           connect c = new connect();
           String query = "select * from acount where username = '"+username+"'";
           ResultSet rs = c.s.executeQuery(query);
           while(rs.next()){
               lblusername.setText(rs.getString("username"));
               lblname.setText(rs.getString("name"));
           }
       }catch(Exception e){
           e.printStackTrace();
        }
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== add){
            String username = lblusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfidnumber.getText();
            String name = lblname.getText();
            String gender = null;
            if (rmale.isSelected()){
                    gender = "Male";
                }else {
                    gender = "Female";
                }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphoneno.getText();
            String email = tfemail.getText();
            
            try {
                connect c = new connect();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
                setVisible(false);
                
            }catch (Exception e) {
                e.printStackTrace();
                }
            
        }else {
            setVisible(false);
            }
    }
    public static void main(String[]args) {
        new Updateinfo("");
    }
    
}
