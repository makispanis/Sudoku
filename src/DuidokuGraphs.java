
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

//κλαση με την γραφικη απεικονιση του duidoku
public class DuidokuGraphs extends JFrame {
    private ArrayList<Integer> su;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private Players players;
    private JTextField[][] board;
    private ReadSudoku read;
    private LogicDuidoku logicDuidoku;

    //  γραφει στο αρχειο το νεο παικτη και δημιουργει ενα frame που ο χρηστης μπορει να παιξει κτο κλασσικο duidoku.
//  Επισης γραφει στο αρχειο αν ο χρηστης κερδισει η χασει.
    public DuidokuGraphs(Player player) throws Exception {
        read=new ReadSudoku();
        logicDuidoku=new LogicDuidoku();
        players=read.ReadPlayers();
        try {
            players.addPlayer(player);
            players.WritePlayers(players);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button=new JButton("Help(also press Enter in any cell you need help):");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(true);
                button.setEnabled(false);

            }

        });
        label = new JLabel("                  ");
        GridLayout grid = new GridLayout(4, 4, 10, 10);
        FlowLayout layout1 = new FlowLayout();
        layout1.setHgap(20);
        layout1.setVgap(10);
        layout1.setAlignment(FlowLayout.LEADING);

        setLayout(layout1);
        panel = new JPanel();
        panel.setLayout(grid);

        board = new JTextField[4][4];
        su = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = new JTextField();
                board[i][j].setText(Integer.toString(logicDuidoku.getBoard()[i][j]));
                int finalI = i;
                int finalj = j;
                board[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int x = finalI;
                        int y = finalj;
                        label.setText(logicDuidoku.getHelpClassicSudoku(x, y));
                        boolean o = logicDuidoku.addMove(x, y, Integer.parseInt(board[x][y].getText()));
                        if (logicDuidoku.Check()) {
                            players.removePlayer(player);
                            player.setSudokus(20, player.getDuidokuwins() + 1);
                            players.addPlayer(player);
                            try {
                                players.WritePlayers(players);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            new PlayerWinsGraph();
                            //dispose();
                        }
                        if (o) {
                            board[x][y].setBackground(Color.GREEN);
                            board[x][y].setEnabled(false);
                            boolean pc = logicDuidoku.pcMove();
                            board[logicDuidoku.getX()][logicDuidoku.getY()].setBackground(Color.BLUE);
                            board[logicDuidoku.getX()][logicDuidoku.getY()].setText(Integer.toString(logicDuidoku.getBoard()[logicDuidoku.getX()][logicDuidoku.getY()]));
                            board[logicDuidoku.getX()][logicDuidoku.getY()].setEnabled(false);
                            if (logicDuidoku.Check()) {
                                players.removePlayer(player);
                                player.setSudokus(21, player.getDuidokulosses() + 1);
                                players.addPlayer(player);
                                try {
                                    players.WritePlayers(players);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                                new PcWinsGraph();
                                dispose();
                            }
                        }else if(board[x][y].getText().equals(Integer.toString(logicDuidoku.getBoard()[x][y]))){

                        } else{
                            board[x][y].setText(Integer.toString(logicDuidoku.getBoard()[x][y]));
                            if(logicDuidoku.getBoard()[x][y]!=0){
                                board[x][y].setBackground(Color.GREEN);
                            }
                            else{
                                board[x][y].setBackground(Color.WHITE);
                            }
                        }
                    }
                });
                panel.add(board[i][j]);
            }
        }
        add(panel);
        add(button);
        add(label);
        pack();
        label.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}


