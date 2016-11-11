public class TennisGame {
	static Player P1=new Player("P1");
	static Player P2=new Player("P2");
	
	public static String game (int punteggio1, int punteggio2)
	{
		String result;
		
		P1.setPunteggio(punteggio1);
		P2.setPunteggio(punteggio2);
		
		if(punteggio1+punteggio2>=6 && punteggio1==punteggio2)
			result="deuce";
		else if (punteggio1-punteggio2>=2 && punteggio1+punteggio2>=4)
			result="player1 win";
		else if (punteggio2-punteggio1>=2 && punteggio1+punteggio2>=4)
			result="player2 win";
		else if (punteggio1+punteggio2>=6 && punteggio1>punteggio2)
			result="advantage - "+P2.getPunteggio();
		else if (punteggio1+punteggio2>=6 && punteggio2>punteggio1)
			result=P1.getPunteggio() + " - advantage";
		else
			result=P1.getPunteggio()+" - "+P2.getPunteggio();
		
		return result;
	}
}
