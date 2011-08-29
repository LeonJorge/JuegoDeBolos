
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
			totalScore=totalScore+sumaDeLosLanzamientos(casillaCentral);
			casillaCentral+=2;
		}
		return totalScore;
	}
	private int sumaDeLosLanzamientos(int casillaCentral){
		return lanzamientos[casillaCentral]+lanzamientos[casillaCentral+1];
	}
}
