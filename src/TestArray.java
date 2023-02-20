public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = {5,11,7,12,75,33,58,42,27,86};
        double average = sum/ numbers.length;


        for (int i =0; i<numbers.length; i++){
            sum +=numbers[i];
            average = sum/ numbers.length;

        }
        System.out.println("The total sum of the values in the array is: "+sum);
        System.out.println("The average sum of the values in the array is: "+average);

    }
}
