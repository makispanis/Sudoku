//λειτουργει ως μετατροπεας π χρησιμοποιηται για τις παραλλαγες των σουντοκου
public class Converter {

    //μετατρεπει ενα πινακα σουντοκου(classic η killer) με μορφη ακεραιων σε ενα με μορφη γραμματων
    public char[][] convertClassicSudokuArray(int[][] array){
        char[][] stringArray =new char[9][9];
        for(int i=0; i<9 ; i++ ){
            for (int j=0; j<9 ; j++ ) {
                if (array[i][j] == 0)
                    stringArray[i][j] = '-';
                if (array[i][j] == 1)
                    stringArray[i][j] = 'A';
                if (array[i][j] == 2)
                    stringArray[i][j] = 'B';
                if (array[i][j] == 3)
                    stringArray[i][j] = 'C';
                if (array[i][j] == 4)
                    stringArray[i][j] = 'D';
                if (array[i][j] == 5)
                    stringArray[i][j] = 'E';
                if (array[i][j] == 6)
                    stringArray[i][j] = 'F';
                if (array[i][j] == 7)
                    stringArray[i][j] = 'G';
                if (array[i][j] == 8)
                    stringArray[i][j] = 'H';
                if (array[i][j] == 9)
                    stringArray[i][j] = 'I';
            }
        }
        return stringArray;
    }

    //μετατρεπει ενα πινακα σουντοκου(duidoku) με μορφη ακεραιων σε ενα με μορφη γραμματων
    public char[][] convertDuidoku(int[][] array){
        char[][] stringArray =new char[4][4];
        for(int i=0; i<4 ; i++ ){
            for (int j=0; j<4 ; j++ ) {
                if (array[i][j] == 0)
                    stringArray[i][j] = '-';
                if (array[i][j] == 1)
                    stringArray[i][j] = 'A';
                if (array[i][j] == 2)
                    stringArray[i][j] = 'B';
                if (array[i][j] == 3)
                    stringArray[i][j] = 'C';
                if (array[i][j] == 4)
                    stringArray[i][j] = 'D';

            }
        }
        return stringArray;

    }

    //μετατρεπει ενα γραμμα σε ακεραιο
    public int getLetter(char c){
        return c - 'A' + 1;
    }

}
