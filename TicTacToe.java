import java.util.Scanner;

public class TicTacToe {
        
        public int[][] board = new int[3][3];


        public TicTacToe() {

        }
        // This draws the board out in 0s, 1s, and 2s
        public void drawBoard(int [][] gameTitle) {
            for (int i = 0; i < gameTitle.length; i++) {
                System.out.println();
                for (int j = 0; j < gameTitle[i].length; j++) {
                    System.out.print(gameTitle[i][j]);
                }
            }
            System.out.println();
        }
    
        // This creates a new board for each new game
        public void initNewBoard() {
            board = new int[3][3];

        }

        public void placeX(int[][] gameTitle) {
            boolean choosingPlacement = true;
            int xCoordinate = 0;
            int yCoordinate = 0;
            //X will be represented with 1s
            Scanner xInput = new Scanner(System.in);
            System.out.println("Where would you like to place an X?");

                while (choosingPlacement) {
                    xCoordinate = xInput.nextInt();
                    yCoordinate = xInput.nextInt();

                    if ((xCoordinate <= 3 && xCoordinate > 0) && (yCoordinate <= 3 && yCoordinate > 0)) {
                        xCoordinate = xCoordinate - 1;
                        yCoordinate = yCoordinate - 1;
                        choosingPlacement = false;
                    } else {
                        continue;
                    }
                
                }

            
            gameTitle[xCoordinate][yCoordinate] = 1;

            }   
        

        public void placeO(int[][] gameTitle) {
            boolean choosingPlacement = true;
            int xCoordinate = 0;
            int yCoordinate = 0;
            //O will be represented with 2s
            //X will be represented with 1s
            Scanner oInput = new Scanner(System.in); 
            System.out.println("Where would you like to place an O?");

                while (choosingPlacement) {
                    xCoordinate = oInput.nextInt();
                    yCoordinate = oInput.nextInt();

                    if ((xCoordinate <= 3 && xCoordinate > 0) && (yCoordinate <= 3 && yCoordinate > 0)) {
                        xCoordinate = xCoordinate - 1;
                        yCoordinate = yCoordinate - 1;
                        choosingPlacement = false;
                    } else {
                        continue;
                    }

                }

            gameTitle[xCoordinate][yCoordinate] = 2;
            

            }

        


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.initNewBoard();
        boolean gameRunning = true;
        
        while (gameRunning) {
            game.placeX(game.board);
            game.placeO(game.board);
            game.drawBoard(game.board);
        }


        game.drawBoard(game.board);
        game.placeX(game.board);
        game.placeO(game.board);
        game.drawBoard(game.board);
        
    }
}