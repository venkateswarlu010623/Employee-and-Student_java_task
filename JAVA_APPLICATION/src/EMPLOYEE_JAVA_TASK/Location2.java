package EMPLOYEE_JAVA_TASK;

public class Location2 {

	int locationId;
	String locationName;
	String locationCountry;
	
	public Location2(int locationId, String locationName, String locationCountry) {
		this.locationId = locationId;
		this.locationName = locationName;
		this.locationCountry = locationCountry;
	}

	public int getLocationId() {
		return locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public String getLocationCountry() {
		return locationCountry;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}

	@Override
	public String toString() {
		return "Location2 [locationId=" + locationId + ", locationName=" + locationName + ", locationCountry="
				+ locationCountry + "]";
	}
	
	
	
}

//Location
//--------
//locationId
//locationName (Hyderabad, chennai, London)
//locationCountry (India, United Kingdom)