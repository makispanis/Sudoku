import org.junit.Test;

import static org.junit.Assert.*;

public class LogicClassicSudokuTest {
    private LogicClassicSudoku logicClassicSudoku;
    private ClassicSudoku classicSudoku;
    public LogicClassicSudokuTest(){
        classicSudoku=new ClassicSudoku();
        logicClassicSudoku=new LogicClassicSudoku(classicSudoku.getArr1());
    }

    @Test
    public void getHelpClassicSudoku() {
        assertEquals("1,2,4,8,",logicClassicSudoku.getHelpClassicSudoku(0,0));
    }

    @Test
    public void getHelpClassicWordoku() {
        assertEquals("A,B,D,H,",logicClassicSudoku.getHelpClassicWordoku(0,0));

    }

    @Test
    public void addMove() {
        assertFalse(logicClassicSudoku.addMove(0, 0, 3));

    }

    @Test
    public void check() {
        assertFalse(logicClassicSudoku.Check());

    }

    @Test
    public void getBoard() {
        assertEquals(classicSudoku.getArr1()[0][0],logicClassicSudoku.getBoard()[0][0]);

    }

    @Test
    public void getCell() {
        assertEquals(0,logicClassicSudoku.getCell(0,0));

    }
}