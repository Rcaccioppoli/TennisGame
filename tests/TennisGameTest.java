import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void test() {
		assertEquals("love - love", TennisGame.game(0, 0));
		assertEquals("15 - love", TennisGame.game(1, 0));
		assertEquals("15 - 30", TennisGame.game(1, 2));
		assertEquals("deuce", TennisGame.game(3, 3));
		assertEquals("player1 win", TennisGame.game(4, 0));
		assertEquals("player1 win", TennisGame.game(5, 3));
		assertEquals("player2 win", TennisGame.game(0, 4));
		assertEquals("advantage - 40", TennisGame.game(5, 4));
	}

}
