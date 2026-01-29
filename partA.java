public class PartA {
    public static int[] create(int length){
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++ ){
            numbers[i] = (int)(Math.random()*101);
        }

        return numbers;
    }

}

