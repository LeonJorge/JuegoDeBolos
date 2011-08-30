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
	@Test
	public void elScoreDeberiaDetectarUnSpareEnLosTiros(){
		realizarLanzamientoSpare();
		juego.realizarLanzamiento(3);
		realizarNLanzamientos(0,17);
		assertEquals(16,juego.calcularScore());
	}
	private void realizarLanzamientoSpare() {
		juego.realizarLanzamiento(5);
		juego.realizarLanzamiento(5);	
	}
	private void realizarLanzamientoStrike(){
		juego.realizarLanzamiento(10);
	}
	@Test
	public void elScoreDeberiaDetectarUnStrikeEnLosTiros(){
		realizarLanzamientoStrike();
		juego.realizarLanzamiento(3);
		juego.realizarLanzamiento(4);
		assertEquals(17,juego.calcularScore());
	}
	@Test
	public void elScoreDeberiaDetectarUnDosStrikesNoConsecutivos(){
		realizarLanzamientoStrike();
		juego.realizarLanzamiento(3);
		juego.realizarLanzamiento(4);
		juego.realizarLanzamiento(4);
		realizarLanzamientoStrike();
		juego.realizarLanzamiento(3);
		juego.realizarLanzamiento(4);
		realizarNLanzamientos(0,13);
		assertEquals(38,juego.calcularScore());
	}
}
	
