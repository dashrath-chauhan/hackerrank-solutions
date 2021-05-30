/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

public static int countingValleys(int steps, String path) {
    int valleys = 0;
    int count = 0;
    for(int i = 0; i < steps; i++) {
        if(path.charAt(i) == 'D') {
            count -= 1;
        } else {
            count += 1;
        }s
        if(count == 0 && path.charAt(i) == 'U'){
            valleys += 1;
        }            
	}
	return valleys;
}
