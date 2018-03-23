package com.servlet.guestoper;
import com.javabean.adminoper.*;
import com.javabean.guestoper.*;
import com.javabean.jdbc.*;
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestLoginUp
 */
@WebServlet("/GuestLoginUp")
public class GuestLoginUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestLoginUp() {
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
		String address=request.getParameter("address");
		String tel=request.getParameter("tel");
		String sex=request.getParameter("gender");
		String pwd1=request.getParameter("password");
		String pwd2=request.getParameter("repassword");
		if(pwd1.equals(pwd2))
		{
			String sql="insert into guest_in(name,address,pwd,tel,sex)values("
		+"'"+name+"','"+address+"','"+pwd1+"','"+tel+"','"+sex+"')";
			
	int n=UserDao.Insert(sql);
	if(n==0)
	{
		response.sendRedirect("GuestLoginFaild.jsp");
	}
	else
	{
		response.sendRedirect("GuestLoginSuccess.jsp");
	}
	
		}
		else
		{
			response.sendRedirect("GuestLoginPwdFaild.jsp");
		}
		
	}

}
