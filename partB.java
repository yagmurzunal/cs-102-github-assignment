import java.util.Scanner ;

public class PartB {
    public static void main(String[] args) {
        int option = 1 ;
        Scanner in = new Scanner (System.in) ;
        System.out.print("Array Size: ") ;
        int length = in.nextInt() ;
        int[] array = PartA.create(length) ;
        for (int a : array) {
            System.out.print(a + " ") ;
        }
        System.out.println() ;
        while (option != 4) {
            System.out.println("1. Find the minimum and the maximum");
            System.out.println("2. Find the differences from the average of the array");
            System.out.println("3. Find the sum of odd and even indexes");
            System.out.println("4. Exit");
            System.out.print("Choose your option: ");
            option = in.nextInt() ;

            if (option == 1) {
                partC.findMin(array) ;
                partC.findMax(array) ;
            }

            else if (option == 2) {
                partd.averageDifferences(array) ;
            }

            else if (option == 3) {
                partE.findSumOfOddAndEvenNumberedIndexes(array) ;
            }
        }




    }
}