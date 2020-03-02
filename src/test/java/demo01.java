import java.util.Scanner;

public class demo01 {
    public static int climbStair(int n) {
        if (n <= 2) {
            return n;
        }
        int orderOne = 1;
        int secondOrder = 2;
        int result = 0;
        while (n >= 3) {
            result = orderOne + secondOrder;
            orderOne = secondOrder;
            secondOrder = result;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("请输入台阶数（数量为正整数）:");
        int i = scann.nextInt();
        int result = climbStair(i);
        System.out.println("有" + result + "方法可以登上台阶");
    }
}
