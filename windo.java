import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class windo implements ActionListener {
     JLabel l1, l2, l3, l4;
     JTextField jx1, jx2, jx3;
     JButton b1, b2, b3, b4;
    windo(){
        JFrame jef = new JFrame();

        l1 = new JLabel("1st num");
        l1.setBounds(70, 150, 30, 35);

        l2 = new JLabel("2nd num");
        l2.setBounds(70, 200, 30, 35);

        l3 = new JLabel("Result");
        l3.setBounds(70, 280, 35, 35);

        jx1=new JTextField();
        jx1.setBounds(140,150,40,40);

        jx2=new JTextField();
        jx2.setBounds(140,200,40,40);

        jx3=new JTextField();
        jx3.setBounds(140,280,40,40);
        jx3.setEditable(false);


        b1 = new JButton("add");
        b1.setBounds(60, 380, 25, 25);
        b1.addActionListener(this);

        b2 = new JButton("sub");
        b2.setBounds(120, 380, 25, 25);
        b2.addActionListener(this);

        b3 = new JButton("mul");
        b3.setBounds(180, 380, 25, 25);
        b3.addActionListener(this);

        b4 = new JButton("div");
        b4.setBounds(240, 380, 25, 25);
        b4.addActionListener(this);


        jef.add(l1);
        jef.add(l2);
        jef.add(l3);
        jef.add(jx1);
        jef.add(jx2);
        jef.add(jx3);
        jef.add(b1);
        jef.add(b2);
        jef.add(b3);
        jef.add(b4);

        jef.setSize(400, 500);
        jef.setLayout(null);
        jef.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String s1 = jx1.getText();
        String s2 = jx2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c=a+b;
        }
        else if (e.getSource() == b2){
            c=a-b;
        } else if (e.getSource() == b3) {
            c=a*b;
        }
        else if (e.getSource() == b4){
            c=a/b;
        }
        String result = String.valueOf(c);
            jx3.setText(result);

        }


        public static void main (String[]args){

             new windo();

        }
    }
