import org.junit.Test;

import static org.junit.Assert.*;

public class ClassicSudokuTest {
    private ClassicSudoku classicSudoku;

    public ClassicSudokuTest(){
        classicSudoku=new ClassicSudoku();
    }

    @Test
    public void getArr1() {
        assertEquals(0,classicSudoku.getArr1()[0][0]);
    }

    @Test
    public void getArr2() {
        assertEquals(0,classicSudoku.getArr2()[0][0]);

    }

    @Test
    public void getArr3() {
        assertEquals(0,classicSudoku.getArr3()[0][0]);

    }

    @Test
    public void getArr4() {
        assertEquals(0,classicSudoku.getArr4()[0][0]);

    }

    @Test
    public void getArr5() {
        assertEquals(4,classicSudoku.getArr5()[0][0]);

    }

    @Test
    public void getArr6() {
        assertEquals(3,classicSudoku.getArr6()[0][0]);

    }

    @Test
    public void getArr7() {
        assertEquals(0,classicSudoku.getArr7()[0][0]);

    }

    @Test
    public void getArr8() {
        assertEquals(0,classicSudoku.getArr8()[0][0]);

    }

    @Test
    public void getArr9() {
        assertEquals(0,classicSudoku.getArr9()[0][0]);

    }

    @Test
    public void getArr10() {
        assertEquals(0,classicSudoku.getArr9()[0][0]);

    }

}