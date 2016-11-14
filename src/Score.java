import TennisGameException.ScoreNotValidException;

public class Score {
	private String score;
	private int points;

	Score (int points) throws ScoreNotValidException
	{
		if (points>=0)
		{
			this.points=points;
			score=convertScore(points);
		}
		else
			throw new ScoreNotValidException();
	}

	Score()
	{
		points=0;
		score=convertScore(points);
	}
	
	public int getPoints() {
		return points;
	}
	
	public String getScore() {
		return score;
	}

	public void setScore(int points) throws ScoreNotValidException
	{
		if (points>=0)
			score=convertScore(points);
		else
			throw new ScoreNotValidException();
	}

	public String total(Score p1, Score p2)
	{
		String total; 
		
		if(p1.points+p2.points>=6 && p1.points==p2.points)
			total="deuce";
		else if (p1.points-p2.points>=2 && p1.points+p2.points>=4)
			total="player 1 win";
		else if (p2.points-p1.points>=2 && p1.points+p2.points>=4)
			total="player 2 win";
		else if (p1.points+p2.points>=6 && p1.points>p2.points)
			total="adv - "+p2.score;
		else if (p1.points+p2.points>=6 && p2.points>p1.points)
			total=p1.score + " - adv";
		else
			total=p1.score+" - "+p2.score;
		
		return total;
	}
	
	private String convertScore (int points)
	{
		String convert=null;
		
		if (points==0)
			convert="love";
		else if (points==1)
			convert="15";
		else if (points==2)
			convert="30";
		else if (points>=3)
			convert="40";
		
		return convert;
	}
}
