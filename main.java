import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;






public class Main implements  ActionListener
{

    JFrame f;
    JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8;
    static JTextField t1,t2;
    JButton b1,b2;

    Main()
    {


        f=new JFrame("ONLINE QUIZ");
        f.getContentPane().setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1535,830);
        ImageIcon background_img=new ImageIcon("C:\\Users\\chand\\OneDrive\\Pictures\\Camera Roll\\panimalar.png");



        f.setLayout(new BorderLayout());
        Image img=background_img.getImage();
        Image image=img.getScaledInstance(1535,830,Image.SCALE_SMOOTH);
        background_img=new ImageIcon(image);
        JLabel background=new JLabel(" ",background_img,JLabel.CENTER);
        f.add(background);
        background.setLayout(new FlowLayout(FlowLayout.CENTER,2000,10));



        l1=new JLabel(" PANIMALAR ENGINEERING COLLEGE");
        l2=new JLabel("WELCOME TO ONLINE QUIZ");
        l3=new JLabel("Instructions");
        l4=new JLabel("NAME");
        t1=new JTextField(20);
        l5=new JLabel("ROLL NUM");
        t2=new JTextField(20);
        b1=new JButton("start");
        b2=new JButton("cancel");
        l6=new JLabel("1.Each question carry 5 marks.");
        l7=new JLabel("2.No negative marks.");
        l8=new JLabel("3.You can select only one option from A to D.");


        b1.setBackground(Color.yellow);
        b2.setBackground(Color.gray);
        l1.setFont(new Font("cooper",Font.BOLD,40));
        l1.setForeground(Color.black);
        l2.setFont(new Font("casteller",Font.BOLD,35));
        l2.setForeground(Color.black);
        l3.setFont(new Font("cooper",Font.BOLD,30));
        l3.setForeground(Color.black);
        b1.setFont(new Font("cooper",Font.BOLD,25));
        b2.setFont(new Font("cooper",Font.BOLD,25));
        l4.setFont(new Font("casteller",Font.BOLD,35));
        l4.setForeground(Color.black);
        l5.setFont(new Font("casteller",Font.BOLD,35));
        l5.setForeground(Color.black);
        l6.setFont(new Font("casteller",Font.BOLD,30));
        l6.setForeground(Color.black);
        l7.setFont(new Font("casteller",Font.BOLD,30));
        l7.setForeground(Color.black);
        l8.setFont(new Font("casteller",Font.BOLD,30));
        l8.setForeground(Color.black);


        background.add(l1);
        background.add(l1);
        background.add(l2);
        background.add(l3);
        background.add(l6);
        background.add(l7);
        background.add(l8);
        background.add(l4);
        background.add(t1);
        background.add(l5);
        background.add(t2);
        background.add(b1);
        background.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setResizable(true);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(b1))
        {
            try
            {String s1=t1.getText();
                String s2=t2.getText();
                if(t1.getText().equals(""))
                {JOptionPane.showMessageDialog(null,"Enter candidate name");}
                else if(t2.getText().equals(""))
                {JOptionPane.showMessageDialog(null,"Enter Roll num");}
                else
                {f.setVisible(false);
                    new Quiz1();
                }
            }
            finally
            {}
        }
        else
        {
            f.setVisible(false);
        }
    }
    public static void main(String...aaa)
    {

        new Main();


    }
}