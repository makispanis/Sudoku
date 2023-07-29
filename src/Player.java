import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

//αντικειμενο player π περιεχει το ονομα και τα στατιστικα τ χρηστη
public class Player implements Serializable {
    private String name;
    private int[] sudokus;

    //δημιουργει και αρχικοποιει ενα αντικειμενο player
    public Player(String name) {
        this.name = name;
        sudokus = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    }

    //επιστρεφει το ονομα του χρηστη
    public String getName() {
        return name;
    }

    //επιστρεφει τις νικες τ χρηστη στο duidoku
    public int getDuidokuwins(){
        return sudokus[20];
    }

    //επιστρεφει τις ηττες τ χρηστη στο duidoku
    public int getDuidokulosses(){
        return sudokus[21];
    }


    //επιστρεφει τα στατιστικα του χρηστη
    public int[] getSudokus() {
        return sudokus;
    }

    //αλλαζει ενα στατιστικο του παικτη
    public void setSudokus(int index,int number){
        sudokus[index]=number;

    }

}
