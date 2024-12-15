f = open(r'C:\\Users\\josep\Desktop\Advent of Code\\2022\Day4\\Day4.txt', 'r')

def part1():
    global f
    counter = 0
    for lines in f:
        firstBegin = int(lines[0])
        firstEnd = int(lines[2])
        secondBegin = int(lines[4])
        secondEnd = int(lines[6])
        if(firstBegin <= secondBegin and firstEnd >= secondEnd):
            counter += 1
        elif(secondBegin <= firstBegin and secondEnd >= firstEnd):
            counter += 1
    print(counter)

def part2():
    return

def main():
    part1()
    part2()
    f.close()

if __name__=="__main__":
    main()