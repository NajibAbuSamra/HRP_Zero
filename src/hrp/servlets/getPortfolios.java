package hrp.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import hrp.da.DataAccess;
import hrp.model.Portfolio;

/**
 * Servlet implementation class GetPortfolios
 */
@WebServlet("/getPortfolios")
public class getPortfolios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPortfolios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logger logger = Logger.getLogger("GetPortfolios servlet");
		logger.log(Level.INFO, "doGet: Start...");
		DataAccess da = new DataAccess();
		logger.log(Level.INFO, "DA ready");
		ArrayList<Portfolio> portfolios = null;
		try {
			portfolios = da.getPortfolios();
		} catch (SQLException e) {
			logger.log(Level.INFO, "doGet: DA THREW EXCEPTION");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			e.printStackTrace();
			return;
		}
		String json = new Gson().toJson(portfolios);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8"); //NOTE: the json body is valid and does not have \u0000 in it, if chrome/else gives display issues solve in angular/js
		response.getWriter().write(json);
		logger.log(Level.INFO, "doGet: End...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
