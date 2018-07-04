package hrp.model;

import java.sql.Date;
import java.util.ArrayList;

public class AllData {
	
	private Date due_date;
	private ArrayList<Project_oc> orgcon;
	private ArrayList<Double> pmd;
	private ArrayList<Double> dmd;
	private ArrayList<Double> pridection;
	
	
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
	public ArrayList<Double> getPmd() {
		return pmd;
	}
	public void setPmd(ArrayList<Double> pmd) {
		this.pmd = pmd;
	}
	public ArrayList<Double> getDmd() {
		return dmd;
	}
	public void setDmd(ArrayList<Double> dmd) {
		this.dmd = dmd;
	}
	public ArrayList<Double> getPridection() {
		return pridection;
	}
	public void setPridection(ArrayList<Double> pridection) {
		this.pridection = pridection;
	}
	

}
