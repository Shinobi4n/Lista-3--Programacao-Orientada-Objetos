import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisaoSegura {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.print("Digite o dividendo: ");
            int v = s.nextInt();

            System.out.print("Digite o divisor: ");
            int d = s.nextInt();

            int resultado = v / d;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Erro: divisão por zero!");

        } catch (InputMismatchException e) {

            System.out.println("Erro: digite apenas números inteiros!");

        } finally {

            System.out.println("Divisão encerrada");

        }

    }

}
