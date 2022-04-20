import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        Pere Abdou = new Pere();
        Mere Aicha = new Mere();
        System.out.println("Veuillez Saisir les informations du Pere");
        Abdou.saisir();
        String job= Abdou.travailler();
        String bouffer = Abdou.manger();
        System.out.println("Veuillez Saisir les informations de la Mere");
        Aicha.saisir();
        Aicha.saisieindo();
        String bouf = Aicha.manger();
        Aicha.getIndo();
        Enfant Ama = new Enfant();
        System.out.println("Veuillez Saisir les informations de l'enfant");
        Ama.saisir();
        Ama.saisiee();
        String bouff = Ama.manger();
        Abdou.afficher();
        System.out.println("Votre travail est : " +job);
        System.out.println("Vous mangez du " +bouffer);
        Aicha.afficher();
        System.out.println("Vous mangez du " +bouf);
        Ama.afficher();
        System.out.println("Vous mangez du " +bouff);


    }
}
