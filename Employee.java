//Solution for Lab_EmailApplication_problemstatement

package set1;

import java.util.Random;
import java.util.Scanner;

public class Employee {

	static String firstName, lastName;
	static String department = null;


	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args) {

		int choice = 1;
		Employee e = new Employee("Khushboo", "Tygi");

		while(choice!=0) {

			System.out.println("\n\nPlease enter the department from the following\n"
					+ "1.Technical\n" + "2.Admin\n" +"3.Human resource\n" + "4.Leagal\n");

			Scanner s = new Scanner(System.in);
			choice = s.nextInt();


			switch(choice){ 
			
			case 0:
				break;
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "Legal";
				break;
			default:
				System.out.println("please enter correct choice");
				break;
			}

			credentialService(firstName,lastName,department);

		}
	}

	static private void credentialService(String firstName, String lastName, String department){
		String email = null;
		String password = null;

		System.out.println("Dear Khushboo your generated credentials are as follows\n");

		email = generateEmail(firstName,lastName,department);
		password = generatePassword(8);

		System.out.println("Email = "+email);
		System.out.println("Password = "+password);
	}


	static String generatePassword(int len) {

		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
				+"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}





	static private String generateEmail(String firstName, String lastName, String department){
		String email = null;

		email = firstName+"."+lastName+"@"+department+"."+"consyosoft"+".com";

		return email;
	}

}



