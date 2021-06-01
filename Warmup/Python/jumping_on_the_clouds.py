#
# Complete the 'jumpingOnClouds' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY c as parameter.
#
    
def jumpingOnClouds(c):
    i = 0
    jumps = 0
    last_cloud = len(c)-1
    last_second = len(c)-2
    
    while i < last_second:
        #Checking if the cloud next to the next cloud is thunderstorm
        if c[i+2] == 0:
            i += 2
        else:
            i += 1
        jumps += 1
    #Checking if we are in the last cloud or the last second cloud
    if i != last_cloud:
        jumps += 1
        
    return jumps
