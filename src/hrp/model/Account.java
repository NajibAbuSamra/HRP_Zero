package hrp.model;

import java.sql.Date;

public class Account {
	int id;
	String name;
	Date start_date;
	Date due_date;
	int port_id;
	public Account(int id, String name, Date start_date, Date due_date, int port_id) {
		super();
		this.id = id;
		this.name = name;
		this.start_date = start_date;
		this.due_date = due_date;
		this.port_id = port_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPort_id() {
		return port_id;
	}
	public void setPort_id(int port_id) {
		this.port_id = port_id;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", start_date=" + start_date + ", due_date=" + due_date
				+ ", port_id=" + port_id + "]";
	}
	
}
