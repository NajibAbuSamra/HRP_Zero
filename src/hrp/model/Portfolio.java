package hrp.model;

public class Portfolio {
	
	int Id;
	String name;
	
	public Portfolio(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Portfolio [Id=" + Id + ", name=" + name + "]";
	}
	

}
