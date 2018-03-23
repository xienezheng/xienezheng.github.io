package com.servlet.guestoper;
import java.sql.*;

import com.javabean.guestoper.*;

import java.util.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javabean.jdbc.*;
/**
 * Servlet implementation class GuestQueryName
 */
@WebServlet("/GuestQueryName")
public class GuestQueryName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestQueryName() {
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

		Guest guest=new Guest();
		ArrayList<Guest> user1=new ArrayList<Guest>();


String name=request.getParameter("querynameguest");
		String sql="select * from guest_in where name='"+name+"'";
System.out.println(name);
		user1=UserDao.QueryGuest(sql);
		System.out.println(user1.get(0).getName());
		HttpSession session=request.getSession();
		session.setAttribute("nameguest", user1);
		request.getRequestDispatcher("AdminNameQueryGuestDisplay.jsp").forward(request,response);
		
		}catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}

}
