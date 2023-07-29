import java.util.ArrayList;

//η λογικη πισω απο το killersudoku
public class LogicKillerSudoku {
    private static final int SIZE = 9;
    private int[][] board;
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
    private int sudoku;

    //αρχικοποιει εναν πινακα 9*9 και αντικειμενα για καθεναν απο τα 10 διαφορετικα killersudoku και εναν αριθμο π θα χρειαστουμε ως επιλογη
    public LogicKillerSudoku(int[][] board,KillerSudoku killerSudoku,int sudoku){
        this.board=board;
        this.killerBoard1=killerSudoku.getKillerBoard1();
        this.killerBoard2=killerSudoku.getKillerBoard2();
        this.killerBoard3=killerSudoku.getKillerBoard3();
        this.killerBoard4=killerSudoku.getKillerBoard4();
        this.killerBoard5=killerSudoku.getKillerBoard5();
        this.killerBoard6=killerSudoku.getKillerBoard6();
        this.killerBoard7 = killerSudoku.getKillerBoard7();
        this.killerBoard8 = killerSudoku.getKillerBoard8();
        this.killerBoard9 = killerSudoku.getKillerBoard9();
        this.killerBoard10 = killerSudoku.getKillerBoard10();
        this.sudoku=sudoku;

    }

    //ελεγχει αν ενας αριθμος βρισκεται ηδη σε μια σειρα
    private boolean isInRow(int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[row][i] == number)
                return true;

        return false;
    }

    //ελεγχει αν ενας αριθμος βρισκεται ηδη σε μια στηλη
    private boolean isInCol(int col, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board[i][col] == number)
                return true;

        return false;
    }

    //ελεγχει αν ενας αριθμος βρισκεται ηδη στον αναλογο 3*3 πινακα
    private boolean isInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }

    //ελεγχει αν ενας αριθμος βρισκεται ηδη σε μια αναλογη ομαδα π ανηκει το κελι
    private boolean isInCage(int row, int col, int number){
        ArrayList<Cell> search=new ArrayList<>();
        Cell cell = new Cell(row, col,0);

        if(sudoku==1) {
            KillerBoard1 z = killerBoard1;
            search=killerBoard1.getSearch1();
        }else if(sudoku==2) {
            KillerBoard2 z = killerBoard2;
            search=killerBoard2.getSearch2();
        }else if(sudoku==3) {
            KillerBoard3 z = killerBoard3;
            search=killerBoard3.getSearch3();
        }else if(sudoku==4) {
            KillerBoard4 z = killerBoard4;
            search=killerBoard4.getSearch4();
        }else if(sudoku==5) {
            KillerBoard5 z = killerBoard5;
            search=killerBoard5.getSearch5();
        }else if(sudoku==6) {
            KillerBoard6 z = killerBoard6;
            search=killerBoard6.getSearch6();
        }else if(sudoku==7) {
            KillerBoard7 z = killerBoard7;
            search=killerBoard7.getSearch7();
        }else if(sudoku==8) {
            KillerBoard8 z = killerBoard8;
            search=killerBoard8.getSearch8();
        }else if(sudoku==9) {
            KillerBoard9 z = killerBoard9;
            search=killerBoard9.getSearch9();
        }else if(sudoku==10) {
            KillerBoard10 z = killerBoard10;
            search=killerBoard10.getSearch10();
        }
        for (Cell i : search) {
            if (i.getX() == cell.getX() && i.getY() == cell.getY()) {
                cell = i;
            }
        }
        for (Cell j : cell.getTeam())
            if (board[j.getX()][j.getY()] == number)
                return true;
        return false;


    }

    //ελεγχει αν η προσθεση τ αριθμου ξεπερναει το αθροισμα π εχει η αντιστοιχη ομαδα π βρισκεται το κελι
    private boolean isOutofSum(int row, int col, int number){

        ArrayList<Cell> search=new ArrayList<>();
        Cell cell = new Cell(row, col,0);

        if(sudoku==1) {
            KillerBoard1 z = killerBoard1;
            search=killerBoard1.getSearch1();
        }else if(sudoku==2) {
            KillerBoard2 z = killerBoard2;
            search=killerBoard2.getSearch2();
        }else if(sudoku==3) {
            KillerBoard3 z = killerBoard3;
            search=killerBoard3.getSearch3();
        }else if(sudoku==4) {
            KillerBoard4 z = killerBoard4;
            search=killerBoard4.getSearch4();
        }else if(sudoku==5) {
            KillerBoard5 z = killerBoard5;
            search=killerBoard5.getSearch5();
        }else if(sudoku==6) {
            KillerBoard6 z = killerBoard6;
            search=killerBoard6.getSearch6();
        }else if(sudoku==7) {
            KillerBoard7 z = killerBoard7;
            search=killerBoard7.getSearch7();
        }else if(sudoku==8) {
            KillerBoard8 z = killerBoard8;
            search=killerBoard8.getSearch8();
        }else if(sudoku==9) {
            KillerBoard9 z = killerBoard9;
            search=killerBoard9.getSearch9();
        }else if(sudoku==10) {
            KillerBoard10 z = killerBoard10;
            search=killerBoard10.getSearch10();
        }

        int sum = 0;
        for (Cell i :search) {
            if (i.getX() == cell.getX() && i.getY() == cell.getY()){
                cell=i;

                for (Cell j : cell.getTeam()) {
                    sum = sum + board[j.getX()][j.getY()];
                }
                break;
            }
        }
        sum = sum + number;
        return sum > cell.getSum();


    }


    //ελεγχει αν ενας αριθμος ικανοποιει ολους τους κανονες ωστε να τοποθετηθει σε ενα κελι
    private boolean isOk(int row, int col, int number) {
        return !isInRow(row, number)  &&  !isInCol(col, number)  &&  !isInBox(row, col, number) && !isInCage(row, col, number) && !isOutofSum(row, col, number);
    }

    //επιστρεφει ενα string με ολους τους επιτρεπτους αριθμους που μπορουν να προστεθουν σε ενα κελι
    public String getHelpKillerSudoku(int x,int y){
        StringBuilder possible= new StringBuilder();
        for(int i=1;i<10;i++){
            if (isOk(x, y, i))
                possible.append(i).append(",");
        }
        return possible.toString();

    }

    // επιστρεφει τα συμβατα γραμματα π μπορουν να τοποθετηθουν σε ενα κελι
    public String getHelpKillerWordoku(int x,int y){
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

    //ελεγχει αν ενας αρθμος μπορει να τοποθετηθει σε καποιο καλι η αν παραβαινει καποιο κανονα
    public boolean addMove(int row, int col, int number){
        if( isOk(row,col,number) && number<10 &&number>0 ){
            board[row][col]=number;
            return true;

        }else
            return false;

    }

    //επιστρεφει τον πινακα 9*9 τ sudoku
    public int[][] getBoard() {
        return board;
    }

    //ελεγχει αν ενα σουντοκου εχει λυθει
    public boolean Check(){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if(board[i][j]==0)
                    return false;

            }
        }
        return true;
    }

    //επιστρεφει τον αριθμο που βρισκεται σε ενα συγκεκριμενο κελι
    public int getCell(int x, int y){
        return board[x][y];
    }
}
