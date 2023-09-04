package com.greatlearning.itsadmin.driver;

import java.util.Scanner;

import com.greatlearning.itsadmin.model.Employee;
import com.greatlearning.itsadmin.service.CredentialService;
import com.greatlearning.itsadmin.service.ICredentialService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ICredentialService service = new CredentialService();
		
		System.out.println("Enter the employee first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the employee last name");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(firstName,lastName);
		
		System.out.println("Please select the employee department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			employee.setDepartment("tech");
			break;
		case 2:
			employee.setDepartment("admin");
			break;
		case 3:
			employee.setDepartment("hr");
			break;
		case 4:
			employee.setDepartment("legal");
			break;	
		}
		 
        if(employee.getFirstName() != null && employee.getLastName() != null  && employee.getDepartment() !=null) {
        	service.generateEmail(employee);
        	service.generatePassword(employee);
        	service.showCredentials(employee);
        }else {
        	System.out.println("Invalid Empoyee Details");
        }
	}

}
