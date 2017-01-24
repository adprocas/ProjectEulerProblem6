package projecteulerproblem6;

public class ProjectEulerProblem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long difference = computeSquareOfSums(100L) - computeSumOfSquares(100L);

        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is:");
        System.out.println(difference);
    }

    public static long computeSumOfSquares(long limit) {
        long sumOfSquares = 0L;

        for (long x = 0L; x <= limit; x++) {
            sumOfSquares += x * x;
        }

        return sumOfSquares;
    }

    public static long computeSquareOfSums(long limit) {
        long squareOfSums = 0L;
        
        for (long x = 0L; x <= limit; x++) {
            squareOfSums += x;
        }

        return squareOfSums * squareOfSums;
    }
}
