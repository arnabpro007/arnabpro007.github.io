def nextMove(n,r,c,grid):
    for i in range(len(grid)):
        for j in range(len(grid[i])):
            if grid[i][j] == 'p':
                positionOfPrincess = [i,j]
    positionOfBot = [r,c]
    DiffY = positionOfBot[0] - positionOfPrincess[0]
    DiffX = positionOfBot[1] - positionOfPrincess[1]
    AbsoluteY = abs(DiffY)
    AbsoluteX = abs(DiffX)
    if(AbsoluteX>AbsoluteY):
        if DiffX > 0:
            return "LEFT"
        else:
            return "RIGHT"
    elif(AbsoluteX<AbsoluteY):
        if DiffY > 0:
            return "UP"
        else:
            return "DOWN"

n = int(input())
r,c = [int(i) for i in input().strip().split()]
grid = []
for i in range(0, n):
    grid.append(input())

print(nextMove(n,r,c,grid))