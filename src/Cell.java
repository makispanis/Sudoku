import java.io.Serializable;
import java.util.ArrayList;

// αυτη η κλαση αντιπροσωπευει ενα αντικειμενο κελι που θα χρησιμοποιηθει για το killersudoku π θα περιεχει τις συντεταγμενες του κελιου,
// τα αλλα κελια με τα οποια ανηκει στην ιδια ομαδα και το αθροισμα αυτης και εναν αριθμο π εξυπηρετει στα γραφικα
public class Cell implements Serializable {
    private int x;
    private int y;
    private int sum;
    private int number;

    ArrayList<Cell> team;
    public Cell(int x,int y,int number){
        this.x=x;
        this.y=y;
        team =new ArrayList<>();
        this.number=number;
    }

    // προσθετει ενα κελι στην ομαδα
    public void addTeam(Cell c) {
        team.add(c);
    }

    //καθοριζει το αθροισμα της ομαδας
    public void setSum(int sum) {
        this.sum = sum;
    }

    //επιστρεφει την συντεταγμενη x του κελιου
    public int getX() {
        return x;
    }

    //επιστρεφει την συντεταγμενη y του κελιου
    public int getY() {
        return y;
    }

    //επιστρεφει το αθροισμα της ομαδας του κελιου
    public int getSum() {
        return sum;
    }

    //επιστρεφει την ομαδα του κελιου
    public ArrayList<Cell> getTeam(){
        return team;
    }

    public int getNumber() {
        return number;
    }

}
