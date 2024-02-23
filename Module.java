public class Module {
private String nom ;
private int nombreTdTP ;
private TdTp tab []= new TdTp[nombreTdTP];

public Module( String nomM , int n , int m  ){
this.nom = nomM ; 
for  ( int i = 0 ; i <10; i++){
    
      TdTp e = new TdTp();
      tab [i] = e;
     }

}



}
