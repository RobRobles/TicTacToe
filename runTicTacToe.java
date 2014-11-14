import java.util.*;

public class runTicTacToe {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		TicTacToe ttt = new TicTacToe();
		
		roblrob_PlayTicTacToe agent = new roblrob_PlayTicTacToe();
		agent.setTTT(ttt);
		
		while (true) {
			System.out.println(ttt);
			System.out.print("x: ");
			int x = in.nextInt();
			System.out.print("y: ");
			int y = in.nextInt();
			ttt.move(x, y);
			
			
			agent.makeMove();
		}
	}

}
