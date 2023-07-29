import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard10Test {
    private KillerBoard10 killerBoard10;
    public KillerBoard10Test(){
        killerBoard10=new KillerBoard10();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard10.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard10.getSearch10().size());

    }
}