import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double vol = (4.0/3) * pi * Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f\n", vol);
        sc.close();
    }
}
