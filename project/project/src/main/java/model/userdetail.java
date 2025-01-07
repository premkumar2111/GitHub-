package model;

public class userdetail {
	
	 private int id;
		private String fname;
		 private String lname;
		 private String Gender;
		 private String email;
		 private String password;
		 private long phone;
		 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		
		public String getGender() {
			return Gender;
		}
		public void setGender(String Gender) {
			this.Gender = Gender;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Userdetail [id=" + id + ", fname=" + fname + ", lname=" + lname + ", Gender=" + Gender + ", email="
					+ email + ", password=" + password + ", phone=" + phone + "]";
		}
		
		
		

}
