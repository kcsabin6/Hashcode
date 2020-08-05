package hashCode;

public class Biscuits {
	int bid;
	String vendor;
	String taste;
	String howToEat;
	
	public Biscuits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Biscuits(int bid, String vendor, String taste, String howToEat) {
		super();
		this.bid = bid;
		this.vendor = vendor;
		this.taste = taste;
		this.howToEat = howToEat;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getHowToEat() {
		return howToEat;
	}
	public void setHowToEat(String howToEat) {
		this.howToEat = howToEat;
	}
	@Override
	public String toString() {
		return "Biscuits [bid=" + bid + ", vendor=" + vendor + ", taste=" + taste + ", howToEat=" + howToEat + "]";
	}

	

	
}
