public class Article {
    String title;
    String author;
    String content;

    public Article(String title,String author,String content){
        this.title=title;
        this.author=author;
        this.content=content;
    }

    public void printInfo(){
        System.out.println("标题："+title);
        System.out.println("作者："+author);
        System.out.println("内容："+content);

    }
}
