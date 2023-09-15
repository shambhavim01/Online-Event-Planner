package model;

import java.util.Objects;

public class Vendor {

	    private int VendorID ;
	    private String name;
	    private String email;
	    private String eventPackages;
		public int getVendorID() {
			return VendorID;
		}
		public void setVendorID(int vendorID) {
			VendorID = vendorID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEventPackages() {
			return eventPackages;
		}
		public void setEventPackages(String eventPackages) {
			this.eventPackages = eventPackages;
		}
		@Override
		public int hashCode() {
			return Objects.hash(VendorID, email, eventPackages, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vendor other = (Vendor) obj;
			return VendorID == other.VendorID && Objects.equals(email, other.email)
					&& Objects.equals(eventPackages, other.eventPackages) && Objects.equals(name, other.name);
		}
		@Override
		public String toString() {
			return "Vendor [VendorID=" + VendorID + ", name=" + name + ", email=" + email + ", eventPackages="
					+ eventPackages + "]";
		}


}
