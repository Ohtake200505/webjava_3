package jp.co.systena.tigerscave.rpgwithdb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.rpgwithdb.model.Player;

@Service
public class PlayerListService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	List<Player> list;

	public List<Player> getPlayerList(){
		if(list == null) {
			list = jdbcTemplate.query("SELECT * FROM players ORDER BY char_id", new BeanPropertyRowMapper<Player>(Player.class));
			return list;
		}
		return this.list;
	}

	public void setPlayerList(int charId, Player player) {
		list.set(charId, player);
	}

	public Player getPlayer(int charId) {
		Player player = list.get(charId);
		return player;
	}

	public void savePlayerDb() {
	    for(Player player : list) {
	      jdbcTemplate.update(
	          "UPDATE players SET level = ?, hp = ? WHERE char_id = ?",
	          player.getLevel(),
	          player.getHp(),
	          player.getCharId()
	          );
	      player.setMemberId(99);
	    }
	}
}

