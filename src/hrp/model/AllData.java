package hrp.model;

import java.sql.Date;
import java.util.ArrayList;

public class AllData {
	
	private Date due_date;
	private ArrayList<Project_oc> orgcon;
	
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public ArrayList<Project_oc> getOrgcon() {
		return orgcon;
	}
	public void setOrgcon(ArrayList<Project_oc> orgcon) {
		this.orgcon = orgcon;
	}
	

}
