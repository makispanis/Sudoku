import java.io.Serializable;
import java.util.ArrayList;

// ο πρωτος πινακας των KillerSudoku
public class KillerBoard1 implements Serializable {
    private ArrayList<Cell> search1;
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

    public KillerBoard1() {

        arr= new int[][]{
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

        //cell1.addTeam(cell1);
        cell1.addTeam(cell10);
        cell1.addTeam(cell11);
        cell1.addTeam(cell20);
        cell1.setSum(11);

        cell10.addTeam(cell1);
        //cell10.addTeam(cell10);
        cell10.addTeam(cell11);
        cell10.addTeam(cell20);
        cell10.setSum(11);


        cell11.addTeam(cell1);
        cell11.addTeam(cell10);
        // cell11.addTeam(cell11);
        cell11.addTeam(cell20);
        cell11.setSum(11);


        cell20.addTeam(cell1);
        cell20.addTeam(cell10);
        cell20.addTeam(cell11);
        //cell20.addTeam(cell20);
        cell20.setSum(11);

        //cell2.addTeam(cell2);
        cell2.addTeam(cell3);
        cell2.addTeam(cell4);
        cell2.addTeam(cell13);
        cell2.setSum(25);


        cell3.addTeam(cell2);
        //cell3.addTeam(cell3);
        cell3.addTeam(cell4);
        cell3.addTeam(cell13);
        cell3.setSum(25);

        cell4.addTeam(cell2);
        cell4.addTeam(cell3);
        //cell4.addTeam(cell4);
        cell4.addTeam(cell13);
        cell4.setSum(25);

        cell13.addTeam(cell2);
        cell13.addTeam(cell3);
        cell13.addTeam(cell4);
        // cell13.addTeam(cell13);
        cell13.setSum(25);

        // cell5.addTeam(cell5);
        cell5.addTeam(cell14);
        cell5.setSum(14);

        cell14.addTeam(cell5);
        // cell14.addTeam(cell14);
        cell14.setSum(14);

        // cell6.addTeam(cell6);
        cell6.addTeam(cell7);
        cell6.setSum(9);

        cell7.addTeam(cell6);
        // cell7.addTeam(cell7);
        cell7.setSum(9);

        //cell8.addTeam(cell8);
        cell8.addTeam(cell9);
        cell8.setSum(12);

        cell9.addTeam(cell8);
        //cell9.addTeam(cell9);
        cell9.setSum(12);

        cell12.addTeam(cell21);
        //cell12.addTeam(cell12);
        cell12.setSum(15);

        //cell21.addTeam(cell21);
        cell21.addTeam(cell12);
        cell21.setSum(15);

        cell15.addTeam(cell16);
        //cell15.addTeam(cell15);
        cell15.setSum(4);

        //cell16.addTeam(cell16);
        cell16.addTeam(cell15);
        cell16.setSum(4);

        //cell17.addTeam(cell17);
        cell17.addTeam(cell26);
        cell17.setSum(14);

        cell26.addTeam(cell17);
        //cell26.addTeam(cell26);
        cell26.setSum(14);

        //cell18.addTeam(cell18);
        cell18.addTeam(cell27);
        cell18.setSum(6);

        cell27.addTeam(cell18);
        //cell27.addTeam(cell27);
        cell27.setSum(6);

        //cell19.addTeam(cell19);
        cell19.addTeam(cell28);
        cell19.addTeam(cell37);
        cell19.addTeam(cell46);
        cell19.addTeam(cell55);
        cell19.addTeam(cell38);
        cell19.addTeam(cell39);
        cell19.addTeam(cell40);
        cell19.setSum(40);

        cell28.addTeam(cell19);
        //cell28.addTeam(cell28);
        cell28.addTeam(cell37);
        cell28.addTeam(cell46);
        cell28.addTeam(cell55);
        cell28.addTeam(cell38);
        cell28.addTeam(cell39);
        cell28.addTeam(cell40);
        cell28.setSum(40);

        cell37.addTeam(cell19);
        cell37.addTeam(cell28);
        //cell37.addTeam(cell37);
        cell37.addTeam(cell46);
        cell37.addTeam(cell55);
        cell37.addTeam(cell38);
        cell37.addTeam(cell39);
        cell37.addTeam(cell40);
        cell37.setSum(40);

        cell46.addTeam(cell19);
        cell46.addTeam(cell28);
        cell46.addTeam(cell37);
        //cell46.addTeam(cell46);
        cell46.addTeam(cell55);
        cell46.addTeam(cell38);
        cell46.addTeam(cell39);
        cell46.addTeam(cell40);
        cell46.setSum(40);

        cell55.addTeam(cell19);
        cell55.addTeam(cell28);
        cell55.addTeam(cell37);
        cell55.addTeam(cell46);
        //cell55.addTeam(cell55);
        cell55.addTeam(cell38);
        cell55.addTeam(cell39);
        cell55.addTeam(cell40);
        cell55.setSum(40);

        cell38.addTeam(cell19);
        cell38.addTeam(cell28);
        cell38.addTeam(cell37);
        cell38.addTeam(cell46);
        cell38.addTeam(cell55);
        //cell38.addTeam(cell38);
        cell38.addTeam(cell39);
        cell38.addTeam(cell40);
        cell38.setSum(40);

        cell39.addTeam(cell19);
        cell39.addTeam(cell28);
        cell39.addTeam(cell37);
        cell39.addTeam(cell46);
        cell39.addTeam(cell55);
        cell39.addTeam(cell38);
        //cell39.addTeam(cell39);
        cell39.addTeam(cell40);
        cell39.setSum(40);

        cell40.addTeam(cell19);
        cell40.addTeam(cell28);
        cell40.addTeam(cell37);
        cell40.addTeam(cell46);
        cell40.addTeam(cell55);
        cell40.addTeam(cell38);
        cell40.addTeam(cell39);
        //cell40.addTeam(cell40);
        cell40.setSum(40);

        //cell22.addTeam(cell22);
        cell22.addTeam(cell31);
        cell22.setSum(3);

        cell31.addTeam(cell22);
        //cell31.addTeam(cell31);
        cell31.setSum(3);

        //cell23.addTeam(cell23);
        cell23.addTeam(cell32);
        cell23.setSum(15);

        cell32.addTeam(cell23);
        //cell32.addTeam(cell32);
        cell32.setSum(15);

        //cell24.addTeam(cell24);
        cell24.addTeam(cell25);
        cell24.setSum(9);

        cell25.addTeam(cell24);
        //cell25.addTeam(cell25);
        cell25.setSum(9);

        cell34.addTeam(cell33);
        //cell34.addTeam(cell34);
        cell34.setSum(12);

        //cell33.addTeam(cell33);
        cell33.addTeam(cell34);
        cell33.setSum(12);

        cell30.addTeam(cell29);
        //cell30.addTeam(cell30);
        cell30.setSum(8);

        //cell29.addTeam(cell29);
        cell29.addTeam(cell30);
        cell29.setSum(8);

        //cell47.addTeam(cell47);
        cell47.addTeam(cell48);
        cell47.setSum(15);

        cell48.addTeam(cell47);
        //cell48.addTeam(cell48);
        cell48.setSum(15);

        //cell57.addTeam(cell57);
        cell57.addTeam(cell66);
        cell57.setSum(7);

        cell66.addTeam(cell57);
        //cell66.addTeam(cell66);
        cell66.setSum(7);

        //cell58.addTeam(cell58);
        cell58.addTeam(cell49);
        cell58.setSum(13);

        cell49.addTeam(cell58);
        //cell49.addTeam(cell49);
        cell49.setSum(13);

        cell50.addTeam(cell59);
        //cell50.addTeam(cell50);
        cell50.setSum(6);

        //cell59.addTeam(cell59);
        cell59.addTeam(cell50);
        cell59.setSum(6);

        //cell51.addTeam(cell51);
        cell51.addTeam(cell52);
        cell51.setSum(4);

        cell52.addTeam(cell51);
        //cell52.addTeam(cell52);
        cell52.setSum(4);

        //cell61.addTeam(cell61);
        cell61.addTeam(cell60);
        cell61.setSum(13);

        cell60.addTeam(cell61);
        //cell60.addTeam(cell60);
        cell60.setSum(13);

        //cell69.addTeam(cell69);
        cell69.addTeam(cell70);
        cell69.setSum(15);

        cell70.addTeam(cell69);
        //cell70.addTeam(cell70);
        cell70.setSum(15);

        //cell78.addTeam(cell78);
        cell78.addTeam(cell79);
        cell78.setSum(11);

        cell79.addTeam(cell78);
        //cell79.addTeam(cell79);
        cell79.setSum(11);

        //cell80.addTeam(cell80);
        cell80.addTeam(cell81);
        cell80.setSum(12);

        cell81.addTeam(cell80);
        //cell81.addTeam(cell81);
        cell81.setSum(12);

        //cell62.addTeam(cell62);
        cell62.addTeam(cell71);
        cell62.setSum(10);

        cell71.addTeam(cell62);
        //cell71.addTeam(cell71);
        cell71.setSum(10);

        //cell63.addTeam(cell63);
        cell63.addTeam(cell72);
        cell63.setSum(6);

        cell72.addTeam(cell63);
        //cell72.addTeam(cell72);
        cell72.setSum(6);

        //cell68.addTeam(cell68);
        cell68.addTeam(cell77);
        cell68.setSum(4);

        cell77.addTeam(cell68);
        //cell77.addTeam(cell77);
        cell77.setSum(4);

        //cell64.addTeam(cell64);
        cell64.addTeam(cell73);
        cell64.addTeam(cell56);
        cell64.addTeam(cell65);
        cell64.setSum(17);

        cell65.addTeam(cell64);
        cell65.addTeam(cell73);
        cell65.addTeam(cell56);
        //cell65.addTeam(cell65);
        cell65.setSum(17);

        cell56.addTeam(cell64);
        cell56.addTeam(cell73);
        //cell56.addTeam(cell56);
        cell56.addTeam(cell65);
        cell56.setSum(17);

        cell73.addTeam(cell64);
        //cell73.addTeam(cell73);
        cell73.addTeam(cell56);
        cell73.addTeam(cell65);
        cell73.setSum(17);

        //cell67.addTeam(cell67);
        cell67.addTeam(cell74);
        cell67.addTeam(cell75);
        cell67.addTeam(cell76);
        cell67.setSum(26);

        cell74.addTeam(cell67);
        //cell74.addTeam(cell74);
        cell74.addTeam(cell75);
        cell74.addTeam(cell76);
        cell74.setSum(26);

        cell75.addTeam(cell67);
        cell75.addTeam(cell74);
        //cell75.addTeam(cell75);
        cell75.addTeam(cell76);
        cell75.setSum(26);

        cell76.addTeam(cell67);
        cell76.addTeam(cell74);
        cell76.addTeam(cell75);
        //cell76.addTeam(cell76);
        cell7.setSum(26);

        //cell41.addTeam(cell41);
        cell41.addTeam(cell42);
        cell41.setSum(11);

        cell42.addTeam(cell41);
        //cell42.addTeam(cell42);
        cell42.setSum(11);

        //cell35.addTeam(cell35);
        cell35.addTeam(cell36);
        cell35.addTeam(cell43);
        cell35.addTeam(cell44);
        cell35.addTeam(cell45);
        cell35.addTeam(cell53);
        cell35.addTeam(cell54);
        cell35.setSum(38);

        cell36.addTeam(cell35);
        //cell36.addTeam(cell36);
        cell36.addTeam(cell43);
        cell36.addTeam(cell44);
        cell36.addTeam(cell45);
        cell36.addTeam(cell53);
        cell36.addTeam(cell54);
        cell36.setSum(38);

        cell43.addTeam(cell35);
        cell43.addTeam(cell36);
        //cell43.addTeam(cell43);
        cell43.addTeam(cell44);
        cell43.addTeam(cell45);
        cell43.addTeam(cell53);
        cell43.addTeam(cell54);
        cell43.setSum(38);

        cell44.addTeam(cell35);
        cell44.addTeam(cell36);
        cell44.addTeam(cell43);
        //cell44.addTeam(cell44);
        cell44.addTeam(cell45);
        cell44.addTeam(cell53);
        cell44.addTeam(cell54);
        cell44.setSum(38);

        cell45.addTeam(cell35);
        cell45.addTeam(cell36);
        cell45.addTeam(cell43);
        cell45.addTeam(cell44);
        //cell45.addTeam(cell45);
        cell45.addTeam(cell53);
        cell45.addTeam(cell54);
        cell45.setSum(38);

        cell53.addTeam(cell35);
        cell53.addTeam(cell36);
        cell53.addTeam(cell43);
        cell53.addTeam(cell44);
        cell53.addTeam(cell45);
        //cell53.addTeam(cell53);
        cell53.addTeam(cell54);
        cell53.setSum(38);

        cell54.addTeam(cell35);
        cell54.addTeam(cell36);
        cell54.addTeam(cell43);
        cell54.addTeam(cell44);
        cell54.addTeam(cell45);
        cell54.addTeam(cell53);
        //cell54.addTeam(cell54);
        cell54.setSum(38);



        search1 =new ArrayList<>();
        search1.add(cell1);
        search1.add(cell2);
        search1.add(cell3);
        search1.add(cell4);
        search1.add(cell5);
        search1.add(cell6);
        search1.add(cell7);
        search1.add(cell8);
        search1.add(cell9);
        search1.add(cell10);
        search1.add(cell11);
        search1.add(cell12);
        search1.add(cell13);
        search1.add(cell14);
        search1.add(cell15);
        search1.add(cell16);
        search1.add(cell17);
        search1.add(cell18);
        search1.add(cell19);
        search1.add(cell20);
        search1.add(cell21);
        search1.add(cell22);
        search1.add(cell23);
        search1.add(cell24);
        search1.add(cell25);
        search1.add(cell26);
        search1.add(cell27);
        search1.add(cell28);
        search1.add(cell29);
        search1.add(cell30);
        search1.add(cell31);
        search1.add(cell32);
        search1.add(cell33);
        search1.add(cell34);
        search1.add(cell35);
        search1.add(cell36);
        search1.add(cell37);
        search1.add(cell38);
        search1.add(cell39);
        search1.add(cell40);
        search1.add(cell41);
        search1.add(cell42);
        search1.add(cell43);
        search1.add(cell44);
        search1.add(cell45);
        search1.add(cell46);
        search1.add(cell47);
        search1.add(cell48);
        search1.add(cell49);
        search1.add(cell50);
        search1.add(cell51);
        search1.add(cell52);
        search1.add(cell53);
        search1.add(cell54);
        search1.add(cell55);
        search1.add(cell56);
        search1.add(cell57);
        search1.add(cell58);
        search1.add(cell59);
        search1.add(cell60);
        search1.add(cell61);
        search1.add(cell62);
        search1.add(cell63);
        search1.add(cell64);
        search1.add(cell65);
        search1.add(cell66);
        search1.add(cell67);
        search1.add(cell68);
        search1.add(cell69);
        search1.add(cell70);
        search1.add(cell71);
        search1.add(cell72);
        search1.add(cell73);
        search1.add(cell74);
        search1.add(cell75);
        search1.add(cell76);
        search1.add(cell77);
        search1.add(cell78);
        search1.add(cell79);
        search1.add(cell80);
        search1.add(cell81);


    }
    // επιστρεφει τον δυσδιαστατο πινακα ακεραιων
    public int[][] getArr() {
        return arr;
    }

    // επιστρεφει ενα arraylist με ολα τα κελια τ πινακα
    public ArrayList<Cell> getSearch1() {
            return search1;
    }

}
