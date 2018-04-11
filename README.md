**Authors:** Reed Scheinberg, and Wilson Zhao

## Problem:
What is the boolean value of the statement "is there a way to get from the starting point to the treasure"?

## Recursive Abstraction:
When I am asked to find out if "there is a way to get from the starting point to the treasure", the recursive abstraction can answer the question if "there is a way to get from the starting point to the treasure by going through this path".

## Base Case:
- When the player is on the treasure --> return true
- The player is at an invalid position (i.e. a wall) --> return false

## Algorithm:
- if the player is at an invalid position
    - return false
- else if this path is the treasure
    - return true
- else
    - for each adjacent square:
        - if this square is a valid path:
            - invoke the recursive abstraction
    - backtrack one path and repeat the Algorithm 
    
## Classes & Methods:
Displayer:
- Fields:
    - windowHeight
    - console
- Constructor
- Methods:
    - atTopOfWindow
    - lineSeparatorsIn

Maze:
- Fields:
    - maze
    - rankCount
    - explorerPosition
- Constructor
- Copy Constructor
- Methods:
    - toString
    - go
    - dropA
    - explorerIsOnA
    - add
    - equals
    
UserOfMaze:
- Fields:
    - displayer
- Methods:
    - main
    - moveTest
    - dropTest
    - copyConstructTest
    - displayerTest
    - snapshotDemo
    
## Version Planner:
0: Working UserOfMaze Class, with appropriate test cases

1: Working Maze Class, with constructor, and the ability to make a maze layout as desired

2: Working UserOfSolver class, with appropriate test cases

3: Basic Solver Class, with constructor, and any helper methods that are necessary for the recursive solver method

4: Working recursive solver method

5+: Anything else that comes to mind
