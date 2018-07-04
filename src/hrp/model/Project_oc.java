package hrp.model;

import java.util.ArrayList;

public class Project_oc {
	private double actual;
	private Country count;
	private Organization orgn;
	private int Id_poc;
	ArrayList<Double> pmd;
	ArrayList<Double> dmd;
	ArrayList<Double> pridection;
	public double getActual() {
		return actual;
	}
	public void setActual(double actual) {
		this.actual = actual;
	}
	public Country getCount() {
		return count;
	}
	public void setCount(Country count) {
		this.count = count;
	}
	public Organization getOrgn() {
		return orgn;
	}
	public void setOrgn(Organization orgn) {
		this.orgn = orgn;
	}
	public int getId_poc() {
		return Id_poc;
	}
	public void setId_poc(int id_poc) {
		Id_poc = id_poc;
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
