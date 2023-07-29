import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard6Test {
    private KillerBoard6 killerBoard6;
    public KillerBoard6Test(){
        killerBoard6=new KillerBoard6();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard6.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard6.getSearch6().size());

    }
}