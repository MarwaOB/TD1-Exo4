import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



public class TdTp {
    private Groupe Grp;
    private LocalDate date;
    private LocalTime time;

    private String module;
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
    public TdTp(Groupe grp) {
        this.Grp = grp ;

        LocalDate startDate = LocalDate.of(2023, 9, 21);
        LocalDate endDate = LocalDate.of(2024, 6, 30);
        this.date = getRandomDate(startDate, endDate);

        LocalTime startTime = LocalTime.of(8, 30, 0);
        LocalTime endTime = LocalTime.of(17, 00, 00);
        this.time = getRandomTime(startTime, endTime);

        grp.getNiv().afficherModules();
        System.out.println("Choisir un module: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("test apres choix success ");
        this.module = grp.getNiv().getModule()[choice-1];

        //Remplir la liste des absc
        for(int i=0; i< grp.getMax(); i++) {
            System.out.println("Is the etudiant: "+grp.getEtudiants()[i].getNom()+grp.getEtudiants()[i].getPrenom() + " absent ? : yes/no");
            String abs = scanner.next();
            if(abs.equals("yes")) {
                grp.getEtudiants()[i].setCptAbs(grp.getEtudiants()[i].getCptAbs()+1);
                listAbs.put(grp.getEtudiants()[i], 1);
            } else {
                listAbs.put(grp.getEtudiants()[i], 0);
            }
        }

        scanner.close();
    }
}
