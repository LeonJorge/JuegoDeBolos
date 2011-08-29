
public class JuegoDeBolos {
	private int[] lanzamientos = new int[21];
	int score=0;
	public JuegoDeBolos()
	{
		for(int i=0;i<21;i++)
			lanzamientos[i]=0;
	}
	public void realizarLanzamiento(int pinos) {
			lanzamientos[0]=pinos;
	}
	public int calcularScore()
	{
		for(int casillero=0;casillero<21;casillero++)
		{
			score=score+lanzamientos[casillero];
		}
		return score;
	}
}
