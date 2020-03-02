package 字符串去除重复;

import java.util.HashMap;
import java.util.Map;

public class reverse {
    public static String reverseStr(String str) {
        Map<Character,Integer> map = new HashMap<>();
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = str.length();
        while (i < len) {
            char c = str.charAt(i);
            if(map.get(c)==null){
                map.put(c,1);
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String reverse = reverseStr("aaaaaabbbbbbbbccccaaabbbcccaav");
        System.out.println(reverse);
    }
}
