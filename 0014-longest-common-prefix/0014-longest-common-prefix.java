
class Solution {
    public String longestCommonPrefix(String[] strs) {

        int firstAI = 0;
        int secondAI = 1;

        int j = 0;
        String prefix = "";

        while (j < strs[firstAI].length()) {

            boolean same = true;

            for (secondAI = 1; secondAI < strs.length; secondAI++) {

                if (j >= strs[secondAI].length() ||
                    strs[firstAI].charAt(j) != strs[secondAI].charAt(j)) {

                    same = false;
                    break;
                }
            }

            if (same) {
                prefix += strs[firstAI].charAt(j);
            } else {
                return prefix;
            }

            j++;
        }

        return prefix;
    }
}
