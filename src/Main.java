import java.util.ArrayList;
import java.util.Scanner;

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

//        System.out.println("一共有"+articles.size()+"篇文章");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("===== 我的博客管理系统 =====");
            System.out.println("1. 查看所有文章");
            System.out.println("2. 添加文章");
            System.out.println("3. 删除文章");
            System.out.println("0. 退出程序");
            System.out.println("==========================");

            System.out.print("请输入你的选择：");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    showArticles(articles);
                    break;
                case 2:
                    addArticle(articles,sc);
                    break;


                case 3:
                    deleteArticle(articles,sc);
                    break;


                case 0:
                    System.out.println("退出程序");
                    return;
                default:
                    System.out.println("请重新输入");
            }
        }
    }

    static void showArticles(ArrayList<Article>articles){
        for (Article article:articles){
            article.printInfo();
        }
    }

    static void addArticle(ArrayList<Article> articles, Scanner sc) {
        System.out.println("请输入标题：");
        String title = sc.nextLine();

        System.out.println("请输入作者：");
        String author = sc.nextLine();

        System.out.println("请输入内容：");
        String content = sc.nextLine();

        Article article = new Article(title,author,content);

        articles.add(article);

        System.out.println("文章添加成功!");

    }

    static void deleteArticle(ArrayList<Article> articles, Scanner sc){
        System.out.println("===== 删除文章 =====");
        for (int i = 0; i < articles.size(); i++) {
            System.out.println("文章编号："+(i+1));
            Article article = articles.get(i);
            article.printInfo();
        }

        System.out.print("请输入要删除的文章编号：");
        int number = sc.nextInt();
        sc.nextLine();

        if (number >= 1 && number <= articles.size()) {
            articles.remove(number - 1);
            System.out.println("删除成功");
        } else {
            System.out.println("文章编号不存在！");
        }

    }
}
