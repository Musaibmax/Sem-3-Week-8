class FRUIT {
 String color, taste; double price;
 FRUIT(){ color="Unknown"; taste="Unknown"; price=0; }
 FRUIT(String color){ this.color=color; taste="Unknown"; price=0; }
 FRUIT(String color,String taste){ this.color=color; this.taste=taste; price=0; }
 void display(){ System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price); }
}
public class Week8_4_FruitOverloadedConstructors {
 public static void main(String[] args) {
  new FRUIT().display(); new FRUIT("Red").display(); new FRUIT("Yellow","Sweet").display();
 }
}
