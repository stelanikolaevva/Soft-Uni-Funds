package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        int lastBacklash = path.lastIndexOf('\\');
        String fileAndExtension = path.substring(lastBacklash+1,path.length());
        String file = fileAndExtension.split("\\.")[0];
        String extension= fileAndExtension.split("\\.")[1];

        System.out.println("File name: "+file);
        System.out.println("File extension: "+extension);
    }
}
