import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//κλαση π αποτελειται απο τα 10 διαφορετικα killersudoku
public class KillerSudoku implements Serializable{
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

    //δημιουργει τα 10 αντιστοιχα sudoku
    public KillerSudoku(){
        killerBoard1=new KillerBoard1();
        killerBoard2=new KillerBoard2();
        killerBoard3=new KillerBoard3();
        killerBoard4=new KillerBoard4();
        killerBoard5=new KillerBoard5();
        killerBoard6=new KillerBoard6();
        killerBoard7=new KillerBoard7();
        killerBoard8=new KillerBoard8();
        killerBoard9=new KillerBoard9();
        killerBoard10=new KillerBoard10();



    }


    //επιστρεφουν τα 10killlersudoku
    public KillerBoard1 getKillerBoard1() {
        return killerBoard1;
    }
    public KillerBoard2 getKillerBoard2(){
        return killerBoard2;
    }
    public KillerBoard3 getKillerBoard3(){
        return killerBoard3;
    }
    public KillerBoard4 getKillerBoard4(){
        return killerBoard4;
    }
    public KillerBoard5 getKillerBoard5(){
        return killerBoard5;
    }
    public KillerBoard6 getKillerBoard6(){
        return killerBoard6;
    }
    public KillerBoard7 getKillerBoard7(){
        return killerBoard7;
    }
    public KillerBoard8 getKillerBoard8(){
        return killerBoard8;
    }
    public KillerBoard9 getKillerBoard9(){
        return killerBoard9;
    }
    public KillerBoard10 getKillerBoard10(){
        return killerBoard10;
    }


    //γρεφει ενα αντικειμενο killersudoku με ολα τα killersudoku μεσα σε ενα αρχειο
    public void WriteKillerSudoku() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("KillerSudokuFile.txt"));

        try {
            KillerSudoku object = new KillerSudoku();
            out.writeObject(object);
        } catch (Throwable var5) {
            try {
                out.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }
            throw var5;
        }
        out.close();
    }


}


