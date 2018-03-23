package com.servlet.adminoper;
import com.javabean.productlist.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javabean.adminoper.Admin;
import com.javabean.jdbc.JdbcCon;
import com.javabean.jdbc.UserDao;

/**
 * Servlet implementation class AdminQueryList1
 */
@WebServlet("/AdminQueryList1")
public class AdminQueryList1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminQueryList1() {
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

		ProductInfor pro=new ProductInfor();
		ArrayList<ProductInfor> user1=new ArrayList<ProductInfor>();


String name=request.getParameter("namelist");
		String sql="select * from guest_product_in where name='"+name+"'";
System.out.println(name);
		user1=UserDao.QueryList(sql);
	
		HttpSession session=request.getSession();
		session.setAttribute("namelist", user1);
		request.getRequestDispatcher("AdminNameQueryListDisplay.jsp").forward(request,response);
		
		}catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}

}
