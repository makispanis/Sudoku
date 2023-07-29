import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard9Test {
    private KillerBoard9 killerBoard9;
    public KillerBoard9Test(){
        killerBoard9=new KillerBoard9();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard9.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard9.getSearch9().size());

    }
}