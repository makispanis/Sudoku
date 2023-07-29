import org.junit.Test;

import static org.junit.Assert.*;

public class LogicDuidokuTest {
    private LogicDuidoku logicDuidoku;
    public LogicDuidokuTest(){
        logicDuidoku=new LogicDuidoku();
    }

    @Test
    public void getHelpClassicSudoku() {
        assertEquals("1,2,3,4,",logicDuidoku.getHelpClassicSudoku(0,0));

    }

    @Test
    public void addMove() {
        assertFalse(logicDuidoku.addMove(0, 0, 5));

    }

    @Test
    public void pcMove() {
        assertTrue(logicDuidoku.pcMove());

    }

    @Test
    public void getX() {
        assertEquals(0,logicDuidoku.getX());
    }

    @Test
    public void getY() {
        assertEquals(0,logicDuidoku.getY());

    }

    @Test
    public void getHelpDuidokuWordoku() {
        assertEquals("A,B,C,D,",logicDuidoku.getHelpDuidokuWordoku(0,0));

    }

    @Test
    public void check() {
        assertFalse(logicDuidoku.Check());

    }

    @Test
    public void getBoard() {
        assertEquals(0,logicDuidoku.getBoard()[0][0]);
    }
}