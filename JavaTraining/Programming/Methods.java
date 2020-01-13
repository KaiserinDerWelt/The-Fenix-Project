/*Methods are functions inside of a class*/

class MyClass{
 int A;
 int B;
 int C;
 
   public static void MyValues(){
    A= 12;
    B= 24;
    C= 36;
           }
}

/*To use this methods is necessary to intanciate it:*/

MyClass myclass= new MyClass();

/*Then is possible to call the method:  InstanceVariableName.methodName();*/

myclass.ChangeValues();
