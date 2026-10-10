public class Desenvolvedor extends Funcionario {
    
    private double horasExtras;
    private String linguagemProg;
    
    public Desenvolvedor(String nome,String cpf,double salarioBase,String linguagemProg,double horasExtras) {

        super(nome, cpf,salarioBase);
        this.linguagemProg = linguagemProg;
        this.horasExtras = horasExtras;

    }
    @Override 
    public double calcularSalario() {

        return getSalarioBase() + (horasExtras*50);

    }
    public double getHorasExtras() {

        return this.horasExtras;

    }
    public double adicionarHorasExtras(double horasExtras) {

        this.horasExtras += horasExtras;
        return this.horasExtras; 

    }
    public double removerHorasExtrar(double horasExtras) {

        if (horasExtras >0 && horasExtras<=this.horasExtras){
        this.horasExtras -= horasExtras;
        return this.horasExtras;
        }
        return 0;
}
    @Override 
    public String toString() {

        return super.toString() +"\nHoras Extras: %.2f \nLinguagem de programação: %s\nSalário com horas extras: %.2f R$".formatted(getHorasExtras(),getLinguagemProg(),calcularSalario());

    }
    public void setLinguagemProg(String linguagemProg) {

        this.linguagemProg = linguagemProg;

    }
    public String getLinguagemProg() {

        return this.linguagemProg;

    }

}
