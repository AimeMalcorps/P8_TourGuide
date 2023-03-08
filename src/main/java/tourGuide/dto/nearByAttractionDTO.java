package tourGuide.dto;

public class nearByAttractionDTO {

	private String attractionName;
	private double attractionLat;
	private double attractionLong;
	private double userLat;
	private double userLong;
	private double distanceUserAttraction;
	private int attractionRewardPoints;

	public nearByAttractionDTO(String attractionName, double attractionLat, double attractionLong, double userLat,
			double userLong, double distanceUserAttraction, int attractionRewardPoints) {
		this.attractionName = attractionName;
		this.attractionLat = attractionLat;
		this.attractionLong = attractionLong;
		this.userLat = userLat;
		this.userLong = userLong;
		this.distanceUserAttraction = distanceUserAttraction;
		this.attractionRewardPoints = attractionRewardPoints;
	}

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public double getAttractionLat() {
		return attractionLat;
	}

	public void setAttractionLat(double attractionLat) {
		this.attractionLat = attractionLat;
	}

	public double getAttractionLong() {
		return attractionLong;
	}

	public void setAttractionLong(double attractionLong) {
		this.attractionLong = attractionLong;
	}

	public double getUserLat() {
		return userLat;
	}

	public void setUserLat(double userLat) {
		this.userLat = userLat;
	}

	public double getUserLong() {
		return userLong;
	}

	public void setUserLong(double userLong) {
		this.userLong = userLong;
	}

	public double getDistanceUserAttraction() {
		return distanceUserAttraction;
	}

	public void setDistanceUserAttraction(double distanceUserAttraction) {
		this.distanceUserAttraction = distanceUserAttraction;
	}

	public int getAttractionRewardPoints() {
		return attractionRewardPoints;
	}

	public void setAttractionRewardPoints(int attractionRewardPoints) {
		this.attractionRewardPoints = attractionRewardPoints;
	}

}
