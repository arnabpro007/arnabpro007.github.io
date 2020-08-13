package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallange {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<Song>();
        boolean quit = false;
        Album Album1 = new Album("English Songs");
        Album Album2 = new Album("Bengali Songs");
        printMenuMain();
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Byee Mate!");
                    quit = true;
                    break;
                case 1:
                    //adding song in the album 1
                    System.out.println("Enter the song Title: ");
                    String Title = scanner.nextLine();
                    System.out.println("Enter the song duration: ");
                    double duration = scanner.nextDouble();
                    Song song = new Song(Title,duration);
                    Album1.addSong(song);
                    break;
                case 2:
                    //adding song in the album 2
                    System.out.println("Enter the song Title: ");
                    Title = scanner.nextLine();
                    System.out.println("Enter the song duration: ");
                    duration = scanner.nextDouble();
                    song = new Song(Title,duration);
                    Album2.addSong(song);
                    break;
                case 3:
                    //Remove a song from album 1
                    System.out.println("Enter the song Title: ");
                    Title = scanner.nextLine();
                    System.out.println("Enter the song duration: ");
                    duration = scanner.nextDouble();
                    song = new Song(Title,duration);
                    Album1.removeSong(song);
                    break;
                case 4:
                    //Remove a song from album 2
                    System.out.println("Enter the song Title: ");
                    Title = scanner.nextLine();
                    System.out.println("Enter the song duration: ");
                    duration = scanner.nextDouble();
                    song = new Song(Title,duration);
                    Album2.removeSong(song);
                    break;
                case 5:
                    //Add a song to the playlist
                    System.out.println("Creating the playlist");
                    System.out.println("Enter the song Title: ");
                    Title = scanner.nextLine();
                    int check1 = Album1.findSong(Title);
                    int check2 = Album2.findSong(Title);//checks if the song is in the album and returns true if that is the case;
                    if(check1 <0 && check2 <0){
                        System.out.println(Title + " is not in any of the album, consider adding it to the album first");

                    }else if (check1>=0){
                        song = Album1.getSong(Title); //gets the song from the album
                        playlist.add(song);
                        System.out.println(song.getTitle() + " added to the playlist");
                    }else{
                        song = Album2.getSong(Title);
                        playlist.add(song);
                        System.out.println(song.getTitle() + " added to the playlist");
                    }
                    break;
                case 6:
                    //Entering Playlist:
                    Playlist(playlist);
                case 7:
                    printMenuMain();

            }
        }


    }
    public static void printMenuMain(){
        System.out.println("Available Actions: ");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to add song to album 1");
        System.out.println("Press 2 to add song to album 2");
        System.out.println("Press 3 to remove song from album 1");
        System.out.println("Press 4 to remove song from album 2");
        System.out.println("Press 5 to add song to playlist");
        System.out.println("Press 6 to enter the playlist");
        System.out.println("Press 7 to get to the menu");
    }
    public static void Playlist(LinkedList playlist){
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.isEmpty()){
            System.out.println("No songs in the playlist");
            return;
        }else{
            System.out.println("Now Playing " + listIterator.next().getTitle());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the beginning of the playlist!");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    } else {

                        goingForward = false;
                    }

                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {

                        System.out.println("Replaying the song " + listIterator.previous().getTitle());
                    }
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Menu for the Playlist: ");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to go to next song");
        System.out.println("Press 2 to go to previous song");
        System.out.println("Press 3 to replay the current song");
        System.out.println("Press 4 to print menu");
    }
}
