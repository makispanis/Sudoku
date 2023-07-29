
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

//κλαση με την γραφικη απεικονιση της παραλλαγης του κιλλερ σουντοκου(Wordoku)
public class KillerWordokuGraphs extends JFrame {
    private JPanel panel;
    private JTextArea info;
    private KillerBoard1 killerBoard1;
    private KillerBoard2 killerBoard2;
    private KillerBoard3 killerBoard3;
    private KillerBoard4 killerBoard4;
    private KillerBoard5 killerBoard5;
    private KillerBoard6 killerBoard6;
    private KillerBoard7 killerBoard7;
    private KillerBoard8 killerBoard8;
    private KillerBoard9 killerBoard9;
    private KillerBoard10 killerBoard10;
    private KillerSudoku killerSudoku;
    private LogicKillerSudoku logicKillerSudoku;
    private ArrayList<Integer> su;
    private JButton button;
    private JLabel label;
    private Players players;
    private ReadSudoku read;
    private JTextField[][] board;
    private Converter convert;

    //  γραφει στο αρχειο το νεο παικτη και δημιουργει ενα frame που ο χρηστης μπορει να παιξει ενα τυχαια επιλεγμενο κιλλερ σουντοκου απο αυτα
    // που δεν εχει ολοκληρωσει. Επισης γραφει στο αρχειο αν ο χρηστης ολοκληρωσει καποιο παζλ ωστε να μην το ξαναπαιξει. Αν τα εχει
    // ολοκληρωσει ολα του εμφανιζει το αντιστοιχο μηνυμα
    public KillerWordokuGraphs(Player player) throws Exception {
        read = new ReadSudoku();
        killerSudoku = read.ReadKillerSudoku();
        killerBoard1 = killerSudoku.getKillerBoard1();
        killerBoard2 = killerSudoku.getKillerBoard2();
        killerBoard3 = killerSudoku.getKillerBoard3();
        killerBoard4 = killerSudoku.getKillerBoard4();
        killerBoard5 = killerSudoku.getKillerBoard5();
        killerBoard6 = killerSudoku.getKillerBoard6();
        killerBoard7 = killerSudoku.getKillerBoard7();
        killerBoard8 = killerSudoku.getKillerBoard8();
        killerBoard9 = killerSudoku.getKillerBoard9();
        killerBoard10 = killerSudoku.getKillerBoard10();

        players = read.ReadPlayers();
        try {
            players.addPlayer(player);
            players.WritePlayers(players);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        convert=new Converter();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button=new JButton("Help(also press Enter in any cell you need help):");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(true);
                button.setEnabled(false);

            }

        });
        label=new JLabel("                  ");
        panel = new JPanel();
        GridLayout grid = new GridLayout(9, 9, 10, 10);
        panel.setLayout(grid);
        board = new JTextField[9][9];
        su = new ArrayList<>();

        for (int i = 10; i < 20; i++) {
            if (player.getSudokus()[i] == 0)
                su.add(i);
        }
        if (su.size() != 0) {
            Random r = new Random();
            int q=su.get(r.nextInt(su.size()));
            //int q = 15;
            if (q == 10) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard1.getArr(), killerSudoku, 1);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard1.getSearch1()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }


            if (q == 11) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard2.getArr(), killerSudoku, 2);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard2.getSearch2()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 12) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard3.getArr(), killerSudoku, 3);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard3.getSearch3()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 13){
                logicKillerSudoku = new LogicKillerSudoku(killerBoard4.getArr(), killerSudoku, 4);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard4.getSearch4()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 14){
                logicKillerSudoku = new LogicKillerSudoku(killerBoard5.getArr(), killerSudoku, 5);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard5.getSearch5()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 15) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard6.getArr(), killerSudoku, 6);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard6.getSearch6()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 16) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard7.getArr(), killerSudoku, 7);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard7.getSearch7()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 17) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard8.getArr(), killerSudoku, 8);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard8.getSearch8()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 18) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard9.getArr(), killerSudoku, 9);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard9.getSearch9()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }
            if (q == 19) {
                logicKillerSudoku = new LogicKillerSudoku(killerBoard10.getArr(), killerSudoku, 10);
                ArrayList<Cell> temp=new ArrayList<>();
                StringBuilder string = new StringBuilder();
                for(Cell i:killerBoard10.getSearch10()){
                    if(!temp.contains(i)) {
                        temp.add(i);

                        string.append("cell").append(i.getNumber());
                        for (Cell y : i.getTeam()) {
                            string.append("+cell").append(y.getNumber());
                            temp.add(y);
                        }
                        string.append("=").append(i.getSum());
                        string.append(System.getProperty("line.separator"));
                    }
                }
                info = new JTextArea(string.toString());
            }


            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j] = new JTextField();
                    board[i][j].setText(String.valueOf(convert.convertClassicSudokuArray(logicKillerSudoku.getBoard())[i][j]));
                    board[i][j].setPreferredSize( new Dimension( 15, 20 ) );
                    int finalI = i;
                    int finalj = j;
                    board[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int x = finalI;
                            int y = finalj;
                            label.setText(logicKillerSudoku.getHelpKillerWordoku(x,y));
                            boolean o = logicKillerSudoku.addMove(x, y,convert.getLetter((board[x][y].getText().charAt(0))));
                            if (o) {
                                board[x][y].setBackground(Color.GREEN);
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicKillerSudoku.getBoard())[x][y]));
                            } else if (board[x][y].getText().equals(Integer.toString(logicKillerSudoku.getBoard()[x][y]))) {
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicKillerSudoku.getBoard())[x][y]));
                            } else {
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicKillerSudoku.getBoard())[x][y]));
                                if (logicKillerSudoku.getBoard()[x][y] != 0) {
                                    board[x][y].setBackground(Color.GREEN);
                                } else {
                                    board[x][y].setBackground(Color.WHITE);
                                }
                            }

                            if (logicKillerSudoku.Check()) {
                                players.removePlayer(player);
                                player.setSudokus(q, 1);
                                players.addPlayer(player);
                                try {
                                    players.WritePlayers(players);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                                dispose();
                            }

                        }

                    });
                    if (!board[i][j].getText().equals("-")) {
                        board[i][j].setBackground(Color.RED);
                        board[i][j].setEnabled(false);
                    }

                    panel.add(board[i][j]);
                }
            }
            FlowLayout layout = new FlowLayout();
            setLayout(layout);
            add(panel);
            add(info);
            add(button);
            add(label);
            label.setVisible(false);

            pack();

            setSize(700, 700);

            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);

        } else {
            FlowLayout layout = new FlowLayout();
            layout.setHgap(20);
            layout.setVgap(10);
            layout.setAlignment(FlowLayout.LEADING);
            JLabel label = new JLabel("You solved all of them");
            setLayout(layout);
            add(label);
            setSize(200, 300);

            setLocationRelativeTo(null);
            setVisible(true);
        }

    }
}

