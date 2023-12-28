/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SRP_Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        processor();
    }

    private static void processor() {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while(nums.size() < MAX) {
            String input = scan.nextLine();
            if (typeChecking(input) != -1) {
                int num = Integer.parseInt(input);
                if (rangeChecking(num) != -1)
                    nums.add(num);
            }
        }
        scan.close();
        sort(nums);
    }

    private static int typeChecking(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return -1;
        }
        return Integer.parseInt(num);
    }

    private static int rangeChecking(int num){
        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return -1;
        }
        return num;
    }

    private static void sort(List<Integer> setInput) {
        Collections.sort(setInput);
        showedTheResult(setInput);
    }

    private static void showedTheResult(List<Integer> setOutput) {
        for (int i = 0; i < setOutput.size(); i++) {
            System.out.print(setOutput.get(i) + " ");
        }
    }
}