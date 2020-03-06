package jp.co.systena.tigerscave.rpgwithdb.model;

public class BattleForm {

  private int memberId;
  private String command;

  public int getMemberId() {
    return this.memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getCommand() {
    return this.command;
  }

  public void setCommand(String command) {
    this.command = command;
  }
}
