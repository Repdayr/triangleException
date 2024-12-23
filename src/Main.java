import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,a2,b1,b2,c1,c2;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        double a = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2));
        double b = Math.sqrt(Math.pow(b1, 2) + Math.pow(b2, 2));
        double c = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        if ((a > b + c) | (b > a + c) | (c > a + b)){
            throw new NotATriangle("правило неравенства трегульника");
        }

    }
}

