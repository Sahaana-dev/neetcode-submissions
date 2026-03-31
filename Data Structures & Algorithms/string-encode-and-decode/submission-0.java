class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for (String s : strs) {
            String len = String.valueOf(s.length());
            str += len + "#" + s;
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            String len = "";
            while (Character.isDigit(str.charAt(i)) && str.charAt(i) != '#') {
                len += str.charAt(i);
                i++;
            }
            i++;
            String word = "";
            int length = Integer.parseInt(len);
            for (int j = 0; j < length; j++) {
                word += str.charAt(i + j);
            }
            list.add(word);
            i += length;
        }
        return list;
    }
}
