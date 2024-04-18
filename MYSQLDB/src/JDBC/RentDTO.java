package JDBC;

public class RentDTO {


	private int numseq;
	private String rentdate; // 날짜가 String 입니다 
	private int bnum;
	private String subject;
	private int mnum;
	private String name;
	private int rentprice; 
	private int discount; 
	private int amount;
	public int getNumseq() {
		return numseq;
	}
	public void setNumseq(int numseq) {
		this.numseq = numseq;
	}
	public String getRentdate() {
		return rentdate;
	}
	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRentprice() {
		return rentprice;
	}
	public void setRentprice(int rentprice) {
		this.rentprice = rentprice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "[대여번호 = " + numseq + ", 대여일 = " + rentdate 
				+ ", 회원번호 = " + mnum 
				+ ", 성명 = " + name + ", 대여가격 = " + rentprice + ", 할인가격 = " + discount
				+ ", 매출액 = " + amount + ", 도서번호 = " + bnum +  ", 제목 = " + subject + "]";
	}
	
	
	
	
}
