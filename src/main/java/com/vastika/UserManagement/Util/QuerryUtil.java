package com.vastika.UserManagement.Util;

public class QuerryUtil 
{
	public static final String SAVE_SQL="insert into user_tbl(user_name,password,"
			+ "mobile_no,dob,enable,salary)values(?,?,?,?,?,?)";
	public static final String UPDATE_SQL="update user_tbl set user_name=?,"
			+ "password=?,mobile_no=?,dob=?,enable=?,salary=? where id=?";
	public static final String DELETE_SQL="delete from user_tbl where id=?";
	public static final String LIST_SQL="select * from user_tbl ";
	public static final String GET_BY_ID_SQL="select * from user_tbl where id=?";
	
	

}
