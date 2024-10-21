package oving10.oppgave1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();

        register.registerArrangement(new Arrangement(1, "Concert", "Oslo", "MusicOrg", "Concert", 202310301800L));
        register.registerArrangement(new Arrangement(2, "Theater", "Bergen", "ArtGroup", "Theater", 202310291900L));
        register.registerArrangement(new Arrangement(3, "Lecture", "Trondheim", "EduCorp", "Lecture", 202310281200L));

        // Find by location
        List<Arrangement> osloEvents = register.findByLocation("Oslo");
        System.out.println("Events in Oslo: " + osloEvents);

        // Find by date
        List<Arrangement> eventsOnDate = register.findByDate(20231029);
        System.out.println("Events on 29th October 2023: " + eventsOnDate);

        // Find by time interval
        List<Arrangement> eventsInInterval = register.findByTimeInterval(202310281200L, 202310301800L);
        System.out.println("Events between given dates: " + eventsInInterval);

        // Sort by location
        List<Arrangement> sortedByLocation = register.sortByLocation();
        System.out.println("Events sorted by location: " + sortedByLocation);

        // Sort by type
        List<Arrangement> sortedByType = register.sortByType();
        System.out.println("Events sorted by type: " + sortedByType);

        // Sort by time
        List<Arrangement> sortedByTime = register.sortByTime();
        System.out.println("Events sorted by time: " + sortedByTime);
    }
}

