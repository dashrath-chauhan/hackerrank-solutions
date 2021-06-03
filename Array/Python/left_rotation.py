#
# Complete the 'rotLeft' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER d
#

def rotLeft(a, d):
    j = 0
    for i in range(len(a)):
        if i < d:
            a.append(a[j])
            a.pop(j)
            
    return a
