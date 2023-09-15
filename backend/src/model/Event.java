package model;
import java.util.Date;
import java.util.Objects;

public class Event {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private String service;
    private int guestnum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getGuestnum() {
		return guestnum;
	}
	public void setGuestnum(int guestnum) {
		this.guestnum = guestnum;
	}
	@Override
	public int hashCode() {
		return Objects.hash(endDate, guestnum, id, name, service, startDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(endDate, other.endDate) && guestnum == other.guestnum && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(service, other.service)
				&& Objects.equals(startDate, other.startDate);
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", service="
				+ service + ", guestnum=" + guestnum + "]";
	}
	
    
}

