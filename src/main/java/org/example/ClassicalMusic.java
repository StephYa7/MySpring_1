package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    private ClassicalMusic() {
        songs.add("Moonlight sonata");
        songs.add("The hall of the mountain king");
        songs.add("Palladio");
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    public List<String> getSong() {
        return songs;
    }

}