#
# Complete the 'repeatedString' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. STRING s
#  2. LONG_INTEGER n
#

def repeatedString(s, n):
    c = s.count('a')
    div = n // len(s)
    if n % len(s) == 0:
        c = c * div
    else:
        m = n % len(s)
        c= c * div + s[:m].count('a')
    return c
