import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Rose Mendes";
        String tipoConta = "Corrente";
        double saldoConta = 2500.00;
        int opcao = 0;

        String mensagem = String.format("""
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                """, nomeCliente, tipoConta, saldoConta);

        String mensagem2 = String.format("""
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """);
        System.out.println(mensagem);

        while (opcao != 4){
            System.out.println(mensagem2);
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    String mensagemSaldo = String.format("O saldo é de R$ %.2f", saldoConta);
                    System.out.println(mensagemSaldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = leitura.nextDouble();
                    saldoConta += valorReceber;
                    String mensagemSaldoAtualizado = String.format("Saldo atualizado R$ %.2f", saldoConta);
                    System.out.println(mensagemSaldoAtualizado);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldoConta) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldoConta -= valorTransferir;
                        mensagemSaldoAtualizado = String.format("Saldo atualizado R$ %.2f", saldoConta);
                        System.out.println(mensagemSaldoAtualizado);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }



    }
}