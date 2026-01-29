public class partE {
    public static void findSumOfOddAndEvenNumberedIndexes( int[] arr ) {
        int sumOfOddIndexes = 0, sumOfEvenIndexes = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( i % 2 == 0 ) {
                sumOfEvenIndexes += arr[ i ];
            }
            else {
                sumOfOddIndexes += arr[ i ];
            }
        }

        System.out.printf( "Sum of Odd Indexes: %d\n", sumOfOddIndexes );
        System.out.printf( "Sum of Even Indexes: %d\n", sumOfEvenIndexes );
    }
}