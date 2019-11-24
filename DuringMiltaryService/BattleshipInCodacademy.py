import random
 
gameboard = []
 
print("Set board size")
set_row = int(input("row:"))
set_col = int(input("col:"))
 
board_row =[]
def set_gamemod():
    while(1<2):
        print("select gamemod: 1.single 2.versus")
        gmod =int(input("your answer:"))
        if(gmod!=1 and gmod!=2):
            continue
        break
    return gmod
               
gamemod = set_gamemod()
 
for b in range(set_col):
    gameboard.append(['0']*set_row)
 
def print_board(board):
 
    for row in board:
        result= " ".join(row)
        print(result)
 
print_board(gameboard)
 
row =random.randint(0,len(gameboard) - 1)
col =random.randint(0,len(gameboard) - 1)
 
left_turn = len(gameboard) -1
 
if( gamemod == 2):
    left_turn *=2
def is_multigame(gamemod,turn):
    if(gamemod == 2):
        if(turn%2==0):
            print("PLAYER ",turn%2+1,"TURN!")
        else:
            print("PLAYER ",turn%2+1,"TURN!")
            
def who_s_winner(turn):
    print("PLAYER ",turn%2+1,"Winner!")
while(3>0):
 
    for turn in range(left_turn):
        print("LEFT TURN:", left_turn- turn)
        is_multigame(gamemod,turn)
        
        guess_row = int(input("Guess_row: "))
        guess_col = int(input("Guess_col: "))
        if(guess_row>len(gameboard) or guess_row<0 or guess_col >len(gameboard) or
           guess_col<0):
             
                continue 
        
        if(row== guess_row and col == guess_col):
            if(gamemod==1):
                print("You win!!")
            else:
                who_s_winner(turn)
            break
        
        else:
            gameboard[guess_row][guess_col] ='X'
            print_board(gameboard)
    else:
        if(gamemod==1):
            print("You lose!")
        else:
            print("Everyone is loser!!")
      
    print("You wanna rematch? 1.yes 2.no")
    rematch =  int(input("Rematch:"))     
    if(rematch == 1):
        continue
    elif(rematch == 2):
        break
    