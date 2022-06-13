import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Estoque estoque = new Estoque();
    String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
    estoque.nome = nome;
    double preco = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço da unidade: "));
    estoque.price = preco;
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos tem em estoque:"));
    estoque.quantity = num;
    estoque.Update();
    int add = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos deseja adicionar:"));
    estoque.AddProducts(add);
    estoque.Update();
    int remove = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos deseja remover:"));
    estoque.RemoveProducts(remove);
    estoque.Update();
  }
}