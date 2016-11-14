import static org.junit.Assert.*;

import org.junit.Test;

import TennisGameException.ScoreNotValidException;

public class TennisGameTest {
	
	@Test
	public void test() {
		assertEquals("love - love", Game.set(0, 0));
		assertEquals("15 - 30", Game.set(1, 2));
		assertEquals("deuce", Game.set(3, 3));
		assertEquals("player 1 win", Game.set(4, 0));
		assertEquals("player 1 win", Game.set(5, 3));
		assertEquals("player 2 win", Game.set(0, 4));
		assertEquals("adv - 40", Game.set(5, 4));
		assertEquals("deuce", Game.set(6, 6));
		assertEquals(ScoreNotValidException.class.getName(), Game.set(-1, 9));
	}

}
