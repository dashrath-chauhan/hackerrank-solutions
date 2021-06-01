/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

public static int jumpingOnClouds(List<Integer> c) {
    int jumps = 0;
    int i = 0;
    while(i < c.size()-2) {
        if(c.get(i+2) == 0) {
            i += 2;
        } else {
            i += 1;
        }
        jumps += 1;
    }
    
    if(i != c.size()-1){
        jumps += 1;
    }
    
    return jumps;
}
