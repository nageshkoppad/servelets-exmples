package com.net.prime;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,  urlPatterns = {"/primeMinister","/show"})
public class PrimeMinisterServlet extends HttpServlet {
	public PrimeMinisterServlet() {
		System.out.println(getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the server successfully");
		
		String name = req.getParameter("name");
		String country =req.getParameter("country");
		String married = req.getParameter("married");
		String party = req.getParameter("party");
		String age = req.getParameter("age");
		String gender = req.getParameter("gen");
		String period = req.getParameter("period");
		String times = req.getParameter("times");
		
		req.setAttribute("Name", name);
		req.setAttribute("Country", country);
		req.setAttribute("Marriage", married);
		req.setAttribute("Party", party);
		req.setAttribute("Age", age);
		req.setAttribute("Gender", gender);
		req.setAttribute("Period", period);
		req.setAttribute("Times", times);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/success.jsp");
		dispatcher.forward(req, resp);
	}

}

