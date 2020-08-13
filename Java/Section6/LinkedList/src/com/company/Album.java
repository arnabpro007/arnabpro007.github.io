package com.company;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songArrayList = new ArrayList<Song>();

    public Album(String albumName) {
        this.albumName = albumName;
    }

    //to check if a song is in the Album
    public int findSong(String Title){
        for (int i = 0; i < songArrayList.size(); i++) {
            if (songArrayList.get(i).getTitle().equals(Title)){
                return i;
            }
        }
        return -1;
    }
    public int findSong(Song song){
        int position = songArrayList.indexOf(song);
        if (position < 0){
            System.out.println( song.getTitle()+" is not in the album!");
            return -1;
        }
        System.out.println("The " + song.getTitle() + " is in the album and is in the position " + position);
        return position;
    }
    public Song getSong(String Title){
        for (int i = 0; i < songArrayList.size(); i++) {
            if (songArrayList.get(i).getTitle().equals(Title)){
                return songArrayList.get(i);
            }

        }
        return null;

    }
    //Adding new song in the album (only if it is not already there)
    public boolean addSong(Song song){
        int position = songArrayList.indexOf(song);
        if (position<0){
            songArrayList.add(song);
            System.out.println("Added "+ song.getTitle() + " to the album!");
            return true;
        }
        System.out.println(song.getTitle() + " is already in the album. It is in the position " + position);
        return false;
    }

    //remove song from the album
    public boolean removeSong(Song song){
        int position = songArrayList.indexOf(song);
        if (position>=0){
            songArrayList.remove(song);
            System.out.println("Removed "+ song.getTitle() + " from the album!");
            return true;
        }
        System.out.println(song.getTitle() + " is not in the album. ");
        return false;
    }



}
