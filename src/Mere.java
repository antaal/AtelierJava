import java.util.Scanner;

public class Mere extends Personne{
    private Boolean indo;

    public Boolean getIndo() {
        return indo;
    }

    public void setIndo(Boolean indo) {
        this.indo = indo;
    }
    public Mere() {

    }
    public Mere(Boolean indo) {
        this.indo = indo;
    }

    public void saisieindo() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Etes Vous Indo ?");
        setIndo(saisie.nextBoolean());
    }

    public void afficher(){
        super.afficher();
        System.out.println("Vous etez Indo: " +getIndo());

    }
    public String manger(){
        Scanner saisie = new Scanner(System.in);
        System.out.println("Vous mangez quoi ?");
        String bouffe = saisie.nextLine();
        return bouffe;
    }

}


