import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] nums = {5,11,7,12,75,33,58,42,27,86};
        System.out.println("Enter a number of your choice\t");
        int user = Integer.parseInt(read.nextLine());
        boolean truthy = false;

        for(int i = 0; i<nums.length;i++){
            if(user ==nums[i]) {
                //System.out.println("Your number is in the list");
                truthy = true;
            }
        }
        if(!truthy){
            System.out.println("Your number is not in the list");
        }
        else{
            System.out.println("Your number is  in the list");
        }



        }
        }




