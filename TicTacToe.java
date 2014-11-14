
public class TicTacToe {
	
	private char[][] grid = {{' ', ' ', ' '},
							 {' ', ' ', ' '},
							 {' ', ' ', ' '}};
	private boolean playerXTurn;
	private int moveCount;
	
	public TicTacToe() {
		moveCount = 0;
		playerXTurn = true;
	}
	
	public boolean getPlayerXTurn() {
		return playerXTurn;
	}
	
	public char[][] getGrid() {
		return grid;
	}
	
	public char get(int x, int y) {
		return grid[y][x];
	}
	
	public boolean move(int x, int y) {
		boolean moveSucceeded = true;
		if (grid[y][x] != ' ') {
			moveSucceeded = false;
		} else {
			moveCount++;
			grid[y][x] = (playerXTurn ? 'X':'O');
			checkForWin();
			playerXTurn = !playerXTurn;
		}
		return moveSucceeded;
	}
	
	private void checkForWin() {
		boolean win = false;
		     if (grid[0][0]!=' ' && grid[0][0]==grid[0][1] && grid[0][0]==grid[0][2]) win=true;
		else if (grid[1][0]!=' ' && grid[1][0]==grid[1][1] && grid[1][0]==grid[1][2]) win=true;
		else if (grid[2][0]!=' ' && grid[2][0]==grid[2][1] && grid[2][0]==grid[2][2]) win=true;
		else if (grid[0][0]!=' ' && grid[0][0]==grid[1][0] && grid[0][0]==grid[2][0]) win=true;
		else if (grid[0][1]!=' ' && grid[0][1]==grid[1][1] && grid[0][1]==grid[2][1]) win=true;
		else if (grid[0][2]!=' ' && grid[0][2]==grid[1][2] && grid[0][2]==grid[2][2]) win=true;
		else if (grid[0][0]!=' ' && grid[0][0]==grid[1][1] && grid[0][0]==grid[2][2]) win=true;
		else if (grid[0][2]!=' ' && grid[0][2]==grid[1][1] && grid[0][2]==grid[2][0]) win=true;
		     
		if (win) {
			System.out.printf("%c Wins!\n", (playerXTurn?'X':'O'));
			System.out.println(this);
			System.exit(0);
		} else if (moveCount == 9) {
			System.out.printf("Tie!\n");
			System.out.println(this);
			System.exit(0);
		}
	}
	
	public String toString() {
		return String.format(
				"%c's turn:\n%c|%c|%c\n-+-+-\n%c|%c|%c\n-+-+-\n%c|%c|%c\n",
				(playerXTurn? 'X':'O'),
				grid[0][0], grid[0][1], grid[0][2],
				grid[1][0], grid[1][1], grid[1][2],
				grid[2][0], grid[2][1], grid[2][2]);
	}
}
