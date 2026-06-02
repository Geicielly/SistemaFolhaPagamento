public class FuncionarioComissionado extends FuncionarioPadrao {
    private final double valorVendas;
    private final double percentualComissao;

    public FuncionarioComissionado(int matricula, String nomeCompleto, double valorVendas, double percentualComissao) {
        super(matricula, nomeCompleto);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
        
    }

    public double calcularComissao() {
        return valorVendas * percentualComissao / 100.0;
    }


    @Override
    public String getTipo() {
        return "Funcionario comissionado";

    }

    @Override
    public double calcularSalarioFinal() {
        return SALARIO_BASE + calcularComissao();
   
    }


 @Override public String toString(){
    return "Nome: " + getNomeCompleto()+ "\t\tMatricula " + getMatricula() + 
    "\t\tSalario Fixo: R$ " + SALARIO_BASE + "\t\tComissão: R$ " + calcularComissao() + "\t\tSalário final: R$ "+ calcularSalarioFinal();

 }
}