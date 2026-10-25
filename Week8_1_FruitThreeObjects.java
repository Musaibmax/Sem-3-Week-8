class FRUIT {
 String color, taste; double price;
 void display() { System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price); }
}
public class Week8_1_FruitThreeObjects {
 public static void main(String[] args) {
  FRUIT f1=new FRUIT(); f1.color="Red"; f1.taste="Sweet"; f1.price=120;
  FRUIT f2=new FRUIT(); f2.color="Yellow"; f2.taste="Sweet"; f2.price=80;
  FRUIT f3=new FRUIT(); f3.color="Green"; f3.taste="Sour"; f3.price=60;
  f1.display(); f2.display(); f3.display();
 }
}
