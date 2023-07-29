import java.io.Serializable;
import java.util.ArrayList;

// ο ογδοος πινακας των KillerSudoku
public class KillerBoard8 implements Serializable {
    private ArrayList<Cell> search8;
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
    public KillerBoard8() {

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
        cell1.addTeam(cell19);
        cell1.setSum(19);

        cell10.addTeam(cell1);
        cell10.addTeam(cell19);
        cell10.setSum(19);

        cell19.addTeam(cell10);
        cell19.addTeam(cell1);
        cell19.setSum(19);
        //
        cell2.addTeam(cell3);
        cell2.setSum(11);

        cell3.addTeam(cell2);
        cell3.setSum(11);
        //
        cell4.addTeam(cell13);
        cell4.setSum(8);

        cell13.addTeam(cell4);
        cell13.setSum(8);
        //
        cell5.addTeam(cell14);
        cell5.addTeam(cell23);
        cell5.addTeam(cell32);
        cell5.setSum(24);

        cell14.addTeam(cell5);
        cell14.addTeam(cell23);
        cell14.addTeam(cell32);
        cell14.setSum(24);

        cell23.addTeam(cell14);
        cell23.addTeam(cell5);
        cell23.addTeam(cell32);
        cell23.setSum(24);

        cell32.addTeam(cell14);
        cell32.addTeam(cell23);
        cell32.addTeam(cell5);
        cell32.setSum(24);
        //
        cell6.addTeam(cell15);
        cell6.setSum(12);

        cell15.addTeam(cell6);
        cell15.setSum(12);
        //
        cell7.addTeam(cell8);
        cell7.setSum(5);

        cell8.addTeam(cell7);
        cell8.setSum(5);
        //
        cell9.addTeam(cell18);
        cell9.addTeam(cell27);
        cell9.setSum(18);

        cell18.addTeam(cell9);
        cell18.addTeam(cell27);
        cell18.setSum(18);

        cell27.addTeam(cell18);
        cell27.addTeam(cell9);
        cell27.setSum(18);
        //
        cell11.addTeam(cell20);
        cell11.setSum(7);

        cell20.addTeam(cell11);
        cell20.setSum(7);
        //
        cell12.addTeam(cell21);
        cell12.addTeam(cell30);
        cell12.addTeam(cell29);
        cell12.addTeam(cell28);
        cell12.setSum(28);

        cell21.addTeam(cell12);
        cell21.addTeam(cell30);
        cell21.addTeam(cell29);
        cell21.addTeam(cell28);
        cell21.setSum(28);

        cell30.addTeam(cell21);
        cell30.addTeam(cell12);
        cell30.addTeam(cell29);
        cell30.addTeam(cell28);
        cell30.setSum(28);

        cell29.addTeam(cell21);
        cell29.addTeam(cell30);
        cell29.addTeam(cell12);
        cell29.addTeam(cell28);
        cell29.setSum(28);

        cell28.addTeam(cell21);
        cell28.addTeam(cell30);
        cell28.addTeam(cell29);
        cell28.addTeam(cell12);
        cell28.setSum(28);
        //
        cell16.addTeam(cell25);
        cell16.addTeam(cell34);
        cell16.addTeam(cell35);
        cell16.addTeam(cell36);
        cell16.setSum(30);

        cell25.addTeam(cell16);
        cell25.addTeam(cell34);
        cell25.addTeam(cell35);
        cell25.addTeam(cell36);
        cell25.setSum(30);

        cell34.addTeam(cell25);
        cell34.addTeam(cell16);
        cell34.addTeam(cell35);
        cell34.addTeam(cell36);
        cell34.setSum(30);

        cell35.addTeam(cell25);
        cell35.addTeam(cell34);
        cell35.addTeam(cell16);
        cell35.addTeam(cell36);
        cell35.setSum(30);

        cell36.addTeam(cell25);
        cell36.addTeam(cell34);
        cell36.addTeam(cell35);
        cell36.addTeam(cell16);
        cell36.setSum(30);
        //
        cell17.addTeam(cell26);
        cell17.setSum(6);

        cell26.addTeam(cell17);
        cell26.setSum(6);
        //
        cell22.addTeam(cell31);
        cell22.addTeam(cell40);
        cell22.setSum(13);

        cell31.addTeam(cell22);
        cell31.addTeam(cell40);
        cell31.setSum(13);

        cell40.addTeam(cell31);
        cell40.addTeam(cell22);
        cell40.setSum(13);
        //
        cell24.addTeam(cell33);
        cell24.addTeam(cell42);
        cell24.setSum(8);

        cell33.addTeam(cell24);
        cell33.addTeam(cell42);
        cell33.setSum(8);

        cell42.addTeam(cell24);
        cell42.addTeam(cell33);
        cell42.setSum(8);
        //
        cell37.addTeam(cell46);
        cell37.setSum(6);

        cell46.addTeam(cell37);
        cell46.setSum(6);
        //
        cell38.addTeam(cell39);
        cell38.setSum(9);

        cell39.addTeam(cell38);
        cell39.setSum(9);
        //
        cell41.addTeam(cell50);
        cell41.addTeam(cell59);
        cell41.setSum(15);

        cell50.addTeam(cell41);
        cell50.addTeam(cell59);
        cell50.setSum(15);

        cell59.addTeam(cell41);
        cell59.addTeam(cell50);
        cell59.setSum(15);
        //
        cell43.addTeam(cell44);
        cell43.setSum(17);

        cell44.addTeam(cell43);
        cell44.setSum(17);
        //
        cell45.addTeam(cell54);
        cell45.setSum(3);

        cell54.addTeam(cell45);
        cell54.setSum(3);
        //
        cell47.addTeam(cell56);
        cell47.setSum(17);

        cell56.addTeam(cell47);
        cell56.setSum(17);
        //
        cell48.addTeam(cell49);
        cell48.setSum(8);

        cell49.addTeam(cell48);
        cell49.setSum(8);
        //
        cell51.addTeam(cell52);
        cell51.setSum(13);

        cell52.addTeam(cell51);
        cell52.setSum(13);
        //
        cell53.addTeam(cell62);
        cell53.setSum(15);

        cell62.addTeam(cell53);
        cell62.setSum(15);
        //
        cell55.addTeam(cell64);
        cell55.setSum(13);

        cell64.addTeam(cell55);
        cell64.setSum(13);
        //
        cell57.addTeam(cell58);
        cell57.setSum(5);

        cell58.addTeam(cell57);
        cell58.setSum(5);
        //
        cell60.addTeam(cell61);
        cell60.setSum(9);

        cell61.addTeam(cell60);
        cell61.setSum(9);
        //
        cell63.addTeam(cell72);
        cell63.setSum(12);

        cell72.addTeam(cell63);
        cell72.setSum(12);
        //
        cell65.addTeam(cell66);
        cell65.addTeam(cell75);
        cell65.setSum(11);

        cell66.addTeam(cell65);
        cell66.addTeam(cell75);
        cell66.setSum(11);

        cell75.addTeam(cell66);
        cell75.addTeam(cell65);
        cell75.setSum(11);
        //
        cell67.addTeam(cell68);
        cell67.addTeam(cell69);
        cell67.addTeam(cell76);
        cell67.addTeam(cell77);
        cell67.addTeam(cell78);
        cell67.setSum(32);

        cell68.addTeam(cell67);
        cell68.addTeam(cell69);
        cell68.addTeam(cell76);
        cell68.addTeam(cell77);
        cell68.addTeam(cell78);
        cell68.setSum(32);

        cell69.addTeam(cell68);
        cell69.addTeam(cell67);
        cell69.addTeam(cell76);
        cell69.addTeam(cell77);
        cell69.addTeam(cell78);
        cell69.setSum(32);

        cell76.addTeam(cell68);
        cell76.addTeam(cell69);
        cell76.addTeam(cell67);
        cell76.addTeam(cell77);
        cell76.addTeam(cell78);
        cell76.setSum(32);

        cell77.addTeam(cell68);
        cell77.addTeam(cell69);
        cell77.addTeam(cell76);
        cell77.addTeam(cell67);
        cell77.addTeam(cell78);
        cell77.setSum(32);

        cell78.addTeam(cell68);
        cell78.addTeam(cell69);
        cell78.addTeam(cell76);
        cell78.addTeam(cell77);
        cell78.addTeam(cell67);
        cell78.setSum(32);
        //
        cell70.addTeam(cell71);
        cell70.addTeam(cell79);
        cell70.setSum(12);

        cell71.addTeam(cell70);
        cell71.addTeam(cell79);
        cell71.setSum(12);

        cell79.addTeam(cell70);
        cell79.addTeam(cell71);
        cell79.setSum(12);
        //
        cell73.addTeam(cell74);
        cell73.setSum(8);

        cell74.addTeam(cell73);
        cell74.setSum(8);
        //
        cell80.addTeam(cell81);
        cell80.setSum(11);

        cell81.addTeam(cell80);
        cell81.setSum(11);
        //

        
        search8 = new ArrayList<>();
        search8.add(cell1);
        search8.add(cell2);
        search8.add(cell3);
        search8.add(cell4);
        search8.add(cell5);
        search8.add(cell6);
        search8.add(cell7);
        search8.add(cell8);
        search8.add(cell9);
        search8.add(cell10);
        search8.add(cell11);
        search8.add(cell12);
        search8.add(cell13);
        search8.add(cell14);
        search8.add(cell15);
        search8.add(cell16);
        search8.add(cell17);
        search8.add(cell18);
        search8.add(cell19);
        search8.add(cell20);
        search8.add(cell21);
        search8.add(cell22);
        search8.add(cell23);
        search8.add(cell24);
        search8.add(cell25);
        search8.add(cell26);
        search8.add(cell27);
        search8.add(cell28);
        search8.add(cell29);
        search8.add(cell30);
        search8.add(cell31);
        search8.add(cell32);
        search8.add(cell33);
        search8.add(cell34);
        search8.add(cell35);
        search8.add(cell36);
        search8.add(cell37);
        search8.add(cell38);
        search8.add(cell39);
        search8.add(cell40);
        search8.add(cell41);
        search8.add(cell42);
        search8.add(cell43);
        search8.add(cell44);
        search8.add(cell45);
        search8.add(cell46);
        search8.add(cell47);
        search8.add(cell48);
        search8.add(cell49);
        search8.add(cell50);
        search8.add(cell51);
        search8.add(cell52);
        search8.add(cell53);
        search8.add(cell54);
        search8.add(cell55);
        search8.add(cell56);
        search8.add(cell57);
        search8.add(cell58);
        search8.add(cell59);
        search8.add(cell60);
        search8.add(cell61);
        search8.add(cell62);
        search8.add(cell63);
        search8.add(cell64);
        search8.add(cell65);
        search8.add(cell66);
        search8.add(cell67);
        search8.add(cell68);
        search8.add(cell69);
        search8.add(cell70);
        search8.add(cell71);
        search8.add(cell72);
        search8.add(cell73);
        search8.add(cell74);
        search8.add(cell75);
        search8.add(cell76);
        search8.add(cell77);
        search8.add(cell78);
        search8.add(cell79);
        search8.add(cell80);
        search8.add(cell81);

    }
    // επιστρεφει τον δυσδιαστατο πινακα ακεραιων
    public int[][] getArr () {
        return arr;
    }
    // επιστρεφει ενα arraylist με ολα τα κελια τ πινακα
    public ArrayList<Cell> getSearch8 () {
        return search8;
    }
}