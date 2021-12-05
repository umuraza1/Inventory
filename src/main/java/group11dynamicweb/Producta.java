package group11dynamicweb;

public class Producta {
	private String proname,protype,quantity,price,fabricationdate,expireddate;

	public Producta(String proname, String protype, String quantity, String price, String fabricationdate,
			String expireddate) {
		super();
		this.proname = proname;
		this.protype = protype;
		this.quantity = quantity;
		this.price = price;
		this.fabricationdate = fabricationdate;
		this.expireddate = expireddate;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getProtype() {
		return protype;
	}

	public void setProtype(String protype) {
		this.protype = protype;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFabricationdate() {
		return fabricationdate;
	}

	public void setFabricationdate(String fabricationdate) {
		this.fabricationdate = fabricationdate;
	}

	public String getExpireddate() {
		return expireddate;
	}

	public void setExpireddate(String expireddate) {
		this.expireddate = expireddate;
	}
	

}
