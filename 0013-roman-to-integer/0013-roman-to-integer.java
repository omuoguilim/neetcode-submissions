class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;

        for (int j = 0; j < s.length(); j++) {

            int current = map.get(s.charAt(j));
            int next = 0;

            if (j + 1 < s.length()) {
                next = map.get(s.charAt(j + 1));
            }

            if (current < next) {
                count += (current * -1);
            } else {
                count += current;
            }
        }

        return count;
    }
}
