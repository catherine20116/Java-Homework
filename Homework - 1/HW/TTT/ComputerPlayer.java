import java.util.Random;

public class ComputerPlayer {
	public String choice;
	public int row;
	public int col;
	
	public ComputerPlayer() {
		Random rand = new Random();
		int random = rand.nextInt(2);
		if (random == 0) {
			this.choice = "O";
		} else {
			this.choice = "X";
		}
		
		int rowIndex = rand.nextInt(3) + 1;
		int colIndex = rand.nextInt(3) + 1;
		if(rowIndex == 1) {
			this.row = 1;
		} else if (rowIndex == 2) {
			this.row = 3;
		} else {
			this.row = 5;
		}
		
		if(colIndex == 1) {
			this.col = 1;
		} else if (colIndex == 2) {
			this.col = 3;
		} else {
			this.col = 5;
		}
		
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
