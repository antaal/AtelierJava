import java.util.Scanner;

public class Personne implements IPersonne {


    private String nom;
    private String prenom;

    private String age;


    public Personne() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Personne(String nom, String prenom, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }

    @Override
    public String manger() {
        System.out.println("Vous mangez quoi ?");
        Scanner saisie = new Scanner(System.in);
        String bouffe = saisie.nextLine();
        return bouffe;

    }

    @Override
    public String travailler() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Vous travaillez dans quoi ?");
        String travail = saisie.nextLine();
        return travail;


    }

    @Override
    public void saisir() {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez Saisir un Nom");
        setNom(saisie.nextLine());
        System.out.println("Veuillez Saisir un Prenom");
        setPrenom(saisie.nextLine());
        System.out.println("Veuillez Saisir un Age");
        setAge(saisie.nextLine());



    }

    @Override
    public void afficher() {
        System.out.println("Vous etes" +" "+getNom() +" "+ getPrenom()+" "+"Vous avez"+" "+getAge()+"ans");



    }
}
