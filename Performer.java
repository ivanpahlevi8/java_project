package com.company;

import com.coba.Gender;
import com.coba.Human;
import java.util.List;

public class Performer extends Human implements Musician, Actor {

    private String music_school;
    private String genre;
    private List<String> songs;
    private String acting_school;
    private List<String> films;

    public Performer(String first_name, String second_name, int age, float height, Gender gender) {
        super(first_name, second_name, age, height, gender);
    }

    @Override
    public int get_time_to_live() {
        return (LIFESPAN - getAge()) / 2;
    }
    @Override
    public String get_music_school() {
        return music_school;
    }
    @Override
    public void set_music_school(String music_school) {
        this.music_school = music_school;
    }
    @Override
    public List<String> get_song() {
        return songs;
    }
    @Override
    public void set_song(List<String> songs) {
        this.songs = songs;
    }
    public void addSong(String song) {
        this.songs.add(song);
    }
    @Override
    public String get_genre() {
        return genre;
    }
    @Override
    public void set_genre(String genre){
        this.genre = genre;
    }
    @Override
    public String get_acting_school(){
        return acting_school;
    }
    @Override
    public void set_acting_school(String acting_school) {
        this.acting_school = acting_school;
    }
    @Override
    public List<String> get_movie() {
        return films;
    }
    @Override
    public void set_films(List<String> films) {
        this.films = films;
    }
    public void addFilm(String filmName) {
        this.films.add(filmName);
    }
}
