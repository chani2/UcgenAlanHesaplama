import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur     
        int a, b, c, i;

        Scanner inp = new Scanner(System.in);
        System.out.print("A kenari:");
        a = inp.nextInt();
        System.out.print("B kenari:");
        b = inp.nextInt();
        System.out.print("C kenari:");
        c = inp.nextInt();
        int u = (a+b+c)/2;
        double alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));
        System.out.print(alan);












    }
}
