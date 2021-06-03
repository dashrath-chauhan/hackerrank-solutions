/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

public static List<Integer> rotLeft(List<Integer> a, int d) {
	int j = 0;
    for(int i = 0; i < a.size(); i++) {
        if( i < d) {
            a.add(a.get(j));
            a.remove(j);
        }
    }
    
    return a;
}
