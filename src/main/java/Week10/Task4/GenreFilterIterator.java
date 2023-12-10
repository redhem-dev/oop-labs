package Week10.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {

    ArrayList<Song> playlist;
    private String genre;
    private int currentIndex;

    public GenreFilterIterator(ArrayList<Song> playlist, String genre){
        this.playlist = playlist;
        this.genre = genre;
        this.currentIndex = 0;
    }
    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size()){
            if (playlist.get(currentIndex).getGenre().equals(genre))
                return true;

            currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        if (!hasNext())
            throw new NoSuchElementException("No more songs with that genre!");

        return playlist.get(currentIndex++);
    }
}