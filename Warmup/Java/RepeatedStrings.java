/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

public static long repeatedString(String s, long n) {
    long count = 0;
    long rs_f = n / s.length();
    long rs_h = n % s.length();
    
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'a') {
            count += 1;
        }
    }
    count = count * rs_f;
    for(int i = 0; i < rs_h; i++) {
        if(s.charAt(i) == 'a') {
            count += 1;
        }
    }
    //System.out.println(count);
    return count;
}
