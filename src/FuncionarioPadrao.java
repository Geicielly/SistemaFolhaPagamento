public class FuncionarioPadrao {
    public static final double SALARIO_BASE = 2000.00;

    private final int matricula;
    private final String nomeCompleto;

    public FuncionarioPadrao(int matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTipo() {
        return "Funcionário Padrão";
    }
       
    public double calcularSalarioFinal() {
        return SALARIO_BASE;
    }

    protected void exibirDadosEspecificos() {
        System.out.println("Adicional: nenhum");
    }
  
    
 @Override public String toString(){
    return "Nome: " + nomeCompleto + "\tMatricula " + matricula + 
    "\tSalario Fixo: R$ " + SALARIO_BASE + "\tExtras: 0.0 " + "\t\tSalário final: R$ "+ calcularSalarioFinal();
 }

}