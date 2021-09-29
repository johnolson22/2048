import java.util.ArrayList;

public class GameBoard {
	
	private int rows = 4;
	private int cols = 4;
	private static int[][] board = new int[rows][cols];
	
	public GameBoard() {
		insertBlock();
	}
	
	public static void insertBlock() {
		ArrayList<int[]> openSpots = new ArrayList<int[]>();
		
		
		for(int r = 0; r < board.length; r++)
			for(int e = 0; e < board[0].length; e++)
				if(board[r][e] == 0)
					openSpots.add(new int[]{r, e});
		
		int randint = (int) Math.floor(Math.random() * openSpots.size());
		int[] spot = openSpots.get(randint);
		System.out.println(spot[0]);
		System.out.println(spot[1]);
		board[spot[0]][spot[1]] = 1;
	}
	private static void combineRight() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = cols - 1; j > 0; j--) {
				if (board[i][j - 1] == board[i][j]) {
					board[i][j] *= 2;
					board[i][j - 1] = 0;
				}
			}
		}
	}

	private static void combineDown() {
		// TODO Auto-generated method stub
		for (int i = rows - 1; i > 0; i--) {
			for (int j = 0; j < cols; j++) {
				if (board[i - 1][j] == board[i][j]) {
					board[i][j] *= 2;
					board[i - 1][j] = 0;
				}
			}
		}
	}

	private static void combineLeft() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols - 1; j++) {
				if (board[i][j + 1] == board[i][j]) {
					board[i][j] *= 2;
					board[i][j + 1] = 0;
				}
			}
		}
	}

	private static void combineUp() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i + 1][j] == board[i][j]) {
					board[i][j] *= 2;
					board[i + 1][j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		insertBlock();
		for(int r = 0; r < board.length; r++)
			for(int e = 0; e < board[0].length; e++)
				board[r][e] = 0;
		
		for(int[] row : board) {
			for(int el : row)
				System.out.print(el + "  ");
			System.out.println();
		}
	}
}
