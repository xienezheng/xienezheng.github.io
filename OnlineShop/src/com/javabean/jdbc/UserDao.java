package com.javabean.jdbc;
import com.javabean.guestoper.*;
import com.javabean.productlist.*;
import com.javabean.adminoper.*;
import java.sql.*;
import java.util.*;
public class UserDao {
	
	public static int Insert(String sql)
	{
		Connection conn=null;
		Statement stt=null;
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			int n=stt.executeUpdate(sql);
			System.out.println("插入"+n+"行");
			return n;
		}catch(Exception e)
		{
			System.out.println("插入失败");
		}
		finally
		{
			JdbcCon.free(null, stt, conn);
		}
		
		return 0;
	}
	
	
	
	public static int Delete(String sql)
	{
		Connection conn=null;
		Statement stt=null;
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			int n=stt.executeUpdate(sql);
			System.out.println("删除"+n+"行");
			return n;
		}catch(Exception e)
		{
			System.out.println("删除失败");
		}
		finally
		{
			JdbcCon.free(null, stt, conn);
		}
		return 0;
	}
	
	
	
	public static int Update(String sql)
	{
		Connection conn=null;
		Statement stt=null;
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			int n=stt.executeUpdate(sql);
			System.out.println("更新"+n+"行");
			return n;
		}catch(Exception e)
		{
			System.out.println("更新失败");
		}
		finally
		{
			JdbcCon.free(null, stt, conn);
		}
		return 0;
	}
	
	
	
	public static ArrayList<Guest> QueryGuest(String sql)
	{
		ArrayList<Guest> user1=new ArrayList<Guest>();
		Connection conn=null;
		Statement stt=null;
		ResultSet rs=null;
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			rs=stt.executeQuery(sql);
		while(rs.next())
		{
			Guest user=new Guest();
			user.setName(rs.getString(1));
			user.setAddress(rs.getString(2));
			user.setPwd(rs.getString(3));
			user.setTel(rs.getString(4));
			user.setSex(rs.getString(5));
			
			user1.add(user);
			
			
		}
		return user1;
		}catch(Exception e)
		{
			System.out.println("查询失败");
		}
		finally
		{
			JdbcCon.free(rs, stt, conn);
		}
		return null;
	}

	
	
	
	
	public static ArrayList<Admin> QueryAdmin(String sql)
	{
		ArrayList<Admin> admin1=new ArrayList<Admin>();
		Connection conn=null;
		Statement stt=null;
		ResultSet rs=null;
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			rs=stt.executeQuery(sql);
		while(rs.next())
		{
			Admin admin=new Admin();
			admin.setAdminname(rs.getString(1));
			admin.setAdminpwd(rs.getString(2));
			admin.setPromission(rs.getInt(3));
			
			
			
			
			admin1.add(admin);
			
			
		}
		return admin1;
		}catch(Exception e)
		{
			System.out.println("查询失败");
		}
		finally
		{
			JdbcCon.free(rs, stt, conn);
		}
		return null;
	}
	
	
	public static ArrayList<ProductInfor> QueryList(String sql)
	{
		ArrayList<ProductInfor> pro=new ArrayList<ProductInfor>();
		Connection conn=null;
		Statement stt=null;
		ResultSet rs=null;
		
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			rs=stt.executeQuery(sql);
		while(rs.next())
		{
			ProductInfor p=new ProductInfor();
			p.setName(rs.getString(1));
			p.setProductname1(rs.getString(2));
			p.setProductprice1(rs.getString(3));
			
			
			
			
			pro.add(p);
			
			
		}
		return pro;
		}catch(Exception e)
		{
			System.out.println("查询失败");
		}
		finally
		{
			JdbcCon.free(rs, stt, conn);
		}
		return null;
	}
	
	
	
	public static ArrayList<Suggestion> QuerySuggestion(String sql)
	{
		ArrayList<Suggestion> pro=new ArrayList<Suggestion>();
		Connection conn=null;
		Statement stt=null;
		ResultSet rs=null;
		
		try
		{
			conn=JdbcCon.getConnection();
			stt=conn.createStatement();
			rs=stt.executeQuery(sql);
		while(rs.next())
		{
			Suggestion p=new Suggestion();
			p.setName(rs.getString(1));
		
			p.setSuggestion(rs.getString(2));
			
			
			
			
			pro.add(p);
			
			
		}
		return pro;
		}catch(Exception e)
		{
			System.out.println("查询失败");
		}
		finally
		{
			JdbcCon.free(rs, stt, conn);
		}
		return null;
	}
	

}
