package fr.epsi.router;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.controller.ProduitController;

public class ProduitServlet extends HttpServlet 
{
	ProduitController controller = new ProduitController();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		if (req.getParameter("action").equals("List")) {
			
			req.setAttribute("listProduit", controller.findByPrix());
			this.getServletContext().getRequestDispatcher("WEB-INF/pages/produitsList.jsp").forward(req, resp);
		} else if(req.getParameter("action").equals("create")) {
			this.getServletContext().getRequestDispatcher("WEB-INF/pages/produitCreate.jsp").forward(req, resp);
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException
	{
		if(req.getParameter("actionPost").equals("formUpdate")) {
			controller.update();
		} else if (req.getParameter("actionPost").equals("formCreate")) {
			controller.create();
		}
	}
	
}
