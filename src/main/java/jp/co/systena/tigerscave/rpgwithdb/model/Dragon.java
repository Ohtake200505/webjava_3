package jp.co.systena.tigerscave.rpgwithdb.model;

public class Dragon implements MonsterType {

	@Override
	public String attack() {
		return "ドラゴンは炎を吐いた！";
	}

}
