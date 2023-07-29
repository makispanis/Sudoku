//η λογικη πισω απο το duidoku
public class LogicDuidoku {
    private static final int SIZE = 4;
    private int[][] board;
    private int x;
    private int y;

    //αρχικοποιει ενα πινακα duidoku
    public LogicDuidoku(){
        board= new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    }

    //επιστρεφει τους συμβατους αριθμους που μπορουν να προστεθουν σε ενα κελι
    public String getHelpClassicSudoku(int x,int y){
        StringBuilder possible= new StringBuilder();
        for(int i=1;i<5;i++){
            if (isOk(x, y, i))
                possible.append(i).append(",");
        }
        return possible.toString();

    }


    //ελεγχει αν ενας αριθμος υπαρχει στην σειρα
    private boolean isInRow(int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[row][i] == number)
                return true;

        return false;
    }

    //ελεγχει αν ενας αριθμος υπαρχει στην στηλη
    private boolean isInCol(int col, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[i][col] == number)
                return true;

        return false;
    }

    //ελεγχει αν ενας αριθμος υπαρχει στο 2χ2 πινακα
    private boolean isInBox(int row, int col, int number) {
        int r = row - row % 2;
        int c = col - col % 2;

        for (int i = r; i < r + 2; i++)
            for (int j = c; j < c + 2; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }

    //ελεγχει αν ο αριθμος εναι συμαβατος με ολους τους κανονες
    private boolean isOk(int row, int col, int number) {
        return !isInRow(row, number)  &&  !isInCol(col, number)  &&  !isInBox(row, col, number);
    }

    //προσθετει εναν αριθμο σε ενα κελι
    public boolean addMove(int row, int col, int number){
        if( isOk(row,col,number) && number<5 && number>0 && board[row][col]==0){
            board[row][col]=number;
            return true;
        }else {
            //pcMove();
            return false;
        }
    }

    //προσθετει εναν αριθμο σε ενα κελι για χαρη του υπολογιστη
    public boolean pcMove() {
        //boolean b = false;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int num = 1; num <= SIZE; num++) {
                    if (isOk(i, j, num)  && board[i][j] == 0) {
                        board[i][j] = num;
                        x=i;
                        y=j;
                        return true;
                        //b = true;
                        // break;
                    }

                }
                //if(b)
                // break;
            }
            //if(b)
            // break;
        }
        //if(Check()){
        //     System.out.print("PC Wins!\n");
        //}
        return false;
    }

    //επιστρεφει τη συντεταγμενη χ τ κελιου που εκανε την κινηση του ο υπολογιστης
    public int getX() {
        return x;
    }

    //επιστρεφει τη συντεταγμενη y τ κελιου που εκανε την κινηση του ο υπολογιστης
    public int getY() {
        return y;
    }

    // επιστρεφει τα συμβατα γραμματα π μπορουν να τοποθετηθουν σε ενα κελι
    public String getHelpDuidokuWordoku(int x,int y){
        StringBuilder possible= new StringBuilder();
        for(int i=1;i<5;i++) {
            if (isOk(x, y, i)) {
                if (i == 1)
                    possible.append("A").append(",");
                if (i == 2)
                    possible.append("B").append(",");
                if (i == 3)
                    possible.append("C").append(",");
                if (i == 4)
                    possible.append("D").append(",");
            }
        }

        return possible.toString();

    }

    //ελεγχει αν το duidoku εχει λυθει
    public boolean Check() {
        boolean b = false;
        boolean solved=true;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int num = 1; num <= SIZE; num++) {
                    if (isOk(i, j, num) && board[i][j] == 0) {
                        solved=false;
                        b = true;
                        break;
                    }

                }
                if(b)
                    break;
            }
            if(b)
                break;
        }
        return solved;
    }

    //επιστρεφει τον πινακα
    public int[][] getBoard() {
        return board;
    }
}
