import java.util.*;

public class Niveau {
    private String code;
    private String Module[] = new String[9] ;

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

        switch(choix) {
           case 1: {
             this.code = "CP1-S1";
             Module[0] = "ANA1";
             Module[1] = "ALG1";
             Module[2] = "ALSDS";
             Module[3] = "ELEC";
             Module[4] = "SYST1";
             Module[5] = "TEE";
             Module[6] = "ARCHI1";
             Module[7] = "BWEB / ANG1";

             break;
        }
            case 2: {this.code = "CP1-S2";
             Module[0] = "ALSDD";
             Module[1] = "SYST2";
             Module[2] = "ANA2";
             Module[3] = "TEO";
             Module[4] = "ALG2";
             Module[5] = "MECA";
             Module[6] = "ELECF1";
             Module[7] = "BWEB / ANG1";

                break;
            }

            case 3: {
             this.code = "CP2-S1";
             Module[0] = "ECON";
             Module[1] = "ALG3";
             Module[2] = "SFSD";
             Module[3] = "ELECF2";
             Module[4] = "PRST1";
             Module[5] = "ANA3";
             Module[6] = "ARCHI2";
             Module[7] = "ANG2";

                break;
            }

            case 4: {
             this.code = "CP2-S2";
             Module[0] = "ANA4";
             Module[1] = "LOGM";
             Module[2] = "POO";
             Module[3] = "OPTEO";
             Module[4] = "PRST2";
             Module[5] = "SINF";
             Module[6] = "PRJP";
             Module[7] = "ANG3";

                break;
            }

            case 5: {
             this.code = "CS1-S1";
             Module[0] = "SYC1";
             Module[1] = "IGL";
             Module[2] = "RO";
             Module[3] = "THP";
             Module[4] = "ORGA";
             Module[5] = "RES1";
             Module[6] = "ANUM";
             Module[7] = "ANG4";

                break;
            }
            case 6: {
             this.code = "CS1-S2";
             Module[0] = "ARCHI3";
             Module[1] = "CPRJ";
             Module[2] = "RES2";
             Module[3] = "BDD";
             Module[4] = "MCSI";
             Module[5] = "SEC";
             Module[6] = "SYC2";
             Module[7] = "ANG4";

                break;
            }


            case 7: {
             this.code = "CS2-SID-S1";
             Module[0] = "HPC";
             Module[1] = "ML";
             Module[2] = "ANAD";
             Module[3] = "BDA";
             Module[4] = "TSG";
             Module[5] = "CRP";
             Module[6] = "INFOVIS";
             Module[7] = "MASD";
             Module[8] = "SGOV";

                break;
            }

            case 8: {
             this.code = "CS2-SID-S2";
             Module[0] = "RV";
             Module[1] = "BI";
             Module[2] = "IMN";
             Module[3] = "PMSS";
             Module[4] = "TOAI";
             Module[5] = "IRIAD";
             Module[6] = "RCR";
             Module[7] = "TALN";

                break;
            }

            case 9: {
             this.code = "CS2-SIL-S1";
             Module[0] = "IHM";
             Module[1] = "MAGIL";
             Module[2] = "TPGO";
             Module[3] = "PDC";
             Module[4] = "WEB";
             Module[5] = "OUTILS";
             Module[6] = "COMPIL";
             Module[7] = "ANAD";
             Module[8] = "STAGE";

                break;
            }

            case 10: {
             this.code = "CS2-SIL-S2";
             Module[0] = "MBL2";
             Module[1] = "BDM";
             Module[2] = "QLOG";
             Module[3] = "ENTP";
             Module[4] = "IHM";
             Module[5] = "MBL1";
             Module[6] = "MNG";
             Module[7] = "ALOG";
             Module[8] = "BDA";

                break;
            }

            case 11: {
             this.code = "CS2-SIQ-S1";
             Module[0] = "RESA";
             Module[1] = "TPGO";
             Module[2] = "COMPIL";
             Module[3] = "ANAD";
             Module[4] = "FAS";

                break;
            }

            case 12: {
             this.code = "CS2-SIQ-S2";
             Module[0] = "SSR";
             Module[1] = "SYSR";
             Module[2] = "BDA";
             Module[3] = "OPTM";
             Module[4] = "MCSI";
             Module[5] = "ALOG";
             Module[6] = "PRJT";

                break;
            }

            case 13: {
             this.code = "CS2-SIT-S1";
             Module[0] = "AQUA";
             Module[1] = "ASI";
             Module[2] = "TICO";
             Module[3] = "BDA";
             Module[4] = "MPSI";
             Module[5] = "SIAD";
             Module[6] = "ANAD";

                break;
            }

            case 14: {
             this.code = "CS2-SIT-S2";
             Module[0] = "SIC";
             Module[1] = "MSSI";
             Module[2] = "PRJT";
             Module[3] = "FASI";
             Module[4] = "COFI";
             Module[5] = "AL";
             Module[6] = "ERP";
             Module[7] = "PRJT-SSI";

                break;
            }
        }
        scanner.close();
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

