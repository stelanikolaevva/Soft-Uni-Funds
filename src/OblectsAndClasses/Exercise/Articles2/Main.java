package OblectsAndClasses.Exercise.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> article = new ArrayList<>();

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] elms = scanner.nextLine().split(", ");
            Article oArticle = new Article(elms[0],elms[1],elms[2]);
            article.add(oArticle);
        }

        String format = scanner.nextLine();
        switch(format){
            case "title":
                article.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                article.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                article.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        for (Article article1 : article) {
            System.out.print(article1.toString());
        }
    }
}
