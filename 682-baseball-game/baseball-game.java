class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int index = 0;
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
        String op = operations[i];
            if (op.equals("+")) {
                int lastValid = index - 1;
                int secondLastValid = index - 2;
                scores[index] = scores[lastValid] + scores[secondLastValid];
                sum += scores[index];
                index++;
            } else if (op.equals("D")) {
                scores[index] = scores[index - 1] * 2;
                sum += scores[index];
                index++;
            } else if (op.equals("C")) {
                sum -= scores[index - 1];
                index--;
            } else {
                scores[index] = Integer.parseInt(op);
                sum += scores[index];
                index++;
            }
        }
        return sum;
    }
}