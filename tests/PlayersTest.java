import org.junit.Test;

import static org.junit.Assert.*;

public class PlayersTest {
    private Player player;
    private Players players;
    public PlayersTest(){
        player=new Player("jon");
        players=new Players();
    }

    @Test
    public void add_getPlayer() {
        players.addPlayer(player);
        assertEquals(player,players.getPlayers().get(0));
    }

    @Test
    public void removePlayer() {
        players.addPlayer(player);
        players.removePlayer(player);
        assertEquals(0,players.getPlayers().size());
    }

    @Test
    public void writePlayers() {
    }
}