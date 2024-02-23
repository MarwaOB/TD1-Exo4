
public class Groupe {
    private final int NumGrp;
    private int max = 30;
    private String niv;
    private int nivInt ;

    private Etudiant[] Etudiants = new Etudiant[max];
    private Module[] Module = new Module[9];

    public void creerGroupe() {
        for (int i = 0; i < this.max; i++) {
            Etudiant e = new Etudiant("nom" + String.valueOf(i), "prenom" + String.valueOf(i), this.NumGrp);
            Etudiants[i] = e;
        }
    }

    public Groupe(int NumGrp,int max ,String niveau , int n) {
        this.NumGrp = NumGrp;
        this.max = max;
        niv = niveau ;
        this.nivInt = n ;

        if ( n== 1){
 Module e = new Module("ANA1", n , NumGrp);
            Module[0] = e;
             e = new Module("ALG1", n, NumGrp);
            Module[1] = e;
            e = new Module("ALSDS", n , NumGrp);
            Module[2] = e;
            e = new Module("ELEC", n , NumGrp);
            Module[3] = e;
            e = new Module("SYST1", n , NumGrp);
            Module[4] = e;
            e = new Module("TEE", n , NumGrp);
            Module[5] = e;
            e = new Module( "ARCHI1", n , NumGrp);
            Module[6] =e;
            e = new Module("BWEB / ANG1", n , NumGrp);
            Module[7] = e;
        }
        if ( n == 2){
            Module e = new Module("ANA2", n , NumGrp);
                       Module[0] = e;
                        e = new Module("ALG2", n , NumGrp);
                       Module[1] = e;
                       e = new Module("ALSDD", n , NumGrp);
                       Module[2] = e;
                       e = new Module("ELEF1", n , NumGrp);
                       Module[3] = e;
                       e = new Module("SYST2", n , NumGrp);
                       Module[4] = e;
                       e = new Module("TEO", n , NumGrp);
                       Module[5] = e;
                       e = new Module( "MECA", n , NumGrp);
                       Module[6] =e;
                       e = new Module("BWEB / ANG1", n , NumGrp);
                       Module[7] = e;
                   }

                   if (n == 3){
                    Module e = new Module("ANA3", n , NumGrp);
                               Module[0] = e;
                                e = new Module("ALG3", n , NumGrp);
                               Module[1] = e;
                               e = new Module("SFSD", n , NumGrp);
                               Module[2] = e;
                               e = new Module("ELEF2", n , NumGrp);
                               Module[3] = e;
                               e = new Module("ARCHI2", n , NumGrp);
                               Module[4] = e;
                               e = new Module("ECON", n , NumGrp);
                               Module[5] = e;
                               e = new Module( "PRST2", n , NumGrp);
                               Module[6] =e;
                               e = new Module("ANG2", n , NumGrp);
                               Module[7] = e;
                           }
                          if ( n == 4){
                            Module e = new Module("ANA4", n , NumGrp);
                                       Module[0] = e;
                                        e = new Module("LOGM", n , NumGrp);
                                       Module[1] = e;
                                       e = new Module("POO", n , NumGrp);
                                       Module[2] = e;
                                       e = new Module("OOE", n , NumGrp);
                                       Module[3] = e;
                                       e = new Module("PRST2", n , NumGrp);
                                       Module[4] = e;
                                       e = new Module("SINF", n , NumGrp);
                                       Module[5] = e;
                                       e = new Module( "PRJT", n , NumGrp);
                                       Module[6] =e;
                                       e = new Module(" ANG3", n , NumGrp);
                                       Module[7] = e;
                                   }
                                   if (n == 5){
                                    Module e = new Module("SYC1", n , NumGrp);
                                               Module[0] = e;
                                                e = new Module("IGL", n , NumGrp);
                                               Module[1] = e;
                                               e = new Module("RO", n , NumGrp);
                                               Module[2] = e;
                                               e = new Module("THP", n , NumGrp);
                                               Module[3] = e;
                                               e = new Module("ORGA", n , NumGrp);
                                               Module[4] = e;
                                               e = new Module("RES1", n , NumGrp);
                                               Module[5] = e;
                                               e = new Module( "ANUM", n , NumGrp);
                                               Module[6] =e;
                                               e = new Module(" ANG4", n , NumGrp);
                                               Module[7] = e;
                                           }
                                           if (n == 6){
                                            Module e = new Module("ARCHI3" ,n , NumGrp);
                                                       Module[0] = e;
                                                        e = new Module("CPRJ" ,n , NumGrp);
                                                       Module[1] = e;
                                                       e = new Module("RES2", n , NumGrp);
                                                       Module[2] = e;
                                                       e = new Module("BDD" ,n , NumGrp);
                                                       Module[3] = e;
                                                       e = new Module("MCSI", n , NumGrp);
                                                       Module[4] = e;
                                                       e = new Module("SEC" ,n , NumGrp);
                                                       Module[5] = e;
                                                       e = new Module( "SYC2" ,n , NumGrp);
                                                       Module[6] =e;
                                                       e = new Module(" ANG4" ,n , NumGrp);
                                                       Module[7] = e;
                                                   }

        creerGroupe();

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

    public int getNumGrp() {
        return NumGrp;
    }

    public int getMax() {
        return max;
    }

    public String getNiv() {
        return niv;
    }

    public int getNivInt() {
        return nivInt;
    }

    public Module[] getModule() {
        return Module;
    }
}