import java.util.Scanner;
class Switchcon
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("fryday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("enter the number between 1 to 7");

		}

	}
}