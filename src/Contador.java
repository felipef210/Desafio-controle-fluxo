import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1 parametro: ");
        int parametro_um = input.nextInt();

        System.out.print("Digite o 2 parametro: ");
        int parametro_dois = input.nextInt();

        try {
            contar(parametro_um, parametro_dois);
        }

        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro parametro deve ser menor que o segundo");
        }

        input.close();
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if(p1 > p2)
          throw new ParametrosInvalidosException();

        else {
            int contagem = p2 - p1;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
}
