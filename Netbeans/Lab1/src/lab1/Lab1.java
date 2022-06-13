package lab1;

public class Lab1 {

  public static void main(String[] args) {
    Coordenador coordenador = new Coordenador("Ferraz", 1548, "Sexo" );
    coordenador.setSalario(10000);
    coordenador.imprime();
    Gerente gerente = new Gerente("Leo Panqueca", 6969, 90000, "Lamborghini");
    Dependente dependente0 = new Dependente("Carol", 23);
    gerente.addDep(dependente0);
    gerente.imprime();
    Funcionario funcionario = new Funcionario("Cotelo");
    funcionario.setSalario(25000);
    Dependente dependente = new Dependente("Tiago", 20);
    funcionario.addDep(dependente);
    Dependente dependente2 = new Dependente("Thalita");
    funcionario.addDep(dependente2);
    funcionario.imprime();
    Departamento departamento = new Departamento("Sexoshow");
    departamento.addFunc(funcionario);
    departamento.addFunc(coordenador);
    departamento.addFunc(gerente);
    departamento.imprime();
  }
}
