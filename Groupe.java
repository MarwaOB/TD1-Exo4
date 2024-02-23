
public class Groupe {
    private final int NumGrp;
    private int max = 0;
    private Niveau niv;

    private Etudiant[] Etudiants = new Etudiant[max];

    public void creerGroupe() {
        for (int i = 0; i < this.max; i++) {
            Etudiant e = new Etudiant("nom" + i, "prenom" + i, this.NumGrp);
            Etudiants[i] = e;
        }
    }

    public Groupe(int NumGrp,int max) {
        this.NumGrp = NumGrp;
        this.max = max;
        niv = new Niveau();
        creerGroupe();
    }

    public Niveau getNiv() {
        return niv;
    }

    public int getMax() {
        return max;
    }

    public void afficherList() {
        int j;
        System.out.println("Affichage de la liste des Etudiant du groupe: "+ this.NumGrp);
        for(int i = 0; i < this.max; i++) {
            j = i+1 ;
            System.out.println("Etudiant: "+ j + ": " + Etudiants[i].getNom()+" "+  Etudiants[i].getPrenom()+" ; Nombre ABS: "+  Etudiants[i].getCptAbs() );
        }
    }

    public Etudiant[] getEtudiants() {
        return Etudiants;
    }
}