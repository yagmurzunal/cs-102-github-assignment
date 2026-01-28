public class partC {
    public static void findMin(int[] arr) {
        int min = 999999999;
        

        for(int i = 0; i < arr.length; i++){
            if( arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }

    public static void findMax(int[] arr) {
        int max = -1;
        
        

        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: " + max); 
    }
}

