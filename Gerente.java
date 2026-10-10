public class Gerente extends Funcionario {
    
    private int quantidadeGerenciados;

    public Gerente(String nome,String cpf,double salarioBase, int quantidadeGerenciados) {

        super(nome, cpf,salarioBase);
        this.quantidadeGerenciados = quantidadeGerenciados;

    }

    @Override 
    public double calcularSalario() {

        return  getSalarioBase() + 1000+(100*quantidadeGerenciados);

    }
    public void adicionarQuantidadeGerenciados(int quantidade) {

        this.quantidadeGerenciados +=quantidade;

    }
    public void removerQuantidadeGerenciados(int quantidade) {

        this.quantidadeGerenciados -= quantidade;

    }
    public int getQuantidadeGerenciados() {

        return this.quantidadeGerenciados;

    }
    @Override
    public String toString() {

        return super.toString() + "\nSubordinados: %d \nSalário com bonus de gerência: %.2f R$".formatted(getQuantidadeGerenciados(),calcularSalario());

    }
}
