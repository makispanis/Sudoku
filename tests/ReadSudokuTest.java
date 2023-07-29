import org.junit.Test;

import static org.junit.Assert.*;

public class ReadSudokuTest {
    private ReadSudoku read;
    private ClassicSudoku classicSudoku;
    private KillerSudoku killerSudoku;
    private Players players;
    public ReadSudokuTest() {
        read=new ReadSudoku();
    }
    @Test
    public void readClassicSudoku() throws Exception {
        classicSudoku=read.ReadClassicSudoku();
        assertEquals(0,classicSudoku.getArr1()[0][0]);
    }

    @Test
    public void readKillerSudoku() throws Exception {
        killerSudoku=read.ReadKillerSudoku();
        assertEquals(0,killerSudoku.getKillerBoard1().getArr()[0][0]);
    }

    @Test
    public void readPlayers() throws Exception {
        players=read.ReadPlayers();
        assertEquals(0,players.getPlayers().size());
    }
}