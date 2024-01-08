import java.util.*;
class AIPlayer extends Player{ 
    String name;
    char mark;

    AIPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    void makeMove(){
                int row;
                int col;
                do{
                   Random ran = new Random();
                   row = ran.nextInt(3);
                   col = ran.nextInt(3);
                } while(!isValidMove(row, col));

                TicTacToe.placeMark(row, col, mark);
            }
    }
