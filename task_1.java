package internSavy;
import java.util.*;
class temperature
{
	double f,c;
	public temperature()     //constructor to initialise f and c
	{
		f=0.0;
		c=0.0;
	}
	double fahrenheit(double c)   //method which calculates fahrenheit temperature
	{
		return  ((9*c)/5)+32;
	}
	
	double celcius(double f)      //method which calculate celcius temperature
	{
		return  (f-32)*5/9;
	}
}
public class task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******temperature conversion tool that allow users to convert temperature\r\n"
				+ "from fahrenheit to celsius and vice versa.******");
		double f,c;
		Scanner sc=new Scanner(System.in);
		temperature temp=new temperature();
		int ch;
		do
		{
			System.out.println("\n\nChoose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	        System.out.println("Enter your choice: "); 
			ch=sc.nextInt();
		switch(ch)
		{
		case 1: 
			System.out.println("\n\nEnter  Celsius temperature");
			c=sc.nextDouble();
			double result=temp.fahrenheit(c);
			System.out.println("Fahrenheit temperature is = "+result);
			break;
			  
		case 2:
			System.out.println("\n\nEnter  Fahrenheit temperature");
			f=sc.nextDouble();
			result=temp.celcius(f);
			System.out.println("Celsius temperature is = "+result);
			break;
			
			  
		default:  System.out.println("please choose valid choice");
		
		}
	
       }while(ch<3);
	}

}
