import java.util.Scanner;
//I know I want input from the user, so I import the scanner.
import java.util.HashSet;
//I had trouble adding stuff to my array. So now I'm going to use a HashSet
public class ToDoList {
            //let's define some variables in the class.
//	String[] toDoList = [];
//	 static String toDoList[]={/*nothing in here = array with no elements*/};
	
	public static void main(String[] args) {
		HashSet<String> toDoList = new HashSet<String>();
		
		
		
		
		//Let's put the scanner in. I forgot to write System.in
		Scanner scan = new Scanner(System.in);
//		ToDoList toDoList =new ToDoList;
        System.out.println("Type something to get started on your todo list:");
//        toDoList+=scan.nextLine();
//          toDoList.add(scan.next());
            toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);
          System.out.println("Type something to get started on your todo list:");  
          toDoList.add(scan.nextLine());
          System.out.println("To do list:" + toDoList);

	}

}
