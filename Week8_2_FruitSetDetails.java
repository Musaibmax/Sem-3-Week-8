class FRUIT {
 String color, taste; double price;
 void setDetails(String c,String t,double p){ color=c; taste=t; price=p; }
 void display(){ System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price); }
}
public class Week8_2_FruitSetDetails {
 public static void main(String[] args) {
  FRUIT fruit=new FRUIT(); fruit.setDetails("Orange","Citrus",90); fruit.display();
 }
}
