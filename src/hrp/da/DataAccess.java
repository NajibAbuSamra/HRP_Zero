package hrp.da;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;



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
}
