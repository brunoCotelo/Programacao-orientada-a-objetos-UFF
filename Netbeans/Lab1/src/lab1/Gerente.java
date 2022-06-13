package lab1;

public final class Gerente extends Funcionario{
  private double bonus;
  private String carro;
  protected Gerente(String nome, int matricula, double bonus, String carro){
    super(matricula, nome);
    this.bonus = bonus;
    this.carro = carro;
  }
  
  
  public void imprime(){
    super.imprime();
    System.out.println("atributos especiais do cargo: bonus R$" + bonus + " ; Carro: " + carro); 
  }
}
