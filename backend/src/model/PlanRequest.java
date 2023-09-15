package model;

import java.util.Date;
import java.util.Objects;

public class PlanRequest {

	 private int requestID ;
	    private String username;
	    private Date fromDate;
	    private Date serviceNeeded;
	    private int attendees;
		public int getRequestID() {
			return requestID;
		}
		public void setRequestID(int requestID) {
			this.requestID = requestID;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Date getFromDate() {
			return fromDate;
		}
		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}
		public Date getServiceNeeded() {
			return serviceNeeded;
		}
		public void setServiceNeeded(Date serviceNeeded) {
			this.serviceNeeded = serviceNeeded;
		}
		public int getAttendees() {
			return attendees;
		}
		public void setAttendees(int attendees) {
			this.attendees = attendees;
		}
		@Override
		public int hashCode() {
			return Objects.hash(attendees, fromDate, requestID, serviceNeeded, username);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PlanRequest other = (PlanRequest) obj;
			return attendees == other.attendees && Objects.equals(fromDate, other.fromDate)
					&& requestID == other.requestID && Objects.equals(serviceNeeded, other.serviceNeeded)
					&& Objects.equals(username, other.username);
		}
		@Override
		public String toString() {
			return "PlanRequesr [requestID=" + requestID + ", username=" + username + ", fromDate=" + fromDate
					+ ", serviceNeeded=" + serviceNeeded + ", attendees=" + attendees + "]";
		}
	    


}
