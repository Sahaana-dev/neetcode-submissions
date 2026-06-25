class Solution {

    public String encode(List<String> strs) {
        // strs =  ["Hello","World"] -> s = 5#Hello5#World
        StringBuilder sb = new StringBuilder();
        for(String s : strs)
        {
            int len = s.length();
            sb.append(String.valueOf(len)).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        // s = 5#Hello5#World -> strs =  ["Hello","World"]
        //Using two pointers
        List<String> list = new ArrayList<>();
        char ch[] = s.toCharArray();
        int i = 0;
        int j = 0;
        while(j < s.length())
        {
            while(ch[j] != '#')
            {
                j++;
            }
            String lenStr = s.substring(i, j);
            int len = Integer.parseInt(lenStr);
            j++;
            String word = s.substring(j, j+len);
            list.add(word);
            j = j+len;
            i = j;
        }
        return list;
    }
}
