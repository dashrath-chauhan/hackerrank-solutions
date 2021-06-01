#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

def countingValleys(steps, path):
    valley = 0
    count = 0
    for i in range(0,steps):
        if path[i] == 'D':
            count -= 1
        else:
            count += 1

        if count == 0 and path[i] == 'U':
            valley += 1

    return valley
