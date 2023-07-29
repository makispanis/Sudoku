import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

//κλαση που περιεχει ολους τους παικτες
public class Players implements Serializable {
    private ArrayList<Player> players;

    //δημιουργει ενα κενο arraylist
    public Players(){
        players=new ArrayList<>();

    }

    //προσθετει ενα αντικειμενο player στο arraylist
    public void addPlayer(Player player) {
        players.add(player);
    }

    //επιστρεφει το arraylist
    public ArrayList<Player> getPlayers() {
        return players;
    }

    //αφαιρει ενα αντικειμενο player απο το arraylist
    public void removePlayer(Player player){
        players.remove(player);
    }

    //γραφει στο αρχειο το αντικειμενο players με ολους του παικτες
    public void WritePlayers(Players players) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PlayersFile.txt"));

        try {
            out.writeObject(players);
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
