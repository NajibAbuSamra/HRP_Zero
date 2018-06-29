package hrp.model;

public class OrgCon {
	int id;
	int org_id;
	int count_id;
	public OrgCon(int id, int org_id, int count_id) {
		super();
		this.id = id;
		this.org_id = org_id;
		this.count_id = count_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public int getCount_id() {
		return count_id;
	}
	public void setCount_id(int count_id) {
		this.count_id = count_id;
	}
	@Override
	public String toString() {
		return "OrgCon [id=" + id + ", org_id=" + org_id + ", count_id=" + count_id + "]";
	}
	
}
