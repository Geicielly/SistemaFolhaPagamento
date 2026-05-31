public class FuncionarioProducao extends FuncionarioPadrao {

    private int quantidadePecas;
    private double valorPeca;

public FuncionarioProducao (int matricula, String nomeCompleto, int quantidadePecas, double valorPeca ) {
    super(matricula, nomeCompleto);
    this.quantidadePecas = quantidadePecas;
    this.valorPeca = valorPeca;

}

public double calcularProducao (){
    return valorPeca * quantidadePecas;

}
public String getTipo(){
    return "Funcionário Produção";
}

public double calcularSalarioFinal (){
    return SALARIO_BASE + calcularProducao();


}

@Override public String toString(){
    return "Nome: " + getNomeCompleto()+ "\tMatricula " + getMatricula() + 
    "\tSalario Fixo: R$ " + SALARIO_BASE + "\tProdução: R$ " + calcularProducao() + "\t\tSalário final: R$ "+ calcularSalarioFinal();

 }

}
