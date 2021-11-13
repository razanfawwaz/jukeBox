import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class main {
    private static String statement;

    public static void show() {

    }

    public static void main(String[] args) {

        List<Song> playlistSong = new ArrayList<>();

        List<Song> allSongs = new ArrayList<Song>();
        Song song1 = new Song("Traitor", new Artist("Olivia Rodrigo"), new Album("Sour"), new Duration(3.50));
        Song song2 = new Song("Good 4 U", new Artist("Olivia Rodrigo"), new Album("Sour"), new Duration(2.59));
        Song song3 = new Song("Happier Than Ever", new Artist("Billie Eilish"), new Album("Happier Than Ever"), new Duration(4.59));
        Song song4 = new Song("Bad Habits", new Artist("Ed Sheeran"), new Album("Bad Habits"), new Duration(3.52));
        Song song5 = new Song("Painkiller", new Artist("Ruel"), new Album("Painkiller"), new Duration(3.34));
        Song song6 = new Song("Cheap Thrills", new Artist("Sia"), new Album("This is Acting"), new Duration(3.45));
        Song song7 = new Song("Wish U Were Here", new Artist("Avril Lavigne"), new Album("Goodbye Lullaby"), new Duration(3.46));
        Song song8 = new Song("Womanizer", new Artist("Britney Separs"), new Album("Circus"), new Duration(3.45));
        Song song9 = new Song("Rumah ke Rumah", new Artist("Hindia"), new Album("Menari dengan Bayangan"), new Duration(4.38));
        Song song10 = new Song("Lara", new Artist("Dialog Senja"), new Album("Lara"), new Duration(5.27));

        allSongs.add(song1);
        allSongs.add(song2);
        allSongs.add(song3);
        allSongs.add(song4);
        allSongs.add(song5);
        allSongs.add(song6);
        allSongs.add(song7);
        allSongs.add(song8);
        allSongs.add(song9);
        allSongs.add(song10);

        List<PlayList> allPlayLists = new ArrayList<PlayList>();
        List<Song> songsInThePlayList = new ArrayList<Song>();
        PlayList playList1 = new PlayList("Hits Hari Ini!", songsInThePlayList);
        songsInThePlayList.add(song1);
        songsInThePlayList.add(song2);
        songsInThePlayList.add(song3);
        songsInThePlayList.add(song6);
        songsInThePlayList.add(song7);
        songsInThePlayList.add(song10);
        allPlayLists.add(playList1);

        System.out.println(allPlayLists.get(0).songsInPlaylist);

        JukeBox jukeBox = new JukeBox(allSongs, allPlayLists);

        Scanner menu = new Scanner(System.in);
        boolean condition = true;
        Operation classOperation = new Operation();
        while (condition) {
            System.out.println("\n\t \t \t \t \t \t \t\t\t\t \tJ U K E B O X \t \t \t \t\t \t \t ");
            System.out.println(("_____________________________________________________________________________________________________"));
            System.out.println("|\t \t                                                                                            |");
            System.out.println("|\t \t                                     MAIN MENU                                              |");


            // System.out.print("|\t ");
            //System.out.println("SONG NAME \t \t \t \t \t\tARTIST \t \t \t \t \t\t ALBUM \t \t \t\t \t DURATION \t|");
            // System.out.println("|___________________________________________________________________________________________________|");
            //System.out.println("|(1)Traitor\t\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t3.50\t|");
            //System.out.println("|(2)Good 4 U\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t2.59\t|");
            //System.out.println("|(3)Happier Than Ever\t\t\tBillie Eilish\t\t\t\tHappier Than Ever\t\t\t\t4.59\t|");
            //System.out.println("|(4)Bad Habits\t\t\t\t\tEd Sheeran\t\t\t\t\tBad Habits \t\t\t\t\t\t3.52\t|");
            // System.out.println("|(5)Painkiller\t\t\t\t\tRuel \t\t\t\t\t\tPainkiller\t\t\t\t\t\t3.34 \t|");
            //System.out.println("|(6)Cheap Thrills\t\t\t\tSia\t\t\t\t\t\t\tThis is Acting\t\t\t\t\t3.45\t|");
            //System.out.println("|(7)Wish U Were Here\t\t\tAvril Lavigne\t\t\t\tGoodbye Lullaby\t\t\t\t\t3.46\t|");
            // System.out.println("|(8)Womanizer\t\t\t\t\tBritney Spears \t\t\t\tCircus\t\t\t\t\t\t\t3.45\t|");
            //System.out.println("|(9)Rumah ke Rumah\t\t\t\tHindia \t\t\t\t\t\tMenari dengan bayangan\t\t\t4.38\t|");
            //System.out.println("|(10)Lara\t\t\t\t\t\tDialog Senja \t\t\t\tLara\t\t\t\t\t\t\t5.27\t|");
            System.out.println("|\t \t __________________________________________________________________________________         |");
            System.out.println("|\t \t|          (1) PLAY MUSIC                 |         (2)GO TO PLAYLIST              |        |");
            System.out.println("|\t \t|_________________________________________|________________________________________|        |");
            System.out.println("|\t \t                                                                                            |");
            System.out.println("|___________________________________________________________________________________________________| ");
            System.out.print(" \t \tChoose menu: ");
            String option = menu.nextLine();

            // System.out.println();
            switch (option) {
                case "1" -> {
                    System.out.println("\n\t \t \t \t \t \t \t\t\t\t   PLAY MUSIC \t \t \t \t\t \t \t ");
                    System.out.println("_____________________________________________________________________________________________________");
                    System.out.print("|\t ");
                    System.out.println("SONG NAME \t \t \t \t \t\tARTIST \t \t \t \t \t\t ALBUM \t \t \t\t \t DURATION \t|");
                    System.out.println("|___________________________________________________________________________________________________|");
                    System.out.println("|(1)Traitor\t\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t3.50\t|");
                    System.out.println("|(2)Good 4 U\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t2.59\t|");
                    System.out.println("|(3)Happier Than Ever\t\t\tBillie Eilish\t\t\t\tHappier Than Ever\t\t\t\t4.59\t|");
                    System.out.println("|(4)Bad Habits\t\t\t\t\tEd Sheeran\t\t\t\t\tBad Habits \t\t\t\t\t\t3.52\t|");
                    System.out.println("|(5)Painkiller\t\t\t\t\tRuel \t\t\t\t\t\tPainkiller\t\t\t\t\t\t3.34 \t|");
                    System.out.println("|(6)Cheap Thrills\t\t\t\tSia\t\t\t\t\t\t\tThis is Acting\t\t\t\t\t3.45\t|");
                    System.out.println("|(7)Wish U Were Here\t\t\tAvril Lavigne\t\t\t\tGoodbye Lullaby\t\t\t\t\t3.46\t|");
                    System.out.println("|(8)Womanizer\t\t\t\t\tBritney Spears \t\t\t\tCircus\t\t\t\t\t\t\t3.45\t|");
                    System.out.println("|(9)Rumah ke Rumah\t\t\t\tHindia \t\t\t\t\t\tMenari dengan bayangan\t\t\t4.38\t|");
                    System.out.println("|(10)Lara\t\t\t\t\t\tDialog Senja \t\t\t\tLara\t\t\t\t\t\t\t5.27\t|");
                    System.out.println("|(exit) CLOSE THE PROGRAM                                                                           |");
                    System.out.println("|___________________________________________________________________________________________________|");
                    System.out.print("  \t \tInput song number : ");
                    String chooseSong = menu.nextLine();
                    System.out.println("\n");
                    System.out.println("\t \t \t \t \t \t \t\t\t\t  NOW PLAYING\t \t \t \t\t \t \t ");
                    switch (chooseSong) {
                        case "1":
                            jukeBox.playSong("Traitor");
                            break;
                        case "2":
                            jukeBox.playSong("Good 4 U");
                            break;
                        case "3":
                            jukeBox.playSong("Happier Than Ever");
                            break;
                        case "4":
                            jukeBox.playSong("Bad Habits");
                            break;
                        case "5":
                            jukeBox.playSong("Painkiller");
                            break;
                        case "6":
                            jukeBox.playSong("Cheap Thrills");
                            break;
                        case "7":
                            jukeBox.playSong("Wish U Were Here");
                            break;
                        case "8":
                            jukeBox.playSong("Womanizer");
                            break;
                        case "9":
                            jukeBox.playSong("Rumah ke Rumah");
                            break;
                        case "10":
                            jukeBox.playSong("Lara");
                            break;
                        case "exit":
                            System.out.println("EXIT!");
                            exit(0);
                    }
                    System.out.println("\n\t================BACK TO MAIN MENU================");
                    System.out.println("TYPE 'Y' FOR YES");
                    System.out.println("TYPE 'N' FOR QUIT");
                    String statement = menu.nextLine();
                    System.out.println("\t=================================================");

                    if (statement.equalsIgnoreCase("y")) {
                        classOperation.setStart("Y");
                    } else {
                        classOperation.setStart("N");
                    }

                    if (classOperation.isStart()) {
                        condition = true;
                    } else {
                        condition = false;
                        break;
                    }
                }
                case "2" -> {
                    System.out.println("\n\t \t \t \t \t \t \t\t\t\t   PLAYLIST  \t \t \t \t\t \t \t ");
                    System.out.println("_____________________________________________________________________________________________________");
                    System.out.print("|\t ");
                    System.out.println("SONG NAME \t \t \t \t \t\tARTIST \t \t \t \t \t\t ALBUM \t \t \t\t \t DURATION \t|");
                    System.out.println("|___________________________________________________________________________________________________|");
                    System.out.println("|(1)Traitor\t\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t3.50\t|");
                    System.out.println("|(2)Good 4 U\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t2.59\t|");
                    System.out.println("|(3)Happier Than Ever\t\t\tBillie Eilish\t\t\t\tHappier Than Ever\t\t\t\t4.59\t|");
                    System.out.println("|(4)Bad Habits\t\t\t\t\tEd Sheeran\t\t\t\t\tBad Habits \t\t\t\t\t\t3.52\t|");
                    System.out.println("|(5)Painkiller\t\t\t\t\tRuel \t\t\t\t\t\tPainkiller\t\t\t\t\t\t3.34 \t|");
                    System.out.println("|(6)Cheap Thrills\t\t\t\tSia\t\t\t\t\t\t\tThis is Acting\t\t\t\t\t3.45\t|");
                    System.out.println("|(7)Wish U Were Here\t\t\tAvril Lavigne\t\t\t\tGoodbye Lullaby\t\t\t\t\t3.46\t|");
                    System.out.println("|(8)Womanizer\t\t\t\t\tBritney Spears \t\t\t\tCircus\t\t\t\t\t\t\t3.45\t|");
                    System.out.println("|(9)Rumah ke Rumah\t\t\t\tHindia \t\t\t\t\t\tMenari dengan bayangan\t\t\t4.38\t|");
                    System.out.println("|(10)Lara\t\t\t\t\t\tDialog Senja \t\t\t\tLara\t\t\t\t\t\t\t5.27\t|");
                    System.out.println("|(exit) CLOSE THE PROGRAM                                                                           |");
                    System.out.println("|___________________________________________________________________________________________________|");
                    System.out.print("\nAdd song number : ");
                    String songPlaylist = menu.nextLine();
                    System.out.println("\n");
                    switch (songPlaylist) {
                        case "1":
                            playlistSong.add(allSongs.get(0));
                            break;
                        case "2":
                            playlistSong.add(allSongs.get(1));
                            break;
                        case "3":
                            playlistSong.add(allSongs.get(2));
                            break;
                        case "4":
                            playlistSong.add(allSongs.get(3));
                            break;
                        case "5":
                            playlistSong.add(allSongs.get(4));
                            break;
                        case "6":
                            playlistSong.add(allSongs.get(5));
                            break;
                        case "7":
                            playlistSong.add(allSongs.get(6));
                            break;
                        case "8":
                            playlistSong.add(allSongs.get(7));
                            break;
                        case "9":
                            playlistSong.add(allSongs.get(8));
                            break;
                        case "10":
                            playlistSong.add(allSongs.get(9));
                            break;
                        default:
                            System.out.println("SONG NOT FOUND");
                            break;
                    }
                    System.out.println("\n\t \t \t \t \t \t \t\t\t\t YOUR PLAYLIST \t \t \t \t\t \t \t ");
                    for (int i = 0; i < playlistSong.size(); i++) {
                        System.out.println(playlistSong.get(i).songName);
                    }

                    System.out.println("\n\t================BACK TO MAIN MENU================");
                    System.out.println("TYPE 'Y' FOR YES");
                    System.out.println("TYPE 'N' FOR QUIT");
                    String statement = menu.nextLine();
                    System.out.println("\t=================================================");

                    if (statement.equalsIgnoreCase("y")) {
                        classOperation.setStart("Y");
                    } else {
                        classOperation.setStart("N");
                    }

                    if (classOperation.isStart()) {
                        condition = true;
                    } else {
                        condition = false;
                        break;
                    }
                }
            }
        }
    }
}