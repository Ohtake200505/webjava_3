package jp.co.systena.tigerscave.rpgwithdb.model;

public class Slime implements MonsterType {

	@Override
	public String attack() {
		return "スライムは体当たりした！";
	}

}
