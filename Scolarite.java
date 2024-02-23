import java.security.PublicKey;
import java.util.*;


public class Scolarite {
    public static Niveau[] TAB = new Niveau[10];

public Scolarite(){
  System.out.print("Entrer le nombre de  niveaux ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
for ( int i = 0 ; i< choix ; i++){
    Niveau e = new Niveau(); 
    TAB[i]= e ; 
}
    }

}
