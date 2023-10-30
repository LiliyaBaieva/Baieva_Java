import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TasksForQA {
  public static void main(String[] args) throws IOException {

    //TASK 1

//    If the entered number is greater than 7, then print “Hello”
    isSeven(); //1.1

//    If the entered name matches “John”, then output “Hello, John”,
//    if not, then output "There is no such name"
    isEqualsJohn(); //1.2

//    There is a numeric array at the input, it is necessary to output array elements
//    that are multiples of 3
    multiply3asList(); //1.3

  }

  public static void isSeven() throws IOException {
    BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter your number: ");

    int enteredNumber = Integer.parseInt(reder.readLine());
    if(enteredNumber > 7){
      System.out.println("Hello");
    }
  }

  public static void isEqualsJohn() throws IOException {
    BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter your name: ");

    String name = reder.readLine();
    if (name.equals("John")) {
      System.out.println("Hello, " + name);
    } else {
      System.out.println("There is no such name");
    }
  }

  public static void multiply3asList() throws IOException {
    BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the size of array: ");
    int sizeArray = Integer.parseInt(reder.readLine());

    List<Integer> numArray = new ArrayList<>();

    for(int i = 0; i < sizeArray; i++){
      numArray.add(Integer.parseInt(reder.readLine()));
    }

    System.out.print("The result is: ");

    for (int i = 0; i < numArray.size(); ++i) {
      if(numArray.get(i) % 3 == 0){
        System.out.print("[" + numArray.get(i) + "] ");
      }
    }
  }

}

// TASK 2

//  Answer the questions
//    Given bracket sequence: [((())()(())]]
//    Can this sequence be considered correct?
//    If the answer to the previous question is “no”,
//    then what needs to be changed in it to make it correct?

// The correct might be [( (()) () (()) )], we open array, and we look inside if bracket
// is opened it must be closed.