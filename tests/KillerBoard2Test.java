import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard2Test {
    private KillerBoard2 killerBoard2;
    public KillerBoard2Test(){
        killerBoard2=new KillerBoard2();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard2.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard2.getSearch2().size());

    }
}