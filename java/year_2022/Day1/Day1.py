first = 0
second = 0
third = 0
current = 0
f = open(r"C:\\Users\\josep\Desktop\Advent of Code\\2022\Day1Part1.txt", "r")
for lines in f:
    if lines == "\n":
        if current > first:
            third = second
            second = first
            first = current
        elif current > second:
            third = second
            second = current
        elif current > third:
            third = current
        current = 0
    else:
        current += int(lines)

print(first + second + third)
f.close()