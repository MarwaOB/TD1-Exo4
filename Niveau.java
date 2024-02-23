import java.util.*;

public class Niveau {
    private String code;
    private int  n ;
    private int nombregroupe ;
    private String Module[] = new String[9] ;
    private Groupe groupes[] = new Groupe[nombregroupe ]; 

    public Niveau() {
        System.out.println("1 : CP1-S1");
        System.out.println("2 : CP1-S2");
        System.out.println("3 : CP2-S1");
        System.out.println("4 : CP2-S2");
        System.out.println("5 : CS1-S1");
        System.out.println("6 : CS1-S2");
        System.out.println("7 : CS2-SID-S1");
        System.out.println("8 : CS2-SID-S2");
        System.out.println("9 : CS2-SIL-S1");
        System.out.println("10: CS2-SIL-S2");
        System.out.println("11: CS2-SIQ-S1");
        System.out.println("12: CS2-SIQ-S2");
        System.out.println("13: CS2-SIT-S1");
        System.out.println("14: CS2-SIT-S2");

        System.out.print("Entrer un niveau: ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
this.n = choix ;
        switch(choix) {
           case 1: {
             this.code = "CP1-S1";
             break;
        }
            case 2: {this.code = "CP1-S2";
                break;
            }

            case 3: {
             this.code = "CP2-S1";
                break;
            }

            case 4: {
             this.code = "CP2-S2";
            }

            case 5: {
             this.code = "CS1-S1";
                break;
            }
            case 6: {
             this.code = "CS1-S2";
                break;
            }


            case 7: {
             this.code = "CS2-SID-S1";
            /*  Module[0] = "HPC";
             Module[1] = "ML";
             Module[2] = "ANAD";
             Module[3] = "BDA";
             Module[4] = "TSG";
             Module[5] = "CRP";
             Module[6] = "INFOVIS";
             Module[7] = "MASD";
             Module[8] = "SGOV";
*/
                break;
            }

            case 8: {
             this.code = "CS2-SID-S2";
        /*      Module[0] = "RV";
             Module[1] = "BI";
             Module[2] = "IMN";
             Module[3] = "PMSS";
             Module[4] = "TOAI";
             Module[5] = "IRIAD";
             Module[6] = "RCR";
             Module[7] = "TALN";*/

                break;
            }

            case 9: {
             this.code = "CS2-SIL-S1";
           /*   Module[0] = "IHM";
             Module[1] = "MAGIL";
             Module[2] = "TPGO";
             Module[3] = "PDC";
             Module[4] = "WEB";
             Module[5] = "OUTILS";
             Module[6] = "COMPIL";
             Module[7] = "ANAD";
             Module[8] = "STAGE";*/

                break;
            }

            case 10: {
             this.code = "CS2-SIL-S2";
         /*     Module[0] = "MBL2";
             Module[1] = "BDM";
             Module[2] = "QLOG";
             Module[3] = "ENTP";
             Module[4] = "IHM";
             Module[5] = "MBL1";
             Module[6] = "MNG";
             Module[7] = "ALOG";
             Module[8] = "BDA";*/

                break;
            }

            case 11: {
             this.code = "CS2-SIQ-S1";
          /*    Module[0] = "RESA";
             Module[1] = "TPGO";
             Module[2] = "COMPIL";
             Module[3] = "ANAD";
             Module[4] = "FAS";*/

                break;
            }

            case 12: {
             this.code = "CS2-SIQ-S2";
            /*  Module[0] = "SSR";
             Module[1] = "SYSR";
             Module[2] = "BDA";
             Module[3] = "OPTM";
             Module[4] = "MCSI";
             Module[5] = "ALOG";
             Module[6] = "PRJT";*/

                break;
            }

            case 13: {
             this.code = "CS2-SIT-S1";
        /*     Module[0] = "AQUA";
             Module[1] = "ASI";
             Module[2] = "TICO";
             Module[3] = "BDA";
             Module[4] = "MPSI";
             Module[5] = "SIAD";
             Module[6] = "ANAD";
*/
                break;
            }

            case 14: {
             this.code = "CS2-SIT-S2";
      /*      Module[0] = "SIC";
             Module[1] = "MSSI";
             Module[2] = "PRJT";
             Module[3] = "FASI";
             Module[4] = "COFI";
             Module[5] = "AL";
             Module[6] = "ERP";
             Module[7] = "PRJT-SSI";*/  

                break;
            }
        }


      System.out.print("Entrer le nombre de groupes dans ce niveau: ");
       scanner = new Scanner(System.in);
        nombregroupe = scanner.nextInt();

            for (int i = 0; i < this.nombregroupe; i++) {
               Groupe e = new Groupe(i, 30, code);
               groupes [i] = e;
            }
      

    }

    public String getCode() {
        return code;
    }

    public String[] getModule() {
        return Module;
    }

    public void afficherModules() {
        int j;
        for (int i = 0; i < 9 ; i++) {
            j  = i+1;
            if (Module[i] != null)
                System.out.println(" " + j + ": " + Module[i]);

        }

    }
}

