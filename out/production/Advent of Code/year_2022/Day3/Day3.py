f = open(r'C:\\Users\\josep\Desktop\Advent of Code\\2022\Day3\\Day3.txt', 'r')

def part1():
    global f
    sum = 0
    for lines in f:
        #first half: lines[:int(len(lines)/2)]
        #second half: lines[int(len(lines)/2):]
        firstHalf = lines[:int(len(lines)/2)]
        secondHalf = lines[int(len(lines)/2):]
        commonLetter = ''.join(set(firstHalf).intersection(secondHalf))
        #ord('a') = 97
        #ord('A') = 65
        if(ord(commonLetter) < 96):
            sum += (ord(commonLetter) - 38)
        else:
            sum += (ord(commonLetter) - 96)
    print(sum)

def part2():
    global f
    packs = []
    sum = 0
    for lines in f:
        packs.append(lines.strip())
        if(len(packs) == 3):
            commonLetter = ''.join(set(packs[0]).intersection(packs[1]))
            commonLetter = ''.join(set(commonLetter).intersection(packs[2]))
            if(ord(commonLetter) < 96):
                sum += (ord(commonLetter) - 38)
            else:
                sum += (ord(commonLetter) - 96)
            packs.clear()
    print(sum)

def main():
    #part1()
    part2()
    f.close()

if __name__=="__main__":
    main()