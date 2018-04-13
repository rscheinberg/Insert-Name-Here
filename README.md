**Authors:** Reed Scheinberg, and Wilson Zhao

## Breakdown of this Repository:
- Maze Project Files
    - Java Code
        - Displayer.java
        - Maze.java
        - MazeSolver.java
        - UserOfMaze.java
        - UserOfMazeSolver.java
    - Test Mazes
        - Holmes' Tests
            - 4cell_treasureWest.txt
            - intersection_noTreasure.txt
            - intersection_treasureNorth.txt
        - My Tests
            - All stepping stones.txt
        - Piazza's Tests
            - 16x32.txt
            - Many spots, hole, no solution.txt
            - One spot, no solution.txt
            - One spot, treasure.txt
            - path with choice.txt
            - path with turn.txt
            - steppingStonesEverywhere.txt
            - straightpathtotreasure.txt
            - thisOneBetterWork.txt
            - Trouble hitting edge of maze?.txt
            - Trouble hitting walls?.txt
            - Trouble Turning?.txt
            - Trouble with finding treasure.txt
            - Two spots, go EAST.txt
            - Two spots, go NORTH.txt
            - Two spots, go SOUTH.txt
            - Two spots, go WEST.txt
            - Two spots, no solution(Horizontal).txt
            - Two spots, no solution(Vertical).txt
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
v1+:
- Nothing planned at the moment
- Would be nice to implement something that finds all of the solutions for a maze

## Known Bugs:
- NullPointException Error, seems to randomly occur in both Maze Solver and Maze.  The program seems to attempt to move the explorer based on a null vector, which it cannot do.  Solution to this issue will be addressed in a future version.