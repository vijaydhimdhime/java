Abstraction in Java | Abstract Class, Example

Abstraction in Java is another OOPs principle that manages complexity. It is a process of hiding complex internal implementation details from the user and providing only necessary functionality to the users.

In other words, abstraction in Java is a technique by which we can hide the data that is not required to a user.

It hides all unwanted data so that users can work only with the required data. It removes all non-essential things and shows only important things to users.

That is, every user will get the required data and will not get confused with unnecessary data.

Let’s take some realtime examples to understand the concept of java abstraction.

Realtime Examples of Abstraction in Java
1. Let’s first take ATM machine as a real-time example. We all use an ATM machine for cash withdrawal, money transfer, retrieve min-statement, etc. in our daily life.

But we don’t know internally what things are happening inside ATM machine when you insert an ATM card for performing any kind of operation.

Realtime example of abstraction in Java
2. Let’s understand another real-time example. A car owner knows how to drive it. He knows about various components of car and how to use them.

For example, a car owner knows that the accelerator pedal is used to increase the speed of car, and pressing the brake pedal stops it.

To perform these simple actions, you only need to know how to use these components but not need to know how they function.

3. When you need to send SMS from your mobile, you only type the text and send the message. But you don’t know the internal processing of the message delivery.

4. A bank clerk can see the customer details like name, account number, and balance amount in the account. But he cannot see sensitive data such as staff salaries, profit or loss of the bank, interest amount paid by the bank, and loan amounts, etc.

Such data are hidden (abstracted) from the clerk. When the bank manager requires knowing this data, it will be provided to the manager.

Thus, there are lots of such important things in real life that show abstraction. Similarly, happens in Java OOPs.

You only need to call the specific classes or methods to implement specific program logic, but you don’t know how these classes or methods function. This concept is known as abstraction in java.

How to achieve Abstraction in Java?
There are two ways to achieve or implement abstraction in java program. They are as follows:

Abstract class (0 to 100%)
Interface (100%)
Let’s understand each way and learn how to implement it in Java program.

Abstract Class in Java
An abstract class in Java is a class, which is declared with an abstract keyword. It is just like a normal class but has two differences.


1. We cannot create an object of this class. Only objects of its non-abstract (or concrete) sub-classes can be created.
2. It can have zero or more abstract methods which are not allowed in a non-abstract class (concrete class). Classloader class is a good example of an abstract class that does not have any abstract methods.

Java Abstract class makes programming more flexible by providing scopes to write abstract method in subclasses of the abstract class.

Key points:

1. Abstract is a non-access modifier in java which is applicable for classes, interfaces, methods, and inner classes. It represents an incomplete class that depends on subclasses for its implementation. Creating subclass is compulsory for abstract class.

2. A non-abstract class is sometimes called a concrete class.

3. An abstract concept is not applicable to variables.

When to use Abstract class in Java?
An abstract class can be used when we need to share the same method to all non-abstract subclasses with their own specific implementations.

Moreover, the common member of the abstract class can also be shared by the subclasses. Thus, abstract class is useful to make the program more flexible and understandable.

Abstract Method in Java
A method that is declared with abstract modifier in an abstract class and has no implementation (means no body) is called abstract method in java. It does not contain any body.

Abstract method has simply a signature declaration followed by a semicolon. It has the following general form as given below:

Syntax:
    abstract type MethodName(arguments); // No body
For example:
   abstract void msg(); // No body.
Since the abstract method does not contain any body. Therefore, it is also known as incomplete method in java.

Key point:

1. A concrete method is a method which has always the body. It is also called a complete method in java.

When to use Abstract method in Java?
There are the following uses of abstract method in Java. They are as follows:

1. An abstract method can be used when the same method has to perform different tasks depending on the object calling it.

2. A method can be used as abstract when you need to be overridden in its non-abstract subclasses.

Let’s understand the uses of abstract class and abstract method with the help of an example program.

When we write anything in a class, it is applicable to all its objects. If a method is defined in a class, it is available to all objects of a class.

For example, suppose a class MyTest that contains a method calculate() that calculates addition of a given two numbers.

If you create three objects to this class, all three objects will get a copy of this method and from any object, we can call this method. Here, the requirement of all objects is the same, i.e. to calculate addition of two numbers.

Now, our requirement is changed. We want the first object calculates addition, the second object calculates subtraction, and the third object calculates multiplication.



Since calculate() method has to perform three different tasks depending on the object. In such a case, how will write calculate() method in MyTest?
If we declare three methods like add(), sub(), and multiply() in MyTest, all three methods will be available for all three objects which are not advisable.

To solve this problem, we will use an abstract class and abstract method. We will declare calculate() method as abstract, it will not have any body within it.

Now, we will derive three subclasses like Addition, Subtraction, and Multiplication from class MyTest where in each subclass, we will provide a method body for calculate() method so that it can calculate different operations such as add, subtract, and multiply.

In this way, we will implement the same abstract method in three subclasses as per the requirement of objects and can perform different tasks.

We can also create objects of subclasses, and respective method can be called using these objects. The hierarchy is shown in the below figure:

When to use Abstract class in Java

Let’s create a program where abstract class MyTest has one abstract method which will be various implementations in sub classes.

Program code 1:

package com.abstraction; 
public abstract class MyTest 
{ 
  abstract void calculate(int a, int b); // No body. 
 } 
public class Addition extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int x = a + b; 
    System.out.println(“Sum: ” +x); 
   } 
} 
public class Subtraction extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int y = a - b; 
    System.out.println(“Subtract: ” +y); 
  } 
} 
public class Multiplication extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int z = a * b; 
    System.out.println(“Multiply: ” +z); 
  } 
} 
public class MyClass 
{ 
 public static void main(String[] args) 
 { 
   Addition a = new Addition(); 
   Subtraction s = new Subtraction(); 
   Multiplication m = new Multiplication(); 
    
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 
  } 
}
Output: 
       Sum: 50 
       Subtract: 5 
       Multiply: 200
As you can observe in the above example, the requirement of every object has been fulfilled. Hope that you will have understood the applications of abstract class and abstract method in Java program.

Features of Abstract class in Java
There are following important features of abstract class in Java that should be kept in mind. They are as follows:

1. Abstract class is not a pure abstraction in java.

2. In Java, object creation is not possible for an abstract class because it is a partially implemented class, not fully implemented class.

3. It can be abstract even with no abstract method.

4. It can have one or more abstract methods or non-abstract methods (or concrete methods) or a combination of both methods.

5. Abstract class allows to define private, final, static and concrete methods. Everything is possible to define in an abstract class as per application requirements.

6. It can have constructors.

7.  Abstract class does not support multiple inheritance in java but allows in interfaces.

8. It can implement one or more interfaces in java.

Rules of Abstract class in Java
There are the following rules to define an abstract class in Java program. They are as follows:

1. Class must be declared with abstract keyword to make an abstract class.

2. We cannot instantiate an abstract class but we can create object of subclass of the abstract class provided they must implement abstract method.

3. If any method is abstract in a class, the class must be declared as abstract.

4. To use methods declared in an abstract class, the abstract class must be extended by an ordinary class and must implement (override) all abstract methods in that ordinary class.

5. If a new abstract method is added in the abstract class, all non-abstract subclasses which extend that abstract class, must implement the newly added abstract method. If it does not implement all the abstract methods, the class must be declared as abstract.

6. If a new instance method is added in the abstract class, all non-abstract subclass which extends that abstract class, is not necessary to implement newly added instance method.

7. Inside the abstract class, we can create any number of constructors. If you do not create a constructor, the compiler will create a default constructor.

Rules of Abstract method in Java
The rules of abstract method to define in an abstract class are as follows:

1. Abstract method can only be declared in an abstract class.

2. A non-abstract class cannot have an abstract method, whether it is inherited or declared in Java.

3. It must not provide a method body/implementation in the abstract class for which it is defined.

4. Method name and signature must be the same as in the abstract class.

5. The visibility of the method in the subclass cannot be reduced while overriding abstract method.

6. Abstract method cannot be static or final.

7. It cannot be private because the abstract method must be implemented in the subclass. If we declare it private, we cannot implement it from outside the class.

Let’s take some example programs based on these rules to understand the abstract class and abstract method concepts more clearly.

Java Abstract Class Example Programs
1. Let us make a program where we will try to create an object of abstract class but the compiler will show a compile-time error.

Program code 2:

package com.abstraction; 
public abstract class AbsClass 
{ 
  // No abstract method here. 
} 
// Creating a subclass that inherits Abstract class. 
public class Subclass extends AbsClass 
{ 
 public static void main(String[] args) 
 { 
   AbsClass c = new AbsClass(); // Compile-time error. 
  } 
}
Output: 
        Unresolved compilation problem: Cannot instantiate the type AbsClass
2. Let’s take an example program where an abstract class Hello contains both abstract method and instance method. The abstract method “msg2” will be implemented in Test class that extends a class Hello. Look at the program source code to understand better.

Program code 3:

package com.abstraction; 
public abstract class Hello 
{ 
// Declaration of instance method. 
  public void msg1() 
  { 
    System.out.println("msg1-Hello"); 
  } 
  abstract public void msg2(); 
} 
public class Test extends Hello 
{ 
// Overriding abstract method. 
  public void msg2() 
  { 
    System.out.println("msg2-Test"); 
  } 
public static void main(String[] args)
{ 
// Creating object of subclass Test. 
   Test obj = new Test(); 
    obj.msg1(); 
    obj.msg2(); 
  } 
}
Output: 
       msg1-Hello 
       msg2-Test
In this example program, we have not implemented instance method msg1() in subclass but abstract method msg2() has been implemented (overridden) in the subclass.

3. Let’s make a program where an abstract class can have a data member, constructor, abstract, final, static, and instance method (non-abstract method).

Program code 4:

package com.abstraction; 
public abstract class AbstractClass 
{ 
  int x = 10; // Data member. 
  AbstractClass()
  { 
    System.out.println("AbstractClass constructor"); 
  } 
final void m1()
{ 
   System.out.println("Final method"); 
 } 
void m2()
{ 
   System.out.println("Instance method"); 
 } 
static void m3()
{ 
   System.out.println("Static method"); 
 } 
  abstract void msg(); 
 } 
public class AbsTest extends AbstractClass 
{ 
  AbsTest()
  { 
     System.out.println("AbsTest class constructor"); 
   } 
 void msg()
 { 
    System.out.println("Hello Java"); 
 } 
public static void main(String[] args) 
{ 
   AbsTest t = new AbsTest(); 
    t.msg(); 
    t.m1(); 
    t.m2(); 
    m3(); 
   System.out.println("x = " +t.x); 
  } 
}
Output: 
       AbstractClass constructor 
       AbsTest class constructor 
       Hello Java 
       Final method 
       Instance method 
       Static method 
       x = 10
In this example program, after object creation, the constructor of non-abstract subclass will be called immediately.

In the first line of constructor, internally super will call the constructor of an abstract class. The control of execution will be immediately transferred to the constructor of abstract class.

Therefore, the first output is “AbstractClass constructor”. After executing abstract class constructor, control of execution again comes back to execute subclass constructor. The second output is “AbsTest class constructor”.

Why abstract class has constructor even though we cannot create object?
We cannot create an object of abstract class but we can create an object of subclass of abstract class. When we create an object of subclass of an abstract class, it calls the constructor of subclass.

This subclass constructor has super in the first line that calls constructor of an abstract class. Thus, the constructors of an abstract class are used from constructor of its subclass.

If the abstract class doesn’t have a constructor, a class that extends that abstract class will not get compiled.

Let’s understand this concept with the help of an example program in a better way.

Here, we will create a program where an abstract class Employee contains instance variables, constructor, and concrete method. A subclass Engineer extends abstract class Employee.

Program code 5:

package com.abstraction; 
public abstract class Employee 
{ 
  private String name; 
  private int id; 
 public Employee(String name, int id)
 { 
   this.name = name; 
   this.id = id; 
  } 
// Declaration of concrete method. 
  void m1()
  { 
    System.out.println("Name: " +name); 
    System.out.println("Id: " +id); 
  } 
} 
public class Engineer extends Employee 
{ 
  public Engineer(String name, int id)
  { 
    super(name, id); // This statement is used to call super class constructor. 
  } 
public static void main(String[] args)
{ 
// Creating an object of the subclass of abstract class. 
   Engineer e = new Engineer("Deep", 10202); e.m1(); 
 } 
}
Output: 
       Name: Deep 
       Id: 10202
Now consider the above program. When we have created an object of subclass, it immediately calls Engineer class constructor. In the first line of constructor, super keyword calls the superclass constructor (Employee).

Thus, the superclass constructor is executing when creating an object of subclass. By executing this superclass constructor, JVM is initializing to non-static variables name and id in the abstract class.

Now suppose if an abstract class does not allow to define constructor, in such a case, is it possible to initialize the value of non-static variables in abstract class?

Answer is no because, without object creation of abstract class, we cannot initialize non-static variables. Therefore,  an abstract class allows constructors to initialize variables.

Let us take an example program in which an abstract class reference refers to the subclass objects. Abstract class reference can be used to call methods of the subclass.

Program code 6:

package Abstarctclass; 
public abstract class Identity 
{ 
  abstract void getName(String name); 
  abstract void getGender(String gender); 
  abstract void getCity(String city); 
} 
public class Person extends Identity 
{ 
  void getName(String name) 
  { 
    System.out.println("Name : " +name); 
  } 
void getGender(String gender) 
{ 
  System.out.println("Gender : " +gender); 
} 
void getCity(String city)
{ 
  System.out.println("City: " +city); 
} 
// Newly added method in subclass. 
  void getCountry(String country)
  { 
    System.out.println("Country: " +country); 
   } 
 } 
public class Mainclass 
{ 
  public static void main(String[] args) 
  { 
// Declaring abstract class reference equal to subclass objects. 
    Identity i = new Person(); 
     i.getName("DEEPAK"); 
     i.getGender("MALE"); 
     i.getCity("DHANBAD"); 
  // i.getCountry("INDIA"); // Compile-time error because we cannot access newly added method in subclass using superclass reference. 
  } 
}
Output: 
       Name: DEEPAK 
       Gender: MALE 
       City: DHANBAD
In the preceding example program, we created abstract class reference that refers to its subclass object. Using superclass reference, we are accessing all methods of subclass in the main() method except newly added method in the subclass.

But if it is possible to access all the members of subclasses by creating objects of subclass, then why should we need to create reference to superclass.

Why should we create reference to superclass (abstract class reference)?
We should create a reference of the superclass to access subclass features because superclass reference allows only to access those features of subclass which have already declared in superclass.

If you create an individual method in subclass, the superclass reference cannot access that method. Thus, any programmer cannot add their own additional features in subclasses other than whatever is given in superclass.

Advantage of Abstract class in Java
The main advantages of using abstract class in java application are as follows:

Abstract class makes programming better and more flexible by giving the scope of implementing abstract methods.
Programmers can implement an abstract method to perform different tasks depending on the need.
We can easily manage code.
Hope that this tutorial has covered almost all important points related to abstraction an