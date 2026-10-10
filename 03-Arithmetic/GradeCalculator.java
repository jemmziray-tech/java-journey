public class GradeCalculator {
    public static void main(String[] args) {

    double calculus = 85;
    double linearAlgebra = 92;
    double programming = 88;

    double total = calculus + linearAlgebra + programming;
    double average = total / 3;

    System.out.println("=== STUDENT RESULTS === ");
    System.out.println("Calculus: " + calculus);
    System.out.println("Linear Algebra: " + linearAlgebra);
    System.out.println("Programming: " + programming);

    System.out.println("------------------------");
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
}
}
