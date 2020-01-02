//Reference types are also called pointers as they point to the object, but not the object itself.

public class Car {
    String color = "red"; 
}
Car car = new Car();
Car carToPaint = car;

public class Car {
    String color = "red" 
    
}
Car car = new Car();
Car carToPaint = car; 
System.out.println(car.color); // -> red 
System.out.println(carToPaint.color); // -> red
carToPaint.color = "yellow";
System.out.println(car.color); // -> yellow 
System.out.println(carToPaint.color); // -> yellow

/*This is something you'll need to pay attention to with parameters of functions.
When you pass reference types as parameters, all modifications you perform
on them within those functions modify the original objects:*/

class Car {
    String color = "red"; 
    
}
public void paint( Car car, String color) { 
    car.color = color; 
}

Car car = new Car(); 
System.out.println(car.color); // -> red
paint(car, "green"); 
System.out.println(car.color); // -> green 
