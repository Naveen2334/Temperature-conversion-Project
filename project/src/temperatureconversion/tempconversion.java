package temperatureconversion;
import java.util.Scanner;


public class tempconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to temp conversion system");
		System.out.println("1.The convert celsious to farenhite");
		System.out.println("2.the conversion the farenhite to celisious");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		
		while(choice) {
			case1:
			{
			System.out.println("enter the value you want to convert");
			double x =sc.nextDouble();
			double farenhite = (1.8*x)+32;
			System.out.println("the converted result"+farenhite);
			
			}
		break;
		case2:
		{
			System.out.println("enter the value you want to convert");
			double z =sc.nextDouble();
			double celcious = (z-32)/1.8;
			System.out.println("the converted result"+celcious);
		}
		break;
		default:
		{
			System.out.println("not valid input");
		}
		}
		
				
		

	}

}
