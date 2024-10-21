package oving10.oppgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ArrangementRegister {
  private List<Arrangement> arrangements;

  public ArrangementRegister() {
    this.arrangements = new ArrayList<>();
  }

  // Register a new arrangement
  public void registerArrangement(Arrangement arrangement) {
    arrangements.add(arrangement);
  }

  // Find all arrangements at a given location
  public List<Arrangement> findByLocation(String location) {
    List<Arrangement> result = new ArrayList<>();
    for (Arrangement arrangement : arrangements) {
      if (arrangement.getLocation().equalsIgnoreCase(location)) {
        result.add(arrangement);
      }
    }
    return result;
  }

  // Find all arrangements on a given date (e.g., 20021030XXXX)
  public List<Arrangement> findByDate(long date) {
    List<Arrangement> result = new ArrayList<>();
    for (Arrangement arrangement : arrangements) {
      long eventDate = arrangement.getTime() / 10000;  // Extract date part
      if (eventDate == date) {
        result.add(arrangement);
      }
    }
    return result;
  }

  // Find all arrangements within a time interval
  public List<Arrangement> findByTimeInterval(long startTime, long endTime) {
    List<Arrangement> result = new ArrayList<>();
    for (Arrangement arrangement : arrangements) {
      long eventTime = arrangement.getTime();
      if (eventTime >= startTime && eventTime <= endTime) {
        result.add(arrangement);
      }
    }
    result.sort(Comparator.comparingLong(Arrangement::getTime));
    return result;
  }

  // List all arrangements sorted by location
  public List<Arrangement> sortByLocation() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparing(Arrangement::getLocation));
    return sortedList;
  }

  // List all arrangements sorted by type
  public List<Arrangement> sortByType() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparing(Arrangement::getType));
    return sortedList;
  }

  // List all arrangements sorted by time
  public List<Arrangement> sortByTime() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparingLong(Arrangement::getTime));
    return sortedList;
  }
}
