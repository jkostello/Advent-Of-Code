round = [0, 0]
score = 0
f = open(r"C:\\Users\\josep\Desktop\Advent of Code\\2022\Day2.txt", "r")

def calcWin(round):
    global score
    if(round[0] == "A"):
        if(round[1] == "X"):
            score += 3
        elif(round[1] == "Y"):
            score += 4
        elif(round[1] == "Z"):
            score += 8
    elif(round[0] == "B"):
        if(round[1] == "X"):
            score += 1
        elif(round[1] == "Y"):
            score += 5
        elif(round[1] == "Z"):
            score += 9
    else:
        if(round[1] == "X"):
            score += 2
        elif(round[1] == "Y"):
            score += 6
        elif(round[1] == "Z"):
            score += 7

for lines in f:
    round[0] = lines[0]
    round[1] = lines[2]
    calcWin(round)

print(score)
f.close()