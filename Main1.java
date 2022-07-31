import java.util.Scanner;

public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        return a + b;
    }

}
public class Main1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Solution solution = new Solution();
        int result = solution.aplusb(a, b);
        System.out.println("a + b = " + result);

        scanner.close();
    }
}

