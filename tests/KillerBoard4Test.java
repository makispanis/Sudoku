import org.junit.Test;

import static org.junit.Assert.*;

public class KillerBoard4Test {
    private KillerBoard4 killerBoard4;
    public KillerBoard4Test(){
        killerBoard4=new KillerBoard4();
    }

    @Test
    public void getArr() {
        assertEquals(0,killerBoard4.getArr()[0][0]);
    }

    @Test
    public void getSearch1() {
        assertEquals(81,killerBoard4.getSearch4().size());

    }
}