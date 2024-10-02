import java.util.Scanner;
public class Atv_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de carros ?");
        int carros = scanner.nextInt();


        double[] notas = new double[carros];
        double somaNota=0;
        int carrosBemAvaliados =0;
        int carrosMalAvaliados =0;

        for(int i = 0; i < carros; i++) {
            System.out.println("Como você avalia o carro " + (i+1) + ":");
            notas[i] = scanner.nextDouble();
            if (notas[i] > 10 || notas[i] < -1){
                System.out.println("Insira uma nota entre 0 e 10");
                i--;
            }
        }

        for (int i = 0; i < carros; i++) {
            somaNota += notas[i];
            if (notas[i] >= 6){
                carrosBemAvaliados++;
            } else if (notas[i] <= 6) {
                carrosMalAvaliados++;
            }

        }

        System.out.println("A média foi de " + (somaNota/ carros));
        System.out.println("E " + carrosBemAvaliados + " foram avaliados como bons");
        System.out.println("e " + carrosMalAvaliados + " foram avaliados como ruins");
    }
}