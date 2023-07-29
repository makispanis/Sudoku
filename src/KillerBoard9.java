import java.io.Serializable;
import java.util.ArrayList;

// ο ενατος πινακας των KillerSudoku
public class KillerBoard9 implements Serializable {
    private ArrayList<Cell> search9;
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
    public KillerBoard9() {

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

        cell1.addTeam(cell2);
        cell1.setSum(11);

        cell2.addTeam(cell1);
        cell2.setSum(11);
        //
        cell3.addTeam(cell4);
        cell3.setSum(3);

        cell4.addTeam(cell3);
        cell4.setSum(3);
        //
        cell5.addTeam(cell14);
        cell5.setSum(15);

        cell14.addTeam(cell5);
        cell14.setSum(15);
        //
        cell6.addTeam(cell15);
        cell6.setSum(7);

        cell15.addTeam(cell6);
        cell15.setSum(7);
        //
        cell7.addTeam(cell16);
        cell7.setSum(16);

        cell16.addTeam(cell7);
        cell16.setSum(16);
        //
        cell8.addTeam(cell17);
        cell8.setSum(9);

        cell17.addTeam(cell8);
        cell17.setSum(9);
        //
        cell9.addTeam(cell18);
        cell9.addTeam(cell27);
        cell9.addTeam(cell36);
        cell9.setSum(21);

        cell18.addTeam(cell9);
        cell18.addTeam(cell27);
        cell18.addTeam(cell36);
        cell18.setSum(21);

        cell27.addTeam(cell18);
        cell27.addTeam(cell9);
        cell27.addTeam(cell36);
        cell27.setSum(21);

        cell36.addTeam(cell18);
        cell36.addTeam(cell27);
        cell36.addTeam(cell39);
        cell36.setSum(21);
        //
        cell10.addTeam(cell11);
        cell10.setSum(7);

        cell11.addTeam(cell10);
        cell11.setSum(7);
        //
        cell12.addTeam(cell13);
        cell12.setSum(14);

        cell13.addTeam(cell12);
        cell13.setSum(14);
        //
        cell19.addTeam(cell28);
        cell19.setSum(13);

        cell28.addTeam(cell19);
        cell28.setSum(13);
        //
        cell20.addTeam(cell29);
        cell20.setSum(5);

        cell29.addTeam(cell20);
        cell29.setSum(5);
        //
        cell21.addTeam(cell22);
        cell21.setSum(9);

        cell22.addTeam(cell21);
        cell22.setSum(9);
        //
        cell23.addTeam(cell32);
        cell23.addTeam(cell41);
        cell23.addTeam(cell50);
        cell23.addTeam(cell59);
        cell23.setSum(21);

        cell32.addTeam(cell23);
        cell32.addTeam(cell41);
        cell32.addTeam(cell50);
        cell32.addTeam(cell59);
        cell32.setSum(21);

        cell41.addTeam(cell32);
        cell41.addTeam(cell23);
        cell41.addTeam(cell50);
        cell41.addTeam(cell59);
        cell41.setSum(21);

        cell50.addTeam(cell32);
        cell50.addTeam(cell41);
        cell50.addTeam(cell23);
        cell50.addTeam(cell59);
        cell50.setSum(21);

        cell59.addTeam(cell32);
        cell59.addTeam(cell41);
        cell59.addTeam(cell50);
        cell59.addTeam(cell23);
        cell59.setSum(21);
        //
        cell24.addTeam(cell25);
        cell24.setSum(7);

        cell25.addTeam(cell24);
        cell25.setSum(7);
        //
        cell26.addTeam(cell35);
        cell26.setSum(9);

        cell35.addTeam(cell26);
        cell35.setSum(9);
        //
        cell30.addTeam(cell39);
        cell30.setSum(8);

        cell39.addTeam(cell30);
        cell39.setSum(8);
        //
        cell31.addTeam(cell40);
        cell31.setSum(13);

        cell40.addTeam(cell31);
        cell40.setSum(13);
        //
        cell33.addTeam(cell34);
        cell33.setSum(11);

        cell34.addTeam(cell33);
        cell34.setSum(11);
        //
        cell37.addTeam(cell38);
        cell37.setSum(11);

        cell38.addTeam(cell37);
        cell38.setSum(11);
        //
        cell42.addTeam(cell51);
        cell42.setSum(13);

        cell51.addTeam(cell42);
        cell51.setSum(13);
        //
        cell43.addTeam(cell52);
        cell43.setSum(11);

        cell52.addTeam(cell43);
        cell52.setSum(11);
        //
        cell44.addTeam(cell45);
        cell44.setSum(8);

        cell45.addTeam(cell44);
        cell45.setSum(8);
        //
        cell46.addTeam(cell55);
        cell46.addTeam(cell64);
        cell46.addTeam(cell73);
        cell46.setSum(26);

        cell55.addTeam(cell46);
        cell55.addTeam(cell64);
        cell55.addTeam(cell73);
        cell55.setSum(26);

        cell64.addTeam(cell55);
        cell64.addTeam(cell46);
        cell64.addTeam(cell73);
        cell64.setSum(26);

        cell73.addTeam(cell55);
        cell73.addTeam(cell64);
        cell73.addTeam(cell46);
        cell73.setSum(26);
        //
        cell47.addTeam(cell56);
        cell47.setSum(9);

        cell56.addTeam(cell47);
        cell56.setSum(9);
        //
        cell48.addTeam(cell49);
        cell48.setSum(7);

        cell49.addTeam(cell48);
        cell49.setSum(7);
        //
        cell53.addTeam(cell62);
        cell53.setSum(11);

        cell62.addTeam(cell53);
        cell62.setSum(11);
        //
        cell54.addTeam(cell63);
        cell54.setSum(16);

        cell63.addTeam(cell54);
        cell63.setSum(16);
        //
        cell57.addTeam(cell58);
        cell57.setSum(14);

        cell58.addTeam(cell57);
        cell58.setSum(14);
        //
        cell60.addTeam(cell61);
        cell60.setSum(6);

        cell61.addTeam(cell60);
        cell61.setSum(6);
        //
        cell65.addTeam(cell74);
        cell65.setSum(8);

        cell74.addTeam(cell65);
        cell74.setSum(8);
        //
        cell66.addTeam(cell75);
        cell66.setSum(7);

        cell75.addTeam(cell66);
        cell75.setSum(7);
        //
        cell67.addTeam(cell76);
        cell67.setSum(15);

        cell76.addTeam(cell67);
        cell76.setSum(15);
        //
        cell68.addTeam(cell77);
        cell68.setSum(9);

        cell77.addTeam(cell68);
        cell77.setSum(9);
        //
        cell69.addTeam(cell70);
        cell69.setSum(8);

        cell70.addTeam(cell69);
        cell70.setSum(8);
        //
        cell71.addTeam(cell72);
        cell71.setSum(12);

        cell72.addTeam(cell71);
        cell72.setSum(12);
        //
        cell78.addTeam(cell79);
        cell78.setSum(11);

        cell79.addTeam(cell78);
        cell79.setSum(11);
        //
        cell80.addTeam(cell81);
        cell80.setSum(4);

        cell81.addTeam(cell80);
        cell81.setSum(4);
        //



        search9 = new ArrayList<>();
        search9.add(cell1);
        search9.add(cell2);
        search9.add(cell3);
        search9.add(cell4);
        search9.add(cell5);
        search9.add(cell6);
        search9.add(cell7);
        search9.add(cell8);
        search9.add(cell9);
        search9.add(cell10);
        search9.add(cell11);
        search9.add(cell12);
        search9.add(cell13);
        search9.add(cell14);
        search9.add(cell15);
        search9.add(cell16);
        search9.add(cell17);
        search9.add(cell18);
        search9.add(cell19);
        search9.add(cell20);
        search9.add(cell21);
        search9.add(cell22);
        search9.add(cell23);
        search9.add(cell24);
        search9.add(cell25);
        search9.add(cell26);
        search9.add(cell27);
        search9.add(cell28);
        search9.add(cell29);
        search9.add(cell30);
        search9.add(cell31);
        search9.add(cell32);
        search9.add(cell33);
        search9.add(cell34);
        search9.add(cell35);
        search9.add(cell36);
        search9.add(cell37);
        search9.add(cell38);
        search9.add(cell39);
        search9.add(cell40);
        search9.add(cell41);
        search9.add(cell42);
        search9.add(cell43);
        search9.add(cell44);
        search9.add(cell45);
        search9.add(cell46);
        search9.add(cell47);
        search9.add(cell48);
        search9.add(cell49);
        search9.add(cell50);
        search9.add(cell51);
        search9.add(cell52);
        search9.add(cell53);
        search9.add(cell54);
        search9.add(cell55);
        search9.add(cell56);
        search9.add(cell57);
        search9.add(cell58);
        search9.add(cell59);
        search9.add(cell60);
        search9.add(cell61);
        search9.add(cell62);
        search9.add(cell63);
        search9.add(cell64);
        search9.add(cell65);
        search9.add(cell66);
        search9.add(cell67);
        search9.add(cell68);
        search9.add(cell69);
        search9.add(cell70);
        search9.add(cell71);
        search9.add(cell72);
        search9.add(cell73);
        search9.add(cell74);
        search9.add(cell75);
        search9.add(cell76);
        search9.add(cell77);
        search9.add(cell78);
        search9.add(cell79);
        search9.add(cell80);
        search9.add(cell81);

    }
    // επιστρεφει τον δυσδιαστατο πινακα ακεραιων
    public int[][] getArr () {
        return arr;
    }
    // επιστρεφει ενα arraylist με ολα τα κελια τ πινακα
    public ArrayList<Cell> getSearch9 () {
        return search9;
    }
}