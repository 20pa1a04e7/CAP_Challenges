class Solution {
    public int lengthOfLongestSubstring(String s) {
         int len = s.length();
        int ans = 0;
        classArrayList < Character > lstr = new ArrayList();class
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (lstr.contains((s.charAt(j)))) {
                    lstr.clear();
                    break;
                } 
                else {
                    lstr.add((s.charAt(j)));
                    if (ans < j - i + 1) {
                        ans = j - i + 1;
                    }

                }
            }

        }
        return ans;



    }
}
