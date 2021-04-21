package OblectsAndClasses.Labs.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberLines; i++) {
            String input  = scanner.nextLine();
            String typeList =input .split("_")[0];
            String songName = input.split("_")[1];
            String time =input.split("_")[2];
            Song song = new Song(typeList, songName, time);
            songs.add(song);

        }
        String filter = scanner.nextLine();
        if (filter.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getSongName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(filter)) {
                    System.out.println(song.getSongName());
                }
            }
        }
    }
}
