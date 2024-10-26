public class MultiplicationTables {

    public static void main(String[] args) {
        for (int i = 3; i <= 8; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            printTable(i);
            System.out.println(); 
        }
    }

    private static void printTable(int number) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + " x " + j + " = " + (number * j));
        }
    }
}
