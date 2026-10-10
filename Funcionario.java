public abstract class Funcionario {

    private String nome;
    private String cpf;
    protected double salarioBase;
    protected boolean situacaoAtivaInativa;

    public Funcionario(String nome,String cpf,double salarioBase) {

        this.nome = nome;
        this.cpf = cpf;
        if (salarioBase>0){
        
            this.salarioBase = salarioBase;
        
        }
        else {

            this.salarioBase =0;

        }
        
        this.situacaoAtivaInativa = false;

    }
    public void setNome(String nome) {

        this.nome = nome;

    }
    public void setCpf(String cpf) {

        this.cpf= cpf;

    }
    public void setSalarioBase(double salarioBase) {

            if(salarioBase>0){
                
                this.salarioBase = salarioBase;
        
            }
            else {

                this.salarioBase =0;

            }
    }
    public String getNome() {

        return this.nome;

    }
    public String getCpf() {

        return this.cpf;

    }
    public double getSalarioBase() {

        return this.salarioBase;

    }
    public String getSituacaoAtivaInativa() {

        if (this.situacaoAtivaInativa == true) {

            return "Funcionario %s na ativa".formatted(this.nome);

        }
        return "Funcionario %s desativado".formatted(this.nome);
    }
    public String AtivarFuncionario() {
        
        this.situacaoAtivaInativa = true;
        return "Funcionário %s está ativado".formatted(this.nome);

    }
    public String DesativarFuncionario() {

        this.situacaoAtivaInativa = false;
        return "Funcionario %s desativado".formatted(this.nome);

    }
    public abstract double calcularSalario();

    @Override 
    public String toString() {

        return "Nome: %S \nCPF: %s \nSalario: R$ %.2f".formatted(getNome(),getCpf(),getSalarioBase());

    }



}