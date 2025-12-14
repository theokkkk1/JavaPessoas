package JavaBasico.Desafios;
import java.util.Scanner;

public class desafioPessoas {
    static void main(String[] args) {
        String[] nomepessoas = new String[100];
        Scanner caixa = new Scanner(System.in);
        int escolhadousuario ;
        int quantidadedepessoas =0;
        do{
            System.out.println("\n===== Menu =====");
            System.out.println("1. Cadastrar Pessoas");
            System.out.println("2. Listar Pessoas cadastradas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolhadousuario = caixa.nextInt();
            switch (escolhadousuario){
                case 1:
                    if (quantidadedepessoas<100){
                    caixa.nextLine();
                    System.out.println("Digite o nome de uma pessoa que você deseja adicionar");
                    String pessoas = caixa.nextLine();
                    nomepessoas[quantidadedepessoas] = pessoas;
                    quantidadedepessoas ++;
                    }
                break;

                case 2:
                    for (int i = 0; i < quantidadedepessoas; i++) {
                        System.out.println(nomepessoas[i]);
                    }
                break;

                case 3:
                    break;

                default:
                    System.out.println("escolha outra opção, essa não é valida");
            }
        } while (escolhadousuario != 3);
        caixa.close();

    }
}
