class FRUIT {
 String color, taste; double price;
 FRUIT(){ this("Unknown"); }
 FRUIT(String color){ this(color,"Unknown"); }
 FRUIT(String color,String taste){ this(color,taste,0); }
 FRUIT(String color,String taste,double price){ this.color=color; this.taste=taste; this.price=price; }
 void display(){ System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price); }
}
public class Week8_5_FruitConstructorChaining {
 public static void main(String[] args) {
  new FRUIT().display(); new FRUIT("Red").display(); new FRUIT("Yellow","Sweet").display(); new FRUIT("Green","Sour",45).display();
 }
}
