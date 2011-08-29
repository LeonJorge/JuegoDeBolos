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
}
	
