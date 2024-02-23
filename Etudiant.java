import java.util.Scanner;

public class Etudiant {
    private String nom;
    private String prenom;
    private int matricule;
    private int groupe;

    private int cptAbs = 0;
    private static int NbEtud = 0;


    public Etudiant(String last, String first,int group) {
        this.nom = last;
        this.prenom = first;
        this.NbEtud = NbEtud + 1;
        this.matricule = NbEtud;
        this.groupe = group;
    }



    public void afficher() {
        System.out.println("Nom est :" + nom);
        System.out.println("Prenom est :" + prenom);
        System.out.println("Matricule est :" + matricule);

    }

    public int GetNbEtud() {
        return NbEtud;
    }

    public void SetNom(String nom) {
        this.nom = nom;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void SetMatricule(int mat) {
        this.matricule = mat;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCptAbs() {
        return cptAbs;
    }

    public String getNom() {
        return nom;
    }

    public void setCptAbs(int cptAbs) {
        this.cptAbs = cptAbs;
    }
}
   