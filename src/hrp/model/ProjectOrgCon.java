package hrp.model;

public class ProjectOrgCon {
	int id;
	int project_id;
	int orgcon_id;
	public ProjectOrgCon(int id, int project_id, int orgcon_id) {
		super();
		this.id = id;
		this.project_id = project_id;
		this.orgcon_id = orgcon_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getOrgcon_id() {
		return orgcon_id;
	}
	public void setOrgcon_id(int orgcon_id) {
		this.orgcon_id = orgcon_id;
	}
	@Override
	public String toString() {
		return "ProjectOrgCon [id=" + id + ", project_id=" + project_id + ", orgcon_id=" + orgcon_id + "]";
	}
	
}
