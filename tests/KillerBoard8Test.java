import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard8Test {
    private KillerBoard8 killerBoard8;
    public KillerBoard8Test(){
        killerBoard8=new KillerBoard8();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard8.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard8.getSearch8().size());

    }
}