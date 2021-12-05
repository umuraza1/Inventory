package group11dynamicweb;

public class Customer {
	private String cfname,clname,phone;
	private int addid;
	public Customer(String cfname, String clname, String phone, int addid) {
		super();
		this.cfname = cfname;
		this.clname = clname;
		this.phone = phone;
		this.addid = addid;
	}
	public String getCfname() {
		return cfname;
	}
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}
	public String getClname() {
		return clname;
	}
	public void setClname(String clname) {
		this.clname = clname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	

}
