package jdbc;

public class EmailListVo {
	private long no;
	private String firstName ;
	private String lasttName ;
	private String email ;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmailListVo [no=" + no + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email
				+ "]";
	}
	
	

}
