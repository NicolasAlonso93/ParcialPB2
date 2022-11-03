package Dominio;

public abstract class Dispositivos implements Denunciable{

	protected String sistemaOperativo;
	protected String direccionIP;
	protected String localidad;
	
	public Dispositivos(String sistemaOperativo, String direccionIP, String localidad) {
		this.sistemaOperativo=sistemaOperativo;
		this.direccionIP=direccionIP;
		this.localidad=localidad;
	
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getDireccionIP() {
		return direccionIP;
	}

	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
}
