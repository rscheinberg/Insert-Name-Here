/*
* Class whose purpose is to encapsulate a Maze that can be solved by the method solveMaze()
*/

import java.util.ArrayList;
public class MazeSolver {
	
	private final static int[] GOLIST = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};
	private int numSolves;
	private ArrayList<Maze> solvedMazes;
	
	public MazeSolver () {
		//int fields are already defaulted to 0		
		solvedMazes = new ArrayList<Maze>();
	}
	
	private void addSolve (Maze solved) {
		solvedMazes.add(solved);
		numSolves++;
	}
	
	public int totalSolves () {
		return numSolves;
	}
	
	public String toString () {
		String result = "";
		result += "Number of Solved Mazes: " + totalSolves() + System.lineSeparator();
		result += " The Solved Mazes: " + System.lineSeparator();
		for(int ctr = 0; ctr < solvedMazes.size(); ctr++) {
			result+= solvedMazes.get(ctr) + System.lineSeparator();
		}
		return result;
	}
	
	public boolean solveMaze (Maze current) {
		
		if(current.explorerIsOnA() == Maze.WALL) {
			return false;
		}
		else if(current.explorerIsOnA() == Maze.TREASURE) {
			addSolve(current);
			return true;
		}
		else {
			for(int path: GOLIST) {
				Maze old = new Maze(current);
				current.dropA(Maze.WALL);
				current.go(path);
				if(solveMaze(current)) {
					addSolve(current);
					return true;
				}
				else {
					current = old;
				}
			}
			return false;
		}
	}
}