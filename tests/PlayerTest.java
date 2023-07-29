import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    public PlayerTest() {
        player=new Player("jon");
    }

    @Test
    public void getName() {
        assertEquals("jon",player.getName());
    }

    @Test
    public void getDuidokuwins() {
        assertEquals(0,player.getDuidokuwins());
    }

    @Test
    public void getDuidokulosses() {
        assertEquals(0,player.getDuidokulosses());

    }

    @Test
    public void set_getSudokus() {
        player.setSudokus(0,1);
        assertEquals(1,player.getSudokus()[0]);
    }

}