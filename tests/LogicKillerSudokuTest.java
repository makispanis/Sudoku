import org.junit.Test;

import static org.junit.Assert.*;

public class LogicKillerSudokuTest {
    private LogicKillerSudoku logicKillerSudoku;
    private KillerSudoku killerSudoku;
    public LogicKillerSudokuTest(){
        killerSudoku=new KillerSudoku();
        logicKillerSudoku=new LogicKillerSudoku(killerSudoku.getKillerBoard1().getArr(),killerSudoku,1);

    }


    @Test
    public void getHelpKillerSudoku() {
    }

    @Test
    public void addMove() {
        assertTrue(logicKillerSudoku.addMove(0, 0, 1));
    }

    @Test
    public void getBoard() {
        assertEquals(0,logicKillerSudoku.getBoard()[0][0]);
    }

    @Test
    public void check() {
        assertFalse(logicKillerSudoku.Check());
    }

    @Test
    public void getCell() {
        assertEquals(0,logicKillerSudoku.getCell(0,0));
    }
}