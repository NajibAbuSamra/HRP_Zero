package hrp.da;

import java.sql.SQLException;
import java.util.ArrayList;

import hrp.model.Portfolio;

public interface DataInterface {

	public ArrayList<Portfolio> getPortfolios() throws SQLException;

	void closeConnection() throws SQLException;
	
}
