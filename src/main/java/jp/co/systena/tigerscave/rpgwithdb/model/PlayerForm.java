package jp.co.systena.tigerscave.rpgwithdb.model;

public class PlayerForm {

	private int charId;
	private String jobName;
	private int level;
	private String name;
	private int num;

	public int getCharId() {
		return this.charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
