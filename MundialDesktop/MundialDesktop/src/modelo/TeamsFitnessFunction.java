package modelo;

import java.util.ArrayList;
import java.util.List;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class TeamsFitnessFunction extends FitnessFunction {

    List teams = new ArrayList();

    public TeamsFitnessFunction(List teams) {
        this.teams = teams;

    }

    @Override
    protected double evaluate(IChromosome chromosome) {
        double score = 0;
        List dups = new ArrayList();
        int badSolution = 1;

        for (int i = 0; i < chromosome.size(); i++) {
            int index = (Integer) chromosome.getGene(i).getAllele();

            if (dups.contains(index)) {
                badSolution = 0;
            } else {
                dups.add(index);
            }

            Equipo team = (Equipo) teams.get(index);
            double genreScore = getGenreScore(team);
            if (genreScore == 0) {
                badSolution = 0;
            }
            score = (score + team.getRankingfifa() + team.getPartidodos() + team.getPartidouno() + team.getPartidotres() + (genreScore))+dificultadGrupo(team);

        }
        return (score * badSolution);
    }

    private double getGenreScore(Equipo team) {
        double genreScore = 0;
        if (team.getNumerocopasganadas() > 0) {
            genreScore = genreScore + 5;
        }
        return genreScore;
    }

    public int dificultadGrupo(Equipo equipo) {
        List<Equipo> equipos = teams;
        int dificultad = 0;
        int cont = 0;
        List<Equipo> equiposGrupo = new ArrayList<>();
        for (Equipo equipo1 : equipos) {
            if (equipo1.getGrupo().equals(equipo.getGrupo()) && equipo1.getEquipo() != equipo.getEquipo()) {
                equiposGrupo.add(equipo1);                
            }
        }

        for (Equipo e : equiposGrupo) {
            if (equipo.getNumerocopasganadas() > 0 && equipo.getRankingfifa() < 20) {
                cont++;
            }
        }
        if (cont > 1) {
            dificultad = 5;
        } else {
            dificultad = 10;
        }       
        return dificultad;
    }

}
