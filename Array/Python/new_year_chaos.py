#
# Complete the 'minimumBribes' function below.
#
# The function accepts INTEGER_ARRAY q as parameter.
#

def minimumBribes(q):
    bribes = 0
    first,second,third = 1,2,3
    
    for i in range(len(q)):
        if q[i] == first:
            first,second = second,third
            third += 1
        elif q[i] == second:
            bribes += 1
            second = third
            third += 1
        elif q[i] == third:
            bribes += 2
            third += 1
        else:
            print("Too chaotic")
            return
        
    print(bribes)