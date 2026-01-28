public class partd {
    public static void averageDifferences(int[] array){
        int sum = 0;
        int[] newArray = new int[array.length];
        int average = 0;
        for(int i = 0; i < array.length ; i++){
            sum += array[i];
            
        }

        average = sum / array.length;

        for(int n = 0; n < array.length ; n++){
            newArray[n] = array[n] - average;
        }

        for(int j = 0 ; j < newArray.length; j++){
            System.out.print(newArray[j] + " ");
        }
        System.out.println();


}
}
