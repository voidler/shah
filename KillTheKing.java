import java.util.Scanner;

public class KillTheKing {
static final int PLAYER_WHITE_ID=1;
static final int PLAYER_BLACK_ID=2;
static final int INPUT=6;
static final String[][] gameBoard=  {
        {"Dw", "M", "K", "Q", "D", "Dw"},
        {"X", "X", "X", "X", "X", "X"},
        {"X", "X", "X", "X", "X", "X"},
        {"X", "X", "X", "X", "X", "X"},
        {"X", "X", "X", "X", "X", "X"},
        {"Dw", "D", "Q", "K", "M", "Dw"}
};

    public static void main(String[] args) {
//Data Structure
boolean isGameOver=false;
boolean isGameRunning=true;
int activePlayerId=1;

//Get Input Data
Scanner gameInputScanner=new Scanner(System.in);
renderGameBoard(gameBoard);
while(isGameRunning){
    System.out.println("Premesti figurka:");
    int gameInputPlayer1=gameInputScanner.nextInt();

    }

}


public static void movingRulesforDwarf(String [][] gameBoard,int row,int col){
        String Dw=gameBoard[row+1][col];
    if (Dw.equals(String.valueOf(gameBoard[row + 5][col]))) {
        System.out.print("Dostignahte kraq na dyskata.Moje da mestite djudjeto v obratna posoka.");
    }
}

    public static void renderGameBoard(String [][] gameBoard){
        for(int row = 0; row < INPUT; row++) { // while(true)
            for(int col = 0; col < INPUT; col++ ) {
                System.out.print(gameBoard[row][col]+" ");
            }
            System.out.println();
        }
    }
        }

