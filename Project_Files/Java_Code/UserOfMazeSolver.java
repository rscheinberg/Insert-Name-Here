/*
*  Class whose purpose is to allow a user to test the MazeSolver class
*/

public class UserOfMazeSolver {
	
	public static void main(String[] commandLine) throws java.io.FileNotFoundException {
		
		
        System.out.println();
        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
         //testing the toString() also allows for the testing of newly added accessors and mutators simultaneously
        System.out.println( maze + System.lineSeparator());
        MazeSolver test = new MazeSolver();
        System.out.println( test.solveMaze(maze));
        System.out.println(test);
	}

}	