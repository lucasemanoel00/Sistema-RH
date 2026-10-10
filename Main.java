import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    //Cotacao com base no dia 09/10/2026

    private static final double COTACAO_DOLAR = 0.20;
    private static final double COTACAO_EURO = 0.18;
    private static final double COTACAO_YUAN = 1.34;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List <Funcionario> Funcionarios = new ArrayList<>();
        

        int escolha;
        do {

            System.out.println("Digite [1] para cadastrar o funcionario \nDigite [2] para ver a lista \nDigite [3] para obter a folha de pagamento \nDigite [0] para sair");
            escolha = sc.nextInt();
            sc.nextLine();


            switch (escolha) {
             
                case 1: {

                    System.out.println("Digite aqui o nome do funcionário:");
                    String nome = sc.nextLine();

                    System.out.println("Digite aqui o CPF do funcionário:");
                    String cpf = sc.nextLine();

                    System.out.println("Digite aqui o salário base dele");
                    double salarioBase = sc.nextDouble();

                    System.out.println("Digite [1] se ela é um gerente \nDigite [2] se ela é um desenvolvedor\nDigite [0] para sair:");
                    int definirCargo = sc.nextInt();
                    sc.nextLine();

                    if (definirCargo == 1) {

                        System.out.println("Quantos funcionários vão ser gerenciados?");
                        int quantidadeGerenciados = sc.nextInt();
                        Funcionarios.add(new Gerente(nome,cpf,salarioBase,quantidadeGerenciados));
                        break;

                    }
                    else if (definirCargo ==2) {
                        
                        System.out.println("Digite a linguagem de programação do desenvolvedor");
                        String linguagemProg = sc.nextLine();
                        System.out.println("Quantas horas extras foram feitas?");
                        double horasExtras = sc.nextDouble();
                        Funcionarios.add(new Desenvolvedor(nome, cpf,salarioBase,linguagemProg,horasExtras));
                        break;

                    }
                    else {

                        System.out.println("Cancelando...");
                        break;

                    }


                }
                case 2: {

                    for(Funcionario mostrar:Funcionarios) {

                        System.out.println(mostrar);
                        

                    }
                    break;
                }
                case 3: {

                    double total = 0;

                    for(Funcionario folhaPagamento:Funcionarios) {

                        total += folhaPagamento.calcularSalario();

                    }

                    System.out.println("Total da folha de pagamento em R$: %.2f".formatted(total));

                    System.out.println("Dejesa converter esta folha pra alguma outra moeda? \nDigite [1] para dolar \nDigite [2] para Euro \nDigite [3] ");
                    int escolha_cotacao = sc.nextInt();
                    switch(escolha_cotacao) {

                        case 1: {

                            double total_dolar = total*COTACAO_DOLAR;
                            System.out.println("Total da folha de pagamento em U$D: %.2f".formatted(total_dolar));
                            break;
                        
                        }
                        case 2: {

                            double total_euro = total*COTACAO_EURO;
                            System.out.println("Total da folha de pagamento em Euro: %.2f".formatted(total_euro));
                            break;

                        }
                        case 3: {

                            double total_yuan = total*COTACAO_YUAN;
                            System.out.println("Total da folha de pagamento em Yuan: %.2f".formatted(total_yuan));
                            break;

                        }
                        case 0: {

                            System.out.println("OK! saindo...");
                            break;

                        }


                    }
                    
                    break;
                }

                    
            }


         }while(escolha !=0);

        



    }

}
