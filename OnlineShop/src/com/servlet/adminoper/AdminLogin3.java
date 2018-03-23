package com.servlet.adminoper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabean.jdbc.UserDao;

/**
 * Servlet implementation class AdminLogin3
 */
@WebServlet("/AdminLogin3")
public class AdminLogin3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin3() {
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
		String name=request.getParameter("firstname");
		
		String pri=request.getParameter("pri");
		
		String pwd1=request.getParameter("password");
		String pwd2=request.getParameter("repassword");
		if(pwd1.equals(pwd2))
		{
			String sql="insert into admin_in(adminname,adminpwd,promission)values("
		+"'"+name+"','"+pwd1+"',"+pri+")";
			
	int n=UserDao.Insert(sql);
	if(n==0)
	{
		response.sendRedirect("AdminLoginFaild.jsp");
	}
	else
	{
		response.sendRedirect("AdminIndex.jsp");
	}
	
		}
		else
		{
			response.sendRedirect("AdminLoginPwdFaild.jsp");
		}
	}	

}
