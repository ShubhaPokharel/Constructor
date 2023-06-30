# Constructor

 - Constructors are used to initialize the data.

   ## Rules to Declare a Constructor:

   1 - Constructor name and class name must be same.

   2 - Constructor can not return the value.
   

   3 - Constructors can have the arguemnts( known as Parameterized Constructor).
   
   
   
   4 - Constructors can not have the arguemnts( known as 0 argument Constructor).


   Example:

   class Test{

      // 0 argument Constructor

      Test(){
 
        logics
       }

      // 1 argument Constructor

      Test(int num){

          logics
       }
   }

   If you dont give any Constructor, the compiler will generate the default constructor. The default constructor is generated by the compiler. It
   has 0 arguments with empty implementations. They are executed when the object is created.

   Example of Default Constructor:

   class Test{

      // Default constructor

      Test(){

        empty impl
       }
        void wish(){
            System.out.println("Good Morning");
       }

        public static void main(String[] args){
              Test t = new Test();
               t.wish();
         }
   }

   We can call local variables with in the method, constructor or blocks.

During object creation, initialize the data using Constructors. The data will go in the Constructor arguemnts. But the arguments are local variables. So, we assign the local data into the Instance variables. You can access the Instance variables with in the class.



- 'this' keyword, which is used inside the constructor, represents the current class.



  Note:

  1 . Constructors are used to initialize the data.

  2. Methods are used to write the logics of the application.
 
  3. Variables is used to store the data.
 
  4. this keyword represents the current class object.
 

- Instance variables, every object is seperate when memory is created.

- Static variales, all objects are stored in one memory.


Dont give permission to the static variables because all objects will be affected if we change the value.

It is not recommanded to allow modifications to the Static variables.

If we use the final keyword in a variables, no modifications are allowed.



Example:
   
class Emp{
//instance variables

int eid;

String ename;

double esal;

public static String company = "pnc";

public static String location = "USA";


Emp(int eid,String ename, double esal ){

 // assign the local data in the instance data

 this.eid = eid;
 
 this.ename = ename;
 
 this.esal = esal;
 
}

 void status(){
 

   if(esal > 8000){
   
     System.out.println("Good employee");
    
     System.out.println(eid + " " + ename + " " + esal + " " + Emp.company + " " + Emp.location);
    
   }
   
   else{
   
    System.out.println("Very Good employee");
    
    System.out.println(eid + " " + ename + " " + esal + " " + Emp.company + " " + Emp.location);
    
   }
   
  }
  
  public static void main(String[] args){
  
    Emp e1 = new Emp(4444, "Shubha", 4444.44,"pnc", "USA");
    
    e1();

    Emp e2 = new Emp(2222, "Sushil", 1295.16, "pnc", "USA");
    e2.status();
  }
  
 } 

   
