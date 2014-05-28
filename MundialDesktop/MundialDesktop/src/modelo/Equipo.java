package modelo;
// Generated 27/05/2014 02:15:53 PM by Hibernate Tools 3.6.0



/**
 * Equipo generated by hbm2java
 */
public class Equipo  implements java.io.Serializable {


     private int equipo;
     private Integer rankingfifa;
     private Integer numerocopasganadas;
     private Integer partidouno;
     private Integer partidodos;
     private Integer partidotres;
     private String nombrepais;
     private String grupo;

    public Equipo() {
    }

	
    public Equipo(int equipo) {
        this.equipo = equipo;
    }
    public Equipo(int equipo, Integer rankingfifa, Integer numerocopasganadas, Integer partidouno, Integer partidodos, Integer partidotres, String nombrepais, String grupo) {
       this.equipo = equipo;
       this.rankingfifa = rankingfifa;
       this.numerocopasganadas = numerocopasganadas;
       this.partidouno = partidouno;
       this.partidodos = partidodos;
       this.partidotres = partidotres;
       this.nombrepais = nombrepais;
       this.grupo = grupo;
    }
   
    public int getEquipo() {
        return this.equipo;
    }
    
    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
    public Integer getRankingfifa() {
        return this.rankingfifa;
    }
    
    public void setRankingfifa(Integer rankingfifa) {
        this.rankingfifa = rankingfifa;
    }
    public Integer getNumerocopasganadas() {
        return this.numerocopasganadas;
    }
    
    public void setNumerocopasganadas(Integer numerocopasganadas) {
        this.numerocopasganadas = numerocopasganadas;
    }
    public Integer getPartidouno() {
        return this.partidouno;
    }
    
    public void setPartidouno(Integer partidouno) {
        this.partidouno = partidouno;
    }
    public Integer getPartidodos() {
        return this.partidodos;
    }
    
    public void setPartidodos(Integer partidodos) {
        this.partidodos = partidodos;
    }
    public Integer getPartidotres() {
        return this.partidotres;
    }
    
    public void setPartidotres(Integer partidotres) {
        this.partidotres = partidotres;
    }
    public String getNombrepais() {
        return this.nombrepais;
    }
    
    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Equipo: "+this.nombrepais;
    }




}

