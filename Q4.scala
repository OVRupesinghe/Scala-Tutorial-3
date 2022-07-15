package Assignment2

object Q4 extends App {
  def bookPrice(x:Int):Double = x * 24.95;
  def discount(amount:Double):Double = amount * 0.4;
  def shipping_cost(x:Int):Double = {
    if (x>50)
      return 50*3 + 0.75*(x-50);
    else
      return 50*3;
    
  }
  def cost(x:Int):Double = bookPrice(x)+shipping_cost(x)-discount(x);
  println("Cost for 60 books: " + cost(60));
}