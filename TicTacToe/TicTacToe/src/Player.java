abstract class Player {
    String name;
    char mark;

    abstract void makeMove();77

    boolean isValidMove(int row, int col){
            if(row >= 0 && row <= 2 && col >= 0 && col <= 2 && TicTacToe.board[row][col] == ' '){
            return true;
            }
    
            return false;
        }
    }
