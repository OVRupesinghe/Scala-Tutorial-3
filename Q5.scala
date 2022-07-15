package Assignment2

object Q5 extends App{
  
  def easy(x:Int):Int = x*8;
  def tempo(x:Int):Int = x*7;
  println("I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km) and 2 km at easy pace again to reach home.");
  println("My running time is " + (easy(2) + tempo(3) + easy (2)));
}