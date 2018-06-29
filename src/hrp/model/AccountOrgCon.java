package hrp.model;

public class AccountOrgCon {
	int id;
	int account_id;
	int orgcon_id;
	public AccountOrgCon(int id, int account_id, int orgcon_id) {
		super();
		this.id = id;
		this.account_id = account_id;
		this.orgcon_id = orgcon_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getOrgcon_id() {
		return orgcon_id;
	}
	public void setOrgcon_id(int orgcon_id) {
		this.orgcon_id = orgcon_id;
	}
	@Override
	public String toString() {
		return "AccountOrgCon [id=" + id + ", account_id=" + account_id + ", orgcon_id=" + orgcon_id + "]";
	}
	
}
