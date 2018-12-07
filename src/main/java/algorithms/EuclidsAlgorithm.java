package algorithms;

/**
 * The Euclidean algorithm, also called Euclid's algorithm, is an algorithm for finding the greatest common divisor of two numbers
 * see @{link https://i.stack.imgur.com/IIg4Q.png}
 */
public class EuclidsAlgorithm {
    public int findGCD(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        int reminder = m % n;
        if (reminder == 0)
            return n;
        else return findGCD(n, reminder);
    }
}
