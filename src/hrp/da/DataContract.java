package hrp.da;

public class DataContract {
	public static class PortfoliosTable{
		public static final String TABLE_NAME = "portfolios";
		public static final String COL_ID = "id";
		public static final String COL_NAME = "name";
	}
	public static class AccountsTable{
		public static final String TABLE_NAME = "accounts";
		public static final String COL_ID = "id";
		public static final String COL_NAME = "name";
		public static final String COL_STARTDATE = "start_date";
		public static final String COL_DUEDATE = "due_date";
		public static final String COL_PORTID = "port_id";
	}
	public static class OrganizationsTable{
		public static final String TABLE_NAME = "organizations";
		public static final String COL_ID = "id";
		public static final String COL_NAME = "name";
	}
	public static class CountriesTable{
		public static final String TABLE_NAME = "countries";
		public static final String COL_ID = "id";
		public static final String COL_NAME = "name";
	}
	public static class OrgConTable{
		public static final String TABLE_NAME = "orgcon";
		public static final String COL_ID = "id";
		public static final String COL_ORGID = "org_id";
		public static final String COL_COUNTID = "count_id";
	}
	public static class AccountOrgConTable{
		public static final String TABLE_NAME = "account_orgcon";
		public static final String COL_ID = "id";
		public static final String COL_ACCOUNTID = "account_id";
		public static final String COL_ORGCONID = "orgcon_id";
	}
}
