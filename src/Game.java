import TennisGameException.ScoreNotValidException;

public class Game {

	public static String set (int punteggio1, int punteggio2)
	{
		Player p1;
		Player p2;
		Score pnt = new Score();
		String result = null;
		
		try {
			p1=new Player("P1");
			p2=new Player("P2");
			
			p1.setPunteggio(punteggio1);
			p2.setPunteggio(punteggio2);
		
			for (int i=0,j=0; (i<=punteggio1 || j<=punteggio2); i++, j++)
			{
				if(i<=punteggio1)
					p1.setPunteggio(i);
				if(j<=punteggio2)	
					p2.setPunteggio(j);
				
				result=pnt.total(p1.getPunteggio(), p2.getPunteggio());
			}
		} catch (ScoreNotValidException e) {
			// TODO Auto-generated catch block
			result=e.getClass().getName();
		}	
					
		return result;
	}
}
