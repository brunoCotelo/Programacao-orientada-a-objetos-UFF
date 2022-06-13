package lab1;

public class Departamento {

  private String nome;
  public static final int MAX_FUNC = 50;
  Funcionario[] vetFuncionario = new Funcionario[MAX_FUNC];

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void addFunc(Funcionario f) {
    for (int i = 0; i < this.vetFuncionario.length; i++) {
      if (vetFuncionario[i] == null) {
        vetFuncionario[i] = f;
        return;
      }
    }
  }

  public Departamento(String nome) {
    this.nome = nome;
  }

  public void imprime() {
    System.out.println("O nome do departamento é: " + this.nome);
    System.out.println("Os funcionarios do dpt são: ");
    for (Funcionario funcionario : this.vetFuncionario) {
      if (funcionario != null) {
        System.out.println(funcionario.getNome());
        System.out.printf("Lista de dependentes de %s: ", funcionario.getNome());
        for (Dependente dependente : funcionario.dependentes) {
          if (dependente != null) {
            System.out.println(dependente.toString());
          }
        }
      } else {
        return;
      }
    }
  }
}
