package Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    login(){

        super("Hospital Management System");
        setLayout(null);

        // Background FIRST
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(iii2));
        background.setBounds(0,0,850,480);
        add(background);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(350,10,100,100);
        background.add(image);

        label1 = new JLabel("WELCOME");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(300,125,300,40);
        background.add(label1);

        label2 = new JLabel("User ID:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,200,30);
        background.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(325,190,230,30);
        background.add(textField2);

        label3 = new JLabel("Password:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,200,30);
        background.add(label3);

        passwordField3 = new JPasswordField();
        passwordField3.setBounds(325,250,230,30);
        background.add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        background.add(button1);

        button2 = new JButton("CLEAR");
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        background.add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        background.add(button3);

        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button1){

            String user = textField2.getText();
            String pass = passwordField3.getText();

            if(user.equals("admin") && pass.equals("1234")){
                JOptionPane.showMessageDialog(null,"Login Successful");
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Login");
            }
        }

        if(e.getSource()==button2){
            textField2.setText("");
            passwordField3.setText("");
        }

        if(e.getSource()==button3){
            JOptionPane.showMessageDialog(null,"Signup clicked");
        }
    }

    public static void main(String[] args){
        new login();
    }
}
