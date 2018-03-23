package com.servlet.guestoper;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javabean.jdbc.UserDao;

import java.util.*;
/**
 * Servlet implementation class AddShoppingList
 */
@WebServlet("/AddShoppingList")
public class AddShoppingList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddShoppingList() {
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
		String name;
		String value;
		request.setCharacterEncoding("utf-8");
		
		int sum=0;
		int i=0;
		ArrayList<String> product=new ArrayList<String>();
		ArrayList<String> price=new ArrayList<String>();
		HttpSession session=request.getSession();
product=(ArrayList<String>)session.getAttribute("product");
price=(ArrayList<String>)session.getAttribute("price");




int n=3;
for(i=0;i<price.size();i++)
{
	String guest=(String)session.getAttribute("guest");
	String p1=product.get(i);
	String pr1=price.get(i);
String sql="insert into guest_product_in(name,productname1,productprice1)values('"
+guest+"','"+p1+"','"+pr1+"')";

 n=UserDao.Insert(sql);

		
}

if(n==1)
{
	System.out.println("插入成功");
	response.sendRedirect("shoppingList.jsp");
}
else
{
	System.out.println("插入失败");
	response.sendRedirect("index.jsp");
}
	}
}
