package com.javabean.jdbc;
import java.sql.*;
public class JdbcCon {
	private static String DriverName="com.mysql.jdbc.Driver";
	private static String user="root";
	private static String pwd="123456";
	private static String url="jdbc:mysql://localhost:3306/onlineshop?useUnicode=true&characterEncoding=utf-8";
	
	static
	{
		try
		{
			Class.forName(DriverName);
			
		}catch(Exception e)
		{
			System.out.println("驱动注册失败");
		}
	}
	
	public static Connection getConnection()
	{
		
		try
		{
			Connection conn=DriverManager.getConnection(url,user,pwd);
			if(conn==null)
			{
				System.out.println("数据库连接失败");
			}
			else{
				System.out.println("数据库连接成功");
			}
			
			return conn;
		}catch(Exception e)
		{
			System.out.println("数据库连接异常");
		}
		
		return null;
		
	}
	
	
	public static void free(ResultSet rs,Statement stmt,Connection conn)
	{
		try
		{
			if(rs!=null)
			{
			rs.close();	
			}	
		}catch(Exception e)
		{
			
		}
		finally
		{
			try
			{
			if(stmt!=null)
			{
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			}catch(Exception e)
			{
				
			}
			finally
			{
				try
				{
					if(conn!=null)
					{
						conn.close();
					}
				}catch(SQLException e)
					{
						
					}
				}
			}
		}
		
	}
	
	


