package com.vastika.UserManagement.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import com.vastika.UserManagement.enums.OperationTypeEnum;
import com.vastika.UserManagement.model.User;
import com.vastika.UserManagement.service.UserService;
import com.vastika.UserManagement.service.UserServiceImpl;

public class UserController
{
	public static void main(String[]args)
	{
		UserService userservice=new UserServiceImpl();
		String decisions="no";
		do
		{
			String operation=JOptionPane.showInputDialog("Enter operation: save|Update|delete|list|get");
			switch(operation)
			{
			case "save":
				User savedUser=getUser(OperationTypeEnum.SAVE.name());
				int saved=userservice.saveUser(savedUser);
				if(saved >=1)
				{
					JOptionPane.showMessageDialog(null,"user info is saved in db");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"OOPs! wrong. some error in db");

				}
				break;
			case "update":
				User updatedUser=getUser(OperationTypeEnum.UPDATE.name());
				int updated=userservice.updateUser(updatedUser);
				if(updated >=1)
				{
					JOptionPane.showMessageDialog(null,"user info is updated in db");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"OOPs! wrong. some error in db");

				}
				break;
			case "delete":
				int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
				int deleted= userservice.deleteUser(id);
				if(deleted >=1)
				{
					JOptionPane.showMessageDialog(null,"user info is deleted from db");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"OOPs! wrong. some error in db");

				}
				break;
			case "list":
				userservice.getAllUser().forEach(user ->{
					System.out.println("User id is: "+user.getId());
					System.out.println("User name is: "+user.getUsername());
					System.out.println("User password is: "+user.getPassword());
					System.out.println("User mobile no is: "+user.getMobileNo());
					System.out.println("User salary is: "+user.getSalary());
					System.out.println(" is user enabled?: "+user.isEnable());
					
					System.out.println("Dob is: "+user.getDob());
					System.out.println("=============================================");

				});
				break;
			case "get":
			    id=Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
				User user=userservice.getUserById(id);
				System.out.println("User id is: "+user.getId());
				System.out.println("User name is: "+user.getUsername());
				System.out.println("User password is: "+user.getPassword());
				System.out.println("User mobile no is: "+user.getMobileNo());
				System.out.println("User salary is: "+user.getSalary());
				System.out.println(" is user enabled?: "+user.isEnable());
				System.out.println("Dob is: "+user.getDob());

				System.out.println("=============================================");
				break;
				
			}
			decisions=JOptionPane.showInputDialog("Do you want to continue? yes|no");
		}
		while(decisions.equalsIgnoreCase("yes"));
	}
	public static User getUser(String type)
	{
		User user= new User();
		if(type.equalsIgnoreCase("update"))
		{
			int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id"));
			user.setId(id);;
		}
		String username=JOptionPane.showInputDialog("Enter userame: ");
		String password=JOptionPane.showInputDialog("Enter password: ");
		double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter Salary: "));
		Long mobileNo=Long.parseLong(JOptionPane.showInputDialog("Enter mobile no: "));
		boolean enable=Boolean.parseBoolean(JOptionPane.showInputDialog("is user enabled?: "));
		String dob=JOptionPane.showInputDialog("Enter dob: format=> yyyy-MM-dd");
		LocalDate ld=LocalDate.parse(dob,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		user.setUsername(username);
		user.setPassword(password);
		user.setMobileNo(mobileNo);
		user.setSalary(salary);
		user.setDob(ld);
		user.setEnable(enable);
		return user;
		





		
	}
}
