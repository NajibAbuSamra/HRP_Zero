package hrp.da;

import java.sql.SQLException;
import java.util.ArrayList;

import hrp.model.Country;
import hrp.model.Customer;
import hrp.model.Organization;
import hrp.model.Project;
import hrp.model.Project_oc;

public interface DataInterface {

	public ArrayList<Customer> getCustomers() throws SQLException;
	
	public ArrayList<Country> getCountries() throws SQLException;
	
	public ArrayList<Organization> getOrganizations() throws SQLException;
	
	public ArrayList<Project> getProjectsByCustomerId(int id) throws SQLException;
	
	public ArrayList<Integer> getProjectOrgConIdsByProjectId(int projectID) throws SQLException;
	
	public ArrayList<Integer> getProjectUpdateIdByProjectId(int projectID) throws SQLException;
	
	public Project_oc getPredictionByProjectId(int projectid) throws SQLException;

	void closeConnection() throws SQLException;

	


	
}
