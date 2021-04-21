package OblectsAndClasses.Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");
        Articles articles = new Articles(article[0],article[1],article[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String command = line.split(": ")[0];
            String todo  = line.split(": ")[1];

            switch (command){
                case "Edit":
                    articles.setContent(todo);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(todo);
                    break;
                case "Rename":
                    articles.setTitle(todo);
                    break;
            }
        }
        System.out.println(articles);
    }
}
