import java.util.Scanner;

public class eleição {

    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Hoje será o dia de saber qual candidato será o nosso presidente pelos próximos 4 anos uma decisão crucucial para a comunidade escolar ");
        IO.println("Quantas pessoas irão votar?");
        int quantia = sc.nextInt();
        int voto = 0;

        for (int i = 1; i <= quantia; i++) {
            IO.println(" 1 - Ronaldinho " + "\n " + "2 - Agnaldinho Careca ");
            voto = sc.nextInt();
        }
        int decisao = 0;
        int votor = 0;
        int votoa = 0;
        if (voto == 1) {
            votor += 1;
            IO.println("Ronaldinho recebeu 1 ponto ");
        } else if (voto == 2) {
            votoa += 1;
            IO.println("Agnaldinho recebeu 1 ponto ");

        } else {
            IO.println("Opção invalida");
        }
        if (votor <= votoa) {
        IO.println("O ronaldinho ganhou !!!");
        }else{
            IO.println("O Agnaldinho ganhou !!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        }



        }






