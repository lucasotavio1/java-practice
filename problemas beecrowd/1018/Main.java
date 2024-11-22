import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(n);
        for (int i = 0; i < notas.length; i++){
            int quantidade = n/notas[i];
            n = n % notas[i];
            System.out.println(quantidade + " nota(s) de R$ " + notas[i] + ",00");
        }
        scanner.close();
    }
}