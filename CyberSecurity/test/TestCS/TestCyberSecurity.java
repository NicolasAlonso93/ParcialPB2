package TestCS;

import static org.junit.Assert.*;

import org.junit.Test;

import Dominio.Biometria;
import Dominio.Cliente;
import Dominio.Dispositivos;
import Dominio.Extraccion;
import Dominio.Movil;
import Dominio.PC;
import Dominio.Sistema;
import Dominio.Transaccion;

public class TestCyberSecurity {
	
	
	String CUIT = "78-11223344-9";
	String nombre = "Nico";
	
	String sistemaOperativo = "Windows";
	String direccionIP = "LBB-2313";
	String localidad = "Moron";
	
	
	
	String IMEI = "bdsfhbsd";
	Biometria registroBiometrico = Biometria.NADA;
	
	
	

	@Test
	public void queSePuedaCrearUnCliente() {
		
	Cliente cliente = new Cliente (CUIT,nombre);	
		
	assertNotNull(cliente);

	}

	@Test
	public void queSePuedaCrearUnDispositivo() {
		
		Dispositivos PC = new PC (sistemaOperativo, direccionIP, localidad);
		Dispositivos celu = new Movil (sistemaOperativo, direccionIP, localidad, IMEI, registroBiometrico);
		
		assertNotNull(PC);
		assertNotNull(celu);
	}
	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() {
		
		Cliente cliente = new Cliente (CUIT,nombre);
		Transaccion extraccion = new Extraccion();
		
		Sistema nuevoSistema = new Sistema();
		
	
	}
	
	@Test
	public void queSePuedaMonitorearUnaTransferencia() {
}
	
	@Test
	public void queSePuedaMonitorearUnPagoConQR() {
		
	}
	
	@Test
	public void queSePuedaMonitorearUnPagoDeServicio() {
		
	}
	
	@Test
	public void queSePuedaMonitorearUnAltaDeUsuario() {
		
	}
	
	@Test
	public void queSePuedaMonitorearUnCambioDeContraseña() {
		
	}
	
	@Test
	public void queElScoreDeUnaTransaccionRechazableSinAntecedentesDeCero() {
		
	}
	
	@Test
	public void queUnaTransaccionAlertablePuedaSerMarcadaComoFraudulenta() {
		
	}
	
	@Test
	public void queElScoreDeUnaTransaccionRechazableConNuevoDispositivoDe20Puntos() {
		
	}
	
	@Test
	public void QueUnaTransaccionDeMasDe60PuntosYMenosDeOchentaSeaAlertadaPeroAprobada() {
		
	}
	
	@Test
	public void queUnaTransaccionDeMasDe80PuntosLanceLaExcepcionFraudeException() {
		
	}
	

	
}
