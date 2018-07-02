package hrp.model;

import java.sql.Date;

public class Project {
	int id;
	int customer_id;
	String name;
	Date start_date;
	Date due_date;
	public Project(int id, int customer_id, String name, Date start_date, Date due_date) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.name = name;
		this.start_date = start_date;
		this.due_date = due_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", customer_id=" + customer_id + ", name=" + name + ", start_date=" + start_date
				+ ", due_date=" + due_date + "]";
	}
	
	
}
