import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("first page");
        frame.setSize(1024,740);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1= new JPanel();
        panel1.setBackground(new Color(204,229,255));
        JLabel textLabel1 = new JLabel("Choose language ");
        //textLabel1.setBounds(600, 0, 200,200 );
        textLabel1.setFont(new Font("body",Font.PLAIN,25));
        Button button1 = new Button("English");
        JPanel panel3= new JPanel();
        JLabel textLabel2 = new JLabel("زبان خود را وارد کنید");
        textLabel2.setFont(new Font("body",Font.PLAIN,25));
        Button button2 = new Button("فارسی");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setSize(1024,720);
                panel3.setBackground(new Color(204,229,255));
                frame.remove(panel1);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel textlabel4= new JLabel("رمز خود را وارد کنید");
        JTextField field1= new JTextField();
        field1.setPreferredSize(new Dimension(80,40));

        Button PasswordButton = new Button("ثبت");
        JPanel PanelForthPage= new JPanel();
        PasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelForthPage.setSize(1024,720);
                PanelForthPage.setBackground(new Color(204,229,255));
                frame.remove(panel3);
                frame.add(PanelForthPage);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button BardashtButton = new Button("برداشت وجه");
        JPanel PanelBardasht= new JPanel();
        BardashtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelBardasht.setSize(1024,720);
                PanelBardasht.setBackground(new Color(204,229,255));
                frame.remove(PanelForthPage);
                frame.add(PanelBardasht);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel mablaghBardashtLable= new JLabel("مبلغ مورد نظر را وارد کنید");
        JTextField mablaghBardashtField= new JTextField();
        mablaghBardashtField.setPreferredSize(new Dimension(80,40));
        Button ChangePassButton = new Button("تغییر رمز");
        JPanel PanelChangePass= new JPanel();
        ChangePassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelChangePass.setSize(1024,720);
                PanelChangePass.setBackground(new Color(204,229,255));
                frame.remove(PanelForthPage);
                frame.add(PanelChangePass);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel changePassLable= new JLabel("رمز جدید را وارد کنید");
        JTextField changePassField= new JTextField();
        changePassField.setPreferredSize(new Dimension(80,40));
        Button KartBeKArtButton = new Button("کارت به کارت");
        JPanel PanelKartBeKart= new JPanel();
        KartBeKArtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelKartBeKart.setSize(1024,720);
                PanelKartBeKart.setBackground(new Color(204,229,255));
                frame.remove(PanelForthPage);
                frame.add(PanelKartBeKart);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel mablaghLable= new JLabel("مبلغ مورد نظر را وارد کنید");
        JTextField mablaghField= new JTextField();
        mablaghField.setPreferredSize(new Dimension(80,40));
        JLabel shomareKartLable= new JLabel("شماره کارت مقصد را وارد کنید");
        JTextField shomareKartField= new JTextField();
        shomareKartField.setPreferredSize(new Dimension(80,40));
        Button MojoodiButton = new Button("اعلام موجودی");
        JPanel PanelMojoodi= new JPanel();
        MojoodiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelMojoodi.setSize(1024,720);
                PanelMojoodi.setBackground(new Color(204,229,255));
                frame.remove(PanelForthPage);
                frame.add(PanelMojoodi);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel MojoodiLable = new JLabel("موجودی حساب شما: 23451803 ریال");
        JPanel PanelPayan = new JPanel();
        Button finishButton= new Button("تایید");
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelPayan.setSize(1024,720);
                PanelPayan.setBackground(new Color(204,229,255));
                frame.remove(PanelMojoodi);
                frame.add(PanelPayan);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button finishButton3= new Button("ثبت");
        finishButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelPayan.setSize(1024,720);
                PanelPayan.setBackground(new Color(204,229,255));
                frame.remove(PanelBardasht);
                frame.add(PanelPayan);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button finishButton2= new Button("ثبت");
        finishButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelPayan.setSize(1024,720);
                PanelPayan.setBackground(new Color(204,229,255));
                frame.remove(PanelKartBeKart);
                frame.add(PanelPayan);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button finishButton4= new Button("تایید");
        finishButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelPayan.setSize(1024,720);
                PanelPayan.setBackground(new Color(204,229,255));
                frame.remove(PanelChangePass);
                frame.add(PanelPayan);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel payanLable= new JLabel("عملیات با موفقیت انجام شد!");
        PanelForthPage.setLayout(null);
        MojoodiButton.setBounds(612,100,100,40);
        BardashtButton.setBounds(612,300,100,40);
        ChangePassButton.setBounds(0,100,100,40);
        KartBeKArtButton.setBounds(0,300,100,40);
        PanelChangePass.add(changePassLable);
        PanelChangePass.add(changePassField);
        PanelChangePass.add(finishButton4);
        PanelMojoodi.add(finishButton);
        PanelBardasht.add(mablaghBardashtLable);
        PanelBardasht.add(mablaghBardashtField);
        PanelBardasht.add(finishButton3);
        PanelKartBeKart.add(mablaghLable);
        PanelKartBeKart.add(mablaghField);
        PanelKartBeKart.add(shomareKartLable);
        PanelKartBeKart.add(shomareKartField);
        PanelKartBeKart.add(finishButton2);
        PanelPayan.add(payanLable);
        PanelMojoodi.add(MojoodiLable);
        PanelForthPage.add(BardashtButton);
        PanelForthPage.add(ChangePassButton);
        PanelForthPage.add(KartBeKArtButton);
        PanelForthPage.add(MojoodiButton);
        frame.add(panel1);
        panel1.add(textLabel1);
        panel1.add(button1);
        panel1.add(textLabel2);
        panel1.add(button2);
        panel3.add(textlabel4);
        panel3.add(field1);
        panel3.add(PasswordButton);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}