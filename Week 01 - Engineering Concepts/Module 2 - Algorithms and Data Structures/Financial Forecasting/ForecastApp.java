import java.util.*;
import java.time.*;

public class ForecastApp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int currentYear=LocalDateTime.now().getYear();

        System.out.print("Enter initial investment amount (₹): ");
        double initialAmount=sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate=sc.nextDouble();

        System.out.print("Enter target year: ");
        int targetYear=sc.nextInt();

        if(targetYear<currentYear) 
            System.out.println("Entered Target year is not wrong.");

        else if(initialAmount<0) 
            System.out.println("Intitial amount cannot be -ve");

        else
        {
            double result=RecurssivePrediction(targetYear,currentYear,initialAmount,growthRate);
            System.out.printf("Forecasted value in %d is ₹%.2f \n",targetYear,result);
        }

        sc.close();
    }

     //  RecurssivePrediction() takes user entered input such as Both current and target year, Rate and Amount
    //  BaseCase : currentYear== targetYear returns amount
    // Else it decrement year by 1 and divides rate /100 

    public static double RecurssivePrediction(int targetYear,int currentYear,double amount,double rate) 
    {
        if(targetYear==currentYear) 
            return amount;

        return RecurssivePrediction(targetYear - 1,currentYear,amount,rate)*(1+rate/100);
    }
}
