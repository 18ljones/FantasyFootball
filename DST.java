
public class DST {

	private String name;
	private String opponent;
	private String status;
	private String touchdowns;
	private String interceptions;
	private String fumblesRecovered;
	private String sacks;
	private String safeties;
	private String blocks;
	private String pointsAllowed;
	private String points;

	public DST(String name, String opp, String status, String td, String inter, String fr, String sck, String sfty,
			String blk, String pa, String pts) {
		
		this.name = name;
		this.opponent = opp;
		this.status = status;
		this.touchdowns = td;
		this.interceptions = inter;
		this.fumblesRecovered = fr;
		this.sacks = sck;
		this.safeties = sfty;
		this.blocks = blk;
		this.pointsAllowed = pa;
		this.points = pts;

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

	public String getTouchdowns() {
		return touchdowns;
	}

	public void setTouchdowns(String touchdowns) {
		this.touchdowns = touchdowns;
	}

	public String getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(String interceptions) {
		this.interceptions = interceptions;
	}

	public String getFumblesRecovered() {
		return fumblesRecovered;
	}

	public void setFumblesRecovered(String fumblesRecovered) {
		this.fumblesRecovered = fumblesRecovered;
	}

	public String getSacks() {
		return sacks;
	}

	public void setSacks(String sacks) {
		this.sacks = sacks;
	}

	public String getSafeties() {
		return safeties;
	}

	public void setSafeties(String safeties) {
		this.safeties = safeties;
	}

	public String getBlocks() {
		return blocks;
	}

	public void setBlocks(String blocks) {
		this.blocks = blocks;
	}

	public String getPointsAllowed() {
		return pointsAllowed;
	}

	public void setPointsAllowed(String pointsAllowed) {
		this.pointsAllowed = pointsAllowed;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}
