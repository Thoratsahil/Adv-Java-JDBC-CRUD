public class Student {
	
	private int sid;
	private String sname;
	private String saddress;
	private double spercentage;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", spercentage=" + spercentage
				+ "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public double getSpercentage() {
		return spercentage;
	}
	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}

}
