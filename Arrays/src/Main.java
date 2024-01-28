import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Create array
        int[] nums = new int[10];
        //2. inout values from user
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<nums.length;i++){
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            nums[i] = value;
        }
        //3. output created  array
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //4. find maximum value
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        //5. output maximal value
        System.out.println("Maximal value is: " + max);

    }
}