import java.util.Random;



public class roblrob_PlayTicTacToe implements IAgent{
	private TicTacToe ttt;

	public void setTTT(TicTacToe ttt) {
		this.ttt = ttt;
	}

	public void makeMove() {
	
		// You're responsible for making sure that you don't pick
		// and invalid spot.

		//this is checking to see if X has gone already. 
		if(ttt.getPlayerXTurn() == false)
		{
			//boolean to see if we placed an O
			boolean placedO = false; 
			boolean defenseO = false; 

			//random num
			Random ran = new Random(); 
			//get a randome position and check if it is empty. If it is put something there. First check to see if the other player will beat you. 

			//bottom row can beat me\\
			if(ttt.get(0,0) == 'X' && ttt.get(0,1) == 'X' && ttt.get(0,2) == ' ')
			{
				ttt.move(0,2); 
				defenseO = true;
			}

			if(ttt.get(1,0) == 'X' && ttt.get(1,1) == 'X' && ttt.get(1,2) == ' ')
			{
				ttt.move(1,2);
				defenseO = true;
			}

			if(ttt.get(2,0) == 'X' && ttt.get(2,1) == 'X' && ttt.get(2,2) == ' ')
			{
				ttt.move(2,2);
				defenseO = true;
			}

			//middle row can beat me\\
			if(ttt.get(0,0) == 'X' && ttt.get(0,2) == 'X' && ttt.get(0,1) == ' ')
			{
				ttt.move(0,1);
				defenseO = true;
			}

			if(ttt.get(1,0) == 'X' && ttt.get(1,2) == 'X' && ttt.get(1,1) == ' ')
			{
				ttt.move(1,1);
				defenseO = true;
			}
			
			if(ttt.get(2,0) == 'X' && ttt.get(2,2) == 'X' && ttt.get(2,1) == ' ')
			{
				ttt.move(2,1);
				defenseO = true;
			}

			//top row can beat me\\
			if(ttt.get(0,1) == 'X' && ttt.get(0,2) == 'X' && ttt.get(0,0) == ' ')
			{
				ttt.move(0,0);
				defenseO = true;
			}

			if(ttt.get(1,1) == 'X' && ttt.get(1,2) == 'X' && ttt.get(1,0) == ' ')
			{
				ttt.move(1,0);
				defenseO = true;
			}

			if(ttt.get(2,1) == 'X' && ttt.get(2,2) == 'X' && ttt.get(2,0) == ' ') 
			{
				ttt.move(2,0);
				defenseO = true;
			}

			//first column can beat me\\
			if(ttt.get(1,0) == 'X' && ttt.get(2,0) == 'X' && ttt.get(0,0) == ' ') 
			{
				ttt.move(0,0);
				defenseO = true;
			}

			if(ttt.get(1,1) == 'X' && ttt.get(2,1) == 'X' && ttt.get(0,1) == ' ') 
			{
				ttt.move(0,1);
				defenseO = true;
			}

			if(ttt.get(1,2) == 'X' && ttt.get(2,2) == 'X' && ttt.get(0,2) == ' ')
			{
				ttt.move(0,2);			
				defenseO = true;
			}

			//second colum can beat me\\
			if(ttt.get(0,0) == 'X' && ttt.get(2,0) == 'X' && ttt.get(1,0) == ' ') 
			{
				ttt.move(1,0);
				defenseO = true;
			}

			if(ttt.get(0,1) == 'X' && ttt.get(2,1) == 'X' && ttt.get(1,1) == ' ') 
			{
				ttt.move(1,1);
				defenseO = true;
			}

			if(ttt.get(0,2) == 'X' && ttt.get(2,2) == 'X' && ttt.get(1,2) == ' ') 
			{
				ttt.move(1,2);
				defenseO = true;
			}

			//third column can beat me\\
			if(ttt.get(0,0) == 'X' && ttt.get(1,0) == 'X' && ttt.get(2,0) == ' ') 
			{
				ttt.move(2,0);
				defenseO = true;
			}

			if(ttt.get(0,1) == 'X' && ttt.get(1,1) == 'X' && ttt.get(2,1) == ' ') 
			{
				ttt.move(2,1);
				defenseO = true;
			}

			if(ttt.get(0,2) == 'X' && ttt.get(1,2) == 'X' && ttt.get(2,2) == ' ') 
			{
				ttt.move(2,2);
				defenseO = true;
			}

			//check for diags going from left to right\\
			if(ttt.get(0,0) == 'X' && ttt.get(1,1) == 'X' && ttt.get(2,2) == ' ') 
			{
				ttt.move(2,2);
				defenseO = true;
			}

			if(ttt.get(0,0) == 'X' && ttt.get(2,2) == 'X' && ttt.get(1,1) == ' ') 
			{
				if(ttt.get(2,0) == 'X' && ttt.get(2,1) != 'O')
				{
					ttt.move(1,1);
					defenseO = true;
				}
			}

			if(ttt.get(1,1) == 'X' && ttt.get(2,2) == 'X' && ttt.get(0,0) == ' ') 
			{
				ttt.move(0,0);
				defenseO = true;
			}


			//check for diags going from right to left\\
			if(ttt.get(2,0) == 'X' && ttt.get(1,1) == 'X' && ttt.get(0,2) == ' ') 
			{
				ttt.move(0,2);
				defenseO = true;
			}

			if(ttt.get(2,0) == 'X' && ttt.get(0,2) == 'X' && ttt.get(1,1) == ' ') 
			{
				ttt.move(1,1);
				defenseO = true;
			}

			if(ttt.get(1,1) == 'X' && ttt.get(0,2) == 'X' && ttt.get(2,0) == ' ') 
			{
				ttt.move(2,0);
				defenseO = true;
			}

			while(placedO == false && defenseO == false)
			{
				int x = ran.nextInt(2);
				int y = ran.nextInt(2);

				if(ttt.get(1,1) == ' ')
				{
					ttt.move(1, 1);
					placedO = true; 
					break;
				}
				if(ttt.get(x,y) == ' ')
				{
					ttt.move(x,y); 
					placedO = true; 
				}
			}

		}
	}


}
