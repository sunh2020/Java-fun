public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double four = 4.0;
        double squareRoot = Math.sqrt(legA*legA + legB*legB);
        System.out.println(squareRoot);
        return squareRoot;
    }
}