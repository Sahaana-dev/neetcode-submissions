class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            map.putIfAbsent(str, new ArrayList<>());
            if(!map.containsKey(str))
            {
                map.put(str, new ArrayList<>());
            }
            else
            {
                map.get(str).add(s);
            }
            // map.get(str).add(s);
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> l : map.values())
        {
            list.add(l);
        }
        return list;
    }
}
