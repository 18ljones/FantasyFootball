
public class OFF {

	private String name;
	private String opponent;
	private String status;
	private String catchAttempts;
	private String passYards;
	private String passTds;
	private String interceptions;
	private String rush;
	private String rushYards;
	private String rushTds;
	private String receptions;
	private String receivingYards;
	private String receivingTds;
	private String receivingTargets;
	private String twoPointConversions;
	private String fumbles;
	private String miscellaneousTds;
	private String points;

	public OFF(String name, String opp, String status, String ca, String pYds, String pTd, String ints, String rush,
			String rushYds, String rushTd, String rec, String recYds, String recTd, String recTar, String twoPc,
			String fuml, String miscTd, String pts) {

		this.name = name;
		this.opponent = opp;
		this.status = status;
		this.catchAttempts = ca;
		this.passYards = pYds;
		this.passTds = pTd;
		this.interceptions = ints;
		this.rush = rush;
		this.rushYards = rushYds;
		this.rushTds = rushTd;
		this.receptions = rec;
		this.receivingYards = recYds;
		this.receivingTds = recTd;
		this.receivingTargets = recTar;
		this.twoPointConversions = twoPc;
		this.fumbles = fuml;
		this.miscellaneousTds = miscTd;
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

	public String getCatchAttempts() {
		return catchAttempts;
	}

	public void setCatchAttempts(String catchAttempts) {
		this.catchAttempts = catchAttempts;
	}

	public String getPassYards() {
		return passYards;
	}

	public void setPassYards(String passYards) {
		this.passYards = passYards;
	}

	public String getPassTds() {
		return passTds;
	}

	public void setPassTds(String passTds) {
		this.passTds = passTds;
	}

	public String getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(String interceptions) {
		this.interceptions = interceptions;
	}

	public String getRush() {
		return rush;
	}

	public void setRush(String rush) {
		this.rush = rush;
	}

	public String getRushYards() {
		return rushYards;
	}

	public void setRushYards(String rushYards) {
		this.rushYards = rushYards;
	}

	public String getRushTds() {
		return rushTds;
	}

	public void setRushTds(String rushTds) {
		this.rushTds = rushTds;
	}

	public String getReceptions() {
		return receptions;
	}

	public void setReceptions(String receptions) {
		this.receptions = receptions;
	}

	public String getReceivingYards() {
		return receivingYards;
	}

	public void setReceivingYards(String receivingYards) {
		this.receivingYards = receivingYards;
	}

	public String getReceivingTds() {
		return receivingTds;
	}

	public void setReceivingTds(String receivingTds) {
		this.receivingTds = receivingTds;
	}

	public String getReceivingTargets() {
		return receivingTargets;
	}

	public void setReceivingTargets(String receivingTargets) {
		this.receivingTargets = receivingTargets;
	}

	public String getTwoPointConversions() {
		return twoPointConversions;
	}

	public void setTwoPointConversions(String twoPointConversions) {
		this.twoPointConversions = twoPointConversions;
	}

	public String getFumbles() {
		return fumbles;
	}

	public void setFumbles(String fumbles) {
		this.fumbles = fumbles;
	}

	public String getMiscellaneousTds() {
		return miscellaneousTds;
	}

	public void setMiscellaneousTds(String miscellaneousTds) {
		this.miscellaneousTds = miscellaneousTds;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

}
