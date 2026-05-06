public class ex10 {}

 void main() {
   Scanner sc = new Scanner(System.in);
   double conta = 0;

    IO.println("Digite 5 notas para saber sua média");
    for(int i = 1 ; i<= 5 ; i++){
        double notas = sc.nextInt();
        conta += notas;

    }
     IO.println("A sua nota final será " + conta /5);
}


