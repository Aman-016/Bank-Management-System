package Hospital;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField2;

    login(){
        super("Hospital Management System");

        setLayout(null);

        // Background
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel background = new JLabel(iii3);
        background.setBounds(0,0,850,480);
        add(background);

        // Top logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        background.add(image);

        // Card image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        background.add(iimage);

        label1 = new JLabel("WELCOME");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(300,125,300,40);
        background.add(label1);

        label2 = new JLabel("User ID:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,200,30);
        background.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        background.add(textField2);

        label3 = new JLabel("Password:");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,200,30);
        background.add(label3);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(325,250,230,30);
        background.add(passwordField2);

        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new login();
    }
}
