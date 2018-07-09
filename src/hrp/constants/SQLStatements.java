package hrp.constants;

import hrp.da.DataContract;

public class SQLStatements {
	public final static String selectAllCustomers = "SELECT * FROM " + DataContract.CustomersTable.TABLE_NAME
			+ " ORDER BY " + DataContract.CustomersTable.COL_ID + ";";
	public static final String selectAllCountries = "SELECT * FROM " + DataContract.CountriesTable.TABLE_NAME
			+ " ORDER BY " + DataContract.CountriesTable.COL_NAME + ";";
	public static final String selectAllOrganizations = "SELECT * FROM " + DataContract.OrganizationsTable.TABLE_NAME
			+ " ORDER BY " + DataContract.OrganizationsTable.COL_NAME + ";";
	public static final String selectProjectsByCustomerId = "SELECT * FROM " + DataContract.ProjectsTable.TABLE_NAME + " WHERE " + DataContract.ProjectsTable.COL_CUSTOMERID + " =?;";
	public final static String selectProjectOrgConIdByProjectId = "SELECT " + DataContract.ProjectOrgConTable.COL_ID
			+ " FROM " + DataContract.ProjectOrgConTable.TABLE_NAME + " WHERE "
			+ DataContract.ProjectOrgConTable.COL_PROJECTID + " = ? ;";
	public final static String selectProjectUpdateIdByProjectId = "SELECT " + DataContract.ProjectUpdateTable.COL_ID
			+ " FROM " + DataContract.ProjectUpdateTable.TABLE_NAME + " WHERE "
			+ DataContract.ProjectUpdateTable.COL_PROJECTID + " = ? ;";
	public final static String selectPredictionInfoByProjectUpdateAndProjectOrgCon = "SELECT * FROM "
			+ DataContract.PredictionInfoTable.TABLE_NAME + " WHERE "
			+ DataContract.PredictionInfoTable.COL_PROJECTUPDATEID + " = ? AND "
			+ DataContract.PredictionInfoTable.COL_PROJECTORGCONID + " = ?;";
	public final static String selectOrgNameAndCountryNameByOrgConId = "SELECT o."
			+ DataContract.OrganizationsTable.COL_NAME + " AND c." + DataContract.CountriesTable.COL_NAME + " FROM "
			+ DataContract.OrganizationsTable.TABLE_NAME + " o, " + DataContract.OrgConTable.TABLE_NAME + " b, "
			+ DataContract.CountriesTable.TABLE_NAME + " c WHERE b." + DataContract.OrgConTable.COL_ID + " =? AND b."
			+ DataContract.OrgConTable.COL_COUNTID + " = c." + DataContract.CountriesTable.COL_ID + " AND b."
			+ DataContract.OrgConTable.COL_ORGID + " = o." + DataContract.OrganizationsTable.COL_ID + ";";
	public final static String selectDueDateFromProjectUpdateByProjectId = "SELECT " + DataContract.ProjectUpdateTable.COL_CURRENTDUEDATE + " FROM " + DataContract.ProjectUpdateTable.TABLE_NAME + " WHERE " + DataContract.ProjectUpdateTable.COL_PROJECTID + " = ?;";
	
	
}
