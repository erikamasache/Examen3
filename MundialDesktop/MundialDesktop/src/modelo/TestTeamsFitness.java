package modelo;

import crud.DaoEquipo;
import java.util.ArrayList;
import java.util.List;

import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.DefaultFitnessEvaluator;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.impl.SwappingMutationOperator;

public class TestTeamsFitness {

    private Configuration conf;
    private SwappingMutationOperator swapper;
    private TeamsFitnessFunction fitnessFunction = null;
    public List teams = new ArrayList();
    public String solucion = new String();
    private long tiempo=0;  

    private static final int MAX_ALLOWED_EVOLUTIONS = 1500;
    private Chromosome teamChromosome = null;

    public void initialize() throws Exception {
        DaoEquipo daoEquipo = new DaoEquipo();
        teams = daoEquipo.listaEquipo(false);

        conf = new DefaultConfiguration();
        Configuration.resetProperty(Configuration.PROPERTY_FITEVAL_INST);
        conf.setFitnessEvaluator(new DefaultFitnessEvaluator());
        conf.getGeneticOperators().clear();

        swapper = new SwappingMutationOperator(conf);
        conf.addGeneticOperator(swapper);
        conf.setPreservFittestIndividual(true);
        conf.setPopulationSize(1000);
        conf.setKeepPopulationSizeConstant(false);

        fitnessFunction = new TeamsFitnessFunction(teams);

        conf.setFitnessFunction(fitnessFunction);

        Gene[] teamGenes = new Gene[4];

        teamGenes[0] = new IntegerGene(conf, 0, teams.size() - 1);
        teamGenes[1] = new IntegerGene(conf, 0, teams.size() - 1);
        teamGenes[2] = new IntegerGene(conf, 0, teams.size() - 1);
        teamGenes[3] = new IntegerGene(conf, 0, teams.size() - 1);

        teamChromosome = new Chromosome(conf, teamGenes);
        teamGenes[0].setAllele(new Integer(0));
        teamGenes[1].setAllele(new Integer(1));
        teamGenes[2].setAllele(new Integer(2));
        teamGenes[3].setAllele(new Integer(3));

        conf.setSampleChromosome(teamChromosome);
    }

    public void testSelectFittestTeam() throws Exception {

        DaoEquipo daoEquipo = new DaoEquipo();
        teams = daoEquipo.listaEquipo(false);
        Genotype population = Genotype.randomInitialGenotype(conf);
        IChromosome bestSolutionSoFar = teamChromosome;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
            solucion = solucion + "Evolucion: " + (i + 1) + ", Fitness"+bestSolutionSoFar.getFitnessValue() +"\n";
            for (int j = 0; j < bestSolutionSoFar.size(); j++) {
                int index = (Integer) bestSolutionSoFar.getGene(j).getAllele();
                Equipo team = (Equipo) teams.get(index);
                
                if (j == bestSolutionSoFar.size() - 1) {
                    solucion = solucion + team.toString() + "\n\n";
                } else {
                    solucion = solucion + team.toString() + "\n";
                }
            }
            
            population.evolve();
            IChromosome candidateBestSolution = population.getFittestChromosome();

            if (candidateBestSolution.getFitnessValue() > bestSolutionSoFar.getFitnessValue()) {
                bestSolutionSoFar = candidateBestSolution;
            }
        }
        long endTime = System.currentTimeMillis();
        tiempo=(endTime-startTime);
        printSolution(bestSolutionSoFar, teams);
    }

    public void printSolution(IChromosome solution, List teams) {

        solucion=solucion+"##############################################################\n"+"Valor del Fitness: " + solution.getFitnessValue()+"\n";
//        System.out.println("#################################################################################################################");
//        System.out.println("Valor del Fitness: " + solution.getFitnessValue());

        for (int i = 0; i < solution.size(); i++) {
            int index = (Integer) solution.getGene(i).getAllele();
            Equipo team = (Equipo) teams.get(index);
            solucion = solucion + team.toString() + "\n";
//            System.out.println(team.toString());
        }
        solucion = solucion+"Total tiempo evolución: " + tiempo +" ms\n##############################################################";
        conf.reset();
//        System.out.println("#################################################################################################################");
    }

    public String solucion() {
        return solucion;
    }

}
