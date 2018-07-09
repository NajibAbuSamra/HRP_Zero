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
import hrp.model.Customer;
import hrp.model.Project;

/**
 * Servlet implementation class getProjects
 */
@WebServlet("/getProjectsByCustomerId")
public class getProjectsByCustomerId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getProjectsByCustomerId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logger logger = Logger.getLogger("getCountries servlet");
		logger.log(Level.INFO, "doPost: Start...");
		DataAccess da = new DataAccess();
		logger.log(Level.INFO, "DA ready");
		ArrayList<Project> projects = null;
		Gson gson = new Gson();
		Customer c = null;
		try {
			StringBuilder sb = new StringBuilder();
			String s;
			while ((s = request.getReader().readLine()) != null) {
				sb.append(s);
			}

			c = (Customer) gson.fromJson(sb.toString(), Customer.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (c == null) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return;
		}
		try {
			projects = da.getProjectsByCustomerId(c.getId());
			da.closeConnection();
		} catch (SQLException e) {
			logger.log(Level.INFO, "doGet: DA THREW EXCEPTION");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			e.printStackTrace();
			return;
		}
	    response.addHeader("Access-Control-Allow-Origin", "*"); 
	    response.addHeader("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS"); 
	    response.addHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With"); 
		String json = new Gson().toJson(projects);
	
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8"); //NOTE: the json body is valid and does not have \u0000 in it, if chrome/else gives display issues solve in angular/js
		response.getWriter().write(json);
		
		logger.log(Level.INFO, "doPost: End...");
	}

}
