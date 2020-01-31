# CMPT 120 Intro to Programming
# Chapter 11 lab: Lists and Error Handling
# Author: Your Name Here
# Created: YYYY-MM-DD

# ----------------------------------------------------------------------------------
# Global Variables
# ---------------------------------------------------------------------------------
#
board = [[0, 0, 0], [0, 0, 0], [0, 0,0]]  # This represents the board--each list corresponds to each row in the board. A zero represent a blank in the square.
symbol = [" ", "x", "o"]

# -------------------------------------------------------------------------------------
# Start of functions
# -------------------------------------------------------------------------------------
#
#  FUNCTION: printRow
#  This function prints out one row of the tic tac toe board - it receives a row from the "board" as a list of three elements.
# -----------------------------------------------------------------------------------------
def printRow(row):
    # Draw the left border - a vertical dash
    print("|", end="")  # end="" keeps the output for the next print on the same line

    # HINT: For loop needed here--for each element in the "row" list passed as a parameter to this function (you can just loop 3 times):
    # Replace the question mark in the print statement below with correct symbol for this square as follows:
    #   - Take the value in the row element being processed, and use this as an index into the "symbol" variable.
    #       For example:
    #          - if the value in the row is a "0", then print 3 blanks-- "   ";
    #          - if the value in the row is a "1", then print " x ";
    #          - if the value in the row is a "2", then print " o ".
    for j in range(3):
        if row[j] == 0:
            print("   |", end="")
        elif row[j] == 1:
            print("   X   |", end="")
        elif row[j] == 2:
            print("   o   |", end="")
    print(" ? |", end="")  # this will keep everything on the same line (no line return after printing)


# AFTER THE WHILE LOOP: after all three spaces have printed, start printing on a new line
print(end='\n')  # this will start a new line on next print.


# -----------------------------------------------------------------------------------
#
#  FUNCTION: printBoard
#  This function prints out the current state of the tic tac toe board to the user
# ------------------------------------------------------------------------------------
def printBoard(board):
    # print the top border
    print("+-----------+")
    # HINT: For loop needed here--for each row in the board do the following two lines:
    for row in range(3):
        printRow(board[row]) # Call "printRow()" - Replace "[0,0,0]" with the actual row index (HINT: Use the variable created in your "for" loop
    print("+----------+")  # print the separator line between rows (Note: this will also print the bottom border for you)


# ------------------------------------------------------------------------------------------------------------------
#
# FUNCTION: markBoard
# This function "marks" the board with the player's move by storing a "1" for an "x" or a "2" for an "o" in the correct row and col.
# ------------------------------------------------------------------------------------------------------------------------
def markBoard(board, row, col, player):


# check to see whether the desired square is blank (Hint: Index the correct row/col in "board" and see if it is equal to "0")
# if True, store the value of "player" (1 for "x", 2 for "o") in the proper row/col of "board"
# if False, then print out a message stating the space has already been taken
if board[row][col1] == 0:
    print("This space is already taken")
else:
    board[row][col1] = player
# ---------------------------------------------------------------------------------------------
#
# FUNCTION: getPlayerMove
# This function prompts the user for a row and col. Explain that valid values are 0, 1, and 2 for rows/columns 1, 2, and 3
# -----------------------------------------------------------------------------------------------------
def getPlayerMove():
    # prompt the user separately for the row and column numbers - remember to make the values integers!
    row = int(input("pick a row"))
    col = int(input("pick a col"))
    return (row, col)  # return the selected row and col values to "main()"


# -------------------------------------------------------------------------------------------------
#
# FUNCTION: hasBlanks
#
# This function checks to see if there are any remaining spaces left on the board.
# ---------------------------------------------------------------------------------------------------------------
def hasBlanks(board):
    def hasBlanks(board):
        for row in range(3):
            for col in range(3):
                if board from [col] == 0:
                    return True
                else:
                    return False

# Loop through the entire board - each row and each column (a for loop within a for loop is needed)
# If there is at least 1 blank in the board, return true. Otherwise, return false.
# for each row in the board...you can just assume that it is 3 times
# for each col in the row...same as above

# If a space is available (represented by a "0" in the proper row/col of "board" array):
# return True  This will immediately return control to the caller
# If you reach the end of the board - ie, you have finished executing both loops and
# you reach this point - which means a blank was not encountered
# then return False
# -----------------------------------------------------------------------------------------------------------------
# end of functions
# -----------------------------------------------------------------------------------------------------------------
#
# MAIN function
# --------------------------------------------------------------------------------------

def main():
    player = 1  # Start player out as "x" (indicated by a value of 1)
    while hasBlanks(board):
        printBoard(board)  # Print the current tic tac toe board out for the user to view
        # Call getPlayerMove which prompts the user to pick a row and a column
        row, col = getPlayerMove()
        # Call markBoard which will set the appropriate spot to an "x" or "o", depending on the value of "player" (1 for "x", 2 for "o")
        markBoard(board, row, col, player)
        player = player % 2 + 1  # switch player for next turn  (1 becomes a 2 and a 2 becomes a 1)
    printBoard(board)  # Print board at the end to show the last move
    print("Game Over")


main()