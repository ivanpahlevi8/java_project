package com.company;
import java.util.List;

public interface Musician {
    String get_music_school();
    void set_music_school(String music_school);
    List<String> get_song();
    void set_song(List<String> songs);
    String get_genre();
    void set_genre(String genre);

}
