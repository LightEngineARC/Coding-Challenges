import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int cur = 0;
        Map<String, Boolean> alpha = new HashMap<String, Boolean>();

        for(int i=0; i< s.length(); i++){
            for(int j=i; j < s.length(); j++){
                String letter = s.substring(j,j+1);
                if(alpha.get(letter) != null){
                    cur = 0;
                    alpha.clear();
                    j=s.length();
                }else{
                    alpha.put(letter, true);
                    cur++;
                    max = (cur > max) ? cur : max;
                }
            }
        }
        return max;
    }
    public static void testLongestSubstringWithoutRepeatingCharacters(){
        System.out.println("Begin Test Longest Substring Without Repeating Characters");
        String s = "abcabcbb";
        int output = 3;
        System.out.println("Input: '" + s + "'s "+ "Expected output: "+ output +" Actual result: " + lengthOfLongestSubstring(s));
        System.out.println("End Test Longest Substring Without Repeating Characters");
    }
}
