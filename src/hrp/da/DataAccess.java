package hrp.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import hrp.model.Country;
import hrp.model.Customer;
import hrp.model.Organization;
import hrp.model.Project;
import hrp.model.Project_oc;
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
	public ArrayList<Customer> getCustomers() throws SQLException{
		
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "getCustomers start...");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer cust = null;
		PreparedStatement stm = c.prepareStatement(SQLStatements.selectAllCustomers);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			cust = new Customer(rs.getInt(DataContract.CustomersTable.COL_ID), rs.getString(DataContract.CustomersTable.COL_NAME));
			customers.add(cust);
		}
		logger.log(Level.INFO, "getCustomers end...");
		return customers;
	}
	@Override
	public ArrayList<Integer> getProjectOrgConIdsByProjectId(int projectID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Integer> getProjectUpdateIdByProjectId(int projectID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Project_oc getPredictionByProjectId(int projectid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Country> getCountries() throws SQLException{
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "getCountries start...");
		ArrayList<Country> countries = new ArrayList<Country>();
		Country count = null;
		PreparedStatement stm = c.prepareStatement(SQLStatements.selectAllCountries);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			count = new Country(rs.getInt(DataContract.CountriesTable.COL_ID), rs.getString(DataContract.CountriesTable.COL_NAME));
			countries.add(count);
		}
		logger.log(Level.INFO, "getCountries end...");
		return countries;
	}
	@Override
	public ArrayList<Organization> getOrganizations() throws SQLException {
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "getOrganizations start...");
		ArrayList<Organization> organizations = new ArrayList<Organization>();
		Organization org = null;
		PreparedStatement stm = c.prepareStatement(SQLStatements.selectAllOrganizations);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			org = new Organization(rs.getInt(DataContract.OrganizationsTable.COL_ID), rs.getString(DataContract.OrganizationsTable.COL_NAME));
			organizations.add(org);
		}
		logger.log(Level.INFO, "getOrganizations end...");
		return organizations;
	}
	@Override
	public ArrayList<Project> getProjectsByCustomerId(int id) throws SQLException {
		Logger logger = Logger.getLogger(DataAccess.class.getName());
		logger.log(Level.INFO, "getProjectsByCustomerId start...");
		ArrayList<Project> projects = new ArrayList<Project>();
		Project proj = null;
		PreparedStatement stm = c.prepareStatement(SQLStatements.selectProjectsByCustomerId);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			proj = new Project(rs.getInt(DataContract.ProjectsTable.COL_ID), rs.getInt(DataContract.ProjectsTable.COL_CUSTOMERID), rs.getString(DataContract.ProjectsTable.COL_NAME),rs.getDate(DataContract.ProjectsTable.COL_STARTDATE), rs.getDate(DataContract.ProjectsTable.COL_DUEDATE));
			projects.add(proj);
		}
		logger.log(Level.INFO, "getProjectsByCustomerId end...");
		return projects;
	}
}
