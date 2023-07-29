import java.io.Serializable;
import java.util.ArrayList;

// ο εβδομοςς πινακας των KillerSudoku
public class KillerBoard7 implements Serializable {
    private ArrayList<Cell> search7;
    private Cell cell1=new Cell(0,0,1);
    private Cell cell2=new Cell(0,1,2);
    private Cell cell3=new Cell(0,2,3);
    private Cell cell4=new Cell(0,3,4);
    private Cell cell5=new Cell(0,4,5);
    private Cell cell6=new Cell(0,5,6);
    private Cell cell7=new Cell(0,6,7);
    private Cell cell8=new Cell(0,7,8);
    private Cell cell9=new Cell(0,8,9);
    private Cell cell10=new Cell(1,0,10);
    private Cell cell11=new Cell(1,1,11);
    private Cell cell12=new Cell(1,2,12);
    private Cell cell13=new Cell(1,3,13);
    private Cell cell14=new Cell(1,4,14);
    private Cell cell15=new Cell(1,5,15);
    private Cell cell16=new Cell(1,6,16);
    private Cell cell17=new Cell(1,7,17);
    private Cell cell18=new Cell(1,8,18);
    private Cell cell19=new Cell(2,0,19);
    private Cell cell20=new Cell(2,1,20);
    private Cell cell21=new Cell(2,2,21);
    private Cell cell22=new Cell(2,3,22);
    private Cell cell23=new Cell(2,4,23);
    private Cell cell24=new Cell(2,5,24);
    private Cell cell25=new Cell(2,6,25);
    private Cell cell26=new Cell(2,7,26);
    private Cell cell27=new Cell(2,8,27);
    private Cell cell28=new Cell(3,0,28);
    private Cell cell29=new Cell(3,1,29);
    private Cell cell30=new Cell(3,2,30);
    private Cell cell31=new Cell(3,3,31);
    private Cell cell32=new Cell(3,4,32);
    private Cell cell33=new Cell(3,5,33);
    private Cell cell34=new Cell(3,6,34);
    private Cell cell35=new Cell(3,7,35);
    private Cell cell36=new Cell(3,8,36);
    private Cell cell37=new Cell(4,0,37);
    private Cell cell38=new Cell(4,1,38);
    private Cell cell39=new Cell(4,2,39);
    private Cell cell40=new Cell(4,3,40);
    private Cell cell41=new Cell(4,4,41);
    private Cell cell42=new Cell(4,5,42);
    private Cell cell43=new Cell(4,6,43);
    private Cell cell44=new Cell(4,7,44);
    private Cell cell45=new Cell(4,8,45);
    private Cell cell46=new Cell(5,0,46);
    private Cell cell47=new Cell(5,1,47);
    private Cell cell48=new Cell(5,2,48);
    private Cell cell49=new Cell(5,3,49);
    private Cell cell50=new Cell(5,4,50);
    private Cell cell51=new Cell(5,5,51);
    private Cell cell52=new Cell(5,6,52);
    private Cell cell53=new Cell(5,7,53);
    private Cell cell54=new Cell(5,8,54);
    private Cell cell55=new Cell(6,0,55);
    private Cell cell56=new Cell(6,1,56);
    private Cell cell57=new Cell(6,2,57);
    private Cell cell58=new Cell(6,3,58);
    private Cell cell59=new Cell(6,4,59);
    private Cell cell60=new Cell(6,5,60);
    private Cell cell61=new Cell(6,6,61);
    private Cell cell62=new Cell(6,7,62);
    private Cell cell63=new Cell(6,8,63);
    private Cell cell64=new Cell(7,0,64);
    private Cell cell65=new Cell(7,1,65);
    private Cell cell66=new Cell(7,2,66);
    private Cell cell67=new Cell(7,3,67);
    private Cell cell68=new Cell(7,4,68);
    private Cell cell69=new Cell(7,5,69);
    private Cell cell70=new Cell(7,6,70);
    private Cell cell71=new Cell(7,7,71);
    private Cell cell72=new Cell(7,8,72);
    private Cell cell73=new Cell(8,0,73);
    private Cell cell74=new Cell(8,1,74);
    private Cell cell75=new Cell(8,2,75);
    private Cell cell76=new Cell(8,3,76);
    private Cell cell77=new Cell(8,4,77);
    private Cell cell78=new Cell(8,5,78);
    private Cell cell79=new Cell(8,6,79);
    private Cell cell80=new Cell(8,7,80);
    private Cell cell81=new Cell(8,8,81);
    private int[][] arr;

    // δημιουργει τον αντιστοιχο πινακα με τις απαραιτητες πληροφοριες
    public KillerBoard7() {

        arr = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        cell1.addTeam(cell10);
        cell1.setSum(6);

        cell10.addTeam(cell1);
        cell10.setSum(6);
        //
        cell2.addTeam(cell3);
        cell2.addTeam(cell4);
        cell2.setSum(10);

        cell3.addTeam(cell2);
        cell3.addTeam(cell4);
        cell3.setSum(10);

        cell4.addTeam(cell2);
        cell4.addTeam(cell3);
        cell4.setSum(10);
        //
        cell5.addTeam(cell14);
        cell5.setSum(7);

        cell14.addTeam(cell5);
        cell14.setSum(7);
        //
        cell6.addTeam(cell7);
        cell6.addTeam(cell8);
        cell6.setSum(24);

        cell7.addTeam(cell6);
        cell7.addTeam(cell8);
        cell7.setSum(24);

        cell8.addTeam(cell6);
        cell8.addTeam(cell7);
        cell8.setSum(24);
        //
        cell9.addTeam(cell18);
        cell9.setSum(13);

        cell18.addTeam(cell9);
        cell18.setSum(13);
        //
        cell11.addTeam(cell20);
        cell11.setSum(15);

        cell20.addTeam(cell11);
        cell20.setSum(15);
        //
        cell12.addTeam(cell13);
        cell12.setSum(7);

        cell13.addTeam(cell12);
        cell13.setSum(7);
        //
        cell15.addTeam(cell16);
        cell15.setSum(9);

        cell16.addTeam(cell15);
        cell16.setSum(9);
        //
        cell17.addTeam(cell26);
        cell17.setSum(11);

        cell26.addTeam(cell17);
        cell26.setSum(11);
        //
        cell19.addTeam(cell28);
        cell19.setSum(8);

        cell28.addTeam(cell19);
        cell28.setSum(8);
        //
        cell21.addTeam(cell22);
        cell21.setSum(17);

        cell22.addTeam(cell21);
        cell22.setSum(17);
        //
        cell23.addTeam(cell32);
        cell23.addTeam(cell31);
        cell23.addTeam(cell33);
        cell23.setSum(12);

        cell32.addTeam(cell23);
        cell32.addTeam(cell31);
        cell32.addTeam(cell33);
        cell32.setSum(12);

        cell31.addTeam(cell32);
        cell31.addTeam(cell23);
        cell31.addTeam(cell33);
        cell31.setSum(12);

        cell33.addTeam(cell32);
        cell33.addTeam(cell31);
        cell33.addTeam(cell23);
        cell33.setSum(12);
        //
        cell24.addTeam(cell25);
        cell24.setSum(9);

        cell25.addTeam(cell24);
        cell25.setSum(9);
        //
        cell27.addTeam(cell36);
        cell27.setSum(8);

        cell36.addTeam(cell27);
        cell36.setSum(8);
        //
        cell29.addTeam(cell30);
        cell29.setSum(7);

        cell30.addTeam(cell29);
        cell30.setSum(7);
        //
        cell34.addTeam(cell35);
        cell34.setSum(17);

        cell35.addTeam(cell34);
        cell35.setSum(17);
        //
        cell37.addTeam(cell46);
        cell37.addTeam(cell47);
        cell37.setSum(19);

        cell46.addTeam(cell37);
        cell46.addTeam(cell47);
        cell46.setSum(19);

        cell47.addTeam(cell37);
        cell47.addTeam(cell46);
        cell47.setSum(19);
        //
        cell38.addTeam(cell39);
        cell38.setSum(8);

        cell39.addTeam(cell38);
        cell39.setSum(8);
        //
        cell40.addTeam(cell41);
        cell40.addTeam(cell42);
        cell40.addTeam(cell50);
        cell40.setSum(23);

        cell41.addTeam(cell40);
        cell41.addTeam(cell42);
        cell41.addTeam(cell50);
        cell41.setSum(23);

        cell42.addTeam(cell41);
        cell42.addTeam(cell40);
        cell42.addTeam(cell50);
        cell42.setSum(23);

        cell50.addTeam(cell41);
        cell50.addTeam(cell42);
        cell50.addTeam(cell40);
        cell50.setSum(23);
        //
        cell43.addTeam(cell44);
        cell43.setSum(7);

        cell44.addTeam(cell43);
        cell44.setSum(7);
        //
        cell45.addTeam(cell54);
        cell45.addTeam(cell53);
        cell45.setSum(13);

        cell54.addTeam(cell45);
        cell54.addTeam(cell53);
        cell54.setSum(13);

        cell53.addTeam(cell54);
        cell53.addTeam(cell45);
        cell53.setSum(13);
        //
        cell48.addTeam(cell49);
        cell48.setSum(11);

        cell49.addTeam(cell48);
        cell49.setSum(11);
        //
        cell51.addTeam(cell52);
        cell51.setSum(9);

        cell52.addTeam(cell51);
        cell52.setSum(9);
        //
        cell55.addTeam(cell64);
        cell55.addTeam(cell73);
        cell55.setSum(14);

        cell64.addTeam(cell55);
        cell64.addTeam(cell73);
        cell64.setSum(14);

        cell73.addTeam(cell55);
        cell73.addTeam(cell64);
        cell73.setSum(14);
        //
        cell56.addTeam(cell65);
        cell56.setSum(15);

        cell65.addTeam(cell56);
        cell65.setSum(15);
        //
        cell57.addTeam(cell58);
        cell57.addTeam(cell59);
        cell57.addTeam(cell60);
        cell57.addTeam(cell61);
        cell57.setSum(26);

        cell58.addTeam(cell57);
        cell58.addTeam(cell59);
        cell58.addTeam(cell60);
        cell58.addTeam(cell61);
        cell58.setSum(26);

        cell59.addTeam(cell58);
        cell59.addTeam(cell57);
        cell59.addTeam(cell60);
        cell59.addTeam(cell61);
        cell59.setSum(26);

        cell60.addTeam(cell58);
        cell60.addTeam(cell59);
        cell60.addTeam(cell57);
        cell60.addTeam(cell61);
        cell60.setSum(26);

        cell61.addTeam(cell58);
        cell61.addTeam(cell59);
        cell61.addTeam(cell60);
        cell61.addTeam(cell57);
        cell61.setSum(26);
        //
        cell62.addTeam(cell71);
        cell62.setSum(8);

        cell71.addTeam(cell62);
        cell71.setSum(8);
        //
        cell63.addTeam(cell72);
        cell63.addTeam(cell81);
        cell63.setSum(15);

        cell72.addTeam(cell63);
        cell72.addTeam(cell81);
        cell72.setSum(15);

        cell81.addTeam(cell72);
        cell81.addTeam(cell63);
        cell81.setSum(15);
        //
        cell66.addTeam(cell67);
        cell66.setSum(10);

        cell67.addTeam(cell66);
        cell67.setSum(10);
        //
        cell68.addTeam(cell77);
        cell68.setSum(14);

        cell77.addTeam(cell68);
        cell77.setSum(14);
        //
        cell69.addTeam(cell70);
        cell69.setSum(5);

        cell70.addTeam(cell69);
        cell70.setSum(5);
        //
        cell74.addTeam(cell75);
        cell74.addTeam(cell76);
        cell74.setSum(15);

        cell75.addTeam(cell74);
        cell75.addTeam(cell76);
        cell75.setSum(15);

        cell76.addTeam(cell75);
        cell76.addTeam(cell74);
        cell76.setSum(15);
        //
        cell78.addTeam(cell79);
        cell78.addTeam(cell80);
        cell78.setSum(13);

        cell79.addTeam(cell78);
        cell79.addTeam(cell80);
        cell79.setSum(13);

        cell80.addTeam(cell79);
        cell80.addTeam(cell78);
        cell80.setSum(13);
        //

        search7 = new ArrayList<>();
        search7.add(cell1);
        search7.add(cell2);
        search7.add(cell3);
        search7.add(cell4);
        search7.add(cell5);
        search7.add(cell6);
        search7.add(cell7);
        search7.add(cell8);
        search7.add(cell9);
        search7.add(cell10);
        search7.add(cell11);
        search7.add(cell12);
        search7.add(cell13);
        search7.add(cell14);
        search7.add(cell15);
        search7.add(cell16);
        search7.add(cell17);
        search7.add(cell18);
        search7.add(cell19);
        search7.add(cell20);
        search7.add(cell21);
        search7.add(cell22);
        search7.add(cell23);
        search7.add(cell24);
        search7.add(cell25);
        search7.add(cell26);
        search7.add(cell27);
        search7.add(cell28);
        search7.add(cell29);
        search7.add(cell30);
        search7.add(cell31);
        search7.add(cell32);
        search7.add(cell33);
        search7.add(cell34);
        search7.add(cell35);
        search7.add(cell36);
        search7.add(cell37);
        search7.add(cell38);
        search7.add(cell39);
        search7.add(cell40);
        search7.add(cell41);
        search7.add(cell42);
        search7.add(cell43);
        search7.add(cell44);
        search7.add(cell45);
        search7.add(cell46);
        search7.add(cell47);
        search7.add(cell48);
        search7.add(cell49);
        search7.add(cell50);
        search7.add(cell51);
        search7.add(cell52);
        search7.add(cell53);
        search7.add(cell54);
        search7.add(cell55);
        search7.add(cell56);
        search7.add(cell57);
        search7.add(cell58);
        search7.add(cell59);
        search7.add(cell60);
        search7.add(cell61);
        search7.add(cell62);
        search7.add(cell63);
        search7.add(cell64);
        search7.add(cell65);
        search7.add(cell66);
        search7.add(cell67);
        search7.add(cell68);
        search7.add(cell69);
        search7.add(cell70);
        search7.add(cell71);
        search7.add(cell72);
        search7.add(cell73);
        search7.add(cell74);
        search7.add(cell75);
        search7.add(cell76);
        search7.add(cell77);
        search7.add(cell78);
        search7.add(cell79);
        search7.add(cell80);
        search7.add(cell81);

    }
    // επιστρεφει τον δυσδιαστατο πινακα ακεραιων
    public int[][] getArr () {
        return arr;
    }
    // επιστρεφει ενα arraylist με ολα τα κελια τ πινακα
    public ArrayList<Cell> getSearch7 () {
        return search7;
    }
}