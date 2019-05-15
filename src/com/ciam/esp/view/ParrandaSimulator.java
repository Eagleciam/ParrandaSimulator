package com.ciam.esp.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciam.esp.model.Musico;
import com.ciam.esp.model.Parranda;

/**
 * Servlet implementation class ParrandaSimulator
 */
@WebServlet("/ParrandaSimulator")
public class ParrandaSimulator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParrandaSimulator() {
        super();
        // TODO Auto-generated constructor stub
    }

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Empezando Parranda...");
		Parranda parranda = new Parranda();
		ArrayList<Musico> musicos=parranda.CreateParranda();
		System.out.println("Vamos "+musicos.size()+ " musicos a la parranda");
		System.out.println(parranda.toString());
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
