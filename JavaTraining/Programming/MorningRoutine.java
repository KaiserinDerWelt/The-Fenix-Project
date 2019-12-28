
public class MorningRoutine {
	public static void main(String[] args) 
	{
		TodoList myTodoList = new TodoList("My morning routine"); // Instantiate object
		myTodoList.addTask("Wake up at 7am");
		myTodoList.addTask("Shower at 7.15");
		myTodoList.addTask("Have breakfast at 7.45");
		myTodoList.addTask("Work at home");
		myTodoList.display();
	}
}

