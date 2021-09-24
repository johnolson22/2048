import java.util.ArrayList;

public class GameBoard {
	
	private static int[][] board = new int[4][4];
	
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
