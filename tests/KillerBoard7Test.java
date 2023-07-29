import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard7Test {
    private KillerBoard7 killerBoard7;
    public KillerBoard7Test(){
        killerBoard7=new KillerBoard7();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard7.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard7.getSearch7().size());

    }
}