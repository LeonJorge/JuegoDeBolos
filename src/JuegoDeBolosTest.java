import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoDeBolosTest {
	public JuegoDeBolos juego = new JuegoDeBolos();	
	@Test
	public void elScoreDeberiaSerCeroSiElPrimerDerribaCeroPinos(){
		int pinos=0;
		juego.realizarLanzamiento(pinos);
		assertEquals(juego.calcularScore(),0);
	}
	@Test
	public void elScoreDeberiaSerCeroSiTodosLosLanzamientosSonFallados(){
		realizarNLanzamientos(0,20);
		assertEquals(0,juego.calcularScore());
	}
	private void realizarNLanzamientos(int pinos, int veces) {
		for(int lanzamiento=0;lanzamiento<veces;lanzamiento++){
			juego.realizarLanzamiento(pinos);
		}
	}
	@Test
	public void elScoreDeberiaSer20SiTodosLosLanzamientosDerribanUno(){
		realizarNLanzamientos(1,20);
		assertEquals(20,juego.calcularScore());
	}
}
	
