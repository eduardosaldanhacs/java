import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, media;
        
        System.out.print("Informe a nota 1: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Informe a nota 2: ");
        nota2 = scanner.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
        
        scanner.close();
    }
}