class TicTacToe{
    static char[][] board;

    public TicTacToe(){
        board = new char[3][3];
        initializeBoard();
    }

    void initializeBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = ' ';
            }
        }
    }

    static void dispBoard(){
        System.out.println("-------------");
        for(int i=0;i<board.length;i++){
            System.out.print("| ");
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void placeMark(int row, int col, char mark){
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2)
        board[row][col] = mark;

        else
        System.out.println("Invalid Position");
    }

    static boolean checkColWin(){
        for(int j=0;j<3;j++){
            if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
            return true;
        }
        return false;
    }

    static boolean checkRowWin(){
        for(int j=0;j<3;j++){
            if(board[j][0] != ' ' && board[j][0] == board[j][1] && board[j][1] == board[j][2])
            return true;
        }
        return false;
    }

    static boolean checkDiagonalWin(){
            if(board[1][1] != ' ' && (board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] == board[1][1] && board[1][1] == board[2][0]))
            return true;

            return false;
    }
    static boolean checkDraw(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j] == ' ') 
                return false;
            }
        }
        return true;
    }
}