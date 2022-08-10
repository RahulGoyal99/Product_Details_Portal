package com.business;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int P_id = Integer.parseInt(request.getParameter("P_id"));
		String P_name = request.getParameter("P_name");
		int P_qty = Integer.parseInt(request.getParameter("P_qty"));
		int Price = Integer.parseInt(request.getParameter("Price"));
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("P_id", P_id);
		session.setAttribute("P_name", P_name);
		session.setAttribute("P_qty", P_qty);
		session.setAttribute("Price", Price);
		out.print("<a href='Display.jsp'>View Record</a>");

	}

}
