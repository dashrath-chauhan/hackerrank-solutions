#
# Complete the 'hourglassSum' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def hourglassSum(arr):
    msum = []
    for i in range(1,5):
        for j in range(1,5):
            msum.append(arr[i][j] + arr[i-1][j-1] + arr[i-1][j-0] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j-0] + arr[i+1][j+1])
                
    return max(msum)
