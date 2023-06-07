

public class TicTacToe {
    int[][] board = new int[2][2];
        public TicTacToe() {

        }
    
    
        public void initNewBoard() {
            board = new int[3][3];

        }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.initNewBoard();
        System.out.println(game.board.length);

        for (int i = 0; i < game.board.length; i++) {
            System.out.println();
            for (int j = 0; j < game.board[i].length; j++) {
                System.out.print(game.board[i][j]);
            }
        }
    }
}