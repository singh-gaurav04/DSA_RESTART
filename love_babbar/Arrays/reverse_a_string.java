class Solution {
    public static String reverseString(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder ans = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }

        return ans.toString();

        // alternate
        // return new StringBuilder(s).reverse().toString();
    }
}