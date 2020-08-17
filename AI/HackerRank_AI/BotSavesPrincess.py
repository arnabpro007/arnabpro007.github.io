def isBigger(x,y):
    if(x>=y):
        return x
    else:
        return y


def displayPathtoPrincess(n,grid):

    for i in range(len(grid)):
        for j in range(len(grid[i])):
            if grid[i][j] == 'm':
                positionOfBot = [i,j]
            elif grid[i][j] == 'p':
                positionOfPrincess = [i,j]
    DiffY = positionOfBot[0] - positionOfPrincess[0]
    DiffX = positionOfBot[1] - positionOfPrincess[1]

    if DiffY>0:
        for i in range(DiffY):
            print("UP")
    elif DiffY<0:
        DiffY = -1*DiffY
        for i in range(DiffY):
            print("DOWN")
    if DiffX>0:
        for i in range(DiffX):
            print("LEFT")
    elif DiffX<0:
        DiffX = -1*DiffX
        for i in range(DiffX):
            print("RIGHT")

m = int(input())
grid = []
for i in range(0,m):
    grid.append(input().strip())
displayPathtoPrincess(m,grid)