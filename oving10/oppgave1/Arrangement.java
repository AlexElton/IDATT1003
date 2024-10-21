package oving10.oppgave1;

import java.util.Objects;

public class Arrangement {
  private final int id;
  private final String name;
  private final String location;
  private final String organizer;
  private final String type;
  private final long time;

  public Arrangement(int id, String name, String location, String organizer, String type, long time) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.organizer = organizer;
    this.type = type;
    this.time = time;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public String getOrganizer() {
    return organizer;
  }

  public String getType() {
    return type;
  }

  public long getTime() {
    return time;
  }

  @Override
  public String toString() {
    return "Arrangement [id=" + id + ", name=" + name + ", location=" + location +
        ", organizer=" + organizer + ", type=" + type + ", time=" + time + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Arrangement that = (Arrangement) o;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
