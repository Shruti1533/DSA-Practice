import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        BigInteger t = new BigInteger(sb.toString());
        t = t.add(BigInteger.ONE);
        String result = t.toString();
        int[] newDigits = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            newDigits[i] = Character.digit(result.charAt(i), 10);
        }
        return newDigits;
    }
}