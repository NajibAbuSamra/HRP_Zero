package hrp.da;

public class DataContract {
	public static class CustomersTable{
		public static final String TABLE_NAME = "customers";
		public static final String COL_ID = "customer_id";
		public static final String COL_NAME = "name";
	}
	public static class ProjectsTable{
		public static final String TABLE_NAME = "projects";
		public static final String COL_ID = "project_id";
		public static final String COL_NAME = "name";
		public static final String COL_STARTDATE = "start_date";
		public static final String COL_DUEDATE = "due_date";
		public static final String COL_PORTID = "customer_id";
	}
	public static class OrganizationsTable{
		public static final String TABLE_NAME = "organizations";
		public static final String COL_ID = "organization_id";
		public static final String COL_NAME = "name";
	}
	public static class CountriesTable{
		public static final String TABLE_NAME = "countries";
		public static final String COL_ID = "country_id";
		public static final String COL_NAME = "name";
	}
	public static class OrgConTable{
		public static final String TABLE_NAME = "orgcon";
		public static final String COL_ID = "orgcon_id";
		public static final String COL_ORGID = "org_id";
		public static final String COL_COUNTID = "count_id";
	}
	public static class ProjectOrgConTable{
		public static final String TABLE_NAME = "project_orgcon";
		public static final String COL_ID = "project_orgcon_id";
		public static final String COL_PROJECTID = "project_id";
		public static final String COL_ORGCONID = "orgcon_id";
	}
	public static class ProjectUpdateTable{
		public static final String TABLE_NAME = "project_update";
		public static final String COL_ID = "project_update_id";
		public static final String COL_UPDATEMONTH = "update_month";
		public static final String COL_CURRENTDUEDATE = "current_due_date";
		public static final String COL_PROJECTID = "project_id";
	}
	public static class PredictionInfoTable{
		public static final String TABLE_NAME = "prediction_info";
		public static final String COL_ID = "prediction_info_id";
		public static final String COL_PROJECTUPDATEID = "project_update_id";
		public static final String COL_PROJECTORGCONID = "project_update_id";
		public static final String COL_ACTUAL = "actual_0";
		public static final String COL_PMDEMAND0 = "pm_demand_0";
		public static final String COL_DMDEMAND0 = "dm_demand_0";
		public static final String COL_PREDICTION0 = "prediction_0";
		public static final String COL_PMDEMAND1 = "pm_demand_1";
		public static final String COL_DMDEMAND1 = "dm_demand_1";
		public static final String COL_PREDICTION1 = "prediction_1";
		public static final String COL_PMDEMAND2 = "pm_demand_2";
		public static final String COL_DMDEMAND2 = "dm_demand_2";
		public static final String COL_PREDICTION2 = "prediction_2";
		public static final String COL_PMDEMAND3 = "pm_demand_3";
		public static final String COL_DMDEMAND3 = "dm_demand_3";
		public static final String COL_PREDICTION3 = "prediction_3";
		public static final String COL_PMDEMAND4 = "pm_demand_4";
		public static final String COL_DMDEMAND4 = "dm_demand_4";
		public static final String COL_PREDICTION4 = "prediction_4";
		public static final String COL_PMDEMAND5 = "pm_demand_5";
		public static final String COL_DMDEMAND5 = "dm_demand_5";
		public static final String COL_PREDICTION5 = "prediction_5";
		public static final String COL_PMDEMAND6 = "pm_demand_6";
		public static final String COL_DMDEMAND6 = "dm_demand_6";
		public static final String COL_PREDICTION6 = "prediction_6";
		
	}
}
