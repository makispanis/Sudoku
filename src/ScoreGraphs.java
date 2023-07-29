

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

// εμφανιζει τα στατιστικα του χρηστη
public class ScoreGraphs extends JFrame {
    private JLabel label,label1,label2,label3,label4,label5;
    private int t;

    //αρχικοποιει και εμφανιζει παραθυρο με τα στατιστικα τ χρηστη
    public ScoreGraphs(Player player){
        t=0;
        setTitle("Scores!");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        label=new JLabel("You have solved:");
        for(int i=0;i<10;i++) {
            if (player.getSudokus()[i] == 1) {
                t = t + 1;
            }
            label1=new JLabel("ClassicSudokus:  "+ t);
        }
        t=0;
        for(int i=10;i<20;i++) {
            if (player.getSudokus()[i] == 1) {
                t = t + 1;
            }
            label2=new JLabel("Killer Sudokus:  "+ t);
        }
        label3=new JLabel("Duidoku: ");
        label4=new JLabel("Wins: "+ player.getDuidokuwins());
        label5=new JLabel("Losses: "+ player.getDuidokulosses());
        GridLayout grid = new GridLayout(6, 1, 10, 20);


        setLayout(grid);
        add(label);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);

        setVisible(true);
    }
}
