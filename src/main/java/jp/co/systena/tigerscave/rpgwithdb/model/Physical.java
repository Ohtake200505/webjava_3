package jp.co.systena.tigerscave.rpgwithdb.model;

public abstract class Physical implements Job {

	@Override
	public String heal(){
		return "やくそうで回復した！ HPが50回復した！";
	}
}
