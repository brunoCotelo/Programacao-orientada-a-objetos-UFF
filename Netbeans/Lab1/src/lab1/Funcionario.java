package lab1;

public class Funcionario {

  private double salario;
  private String nome; // Exercício: crie os métodos get e set para
  private int matricula; // nome e matrícula também
  public static final int MAX_DEP = 10;
  Dependente[] dependentes = new Dependente[MAX_DEP];
  char letra = (char) 12345678;

  public Funcionario(int matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;
  }

  protected Funcionario(String nome) {
    this(1234, nome);
  }

  protected double getSalario() {
    return salario;
  }

  protected void setSalario(double salario) {
    this.salario = validaSalario(salario);
  }

  protected String getNome() {
    return nome;
  }

  protected void setNome(String nome) {
    this.nome = nome;
  }

  protected int getMatricula() {
    return matricula;
  }

  protected void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  protected static final double SALARIO_MINIMO = 380.0;
  protected static final double SALARIO_PRESIDENTE = 24000.0;

  private double validaSalario(double salario) {
    if (salario > SALARIO_PRESIDENTE) {
      return SALARIO_PRESIDENTE; // sem mensagem de erro ou log
    } else if (salario < SALARIO_MINIMO) {
      return SALARIO_MINIMO;
    }
    return salario;
  }

  protected void addDep(Dependente d) {
    for (int i = 0; i < this.dependentes.length; i++) {
      if (dependentes[i] == null) {
        dependentes[i] = d;
        return;
      }
    }
  }
  

  public void imprime() {
    System.out.printf("O nome do funcionario é %s\nA matricula é %d\nO salario é R$%.2f\n", this.getNome(), this.getMatricula(), this.getSalario());
    System.out.println("Os dependentes são: ");
    for (Dependente dependente : this.dependentes) {
      if (dependente != null) {
        System.out.println(dependente.toString());
      } else {
        return;
      }
    }
  }
}
