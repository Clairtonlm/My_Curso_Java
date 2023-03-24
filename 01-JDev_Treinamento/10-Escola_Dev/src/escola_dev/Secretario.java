package escola_dev;

import java.util.Objects;

public class Secretario extends Pessoa {
	private String registo;
	private String nivelCargo;
	private String experiencia;
	
	
	//Metodo Getters e Setters
	public String getRegisto() {
		return registo;
	}
	public void setRegisto(String registo) {
		this.registo = registo;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(experiencia, nivelCargo, registo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretario other = (Secretario) obj;
		return experiencia == other.experiencia && Objects.equals(nivelCargo, other.nivelCargo)
				&& Objects.equals(registo, other.registo);
	}
	@Override
	public String toString() {
		return "Secretario [registo=" + registo + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	
	
}
