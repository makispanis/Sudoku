import java.io.FileInputStream;
import java.io.ObjectInputStream;
//αντικειμενο π χρησιμοποιειται για το διαβασμα των αρχειων
public class ReadSudoku {

    //διαβαζει το αρχειο με τα κλασσικα σουντοκου
    public ClassicSudoku ReadClassicSudoku() throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ClassicSudokuFile.txt"));

        try {
            ClassicSudoku object = (ClassicSudoku) in.readObject();
            in.close();
            return object;
        } catch (Throwable var5) {
            try {
                in.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }
            throw var5;
        }


    }

    //διαβαζει το αρχειο με τα killersudoku
    public KillerSudoku ReadKillerSudoku() throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("KillerSudokuFile.txt"));

        try {
            KillerSudoku object = (KillerSudoku) in.readObject();
            in.close();
            return object;
        } catch (Throwable var5) {
            try {
                in.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }
            throw var5;
        }


    }

    //διαβαζει το αρχειο με τους χρηστες
    public Players ReadPlayers() throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("PlayersFile.txt"));

        try {
            Players object = (Players) in.readObject();
            in.close();
            return object;
        } catch (Throwable var5) {
            try {
                in.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }
            throw var5;
        }


    }


}


