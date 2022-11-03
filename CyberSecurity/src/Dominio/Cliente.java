package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Denunciable {

	private Integer codigo;
	private String CUIT;
	private String nombre;
	private List <Dispositivos> dispositivo;
	
	public Cliente(String CUIT, String nombre) {
		this.CUIT=CUIT;
		this.nombre=nombre;
		this.dispositivo=new ArrayList<>();

		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Dispositivos> getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(List<Dispositivos> dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	
	
	

}
