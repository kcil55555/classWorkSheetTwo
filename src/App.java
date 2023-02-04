 import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int workerID = 69420;   
        int number = 0;
        double salary = 45689;
        String lastName = "john";
        String firstName = "nhoj";
        System.out.println("want their first name, last names, workerID or salary");
       imputWorker john = new imputWorker ( lastName, salary,  firstName, workerID);
        System.out.println(john.workerID);
        System.out.println(john. lastName);
        System.out.println(john.firstName);
        System.out.println("current salary is " + salary + " what rais do you want to give them");
        number = scanner.nextInt();
        System.out.println("there new salary is " + john.salary());

        

        }
    }