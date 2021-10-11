package Lab_2_1.Practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame
{

    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JPanel pnl3 = new JPanel();
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW" );
    JButton but1 = new JButton("AC Milan");;
    JButton but2 = new JButton("Real Madrid");;
    int a = 0, b = 0;

    Football(){

        super("bro");

        setSize(300,150);
        setLayout(new FlowLayout());

        pnl1.add(but1);
        pnl1.add(but2);
        pnl1.setBackground(Color.blue);
        pnl2.add(lbl1);
        pnl3.add(lbl2);
        pnl2.add(lbl3);
        pnl2.setBackground(Color.white);
        add(pnl2);
        add(pnl1);
        add(pnl3);
        pnl3.setBackground(Color.red);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                a++;
                lbl1.setText("Result: "+ a +" X "+ b);
                lbl2.setText("Last Scorer: AC Milan");
                if(a==b+1){
                    lbl3.setText("Winner: AC Milan");
                }
                else if(a==b) lbl3.setText("Winner: Draw");
            }
        });

        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                b++;
                lbl1.setText("Result: "+ a +" X "+ b);
                lbl2.setText("Last Scorer: Real Madrid");
                if(b==a+1){
                    lbl3.setText("Winner: Real Madrid");
                }
                else if(a==b) lbl3.setText("Winner: Draw");
            }
        });

    }
    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}
