package Dominio;

public class Movil extends Dispositivos {
	
	private String IMEI;
	private Biometria registroBiometrico;

	public Movil(String sistemaOperativo, String direccionIP, String localidad, String IMEI, Biometria registroBiometrico) {
		super(sistemaOperativo, direccionIP, localidad);
		this.IMEI=IMEI;
		this.registroBiometrico=registroBiometrico;
	}

}
