package com.servlet.guestoper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabean.jdbc.UserDao;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
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
		String name=request.getParameter("name");
		String suggestion=request.getParameter("message");
		System.out.println(suggestion);
		try
		{
			String sql="insert into suggestion(name,suggestion)values("
					+"'"+name+"','"+suggestion+"')";
						
				int n=UserDao.Insert(sql);
		}
		catch(Exception e)
		{
			
		}finally
		{
			request.getRequestDispatcher("ContactSuccesss.jsp").forward(request,response);
		}
		
		
	}

}
