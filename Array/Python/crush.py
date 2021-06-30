#!/bin/python3
#
# Complete the 'arrayManipulation' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#

def arrayManipulation(n, queries):
    arr = [0] * (n+1)
    
    for i in range(len(queries)):
        a = queries[i][0]-1
        b = queries[i][1]
        k = queries[i][2]
        arr[a] += k
        arr[b] -= k
    
    max_value = 0
    running_count = 0
    for i in arr:
        running_count += i
        if running_count > max_value:
            max_value = running_count
            
    return max_value