package airline;

public class CurAccount {
	private int accNum;
	private String id;
	private String name;
	
	public CurAccount(int accNum, String id, String name) {
		this.accNum = accNum;
		this.id = id;
		this.name = name;
	}

	public int getAccNum() {
		return accNum;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id=id;
	}
}
