import java.util.*;
class Player1 extends Player{
    String name;
    char mark;

    Player1(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    void makeMove(){
            try (Scanner sc = new Scanner (System.in)) {
                int row;
                int col;
                do{
                    System.out.println("Enter and row and column");
                   
                     row = sc.nextInt();
                     col = sc.nextInt();

                } while(!isValidMove(row, col));

                TicTacToe.placeMark(row, col, mark);
            }
        }
}
