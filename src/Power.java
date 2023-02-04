import java.util.Scanner;

public class Power {
    Scanner scanner = new Scanner(System.in);
    int m_exponent, m_number, m_otherNumber ;
    int number, exponent, otherNumber, i;
    public Power (int number, int exponent){
        m_exponent = exponent;
        m_number = number;
    
    }
        public int power() {
        System.out.println("what is the first number");
        number = scanner.nextInt();
        System.out.println("what is the exponent");
        exponent = scanner.nextInt();
        otherNumber = number;
        while (i < exponent){
            number = number * otherNumber;
            i++;
        }
        return number;
    }
}