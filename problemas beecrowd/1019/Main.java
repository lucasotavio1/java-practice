import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int horas = n/3600;
        n %= 3600;
        int minutos = n/60;
        int segundos = n%60;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        scanner.close();
    }
}