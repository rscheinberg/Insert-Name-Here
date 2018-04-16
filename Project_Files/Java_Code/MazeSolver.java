/*
* Class whose purpose is to encapsulate a Maze that can be solved by the method solveMaze()
*/

import java.util.ArrayList;
public class MazeSolver {
	
	//fields
	private final static int[] GOLIST = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};
	private int numSolves;
	private int numFails;
	private ArrayList<Maze> solvedMazes;
	private ArrayList<Maze> failedMazes;
	
	
	/*
	* Constructor that sets the @solvedMazes and @failedMazes fields to new ArrayList objects
	*/
	public MazeSolver () {
		//int fields are already defaulted to 0		
		solvedMazes = new ArrayList<Maze>();
	}
	
	/*
	* Method that increases @numSolves by 1, and adds the @solved maze to @solvedMazes
	*/
	private void addSolve (Maze solved) {
		solvedMazes.add(solved);
		numSolves++;
	}
	
	/*
	* Method that increases @numFails by 1, and adds the @failed maze to @failedMazes
	*/
	private void addFail (Maze failed) {
		failedMazes.add(failed);
		numFails++;
	}
	
	/*
	* Accessor method that @return @numSolves
	*/
	public int totalSolves () {
		return numSolves;
	}
	
	/*
	* Accessor method that @return @numFails
	*/
	public int totalFails () {
		return numFails;
	}
	
	/*
	* toString method that @return information about each field excluding @GOLIST
	*/
	public String toString () {
		String result = "";
		result += "Number of Solved Mazes: " + totalSolves() + System.lineSeparator();
		result += " The Solved Mazes: " + System.lineSeparator();
		for(int ctr = 0; ctr < solvedMazes.size(); ctr++) {
			result+= solvedMazes.get(ctr) + System.lineSeparator();
		}
		result += "Number of Failed Mazes: " + totalFails() + System.lineSeparator();
		result += " The Failed Mazes: " + System.lineSeparator();
		for(int ctr = 0; ctr < failedMazes.size(); ctr++) {
			result+= failedMazes.get(ctr) + System.lineSeparator();
		}
		return result;
	}
	
	/*
	* Method that @return the value from @solveMazeHelper, and calls @addSolve or @addFail depending on that @return value
	*/
	public boolean solveMaze (Maze current) {
		Maze original = new Maze(current);
		boolean result = solveMazeHelper(current);
		if(result) {
			addSolve(original);
		}
		else {
			addFail(original);
		}
		return result;
	}
	
	/*
	* Helper method that attempts to solve the @current Maze via recursive backtracking, and @return the appropriate boolean
	*/
	private boolean solveMazeHelper (Maze current) {
		
		if(current.explorerIsOnA() == Maze.WALL) {
			return false;
		}
		else if(current.explorerIsOnA() == Maze.TREASURE) {
			return true;
		}
		else {
			for(int path: GOLIST) {
				Maze old = new Maze(current);
				current.dropA(Maze.WALL);
				current.go(path);
				if(solveMaze(current)) {
					return true;
				}
				else {
					current = new Maze(old);
				}
			}
			return false;
		}
	}
}