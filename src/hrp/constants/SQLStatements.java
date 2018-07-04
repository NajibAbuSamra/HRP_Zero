package hrp.constants;

import hrp.da.DataContract;

public class SQLStatements {
	public final static String selectAllPortfolios = "SELECT * FROM " + DataContract.CustomersTable.TABLE_NAME + " ORDER BY " + DataContract.CustomersTable.COL_ID + ";";
	public final static String selectProjectOrgConIdByProjectId = "SELECT " + DataContract.ProjectOrgConTable.COL_ID + " FROM " + DataContract.ProjectOrgConTable.TABLE_NAME + " WHERE " + DataContract.ProjectOrgConTable.COL_PROJECTID + " = ? ;";
	public final static String selectProjectUpdateIdByProjectId = "SELECT " + DataContract.ProjectUpdateTable.COL_ID + " FROM " + DataContract.ProjectUpdateTable.TABLE_NAME + " WHERE " + DataContract.ProjectUpdateTable.COL_PROJECTID + " = ? ;";
	public final static String selectPredictionInfoByProjectUpdateAndProjectOrgCon = "SELECT * FROM " + DataContract.PredictionInfoTable.TABLE_NAME + " WHERE " + DataContract.PredictionInfoTable.COL_PROJECTUPDATEID + " = ? AND " + DataContract.PredictionInfoTable.COL_PROJECTORGCONID + " = ?;";
}
