import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard5Test {
    private KillerBoard5 killerBoard5;
    public KillerBoard5Test(){
        killerBoard5=new KillerBoard5();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard5.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard5.getSearch5().size());

    }
}