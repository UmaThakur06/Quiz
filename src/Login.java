import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

    public class Login extends JFrame implements ActionListener
    {
        JButton back;
        JButton rules;
        JTextField tfname;
        
        Login()
        {
            getContentPane().setBackground(Color.BLACK);
            setLayout(null);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
            JLabel image = new JLabel(i1);
            image.setBounds(0, 0, 600, 500);
            add(image);
            
            JLabel heading = new JLabel("Simple Minds");
            heading.setBounds(730, 60, 300, 45);
            heading.setFont(new Font("Georgia", Font.BOLD, 25));
            heading.setForeground(new Color( 30, 144, 254));
            add(heading);
            
            JLabel name = new JLabel("Enter Your Name");
            name.setBounds(740, 150, 300, 45);
            name.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 18));
            name.setForeground(Color.WHITE);
            add(name);
            
            rules = new JButton("NEXT");
            rules.setBounds(700, 270, 120, 25);
            rules.setBackground(new Color( 30, 144, 254));
            rules.setForeground(Color.WHITE);
            rules.addActionListener(this);
            add(rules);
            
            back = new JButton("Back");
            back.setBounds(850, 270, 120, 25);
            back.setBackground(new Color( 30, 144, 254));
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            add(back);
            
            tfname = new JTextField();
            tfname.setBounds(730, 200, 200,30);
            tfname.setFont(new Font("Time New Roman ", Font.BOLD, 17));
            add(tfname);
            
            setSize(1000,500);
            setLocation(350,200);
            setVisible(true);
            
            
            
        }
  
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()== rules)
      {
          String name = tfname.getText();
          setVisible(false);
          new Rules(name);
          
      }
      else if(ae.getSource()== back)
      {
          setVisible(false);
      }
    }   
    
    
    public static void main(String[] args)
    {
        new Login();
    }
}
 