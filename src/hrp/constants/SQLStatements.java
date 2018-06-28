package hrp.constants;

import hrp.da.DataContract;

public class SQLStatements {
	public final static String selectAllPortfolios = "SELECT * FROM " + DataContract.PortfolioTable.TABLE_NAME + ";";
}
