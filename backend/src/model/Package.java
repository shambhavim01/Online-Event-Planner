package model;

import java.util.Date;
import java.util.Objects;

public class Package {

	 private int PackageID ;
	    private String services;
	    private int amount;
		public int getPackageID() {
			return PackageID;
		}
		public void setPackageID(int packageID) {
			PackageID = packageID;
		}
		public String getServices() {
			return services;
		}
		public void setServices(String services) {
			this.services = services;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		@Override
		public int hashCode() {
			return Objects.hash(PackageID, amount, services);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Package other = (Package) obj;
			return PackageID == other.PackageID && amount == other.amount && Objects.equals(services, other.services);
		}
		@Override
		public String toString() {
			return "Package [PackageID=" + PackageID + ", services=" + services + ", amount=" + amount + "]";
		}
	    
	 

}
