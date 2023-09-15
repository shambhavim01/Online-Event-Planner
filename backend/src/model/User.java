package model;

import java.util.Date;
import java.util.Objects;

public class User {
	 private int UserID ;
	    private String username;
	    private Date startDate;
	    private Date DateOfJoining;
	    private String email;
	    private String department;
	    private String location;
		public int getUserID() {
			return UserID;
		}
		public void setUserID(int userID) {
			UserID = userID;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getDateOfJoining() {
			return DateOfJoining;
		}
		public void setDateOfJoining(Date dateOfJoining) {
			DateOfJoining = dateOfJoining;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public int hashCode() {
			return Objects.hash(DateOfJoining, UserID, department, email, location, startDate, username);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(DateOfJoining, other.DateOfJoining) && UserID == other.UserID
					&& Objects.equals(department, other.department) && Objects.equals(email, other.email)
					&& Objects.equals(location, other.location) && Objects.equals(startDate, other.startDate)
					&& Objects.equals(username, other.username);
		}
		@Override
		public String toString() {
			return "User [UserID=" + UserID + ", username=" + username + ", startDate=" + startDate + ", DateOfJoining="
					+ DateOfJoining + ", email=" + email + ", department=" + department + ", location=" + location
					+ "]";
		}
	    
	    
	    

}
