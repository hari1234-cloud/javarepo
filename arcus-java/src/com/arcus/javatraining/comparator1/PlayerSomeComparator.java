package com.arcus.javatraining.comparator1;

import java.util.Comparator;

public class PlayerSomeComparator implements Comparator<Player> {

	@Override
	public int compare(Player firstPlayer, Player secondPlayer) {
		return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
	}

}