package com.servlet.adminoper;

import com.javabean.jdbc.*;
import com.javabean.adminoper.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javabean.guestoper.Guest;
import com.javabean.jdbc.UserDao;

/**
 * Servlet implementation class AdminDownload
 */
@WebServlet("/AdminDownload")
public class AdminDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDownload() {
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
		ArrayList<Admin> array=new ArrayList<Admin>();
		
		
		try
		{
			String name1=request.getParameter("username");
			System.out.println(name1);
			String pwd1=request.getParameter("password");
	String sql="select * from admin_in where adminname="+"'"+name1+"'";//注意sql的书写，引用不了，只能通过引号操作
		/*	String sql="select * from guest_in where name=name1";*/
		
		array=UserDao.QueryAdmin(sql);
		if(array.get(0).getAdminpwd().equals(pwd1))
		{
			HttpSession session=request.getSession();
			session.setAttribute("admin", name1);
			request.getRequestDispatcher("AdminIndex.jsp").forward(request,response);
			
		}
		else
		{
			System.out.println("登录失败");
			response.sendRedirect("AdminMatchFaild.jsp");
		}
		}catch(Exception e)
		{
			System.out.println("登录异常");
			response.sendRedirect("AdminUserNameFaild.jsp");
		}
		
	}

}
