package com.company;
import java.util.List;

public interface Actor {
    String get_acting_school();
    void set_acting_school(String acting_school);
    List<String> get_movie();
    void set_films(List<String> films);
    void addFilm(String film_name);
}
