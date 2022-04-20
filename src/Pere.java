import java.util.Scanner;

public class Pere extends Personne{
    private String salaire;
    private int nombreEnfant;
    private int nombreFemme;


        public  Pere (){

    }
    public Pere(String salaire, int nombreEnfant, int nombreFemme) {
        this.salaire = salaire;
        this.nombreEnfant = nombreEnfant;
        this.nombreFemme = nombreFemme;
    }

    public String getSalaire() {
        return salaire;
    }



    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public int getNombreEnfant() {
        return nombreEnfant;
    }

    public void setNombreEnfant(int nombreEnfant) {
        this.nombreEnfant = nombreEnfant;
    }

    public int getNombreFemme() {
        return nombreFemme;
    }

    public void setNombreFemme(int nombreFemme) {
        this.nombreFemme = nombreFemme;
    }


    public void saisiSalaire() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez Enregistrer votre Salaire");
        setSalaire(saisie.nextLine());
        System.out.println("Vous Avez combien D'enfant ?");
        setNombreEnfant(saisie.nextInt());
        System.out.println("Vous Avez Combien de Femmes ?");
        setNombreFemme(saisie.nextInt());
    }
    public String travailler() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Vous travaillez dans quoi ?");
        String travail = saisie.nextLine();
        return travail;
    }

    public String manger(){
        Scanner saisie = new Scanner(System.in);
        System.out.println("Vous mangez quoi ?");
        String bouffe = saisie.nextLine();
        return bouffe;
    }

}
