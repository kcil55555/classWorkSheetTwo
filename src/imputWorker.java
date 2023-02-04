import java.util.Scanner;
public class imputWorker {
        int workerID, number;
        double salary;
        String firstName, lastName, answer;
        public imputWorker( String lastName,double salary2,String firstName,int workerID){
            this.workerID = workerID;
            this.lastName = lastName;
            this.salary = salary;
            this.firstName = firstName;
         }
         public double workerID (){
            return workerID;
            
         }
         public String lastName (){
            return lastName;
         }
         public double salary (){
            Scanner scanner = new Scanner (System.in);
            System.out.println(salary);
            System.out.println("want to give a raise");
            answer = scanner.nextLine();
            if (answer .equals ("yes")){
            return salary * number;
         }
            return salary;
    }
         public String firstName(){
             return firstName;
         }
} 