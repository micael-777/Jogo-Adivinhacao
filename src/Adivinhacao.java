import java.util.Scanner;
public class Adivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int palpite = 0;

        System.out.println("Vamos tentar adivinhar um número de 1 a 100.");

        while (palpite != numeroSecreto) {
            System.out.println("Digite um número: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("VOCÊ ACERTOU!!");
            }
        }
        scanner.close();
    }}