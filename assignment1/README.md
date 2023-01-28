Methods ->

Implement a class Calculator with the method mentioned below. 
Method Description
findAverage()
Calculate the average of three numbers
Calculate the average of four numbers
Calculate the average of five numbers
Return the average rounded off to two decimal digits
​​​​Test the functionalities using the provided Tester class. 

Hint:  For round-off to two decimal digits:

double num1 = 65, num2 = 175;
double num3 = num1/num2;
System.out.println(Math.round(num3*100.0)/100.0);

// 678.90876 -> 67890.876 -> 67891 ->  678.91
![Screenshot (235)](https://user-images.githubusercontent.com/56465452/215254921-c054a660-fd79-4d94-8b97-08886a5c35d9.png)


Inheritance :

Create a class called Vehicle. Create subclasses Truck, Bus and Car. Add common methods  in the base class and specific methods in the corresponding subclasses. Create a class called Road and create objects for  Truck, Bus and Car and display the appropriate messages. Also, in the Vehicle class constructor, initialise the variables colour, no of wheels and model. Give appropriate values for these variables from the invoking subclass.  
![image](https://user-images.githubusercontent.com/56465452/215255123-44e1b1e5-c5ba-4036-9183-e6322c0e7e59.png)
![image](https://user-images.githubusercontent.com/56465452/215255136-aa14e11c-8863-43e0-aa3c-99b58b2cf9f3.png)

Create a class called Inventory in a package stock. This class has data members called quantity and lowOrderLevelQuantity. Two classes that inherit from this class -Accessories and Laptops, are in package called material. The lowOrderLevelQuantity for laptops is 3, while lowOrderLevelQuantity for Accessories is 5. Apart from these members, Accessories and Laptops also have members describing them and a unique id.


Create 5 laptops and 10 Accessories  objects. The quantity member must add up accordingly in the individual classes.
Create an Order class and have customers place orders. If the ordered quantity is available then Invoice should be generated. If the quantity is below lowOrderLevelQuantity then a RequestForMaterial (RFM) must be generated.
![image](https://user-images.githubusercontent.com/56465452/215283996-008a0df9-00de-49b7-8a66-b59d47f2edb2.png)
![image](https://user-images.githubusercontent.com/56465452/215284018-044f9bfa-959c-4f08-9fb8-c44fa9bfe94a.png)

