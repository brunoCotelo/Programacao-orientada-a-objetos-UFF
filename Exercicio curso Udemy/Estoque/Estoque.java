import javax.swing.*;

public class Estoque{
  String nome;
  double price;
  int quantity;

  public double TotalValueInStock(){
    return price * quantity;
  }
  public void AddProducts(int add){
    this.quantity += add;
  }
  public void RemoveProducts(int remove){
    this.quantity -= remove;
  }
  public void Update(){
    System.out.printf("\nUptaded data: %s,$ %2f, %d units, Total: $ %2f", nome, price, quantity, TotalValueInStock());
  }
}