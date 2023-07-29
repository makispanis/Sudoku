
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

//κλαση με την γραφικη απεικονιση της παραλλαγης του κλασσικου σουντοκου(Wordoku)
public class ClassicWordokuGraphs extends JFrame {
    private ReadSudoku read;
    private Converter convert;
    private LogicClassicSudoku logicClassicSudoku;
    private ClassicSudoku classicSudoku;
    private ArrayList<Integer> su;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private Players players;
    private JTextField[][] board;
    //  γραφει στο αρχειο το νεο παικτη και δημιουργει ενα frame που ο χρηστης μπορει να παιξει ενα τυχαια επιλεγμενο σουντοκου απο αυτα
    // που δεν εχει ολοκληρωσει. Επισης γραφει στο αρχειο αν ο χρηστης ολοκληρωσει καποιο παζλ ωστε να μην το ξαναπαιξει. Αν τα εχει
    // ολοκληρωσει ολα του εμφανιζει το αντιστοιχο μηνυμα
    public ClassicWordokuGraphs(Player player) throws Exception {
        read=new ReadSudoku();
        classicSudoku=read.ReadClassicSudoku();
        players=read.ReadPlayers();
        players.addPlayer(player);
        try {
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
        GridLayout grid = new GridLayout(9, 9, 10, 10);
        FlowLayout layout1 = new FlowLayout();
        layout1.setHgap(20);
        layout1.setVgap(10);
        layout1.setAlignment(FlowLayout.LEADING);


        setLayout(layout1);
        panel = new JPanel();
        panel.setLayout(grid);

        board = new JTextField[9][9];
        su=new ArrayList<>();

        for(int i=0;i<10;i++){
            if(player.getSudokus()[i]==0)
                su.add(i);
        }
        if(su.size()!=0){
            Random r = new Random();
            int q=su.get(r.nextInt(su.size()));
            if(q==0)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr1());
            if(q==1)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr2());
            if(q==2)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr3());
            if(q==3)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr4());
            if(q==4)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr5());
            if(q==5)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr6());
            if(q==6)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr7());
            if(q==7)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr8());
            if(q==8)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr9());
            if(q==9)
                logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr10());


            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j]=new JTextField();
                    board[i][j].setText(String.valueOf(convert.convertClassicSudokuArray(logicClassicSudoku.getBoard())[i][j]));
                    int finalI = i;
                    int finalj=j;
                    board[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int x=finalI;
                            int y=finalj;
                            label.setText(logicClassicSudoku.getHelpClassicWordoku(x,y));
                            boolean o=logicClassicSudoku.addMove(x,y,convert.getLetter((board[x][y].getText().charAt(0))));
                            if(o){
                                board[x][y].setBackground(Color.GREEN);
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicClassicSudoku.getBoard())[x][y]));
                            }
                            else if(board[x][y].getText().equals(Integer.toString(logicClassicSudoku.getBoard()[x][y]))){
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicClassicSudoku.getBoard())[x][y]));

                            }
                            else{
                                board[x][y].setText(String.valueOf(convert.convertClassicSudokuArray(logicClassicSudoku.getBoard())[x][y]));

                                if(logicClassicSudoku.getBoard()[x][y]!=0){
                                    board[x][y].setBackground(Color.GREEN);
                                }
                                else{
                                    board[x][y].setBackground(Color.WHITE);
                                }
                            }

                            if(logicClassicSudoku.Check()){
                                players.removePlayer(player);
                                player.setSudokus(q,1);
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
                    if(!board[i][j].getText().equals("-")) {
                        board[i][j].setBackground(Color.RED);
                        board[i][j].setEnabled(false);
                    }

                    panel.add(board[i][j]);
                }
            }
            add(panel);
            add(button);
            add(label);
            label.setVisible(false);

            pack();
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            setSize(500, 400);


        }else{
            FlowLayout layout = new FlowLayout();
            layout.setHgap(20);
            layout.setVgap(10);
            layout.setAlignment(FlowLayout.LEADING);
            JLabel label=new JLabel("You solved all of them");
            setLayout(layout);
            add(label);
            setSize(200, 300);

            setLocationRelativeTo(null);
            setVisible(true);

        }




    }
}
