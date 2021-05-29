def sockMerchant(n, ar):
    pairs = 0
    freq = {}
    for items in ar:
        freq[items] = ar.count(items)
      
    for key, value in freq.items():
        if value != 1:
            pairs += value // 2
            
    return pairs
