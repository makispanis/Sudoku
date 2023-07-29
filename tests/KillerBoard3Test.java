import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard3Test {
    private KillerBoard3 killerBoard3;
    public KillerBoard3Test(){
        killerBoard3=new KillerBoard3();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard3.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard3.getSearch3().size());

    }
}