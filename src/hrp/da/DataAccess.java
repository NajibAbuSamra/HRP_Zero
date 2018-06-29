package hrp.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import hrp.model.Portfolio;
import hrp.constants.SQLStatements;



public class DataAccess implements DataInterface{
	private Connection c;

	public DataAccess() {

		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "DataAccess c'tor: attempting connection...");
		c = util.DBUtil.getConnection();
		if (c == null) {
			logger.log(Level.SEVERE, "Connection Failed");
		} else {
			logger.log(Level.INFO, "Connection Established");
		}
	}
	@Override
	public void closeConnection() throws SQLException {
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "DataAccess closing connection");
		if (c != null)
			c.close();
	}
	
	@Override
	public ArrayList<Portfolio> getPortfolios() throws SQLException{
		
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "getPortfolios start...");
		ArrayList<Portfolio> portfolios = new ArrayList<Portfolio>();
		Portfolio port = null;
		PreparedStatement stm = c.prepareStatement(SQLStatements.selectAllPortfolios);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			port = new Portfolio(rs.getInt(DataContract.PortfoliosTable.COL_ID), rs.getString(DataContract.PortfoliosTable.COL_NAME));
			portfolios.add(port);
		}
		logger.log(Level.INFO, "getPortfolios end...");
		return portfolios;
	}
}
