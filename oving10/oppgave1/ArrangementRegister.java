package oving10.oppgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ArrangementRegister {
  private final List<Arrangement> arrangements;

  public ArrangementRegister() {
    this.arrangements = new ArrayList<>();
  }

  public void registerArrangement(Arrangement arrangement) {
    arrangements.add(arrangement);
  }

  public List<Arrangement> findByLocation(String location) {
    List<Arrangement> result = new ArrayList<>();
    for (Arrangement arrangement : arrangements) {
      if (arrangement.getLocation().equalsIgnoreCase(location)) {
        result.add(arrangement);
      }
    }
    return result;
  }

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

  public List<Arrangement> sortByLocation() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparing(Arrangement::getLocation));
    return sortedList;
  }

  public List<Arrangement> sortByType() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparing(Arrangement::getType));
    return sortedList;
  }

  public List<Arrangement> sortByTime() {
    List<Arrangement> sortedList = new ArrayList<>(arrangements);
    sortedList.sort(Comparator.comparingLong(Arrangement::getTime));
    return sortedList;
  }
}
