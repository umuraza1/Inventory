package group11dynamicweb;

public class Payment {
	private int proid,custid,quantity,amountpaid;
	private String date;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(int amountpaid) {
		this.amountpaid = amountpaid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Payment(int proid, int custid, int quantity, int amountpaid, String date) {
		super();
		this.proid = proid;
		this.custid = custid;
		this.quantity = quantity;
		this.amountpaid = amountpaid;
		this.date = date;
	}

}
