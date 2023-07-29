import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard1Test {
    private KillerBoard1 killerBoard1;
    public KillerBoard1Test(){
        killerBoard1=new KillerBoard1();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard1.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard1.getSearch1().size());

    }
}