import org.junit.Test;

import static org.junit.Assert.*;

public class KillerSudokuTest {
    private KillerBoard1 killerBoard1;
    private KillerBoard2 killerBoard2;
    private KillerBoard3 killerBoard3;
    private KillerBoard4 killerBoard4;
    private KillerBoard5 killerBoard5;
    private KillerBoard6 killerBoard6;
    private KillerBoard7 killerBoard7;
    private KillerBoard8 killerBoard8;
    private KillerBoard9 killerBoard9;
    private KillerBoard10 killerBoard10;
    private KillerSudoku killerSudoku;
    public KillerSudokuTest() {
        killerBoard1 = new KillerBoard1();
        killerBoard2 = new KillerBoard2();
        killerBoard3 = new KillerBoard3();
        killerBoard4 = new KillerBoard4();
        killerBoard5 = new KillerBoard5();
        killerBoard6 = new KillerBoard6();
        killerBoard7 = new KillerBoard7();
        killerBoard8 = new KillerBoard8();
        killerBoard9 = new KillerBoard9();
        killerBoard10 = new KillerBoard10();
        killerSudoku=new KillerSudoku();
    }

        @Test
    public void getKillerBoard1() {
        assertEquals(81,killerSudoku.getKillerBoard1().getSearch1().size());
    }

    @Test
    public void getKillerBoard2() {
        assertEquals(81,killerSudoku.getKillerBoard2().getSearch2().size());

    }

    @Test
    public void getKillerBoard3() {
        assertEquals(81,killerSudoku.getKillerBoard3().getSearch3().size());

    }

    @Test
    public void getKillerBoard4() {
        assertEquals(81,killerSudoku.getKillerBoard4().getSearch4().size());
    }

    @Test
    public void getKillerBoard5() {
        assertEquals(81,killerSudoku.getKillerBoard5().getSearch5().size());

    }

    @Test
    public void getKillerBoard6() {
        assertEquals(81,killerSudoku.getKillerBoard6().getSearch6().size());

    }

    @Test
    public void getKillerBoard7() {
        assertEquals(81,killerSudoku.getKillerBoard7().getSearch7().size());

    }

    @Test
    public void getKillerBoard8() {
        assertEquals(81,killerSudoku.getKillerBoard8().getSearch8().size());

    }

    @Test
    public void getKillerBoard9() {
        assertEquals(81,killerSudoku.getKillerBoard9().getSearch9().size());

    }

    @Test
    public void getKillerBoard10() {
        assertEquals(81,killerSudoku.getKillerBoard10().getSearch10().size());

    }

}