import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoDeBolosTest {
	public JuegoDeBolos juego = new JuegoDeBolos();	
	@Test
	public void elPuntajeDeberiaSerCeroSiElPrimerDerribaCeroPinos(){
		int pinos=0;
		juego.realizarLanzamiento(pinos);
		assertEquals(juego.calcularScore(),0);
	}
	@Test
	public void elPuntajeDeberiaSerCeroSiTodosLosLanzamientosSonFallados(){
		realizarNLanzamientos(0,20);
		assertEquals(0,juego.calcularScore());
	}
	private void realizarNLanzamientos(int pinos, int veces) {
		for(int lanzamiento=0;lanzamiento<veces;lanzamiento++){
			juego.realizarLanzamiento(pinos);
		}
	}
}
	
