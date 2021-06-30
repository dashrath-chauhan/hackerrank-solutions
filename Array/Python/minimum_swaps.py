#!/bin/python3

def minimumSwaps(arr):
    swaps = 0
    a = dict(enumerate(arr,1))
    b = { v:k for k,v in a.items() }
    print(a)
    for i in a:
        x = a[i]
        if x != i:
            y = b[i]
            a[y] = x
            b[x] = y
            
            swaps += 1
            
                
    return swaps
