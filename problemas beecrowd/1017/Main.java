import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velMedia = scanner.nextInt();
        double distancia = tempo * velMedia;
        double litros = distancia/12;
        System.out.printf("%.3f\n", litros);
        scanner.close();
    }
}