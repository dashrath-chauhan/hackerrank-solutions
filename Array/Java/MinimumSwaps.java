/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

public static int hourglassSum(List<List<Integer>> arr) {
    int maxSum = Integer.MIN_VALUE;
    
    for(int i = 1; i < 5; i++) {
        for(int j = 1; j < 5; j++) {
            int currSum = arr.get(i).get(j)
            + arr.get(i-1).get(j-1) + arr.get(i-1).get(j-0) + arr.get(i-1).get(j+1) 
            + arr.get(i+1).get(j-1) + arr.get(i+1).get(j-0) + arr.get(i+1).get(j+1);
            
            maxSum = currSum > maxSum ? currSum : maxSum;
        }    
    }
    return maxSum;
}
