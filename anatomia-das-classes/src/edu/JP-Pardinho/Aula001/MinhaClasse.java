import java.util.*;

public class MinhaClasse {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        String nome1, nome2;

        System.out.print("Digite o primeiro nome: ");
        nome1 = scan.nextLine();
        System.out.print("Digite o segundo nome: ");
        nome2 = scan.nextLine();

        System.out.println(nomeCompleto(nome1, nome2));

    }  

    public static String nomeCompleto (String primeiroNome, String Sobrenome){
        return primeiroNome.concat(" ").concat(Sobrenome);
    }
}

