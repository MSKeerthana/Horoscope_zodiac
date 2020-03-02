package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Astrozone_entervalues;
import service.AstrozoneCalculator;

///**
// * Servlet implementation class AstroZoneController
// */
@WebServlet(urlPatterns = {"/astrozone"})
public class AstroZoneController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sub = request.getParameter("submit");
		if (sub != null) {
			System.out.println("redirecting");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/entervalues.jsp");
			rd.forward(request, response);
		}

	}
}
