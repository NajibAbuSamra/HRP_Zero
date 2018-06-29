package hrp.constants;

import hrp.da.DataContract;

public class SQLStatements {
	public final static String selectAllPortfolios = "SELECT * FROM " + DataContract.PortfoliosTable.TABLE_NAME + ";";
}
