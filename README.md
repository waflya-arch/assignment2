This project is a Transportation Management System written in Java. The main goal of the assignment is to demonstrate the basic principles of object-oriented programming (OOP): inheritance, abstraction, encapsulation, and polymorphism.

How the program is structured:

Abstraction and inheritance: At the center of the system is the abstract class Vehicle. We're not just creating a "vehicle"; we're creating specific types: Car, Motorcycle, and Truck. They all inherit common features (brand and year) from the main class, but add their own unique details (for example, the number of doors or the presence of a sidecar).

Driver Relationships (Composition and Aggregation): The program has a Driver class. We've linked it to cars so that each car has its own driver, and a single person can drive multiple vehicles.

Polymorphism in Action: In the main file, Main.java, we create an array in which we store all our cars, motorcycles, and trucks. Using a single loop, we make them all "start their engines." Even though the loop code is the same, each machine reacts differently: the truck roars powerfully, while the car starts quietly.

Short conclusion (Reflection):

Inheritance greatly simplified the work: I didn't have to write the code for "brand" and "year" four times—I wrote it once in the main class. Overriding methods allowed each machine to behave uniquely. The main challenge was setting the protected modifier correctly so that child classes could see the shared data while remaining protected from outside interference.

How to run:

Enter the following in the console: javac *.java java Main