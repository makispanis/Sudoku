import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    private ClassicSudoku classicSudoku;
    private Converter converter;
    private LogicDuidoku logicDuidoku;
    public ConverterTest(){
        classicSudoku=new ClassicSudoku();
        converter=new Converter();
        logicDuidoku=new LogicDuidoku();
    }
    @Test
    public void convertClassicSudokuArray() {
        assertEquals('-',converter.convertClassicSudokuArray(classicSudoku.getArr1())[0][0]);
    }

    @Test
    public void convertDuidoku() {
        assertEquals('-',converter.convertDuidoku(logicDuidoku.getBoard())[0][0]);

    }

    @Test
    public void getLetter() {
        assertEquals(1,converter.getLetter('A'));
    }
}