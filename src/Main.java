import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
        Article article1=new Article(
                "Java学习",
                "zagclb",
                "今天学习了Java基础"
        );

        Article article2=new Article(
                "Git学习",
                "zagclb",
                "我学会了Git基本操作"
        );

        Article article3=new Article(
                "Mysql学习",
                "zagclb",
                "我学会了Mysql基本操作"
        );

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        for (Article article:articles){
            article.printInfo();
        }

        System.out.println("一共有"+articles.size()+"篇文章");

    }
}
