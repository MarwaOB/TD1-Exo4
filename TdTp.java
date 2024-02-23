import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;




public class TdTp {
   
    private LocalDate date;
    private LocalTime time;
    private int nbNiv ;
    private int nombregroupe ;


   
    private Map<Etudiant, Integer> listAbs = new HashMap<>();

    public static LocalDate getRandomDate(LocalDate startDate, LocalDate endDate) {
        Random random = new Random();
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        long randomEpochDay = startEpochDay + random.nextInt((int) (endEpochDay - startEpochDay));
        return LocalDate.ofEpochDay(randomEpochDay);
    }

    public static LocalTime getRandomTime(LocalTime startTime, LocalTime endTime) {
        Random random = new Random();
        long startSeconds = startTime.toSecondOfDay();
        long endSeconds = endTime.toSecondOfDay();
        long randomSeconds = startSeconds + random.nextInt((int) (endSeconds - startSeconds));
        return LocalTime.ofSecondOfDay(randomSeconds);
    }
    public TdTp( int nNiv , int nombregroupe) {
     

        LocalDate startDate = LocalDate.of(2023, 9, 21);
        LocalDate endDate = LocalDate.of(2024, 6, 30);
        this.date = getRandomDate(startDate, endDate);

        LocalTime startTime = LocalTime.of(8, 30, 0);
        LocalTime endTime = LocalTime.of(17, 00, 00);
        this.time = getRandomTime(startTime, endTime);
        Groupe e = Scolarite.TAB[nNiv].groupes[nombregroupe]; 

        for ( int i= 0 ; i< e.getMax();  i ++){
            Random random = new Random();
            listAbs.put(   e.Etudiants[i],  random.nextInt(2));
         
        }

     
      
    }
}
