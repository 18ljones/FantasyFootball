
public class KICK {
	
	private String name;
	private String opponent;
	private String status;
	private String thirtynine;
	private String fortynine;
	private String fifty;
	private String totalTries;
	private String extraPoints;
	private String pts;
	
	public KICK (String name, String opp, String status, String thirtynine, String fortynine, String fifty,
			String tot, String xp, String pts) {
		
		 this.name = name;
		 this.opponent = opp;
		 this.status = status;
		 this.thirtynine = thirtynine;
		 this.fortynine = fortynine;
		 this.fifty = fifty;;
		 this.totalTries = tot;
		 this.extraPoints = xp;
		 this.pts = pts;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpponent() {
		return opponent;
	}

	public void setOpponent(String opponent) {
		this.opponent = opponent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThirtynine() {
		return thirtynine;
	}

	public void setThirtynine(String thirtynine) {
		this.thirtynine = thirtynine;
	}

	public String getFortynine() {
		return fortynine;
	}

	public void setFortynine(String fortynine) {
		this.fortynine = fortynine;
	}

	public String getFifty() {
		return fifty;
	}

	public void setFifty(String fifty) {
		this.fifty = fifty;
	}

	public String getTotalTries() {
		return totalTries;
	}

	public void setTotalTries(String totalTries) {
		this.totalTries = totalTries;
	}

	public String getExtraPoints() {
		return extraPoints;
	}

	public void setExtraPoints(String extraPoints) {
		this.extraPoints = extraPoints;
	}

	public String getPts() {
		return pts;
	}

	public void setPts(String pts) {
		this.pts = pts;
	}

}
