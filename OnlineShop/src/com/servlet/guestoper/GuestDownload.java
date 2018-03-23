package com.servlet.guestoper;
import com.javabean.jdbc.*;
import javax.servlet.http.HttpSession;
import com.javabean.guestoper.*;
import java.sql.*;
import java.util.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestDownload
 */
@WebServlet("/GuestDownload")
public class GuestDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestDownload() {
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
		request.setCharacterEncoding("utf-8");
		ArrayList<Guest> array=new ArrayList<Guest>();
		
		
		try
		{
			String name1=request.getParameter("username");
			System.out.println(name1);
			String pwd1=request.getParameter("password");
	String sql="select * from guest_in where name="+"'"+name1+"'";//注意sql的书写，引用不了，只能通过引号操作
		/*	String sql="select * from guest_in where name=name1";*/
		
		array=UserDao.QueryGuest(sql);
		if(array.get(0).getPwd().equals(pwd1))
		{
			HttpSession session=request.getSession();
			session.setAttribute("guest", name1);
			request.getRequestDispatcher("cart.jsp").forward(request,response);
			
		}
		else
		{
			System.out.println("登录失败");
			response.sendRedirect("GuestMatchFaild.jsp");
		}
		}catch(Exception e)
		{
			System.out.println("登录异常");
			response.sendRedirect("GuestUserNameFaild.jsp");
		}
		
	}

}
