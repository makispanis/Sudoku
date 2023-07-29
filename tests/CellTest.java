import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class CellTest {
    private Cell cell;
    private Cell cell2;

    public CellTest(){
        cell=new Cell(0,2,0);
        cell2=new Cell(0,3,0);
    }

    @Test
    public void Team() {
        cell.addTeam(cell2);
        assertEquals(cell2, cell.getTeam().get(0));

    }
    @Test
    public void getNumber(){
        assertEquals(0,cell.getNumber());
    }
    @Test
    public void Sum() {
        cell.setSum(12);
        assertEquals(12,cell.getSum());
    }

    @Test
    public void getX() {
        assertEquals(0, cell.getX(), 0.0);
    }

    @Test
    public void getY() {
        assertEquals(2, cell.getY(), 0.0);

    }


}