public static int sockMerchant(int n, List<Integer> ar) {
    int pairs = 0;
    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    for (Integer i : ar) {
        Integer j = hm.get(i);
        hm.put(i, (j == null) ? 1 : j + 1);
    }
    
    for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
        if(val.getValue() == 1) {
            continue;
        } else {
            pairs += val.getValue() / 2;
        }
        
    }
    
    return pairs;
}
