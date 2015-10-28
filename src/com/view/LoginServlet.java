package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bov.dto.Account;
import com.jdbcwork.DataBaseOperater;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
				{
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				HttpSession session = request.getSession(true);
				session.setAttribute("sinan", username);
				session.setAttribute("somevalue", password);
				
				try {
					Account act=DataBaseOperater.getAccount(1);
					act.getAccountNumberOne();
				   session.setAttribute("accountNumber",act.getAccountNumberOne());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.getc
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/welcomeUser.jsp");
				if (rd != null)
				   rd.forward(request,response); 
				
				}
	}

}
