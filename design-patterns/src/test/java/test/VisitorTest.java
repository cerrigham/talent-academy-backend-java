package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorTest {

    static final Music MUSIC = new Playlist(
            new Song("You Give Love a Bad Name"),
            new Playlist(
                    new Song("Summer of '69"),
                    new Song("Heaven")
            )
    );

    @Test
    @DisplayName("can play all music")
    void canPlayAllMusic() {
        String result = MUSIC.play();

        assertEquals("You Give Love a Bad Name" +
                System.lineSeparator() +
                "Summer of '69" +
                System.lineSeparator() +
                "Heaven", result);
    }

    @Test
    @DisplayName("can count all songs")
    void canCountAllSongs() {
        int count = new SongCounter().count(MUSIC);
        assertEquals(3, count);
    }


}

interface Music extends MusicVisitable {

    String play();

}

record Song(String title) implements Music {

    @Override
    public String play() {
        return title;
    }

    @Override
    public void accept(MusicVisitor visitor) {
        visitor.accept(this);
    }

}

record Playlist(Music... music) implements Music {

    @Override
    public String play() {
        return Arrays.stream(music)
                .map(Music::play)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public void accept(MusicVisitor visitor) {
        visitor.accept(this);
    }

}

interface MusicVisitable {

    void accept(MusicVisitor visitor);

}

interface MusicVisitor {

    void accept(Song song);

    void accept(Playlist playlist);

}

class SongCounter implements MusicVisitor {

    private int count = 0;

    @Override
    public void accept(Song song) {
        count++;
    }

    @Override
    public void accept(Playlist playlist) {
        count += Stream.of(playlist.music())
                .mapToInt(music -> new SongCounter().count(music))
                .sum();
    }

    public int count(Music music) {
        music.accept(this);
        return count;
    }

}
