package com.vastika.UserManagement.model;

import java.time.LocalDate;

public class User
{
	private int id;
	private String username;
	private String password;
	private long mobileNo;
	private double salary;
	private boolean enable;
	private LocalDate dob;
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public boolean isEnable()
	{
		return enable;
	}
	public void setEnable(boolean enable)
	{
		this.enable = enable;
	}
	public LocalDate getDob()
	{
		return dob;
	}
	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}
	
}
