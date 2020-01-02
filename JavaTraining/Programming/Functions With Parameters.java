//Make my function accept values from the outside.
//In java variable name and type of the parameter are part of function declaration.

public static void displayPerimeter(int length, int width) {
    int perimeter = 2 * (length + width);
    System.out.println(perimeter); // -> depends on the values of length and width
}

//Parameters are variables listed in the function declaration that are specified inside () by the name and type. 
displayPerimeter(10, 11); // -> 42
 displayPerimeter(2, 2); // -> 8

//Each value is assigned to a parameter in the order they are defined. (Lenght, Width)
//Parameters are the input the function needs in order to operate.

public static void VariableName(TypeData Parameter, DataType Parameter){ 
  //Functionality here

ParameterName (InputOne,InputTwo); //Define parameters

}
