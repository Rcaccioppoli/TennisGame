
public class Player {
	private String nome;
	private int punteggio;
	
	Player (String nome){
		this.nome=nome;
		punteggio=0;
	}

	public void setPunteggio(int punteggio)
	{
		this.punteggio=punteggio;
	}
	
	public String getPunteggio()
	{
		String result="null";
		
		if (punteggio==0)
			result="love";
		else if (punteggio==1)
			result="15";
		else if (punteggio==2)
			result="30";
		else if (punteggio>=3)
			result="40";
		
		return result;
	}
}
