package exercicios;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade (km/h): ");
        double velocidade = sc.nextDouble();

        System.out.print("Tempo (horas): ");
        double tempo = sc.nextDouble();

        double distancia = velocidade * tempo;

        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo da viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
    }
}
