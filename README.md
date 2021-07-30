# SuperTTT-V2
Super Tic Tac Toe again, except now I have some software engineering principles

## Classes
### Main
    Inits the game
### GameEnv
    Hold the game env
### View
    Provides visual representations of Model for the player
### Model
    Contains the information about the board
### Controller
    Takes input from player interactions with View, and modifies Model

# Code Flow
Main runs the overall application, which creates an instance of GameEnv. 
GameEnv then creates the MVC.
GameEnv then starts the game loop.
    Each iteration of the game loop consists of:
        Starting with View displaying information of Model to the user.
        View then requests input from the user, if required.
        View then gets Controller to process the input, and View re-requests input from the user if the input was invalid (Controller returns false)
        Upon valid input, Controller updates Model.
When the game ends, Model has GameEnv to stop the loop, ending the game.
Currently, this just ends the game, but in future I could have a separate loop in Main, which can allow for multiple games to be played in a row.
    
