
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

// παραυθυρο π ο χρηστης δεινει το nickname του
public class NameForm extends JFrame{
    private int which;
    private JPanel panel;
    private JLabel user_label;
    private JTextField userName_text;
    private Players players;
    private ReadSudoku read;

    //δημιουργει το παραθυρο καταχωρησης του ονοματος και καλει τη μεθοδο DoEverything()
    public NameForm(int which) throws Exception {
        read=new ReadSudoku();
        players=read.ReadPlayers();
        this.which=which;
        panel = new JPanel(new GridLayout(8, 3));
        user_label = new JLabel("User Name :");
        userName_text = new JTextField();
        userName_text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DoEverything();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        });

        setTitle("Please write your name and press ENTER");
        setSize(500,300);
        panel.add(user_label);
        panel.add(userName_text);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }


    // ελεγχει αν το ονομα του χρηστη εχει καταχωρηθει ηδη και αν ναι φορτωνει τα στατιστικα του,αν οχι δημιουργει
// ενα καινουργιο παικτη με αυτο το ονομα και ανοιγει το αναλογο παραθυρο π ο χρηστης εχει επιλεξει
    private void DoEverything() throws Exception {

        Player currentPlayer = null;
        boolean found=false;
        for(Player i:players.getPlayers()){
            if(userName_text.getText().equals(i.getName())){
                currentPlayer=i;
                found=true;
                break;
            }
        }
        if(!found){
            currentPlayer=new Player(userName_text.getText());
            players.addPlayer(currentPlayer);

        }
        setVisible(false);
        if(which==1){
            new ClassicSudokuGraphs(currentPlayer);
        }
        if(which==2){
            new ClassicWordokuGraphs(currentPlayer);
        }


        if(which==3){
            new KillerSudokuGraphs(currentPlayer);
        }
        if(which==4){
            new KillerWordokuGraphs(currentPlayer);
        }

        if(which==5){
            new DuidokuGraphs(currentPlayer);
        }
        if (which ==6){
            new DuidokuWordokuGraphs(currentPlayer);
        }
        if(which==7){
            new ScoreGraphs(currentPlayer);
        }
        dispose();

    }

}