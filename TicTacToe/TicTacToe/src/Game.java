public class Game {
    public static void main(String[] args) throws Exception {

        TicTacToe obj = new TicTacToe();

        Player1 p1 = new Player1("player1", 'X');
        AIPlayer p2 = new AIPlayer("player2", 'O');

        Player currPlayer;
        currPlayer = p1;
        TicTacToe.dispBoard();

        while(true)
        {
            System.out.println(currPlayer.name+ " Make Your Move");
            currPlayer.makeMove();

        if(TicTacToe.checkDiagonalWin() || TicTacToe.checkColWin() || TicTacToe.checkRowWin()){
            System.out.println(currPlayer.name+" has Won");
            break;
        }
        else if(TicTacToe.checkDraw()){
            System.out.println("Game Draw");
            break;
        }
        else{
            if(currPlayer == p1){
                currPlayer = p2;
            }
            else{
                currPlayer = p1;
            }
        }
    }
}
}

