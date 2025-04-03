package atm.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField PasswordField3;
    JButton btn1,btn2,btn3;
    Login(){
        super("ATM System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        label1 = new JLabel("Welcome to ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arail",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN No : ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(640,350,100,100);
        add(iimage);

        PasswordField3 = new JPasswordField(15);
        PasswordField3.setBounds(325,250,230,30);
        PasswordField3.setFont(new Font("Arail",Font.BOLD,14));
        add(PasswordField3);

        btn1 = new JButton("LOGIN");
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLUE);
        btn1.setBounds(300,300,100,30);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("CLEAR");
        btn2.setFont(new Font("Arial",Font.BOLD,14));
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLUE);
        btn2.setBounds(430,300,100,30);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("REGISTER");
        btn3.setFont(new Font("Arial",Font.BOLD,14));
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLUE);
        btn3.setBounds(300,350,230,30);
        btn3.addActionListener(this);
        add(btn3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==btn1){

            }
            else if(e.getSource()==btn2){
                textField2.setText("");
                PasswordField3.setText("");
            }
            else if(e.getSource()==btn3){

            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
