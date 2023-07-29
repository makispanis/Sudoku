import java.io.Serializable;
import java.util.ArrayList;

// ο τεταρτος πινακας των KillerSudoku
public class KillerBoard4 implements Serializable {
    private ArrayList<Cell> search4;
    private Cell cell1 = new Cell(8, 0,73);
    private Cell cell2 = new Cell(8, 1,74);
    private Cell cell3 = new Cell(8, 2,75);
    private Cell cell4 = new Cell(8, 3,76);
    private Cell cell5 = new Cell(8, 4,77);
    private Cell cell6 = new Cell(8, 5,78);
    private Cell cell7 = new Cell(8, 6,79);
    private Cell cell8 = new Cell(8, 7,80);
    private Cell cell9 = new Cell(8, 8,81);
    private Cell cell10 = new Cell(7, 0,64);
    private Cell cell11 = new Cell(7, 1,65);
    private Cell cell12 = new Cell(7, 2,66);
    private Cell cell13 = new Cell(7, 3,67);
    private Cell cell14 = new Cell(7, 4,68);
    private Cell cell15 = new Cell(7, 5,69);
    private Cell cell16 = new Cell(7, 6,70);
    private Cell cell17 = new Cell(7, 7,71);
    private Cell cell18 = new Cell(7, 8,72);
    private Cell cell19 = new Cell(6, 0,55);
    private Cell cell20 = new Cell(6, 1,56);
    private Cell cell21 = new Cell(6, 2,57);
    private Cell cell22 = new Cell(6, 3,58);
    private Cell cell23 = new Cell(6, 4,59);
    private Cell cell24 = new Cell(6, 5,60);
    private Cell cell25 = new Cell(6, 6,61);
    private Cell cell26 = new Cell(6, 7,62);
    private Cell cell27 = new Cell(6, 8,63);
    private Cell cell28 = new Cell(5, 0,46);
    private Cell cell29 = new Cell(5, 1,47);
    private Cell cell30 = new Cell(5, 2,48);
    private Cell cell31 = new Cell(5, 3,49);
    private Cell cell32 = new Cell(5, 4,50);
    private Cell cell33 = new Cell(5, 5,51);
    private Cell cell34 = new Cell(5, 6,52);
    private Cell cell35 = new Cell(5, 7,53);
    private Cell cell36 = new Cell(5, 8,54);
    private Cell cell37=new Cell(4,0,37);
    private Cell cell38=new Cell(4,1,38);
    private Cell cell39=new Cell(4,2,39);
    private Cell cell40=new Cell(4,3,40);
    private Cell cell41=new Cell(4,4,41);
    private Cell cell42=new Cell(4,5,42);
    private Cell cell43=new Cell(4,6,43);
    private Cell cell44=new Cell(4,7,44);
    private Cell cell45=new Cell(4,8,45);
    private Cell cell46 = new Cell(3, 0,28);
    private Cell cell47 = new Cell(3, 1,29);
    private Cell cell48 = new Cell(3, 2,30);
    private Cell cell49 = new Cell(3, 3,31);
    private Cell cell50 = new Cell(3, 4,32);
    private Cell cell51 = new Cell(3, 5,33);
    private Cell cell52 = new Cell(3, 6,34);
    private Cell cell53 = new Cell(3, 7,35);
    private Cell cell54 = new Cell(3, 8,36);
    private Cell cell55 = new Cell(2, 0,19);
    private Cell cell56 = new Cell(2, 1,20);
    private Cell cell57 = new Cell(2, 2,21);
    private Cell cell58 = new Cell(2, 3,22);
    private Cell cell59 = new Cell(2, 4,23);
    private Cell cell60 = new Cell(2, 5,24);
    private Cell cell61 = new Cell(2, 6,25);
    private Cell cell62 = new Cell(2, 7,26);
    private Cell cell63 = new Cell(2, 8,27);
    private Cell cell64 = new Cell(1, 0,10);
    private Cell cell65 = new Cell(1, 1,11);
    private Cell cell66 = new Cell(1, 2,12);
    private Cell cell67 = new Cell(1, 3,13);
    private Cell cell68 = new Cell(1, 4,14);
    private Cell cell69 = new Cell(1, 5,15);
    private Cell cell70 = new Cell(1, 6,16);
    private Cell cell71 = new Cell(1, 7,17);
    private Cell cell72 = new Cell(1, 8,18);
    private Cell cell73 = new Cell(0, 0,1);
    private Cell cell74 = new Cell(0, 1,2);
    private Cell cell75 = new Cell(0, 2,3);
    private Cell cell76 = new Cell(0, 3,4);
    private Cell cell77 = new Cell(0, 4,5);
    private Cell cell78 = new Cell(0, 5,6);
    private Cell cell79 = new Cell(0, 6,7);
    private Cell cell80 = new Cell(0, 7,8);
    private Cell cell81 = new Cell(0, 8,9);
    private int[][] arr;

    // δημιουργει τον αντιστοιχο πινακα με τις απαραιτητες πληροφοριες
    public KillerBoard4() {

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
        cell1.setSum(9);

        cell10.addTeam(cell1);
        cell10.setSum(9);
        //
        cell2.addTeam(cell3);
        cell2.setSum(8);

        cell13.addTeam(cell12);
        cell13.setSum(8);
        //
        cell4.addTeam(cell13);
        cell4.setSum(12);

        cell13.addTeam(cell4);
        cell13.setSum(12);
        //
        cell5.addTeam(cell6);
        cell5.addTeam(cell14);
        cell5.addTeam(cell15);
        cell5.setSum(11);

        cell6.addTeam(cell5);
        cell6.addTeam(cell14);
        cell6.addTeam(cell15);
        cell6.setSum(11);

        cell14.addTeam(cell5);
        cell14.addTeam(cell6);
        cell14.addTeam(cell15);
        cell14.setSum(11);

        cell15.addTeam(cell5);
        cell15.addTeam(cell14);
        cell15.addTeam(cell6);
        cell15.setSum(11);
        //
        cell7.addTeam(cell8);
        cell7.addTeam(cell9);
        cell7.addTeam(cell18);
        cell7.addTeam(cell27);
        cell7.setSum(28);

        cell8.addTeam(cell7);
        cell8.addTeam(cell9);
        cell8.addTeam(cell18);
        cell8.addTeam(cell27);
        cell8.setSum(28);

        cell9.addTeam(cell8);
        cell9.addTeam(cell7);
        cell9.addTeam(cell18);
        cell9.addTeam(cell27);
        cell9.setSum(28);

        cell18.addTeam(cell8);
        cell18.addTeam(cell9);
        cell18.addTeam(cell7);
        cell18.addTeam(cell27);
        cell18.setSum(28);

        cell27.addTeam(cell8);
        cell27.addTeam(cell9);
        cell27.addTeam(cell18);
        cell27.addTeam(cell7);
        cell27.setSum(28);
        //
        cell11.addTeam(cell12);
        cell11.setSum(11);

        cell12.addTeam(cell11);
        cell12.setSum(11);
        //
        cell16.addTeam(cell25);
        cell16.setSum(7);

        cell25.addTeam(cell16);
        cell25.setSum(7);
        //
        cell17.addTeam(cell26);
        cell17.setSum(10);

        cell26.addTeam(cell17);
        cell26.setSum(10);
        //
        cell19.addTeam(cell20);
        cell19.setSum(9);

        cell20.addTeam(cell19);
        cell20.setSum(9);
        //
        cell21.addTeam(cell22);
        cell21.addTeam(cell31);
        cell21.setSum(21);

        cell22.addTeam(cell21);
        cell22.addTeam(cell31);
        cell22.setSum(21);

        cell31.addTeam(cell21);
        cell31.addTeam(cell22);
        cell31.setSum(21);
        //
        cell23.addTeam(cell32);
        cell23.setSum(8);

        cell32.addTeam(cell23);
        cell32.setSum(8);
        //
        cell24.addTeam(cell33);
        cell24.setSum(14);

        cell33.addTeam(cell24);
        cell33.setSum(14);
        //
        cell28.addTeam(cell29);
        cell28.addTeam(cell30);
        cell28.setSum(18);

        cell29.addTeam(cell28);
        cell29.addTeam(cell30);
        cell29.setSum(18);

        cell30.addTeam(cell29);
        cell30.addTeam(cell28);
        cell30.setSum(18);
        //
        cell34.addTeam(cell43);
        cell34.addTeam(cell52);
        cell34.addTeam(cell44);
        cell34.setSum(30);

        cell43.addTeam(cell34);
        cell43.addTeam(cell52);
        cell43.addTeam(cell44);
        cell43.setSum(30);

        cell52.addTeam(cell34);
        cell52.addTeam(cell43);
        cell52.addTeam(cell44);
        cell52.setSum(30);

        cell44.addTeam(cell34);
        cell44.addTeam(cell52);
        cell44.addTeam(cell43);
        cell44.setSum(30);
        //
        cell35.addTeam(cell36);
        cell35.addTeam(cell45);
        cell35.addTeam(cell54);
        cell35.addTeam(cell53);
        cell35.setSum(15);

        cell36.addTeam(cell35);
        cell36.addTeam(cell45);
        cell36.addTeam(cell54);
        cell36.addTeam(cell53);
        cell36.setSum(15);

        cell45.addTeam(cell36);
        cell45.addTeam(cell35);
        cell45.addTeam(cell54);
        cell45.addTeam(cell53);
        cell45.setSum(15);

        cell54.addTeam(cell36);
        cell54.addTeam(cell45);
        cell54.addTeam(cell35);
        cell54.addTeam(cell53);
        cell54.setSum(15);

        cell53.addTeam(cell36);
        cell53.addTeam(cell45);
        cell53.addTeam(cell54);
        cell53.addTeam(cell35);
        cell53.setSum(15);
        //
        cell37.addTeam(cell38);
        cell37.addTeam(cell39);
        cell37.addTeam(cell40);
        cell37.addTeam(cell41);
        cell37.addTeam(cell42);
        cell37.setSum(31);

        cell38.addTeam(cell37);
        cell38.addTeam(cell39);
        cell38.addTeam(cell40);
        cell38.addTeam(cell41);
        cell38.addTeam(cell42);
        cell38.setSum(31);

        cell39.addTeam(cell38);
        cell39.addTeam(cell37);
        cell3.addTeam(cell40);
        cell39.addTeam(cell41);
        cell39.addTeam(cell42);
        cell39.setSum(31);

        cell40.addTeam(cell38);
        cell40.addTeam(cell39);
        cell40.addTeam(cell37);
        cell40.addTeam(cell41);
        cell40.addTeam(cell42);
        cell40.setSum(31);

        cell41.addTeam(cell38);
        cell41.addTeam(cell39);
        cell41.addTeam(cell40);
        cell41.addTeam(cell37);
        cell41.addTeam(cell42);
        cell41.setSum(31);

        cell42.addTeam(cell38);
        cell42.addTeam(cell39);
        cell42.addTeam(cell40);
        cell42.addTeam(cell41);
        cell42.addTeam(cell37);
        cell42.setSum(31);
        //
        cell46.addTeam(cell47);
        cell46.addTeam(cell48);
        cell46.setSum(12);

        cell47.addTeam(cell46);
        cell47.addTeam(cell48);
        cell47.setSum(12);

        cell48.addTeam(cell46);
        cell48.addTeam(cell47);
        cell48.setSum(12);
        //
        cell49.addTeam(cell58);
        cell49.addTeam(cell57);
        cell49.setSum(14);

        cell57.addTeam(cell58);
        cell57.addTeam(cell49);
        cell57.setSum(14);

        cell58.addTeam(cell57);
        cell58.addTeam(cell49);
        cell58.setSum(14);
        //
        cell50.addTeam(cell59);
        cell50.setSum(17);

        cell59.addTeam(cell50);
        cell59.setSum(17);
        //
        cell51.addTeam(cell60);
        cell51.setSum(10);

        cell60.addTeam(cell51);
        cell60.setSum(10);
        //
        cell55.addTeam(cell56);
        cell55.setSum(8);

        cell56.addTeam(cell55);
        cell56.setSum(8);
        //
        cell61.addTeam(cell70);
        cell61.setSum(7);

        cell70.addTeam(cell61);
        cell70.setSum(7);
        //
        cell62.addTeam(cell71);
        cell62.setSum(6);

        cell71.addTeam(cell62);
        cell71.setSum(6);
        //
        cell63.addTeam(cell72);
        cell63.addTeam(cell81);
        cell63.addTeam(cell80);
        cell63.addTeam(cell79);
        cell63.setSum(32);

        cell72.addTeam(cell63);
        cell72.addTeam(cell81);
        cell72.addTeam(cell80);
        cell72.addTeam(cell79);
        cell72.setSum(32);

        cell81.addTeam(cell72);
        cell81.addTeam(cell63);
        cell81.addTeam(cell80);
        cell81.addTeam(cell79);
        cell81.setSum(32);

        cell80.addTeam(cell72);
        cell80.addTeam(cell81);
        cell80.addTeam(cell63);
        cell80.addTeam(cell79);
        cell80.setSum(32);

        cell79.addTeam(cell72);
        cell79.addTeam(cell81);
        cell79.addTeam(cell80);
        cell79.addTeam(cell63);
        cell79.setSum(32);
        //
        cell64.addTeam(cell73);
        cell64.setSum(6);

        cell73.addTeam(cell64);
        cell73.setSum(6);
        //
        cell65.addTeam(cell66);
        cell65.setSum(17);

        cell66.addTeam(cell65);
        cell66.setSum(17);
        //
        cell67.addTeam(cell76);
        cell67.setSum(4);

        cell76.addTeam(cell67);
        cell76.setSum(4);
        //
        cell68.addTeam(cell69);
        cell68.addTeam(cell77);
        cell68.addTeam(cell78);
        cell68.setSum(23);

        cell69.addTeam(cell68);
        cell69.addTeam(cell77);
        cell69.addTeam(cell78);
        cell69.setSum(23);

        cell77.addTeam(cell78);
        cell77.addTeam(cell68);
        cell77.addTeam(cell69);
        cell77.setSum(23);

        cell78.addTeam(cell68);
        cell78.addTeam(cell69);
        cell78.addTeam(cell77);
        cell78.setSum(23);
        //
        cell74.addTeam(cell75);
        cell74.setSum(7);

        cell75.addTeam(cell74);
        cell75.setSum(7);
        //











        search4 = new ArrayList<>();
        search4.add(cell1);
        search4.add(cell2);
        search4.add(cell3);
        search4.add(cell4);
        search4.add(cell5);
        search4.add(cell6);
        search4.add(cell7);
        search4.add(cell8);
        search4.add(cell9);
        search4.add(cell10);
        search4.add(cell11);
        search4.add(cell12);
        search4.add(cell13);
        search4.add(cell14);
        search4.add(cell15);
        search4.add(cell16);
        search4.add(cell17);
        search4.add(cell18);
        search4.add(cell19);
        search4.add(cell20);
        search4.add(cell21);
        search4.add(cell22);
        search4.add(cell23);
        search4.add(cell24);
        search4.add(cell25);
        search4.add(cell26);
        search4.add(cell27);
        search4.add(cell28);
        search4.add(cell29);
        search4.add(cell30);
        search4.add(cell31);
        search4.add(cell32);
        search4.add(cell33);
        search4.add(cell34);
        search4.add(cell35);
        search4.add(cell36);
        search4.add(cell37);
        search4.add(cell38);
        search4.add(cell39);
        search4.add(cell40);
        search4.add(cell41);
        search4.add(cell42);
        search4.add(cell43);
        search4.add(cell44);
        search4.add(cell45);
        search4.add(cell46);
        search4.add(cell47);
        search4.add(cell48);
        search4.add(cell49);
        search4.add(cell50);
        search4.add(cell51);
        search4.add(cell52);
        search4.add(cell53);
        search4.add(cell54);
        search4.add(cell55);
        search4.add(cell56);
        search4.add(cell57);
        search4.add(cell58);
        search4.add(cell59);
        search4.add(cell60);
        search4.add(cell61);
        search4.add(cell62);
        search4.add(cell63);
        search4.add(cell64);
        search4.add(cell65);
        search4.add(cell66);
        search4.add(cell67);
        search4.add(cell68);
        search4.add(cell69);
        search4.add(cell70);
        search4.add(cell71);
        search4.add(cell72);
        search4.add(cell73);
        search4.add(cell74);
        search4.add(cell75);
        search4.add(cell76);
        search4.add(cell77);
        search4.add(cell78);
        search4.add(cell79);
        search4.add(cell80);
        search4.add(cell81);

    }
    // επιστρεφει τον δυσδιαστατο πινακα ακεραιων
    public int[][] getArr() {
        return arr;
    }
    // επιστρεφει ενα arraylist με ολα τα κελια τ πινακα
    public ArrayList<Cell> getSearch4 () {
        return search4;
    }
}