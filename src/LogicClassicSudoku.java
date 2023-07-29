
// η λογικη πισω απο το κλασσικο σουντοκου
public class LogicClassicSudoku {
    private static final int SIZE = 9;
    private int[][] board;

    //αρχικοποιει ενα πινακα σουντοκου
    public LogicClassicSudoku(int[][] board){
        this.board=board;

    }

    //ελεγχει αν ο αριθμος υπαρχει ξανα στην σειρα
    private boolean isInRow(int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[row][i] == number)
                return true;

        return false;
    }

    //ελεγχει αν ο αριθμος υπαρχει ξανα στην στηλη
    private boolean isInCol(int col, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[i][col] == number)
                return true;

        return false;
    }

    //ελεγχει αν ο αριθμος υπαρχει ξανα στον 3χ3 πινακα
    private boolean isInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }

    //ελεγχει αν ο αριθμος εναι συμαβατος με ολους τους κανονες
    private boolean isOk(int row, int col, int number) {
        return !isInRow(row, number)  &&  !isInCol(col, number)  &&  !isInBox(row, col, number);
    }

    // επιστρεφει τους συμβατους αριθμους π μπορουν να τοποθετηθουν σε ενα κελι
    public String getHelpClassicSudoku(int x,int y){
        StringBuilder possible= new StringBuilder();
        for(int i=1;i<10;i++){
            if (isOk(x, y, i))
                possible.append(i).append(",");
        }
        return possible.toString();

    }

    // επιστρεφει τα συμβατα γραμματα π μπορουν να τοποθετηθουν σε ενα κελι
    public String getHelpClassicWordoku(int x,int y){
        StringBuilder possible= new StringBuilder();
        for(int i=1;i<10;i++) {
            if (isOk(x, y, i)) {
                if (i == 1)
                    possible.append("A").append(",");
                if (i == 2)
                    possible.append("B").append(",");
                if (i == 3)
                    possible.append("C").append(",");
                if (i == 4)
                    possible.append("D").append(",");
                if (i == 5)
                    possible.append("E").append(",");
                if (i == 6)
                    possible.append("F").append(",");
                if (i == 7)
                    possible.append("G").append(",");
                if (i == 8)
                    possible.append("H").append(",");
                if (i == 9)
                    possible.append("I").append(",");
            }
        }

        return possible.toString();

    }

    //προσθετει εναν αριθμο σε ενα κελι
    public boolean addMove(int row, int col, int number){
        if( isOk(row,col,number) && number<10 &&number>0 ){
            board[row][col]=number;
            return true;

        }else
            return false;
    }

    //ελεγχει αν το παζλ εχει λυθει
    public boolean Check(){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if(board[i][j]==0)
                    return false;

            }
        }
        return true;
    }

    //επιστρεφει τον πινακα σουντοκου
    public int[][] getBoard() {
        return board;
    }

    //επιστρεφει ενα κελι του πινακα
    public int getCell(int x, int y){
        return board[x][y];
    }
}
