import java.util.Scanner;

public class UsaContaPolimorfa {
    public static void main(String[] args) {
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Qual opção voce deseja?");
        System.out.println("1 - criar nova conta");
        System.out.println("2 - sair do menu");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1 :
                System.out.println("Qual tipo de conta vc deseja criar?");
                System.out.println("1 - criar comum");
                System.out.println("2 - criar conta especial");
                System.out.println("3 - criar poupança");
                int novaOpcao = scan.nextInt();
                switch(novaOpcao){
                    case 1 ->
                        c = new Conta(105, "Warlla");
                    case 2 ->
                        c = new ContaEspecial(105, "Damiana", 500);
                    case 3 ->
                        c = new ContaPoupanca(105, "Aly" );
                    default ->
                        System.out.println("numero invalido");
                }
          }
    }
}