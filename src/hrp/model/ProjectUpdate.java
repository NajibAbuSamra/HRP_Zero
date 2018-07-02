package hrp.model;

import java.sql.Date;

public class ProjectUpdate {
	int id;
	Date update_month;
	Date current_due_date;
	int project_id;
	public ProjectUpdate(int id, Date update_month, Date current_due_date, int project_id) {
		super();
		this.id = id;
		this.update_month = update_month;
		this.current_due_date = current_due_date;
		this.project_id = project_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getUpdate_month() {
		return update_month;
	}
	public void setUpdate_month(Date update_month) {
		this.update_month = update_month;
	}
	public Date getCurrent_due_date() {
		return current_due_date;
	}
	public void setCurrent_due_date(Date current_due_date) {
		this.current_due_date = current_due_date;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	@Override
	public String toString() {
		return "ProjectUpdate [id=" + id + ", update_month=" + update_month + ", current_due_date=" + current_due_date
				+ ", project_id=" + project_id + "]";
	}
	
	
}
