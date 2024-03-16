import java.util.*;

class Person{
    int age;
    int weight;
    String name;


    public Person(int age, int weight, String name){
	this.age = age;
	this.weight = weight;
	this.name = name;
    }

    public int lengthName(){
	return name.length();
    }




}


class Car{
    String brand;
    String manufactuer;
    int gasMileage;
    int price;

    public Car(String brand, String manufactuer, int gasMileage, int price){
	this.brand = brand;
	this.manufactuer = manufactuer;
	this.gasMileage = gasMileage;
	this.price = price;
    }

    public int getPrice(){
	return price;
    }

}

class App{
    public static void main(String[] args){
	System.out.println("I love when a dommy mommy rings me out");
	Person p1 = new Person(24,145,"vedolf");
	System.out.println("Length of vedolf is " + p1.lengthName());
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(95);
	list.add(999);
	list.add(420);
	for(int i: list){
	    System.out.println(i);
	}
	System.out.println("Test: " + Collections.max(list));
	System.out.println("Min Test: " + Collections.min(list));
	Plane plane = new Plane(54,"Boeing","Coke");
	System.out.println("Eligible: " + plane.getbool());
	System.out.println("I have a big cock");
	Car car = new Car("lol", "Honda", 500,259000);
	System.out.println("The price of the car is " + car.getPrice());
	if(car.getPrice() > 125000){
	    String string = "This is not affordable, sorry";
	    System.out.println(string);
	    System.out.println(string.length());
	}

	
    }

}
