import java.util.Scanner;

public class Enfant extends Personne {
    private String salle;
    private String ecole;
    private Pere pere;
    private Mere mere;

    public Enfant(){

    }
    public Enfant(String salle, String ecole, Pere pere, Mere mere) {
        this.salle = salle;
        this.ecole = ecole;
        this.pere = pere;
        this.mere = mere;
    }


    public void saisiee() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez Saisir votre classe");
        setSalle(saisie.nextLine());
        System.out.println("Veuillez Saisir votre ecole");
        setEcole(saisie.nextLine());
    }
    public void afficher(){
        super.afficher();
        System.out.println("Vous etes en "+getSalle()+" "+"a l'ecole " +getEcole());
    }

    public String manger(){
        Scanner saisie = new Scanner(System.in);
        System.out.println("Vous mangez quoi ?");
        String bouffe = saisie.nextLine();
        return bouffe;
    }
    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
}