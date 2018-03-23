package com.servlet.guestoper;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
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
		Enumeration det=request.getParameterNames();
		int sum=0;
		int i=0;
		ArrayList<String> product=new ArrayList<String>();
		ArrayList<String> price=new ArrayList<String>();
		try
		{

		while(det.hasMoreElements())
		{
		name=(String)det.nextElement();
		value=request.getParameter(name);
		
		product.add(name);
		price.add(value);
		sum=sum+Integer.parseInt(value);
		
		
		System.out.println(name);
		}
		
		}catch(Exception e)
		{
			
		}
		HttpSession session=request.getSession();
		session.setAttribute("product", product);
		session.setAttribute("price", price);
		
		Integer sum2=(Integer)sum;
		session.setAttribute("sum", sum2);
		
		
		request.getRequestDispatcher("cart.jsp").forward(request,response);
		

	}

}
