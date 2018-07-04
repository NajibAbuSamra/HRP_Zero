package hrp.da;

import java.sql.SQLException;
import java.util.ArrayList;

import hrp.model.Customer;

public interface DataInterface {

	public ArrayList<Customer> getCustomers() throws SQLException;
	
	public ArrayList<Integer> getProjectOrgConIdsByProjectId(int projectID) throws SQLException;
	
	public ArrayList<Integer> getProjectUpdateIdByProjectId(int projectID) throws SQLException;

	void closeConnection() throws SQLException;
	
}
