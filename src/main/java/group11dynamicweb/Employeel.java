package group11dynamicweb;

public class Employeel {
	private String empfname,emplname,phone,username,password;

	public Employeel(String empfname, String emplname, String phone, String username, String password) {
		super();
		this.empfname = empfname;
		this.emplname = emplname;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public String getEmpfname() {
		return empfname;
	}

	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}

	public String getEmplname() {
		return emplname;
	}

	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
