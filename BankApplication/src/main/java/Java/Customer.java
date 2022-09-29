package Java;

public class Customer {
	private int accountNo;
    private String firstName,lastName,address,email,branch;
    private long phone;
    private double balance;
    
    
    //||accountNo||firstName||lastName||address||phone||email||branch||balance||..
    
    
	int getAccountNo() {
		return accountNo;
	}
	String getFirstName() {
		return firstName;
	}
	String getLastName() {
		return lastName;
	}
	String getAddress() {
		return address;
	}
	String getEmail() {
		return email;
	}
	String getBranch() {
		return branch;
	}
	long getPhone() {
		return phone;
	}
	double getBalance() {
		return balance;
	}
	
	
	void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setBranch(String branch) {
		this.branch = branch;
	}
	void setPhone(long phone) {
		this.phone = phone;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
    
    
    
}
