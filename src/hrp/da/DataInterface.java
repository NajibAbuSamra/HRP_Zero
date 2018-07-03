package hrp.da;

import java.sql.SQLException;
import java.util.ArrayList;

import hrp.model.Customer;

public interface DataInterface {

	public ArrayList<Customer> getCustomers() throws SQLException;

	void closeConnection() throws SQLException;
	
}
