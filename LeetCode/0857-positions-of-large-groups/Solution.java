
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        int n = s.length();
        int start = 0;

        for (int i = 1; i <= n; i++) {

            if (i == n || s.charAt(i) != s.charAt(start)) {

                if (i - start >= 3) {
                    result.add(Arrays.asList(start, i - 1));
                }

                start = i;
            }
        }

        return result;
    }
}
