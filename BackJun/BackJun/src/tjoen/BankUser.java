package tjoen;

import java.util.Objects;

//클래서 필드 , static 필드 ,전역 필드
//static 유무에 따라 클래스 필드와 인스턴스 필드로 구분된다.
//클래스 필드 : 1개만 생성되며 전역변수이며 클래스 이름으로 접근 (new와 관련 x)
//인스턴스 필드 : new를 이용해서 원하는 만큼 생성 
public class BankUser {
	// 하나의 값을 가져야되는 애들은 클래스필드 사용
	private String id= "noData";
	private String pw= "noData";
	private double account = 0;
	public BankUser(String id, String pw, double account) {
		super();// 부모의 생성자 호출 
		this.id = id;
		this.pw = pw;
		this.account = account;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	public BankUser() {
	    this("u1","u1",0);
	}
	@Override
	public String toString() {
		return "BankUser [id=" + id + ", pw=" + pw + ", account=" + account + "]";
	}
	//4가지 만들어보자 , 생성자 , getter setter , toString , equals 
	@Override
	public int hashCode() {
		return Objects.hash(account, id, pw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankUser other = (BankUser) obj;
		return account == other.account && Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	

}
