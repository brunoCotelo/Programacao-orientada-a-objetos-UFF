package lab1;

public class Coordenador extends Funcionario{
  private String projeto;
  public Coordenador(String nome, int matricula, String projeto){
    super(matricula, nome);
    this.projeto = projeto;
  }
  public void imprime(){
    super.imprime();
    System.out.println("atributos especiais do cargo: projeto " + projeto); 
  }
}
