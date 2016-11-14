import TennisGameException.ScoreNotValidException;

public class Player {
	private String nome;
	private Score punteggio;
	
	Player (String nome) throws ScoreNotValidException{
		this.nome=nome;
		punteggio=new Score(0);
	}

	public void setPunteggio(int punteggio) throws ScoreNotValidException
	{
		this.punteggio=new Score(punteggio);
	}
	
	public Score getPunteggio() throws ScoreNotValidException
	{
		Score copia=new Score(punteggio.getPoints());
		return copia;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
