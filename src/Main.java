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
            switch (choice){
                case 1:
                    for (Article article:articles){
                        article.printInfo();
                    }
                    break;
                case 0:
                    System.out.println("退出程序");
                    return;
                default:
                    System.out.println("请重新输入");
            }
        }
    }
}
