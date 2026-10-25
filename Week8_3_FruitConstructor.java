class FRUIT {
 String color, taste; double price;
 FRUIT(String color,String taste,double price){ this.color=color; this.taste=taste; this.price=price; }
 void display(){ System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price); }
}
public class Week8_3_FruitConstructor {
 public static void main(String[] args) { FRUIT fruit=new FRUIT("Purple","Sweet",150); fruit.display(); }
}
