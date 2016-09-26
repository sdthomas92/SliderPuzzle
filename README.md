# Slider Puzzle

This is an Artificial Intelligence project which allows the program to solve a slider puzzle that is either generated randomly or provided by the user. The program uses A* Search to solve the puzzle, and displays statistics about the algorithm (how many nodes were generated, max depth of the search tree, and how long the algorithm took to solve) depending on what heuristic function was used in the search.

## Slider Puzzle Format
The format of the slider puzzle is a 3x3 grid of 8 tiles, each with a number on it (1-8). The goal state is:
|   |   |   |
| - | - | - |
|  | 1 | 2 |
| 3 | 4 | 5 |
| 6 | 7 | 8 |

A slider puzzle like the one shown above is formatted as: 

`012345678`

Where 0 represents the missing tile.

## Features
* Solves a slider puzzle provided by the user
* Solves a randomized slider puzzle provided by the program
* Displays A* Search analytics (shows which heuristic function is more efficient with a starting and ending depth (depth of the search tree equals the number of moves made from start to goal)
