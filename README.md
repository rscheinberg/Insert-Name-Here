**Authors:** Reed Scheinberg, and Wilson Zhao

## Problem:
What is the boolean value of the statement "is there a way to get from the starting point to the treasure"?

## Recursive Abstraction:
When we are trying to answer the question "is there a way to get from the starting point to the treasure", the recursive abstraction can answer the question "is there a way to get from the starting point to the treasure by going through junction *n*".

## Version Planner:
0: Working UserOfMaze Class, with appropriate test cases

1: Working Maze Class, with constructor, and the ability to make a maze layout as desired

2: Working UserOfSolver class, with appropriate test cases

3: Basic Solver Class, with constructor, and any helper methods that are necessary for the recursive solver method

4: Working recursive solver method

5+: Anything else that comes to mind

## Base Case:
When a junction leads to a dead end

## Algorithm:
For each junction...
- if this junction results in a dead end,
    - go back one junction and repeat
- else,
  - if this junction is the treasure
    - return true
  - else
    - invoke the recursive abstraction
