package jp.co.systena.tigerscave.rpgwithdb.model;

public class Player {

	private int memberId =99;
	private int charId;
	private String jobName;
	private int hp;
	private Job job;
	private String name;
	private int level;
	private String command;

	public void addJob(String jobName) {
		switch(jobName) {
		case "戦士":
			job = new Warrior();
			break;
		case "魔法使い":
			job = new Wizard();
			break;
		case "武闘家":
			job = new MartialArtist();
			break;
		}
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

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

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Job getJob() {
		return this.job;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
