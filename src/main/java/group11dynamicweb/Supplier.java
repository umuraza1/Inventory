package group11dynamicweb;

public class Supplier {
	private String supfname,suplname,phone;
	private int proid,quantity,price;
	private String date;
	public Supplier(String supfname, String suplname, String phone,int proid, int quantity,int price,String date) {
		super();
		this.supfname = supfname;
		this.suplname = suplname;
		this.phone = phone;
		this.date = date;
		this.quantity = quantity;
		this.price = price;
		this.proid=proid;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getSupfname() {
		return supfname;
	}
	public void setSupfname(String supfname) {
		this.supfname = supfname;
	}
	public String getSuplname() {
		return suplname;
	}
	public void setSuplname(String suplname) {
		this.suplname = suplname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
