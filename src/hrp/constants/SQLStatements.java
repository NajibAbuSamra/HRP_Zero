package hrp.constants;

import hrp.da.DataContract;

public class SQLStatements {
	public final static String selectAllPortfolios = "SELECT * FROM " + DataContract.CustomersTable.TABLE_NAME + " ORDER BY " + DataContract.CustomersTable.COL_ID + ";";
}
