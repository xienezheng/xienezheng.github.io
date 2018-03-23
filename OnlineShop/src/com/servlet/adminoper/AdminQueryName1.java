package com.servlet.adminoper;
import com.javabean.adminoper.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javabean.guestoper.Guest;
import com.javabean.jdbc.JdbcCon;
import com.javabean.jdbc.UserDao;

/**
 * Servlet implementation class AdminQueryName1
 */
@WebServlet("/AdminQueryName1")
public class AdminQueryName1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminQueryName1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			request.setCharacterEncoding("utf-8");
		Connection conn=JdbcCon.getConnection();

		Admin admin=new Admin();
		ArrayList<Admin> user1=new ArrayList<Admin>();


String name=request.getParameter("querynameadmin1");
		String sql="select * from admin_in where adminname='"+name+"'";
System.out.println(name);
		user1=UserDao.QueryAdmin(sql);
	
		HttpSession session=request.getSession();
		session.setAttribute("nameadmin", user1);
		request.getRequestDispatcher("AdminNameQueryAdminDisplay.jsp").forward(request,response);
		
		}catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}
	
	}



