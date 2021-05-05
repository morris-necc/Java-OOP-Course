import java.util.LinkedList;
public class Genus {
    private String genusName;

    public Genus(String g){
        this.genusName = g;
    }

    public void setGenusName(String g){
        this.genusName = g;
    }

    public String getGenusName(){
        return this.genusName;
    }

    public String toString(){
        return "Genus: " + getGenusName();
    }

    // Construct a method countSpecimens( Specimen[] animals, Species s)
    // that will output the number of specimens of the given species
    // in the zoo

    public int countSpecimens(Specimen[] animals, Species s){
        // how many specimens of species s is in the damn zoo
        int count = 0;
        for(Specimen animal: animals){
            if(animal.getTOA() == s){
                count++;
            }
        }
        return count;
    }

    public LinkedList makeList( Specimen[] animals ){

        LinkedList<Specimen> specimens = new LinkedList<Specimen>();
        for(Specimen animal: animals){
            specimens.add(animal);
        }
        return specimens;

    }

    public LinkedList makeSpeciesList(LinkedList animals){
        LinkedList<Species> species = new LinkedList<Species>();
        Iterator<Species> iterator = species.listIterator(0);
        while(iter.hasNext()){
            species.add(iter.next().getTOA());
        }
        return species;
    }

    public LinkedList makeSpeciesListUnique(LinkedList allSpecies){
        LinkedList<Species> species = new LinkedList<Species>();
        Iterator<Species> iterator = species.listIterator(0);
        while(iter.hasNext()){
            species.add(iter.next().getTOA());
        }
    }

}
