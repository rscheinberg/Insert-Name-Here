**Authors:** Reed Scheinberg, and Wilson Zhao

## Breakdown of this Repository:
- Projec_Files
    - Java_Code
        - Displayer.java
        - Maze.java
        - MazeSolver.java
        - UserOfMaze.java
        - UserOfMazeSolver.java
    - Test_Mazes
        - Holmes_Tests
            - 4cell_treasureWest.txt
            - intersection_noTreasure.txt
            - intersection_treasureNorth.txt
        - My_Tests
            - All_stepping_stones.txt
        - Piazza's Tests
            - 16x32.txt
            - Many_spots_hole_no_solution.txt
            - One_spot_no_solution.txt
            - One_spot_treasure.txt
            - path_with_choice.txt
            - path_with_turn.txt
            - steppingStonesEverywhere.txt
            - straightpathtotreasure.txt
            - thisOneBetterWork.txt
            - Trouble_hitting_edge_of_maze.txt
            - Trouble_hitting_walls.txt
            - Trouble_Turning.txt
            - Trouble_with_finding_treasure.txt
            - Two_spots_go_EAST.txt
            - Two_spots_go_NORTH.txt
            - Two_spots_go_SOUTH.txt
            - Two_spots_go_WEST.txt
            - Two_spots_no_solution_Horizontal.txt
            - Two_spots_no_solution_Vertical.txt
- README.md

## The Problem:
What is the boolean value of the statement "is there a way to get from the starting point to the treasure"?

## The Recursive Abstraction:
When I am asked to find out if "there is a way to get from the starting point to the treasure", the recursive abstraction can answer the question if "there is a way to get from the starting point to the treasure by going through this path".

## The Base Cases and their Return Values:
- When the player is on the treasure --> return true
- The player is on a wall --> return false

## The Algorithm - Psuedocode:
- if the player is at an invalid position
    - return false
- else if this path is the treasure
    - return true
- else
    - for each possible path
        - copy the current maze
        - drop a wall on the current position
        - go to that path
        - invoke the recursive abstraction
            - return true if the recursive abstraction returns true
        - revert to old maze //assumes recursive abstraction was unsuccessful
    - return false //assumes for loop + recursive abstraction was unable to find a valid path
    
## Classes & Methods:
-Displayer
    - Fields:
        - windowHeight
        - console
    - Constructor
    - Methods:
        - atTopOfWindow
        - lineSeparatorsIn
- Maze
    - Fields
        - maze
        - rankCount
        - explorerPosition
    - Constructor
    - Copy Constructor
    - Methods
        - toString
        - go
        - dropA
        - explorerIsOnA
        - add
        - equals
- Maze Solver
    - Methods
        - SolveMaze
- UserOfMaze
    - Fields
        - displayer
    - Methods
        - main
        - moveTest
        - dropTest
        - copyConstructTest
        - displayerTest
        - snapshotDemo
- UserOfMazeSolver
    - Methods
        - main

## Version Planner (properly updated):
v0:
- Working completed Maze class
- Working completed UserOfMaze class
- Working Maze Solver class, that only has a solve method
- Working UserOfMazeSolver class, that tests the solve method in Maze Solver
v1:
- Updated Maze Solver class with total mazes solved field, solved mazes list field, a constructor, toString, and additional accessors
v2:
- Bug fixing
    - NullPointerException Error
    - Fixed bugs in the MazeSolver addSolve method
- Added addFail method, and additional corresponding accessor method
- Added header and line comments for further/future clarity
- Updated UserOfMazeSolver to accommodate changes
- GitHub and project file hierarchy was modified to meet conventional naming standards

## Known Bugs:
- None 