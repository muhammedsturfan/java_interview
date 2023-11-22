package hackerrank_advanced;

public class Closest_Divisors {

    public class ClosestDivisors {

        public int[] closestDivisors(int num) {
            int[] closest = new int[2];
            int diff = Integer.MAX_VALUE;

            // Iterate from the square root of num + 2 down to 1
            for (int i = (int) Math.sqrt(num + 2); i >= 1; i--) {
                if ((num + 1) % i == 0) {
                    int j = (num + 1) / i;
                    if (Math.abs(i - j) < diff) {
                        closest[0] = i;
                        closest[1] = j;
                        diff = Math.abs(i - j);
                    }
                }

                if ((num + 2) % i == 0) {
                    int j = (num + 2) / i;
                    if (Math.abs(i - j) < diff) {
                        closest[0] = i;
                        closest[1] = j;
                        diff = Math.abs(i - j);
                    }
                }
            }

            return closest;
        }
    }

}
