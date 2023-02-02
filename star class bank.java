import java.util.Scanner;

public class star{

    public static void main(String[] args) {
        
        Bank bank = new kotak();
        bank.Rates_of_Interest();

        bank = new icici();
        bank.Rates_of_Interest();
        
        bank = new sbi();
        bank.Rates_of_Interest();
        
        bank = new bob();
        bank.Rates_of_Interest();
    }
}
abstract class Bank{

    Double Rates_of_Interest;

    abstract void Rates_of_Interest();

}

class icici extends Bank{

    void Rates_of_Interest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ICICI Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("ICICI Bank Interest rate = "+(a*2*5/100));
        
    } 
}

class bob extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BOB Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("BOB Bank Interest rate = "+(a*2*5/100));
    } 
}
class sbi extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SBI Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("SBI Bank Interest rate = "+(a*2*5/100));
    } 
}
class kotak extends Bank{
    
    void Rates_of_Interest(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kotak Bank Rate = ");
        Double a = sc.nextDouble();
        System.out.println("Kotak Bank Interest rate = "+(a*2*5/100));
    } 
}
