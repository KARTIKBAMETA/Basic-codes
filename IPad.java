import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ip extends Frame implements ActionListener
{
JTextField j1;
JLabel j2;
JButton j3;
ip()
{
j1=new JTextField();
j1.setBounds(60,60,160,30);
j2=new JLabel();
j2.setBounds(60,110,260,30);
j3=new JButton("Find IP Address");
j3.setBounds(60,160,105,30);
j3.addActionListener(this);
add(j3);
add(j1);
add(j2);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void ActionPerformed(ActionEvent e)
{try{
String host=j1.getText();
String ip=java.net.InetAddress.getByName(host).getHostAddress();
j2.setText("IP Address of "+host+"is: "+ip);
}
catch(Exception ex)
{ System.out.println(ex);}
}
public static void main(String[]args)
{
new ip();
}}
