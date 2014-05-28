package modelo;

public class Team {
	private String nombrePais;
	private int posFifa;
	private int numeroCopasGanadas;
	private int pUno;
	private int pDos;
	private int pTres;
        private String grupo;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "[Equipo:] "+this.nombrePais+" [Posición Fifa:] "+this.posFifa+" [Copas Ganadas:] "+this.numeroCopasGanadas;
		
	}
	
	public String getNombrePais() {
		return nombrePais;
	}


	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}


	public int getPosFifa() {
		return posFifa;
	}


	public void setPosFifa(int posFifa) {
		this.posFifa = posFifa;
	}


	public int getNumeroCopasGanadas() {
		return numeroCopasGanadas;
	}


	public void setNumeroCopasGanadas(int numeroCopasGanadas) {
		this.numeroCopasGanadas = numeroCopasGanadas;
	}


	public int getpUno() {
		return pUno;
	}


	public void setpUno(int pUno) {
		this.pUno = pUno;
	}


	public int getpDos() {
		return pDos;
	}


	public void setpDos(int pDos) {
		this.pDos = pDos;
	}


	public int getpTres() {
		return pTres;
	}


	public void setpTres(int pTres) {
		this.pTres = pTres;
	}
	
	
	
}
