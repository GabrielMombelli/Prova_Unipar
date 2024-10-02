import java.util.Scanner;
public class Atv_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        int voto = 0;
        int votoTaffe =0;
        int votoRodrigo =0;
        int votoLucas =0;
        int votoAlessandro =0;

        System.out.println("Quantas pessoas irão participar da votação?");
        quantidade = scanner.nextInt();

        for (int i= 0; i < quantidade; i++ ) {
            System.out.println("Por favor, escolha um dos candidatos a seguir para votar:");
            System.out.println("80 - Taffe");
            System.out.println("70 - Rodrigo");
            System.out.println("60 - Lucas");
            System.out.println("50 - Alessandro");
            voto = scanner.nextInt();

            if (voto == 80) {
                votoTaffe++;
            }else if(voto == 70){
                votoRodrigo++;
            }else if(voto == 60) {
                votoLucas++;
            }else if(voto == 50){
                votoAlessandro++;
            } else{
                System.out.println("Informe um dígito existente");
                i--;
            }

        }

        if (votoTaffe > votoRodrigo && votoTaffe > votoLucas && votoTaffe > votoAlessandro ) {
            System.out.println("Taffe ganhou");
        }
        if (votoRodrigo > votoTaffe && votoRodrigo > votoLucas && votoRodrigo > votoAlessandro) {
            System.out.println("Rodrigo ganhou");
        }
        if (votoLucas > votoTaffe && votoLucas > votoRodrigo && votoLucas > votoAlessandro) {
            System.out.println("Lucas Ganhou");
        }
        if (votoAlessandro > votoTaffe && votoAlessandro > votoRodrigo && votoAlessandro > votoLucas){
            System.out.println("Alessandro ganhou");
        }



        System.out.println("o candidato Taffe teve " + votoTaffe + " votos");
        System.out.println("o candidato Rodrigo teve " + votoRodrigo + " votos");
        System.out.println("o candidato Lucas teve " + votoLucas + " votos");
        System.out.println("o candidato Alessandro teve " + votoAlessandro + " votos");

    }
}