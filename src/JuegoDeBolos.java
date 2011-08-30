
public class JuegoDeBolos {
	private int[] lanzamientos = new int[21];
	int score=0;
	int casilleroActual=0;
	public JuegoDeBolos()
	{
		for(int i=0;i<21;i++)
			lanzamientos[i]=0;
	}
	public void realizarLanzamiento(int pinos) {
			lanzamientos[casilleroActual]=pinos;
			casilleroActual++;
			score=score+pinos;
	}
	public int calcularScore()
	{
		int totalScore=0;
		int casillaCentral=0;
		for(int casillero=0;casillero<10;casillero++)
		{
			if(esSpare(casillaCentral))
				totalScore=totalScore+10+lanzamientos[casillaCentral+2];		
			else
				if(esStrike(casillaCentral)){
					totalScore=totalScore+10+obtenerBono(casillaCentral);
					casillaCentral++;
				}
				else
					totalScore=totalScore+sumaDeLosLanzamientos(casillaCentral);
			casillaCentral+=2;
		}
		return totalScore;
	}
	private int sumaDeLosLanzamientos(int casillaCentral){
		return lanzamientos[casillaCentral]+lanzamientos[casillaCentral+1];
	}
	private boolean esSpare(int casillero){
		if(lanzamientos[casillero]+lanzamientos[casillero+1]==10)
			return true;
		else
			return false;
	}
	private boolean esStrike(int casillero){
		if(lanzamientos[casillero]==10)
			return true;
		else
			return false;
	}
	private int obtenerBono(int casillero){
		return lanzamientos[casillero+1]+lanzamientos[casillero+2];
	}
}
