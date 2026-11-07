import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionTest {
        public static void main(String[] args) throws SQLException {

            String url = "jdbc:mysql://localhost:3306/my_developer_blog";
            String username = "root";
            String password = System.getenv("BLOG_DB_PASSWORD");

            if (password == null || password.isBlank()) {
                System.out.println("请先配置数据库密码环境变量");
                return;
            }

            try (Connection conn =
                         DriverManager.getConnection(url, username, password)) {

                System.out.println("数据库连接成功！");
                String sql = "SELECT title, author, content FROM articles";

                try (PreparedStatement stmt = conn.prepareStatement(sql);
                     ResultSet rs = stmt.executeQuery()) {

                    while (rs.next()) {
                        String title = rs.getString("title");
                        String author = rs.getString("author");
                        String content = rs.getString("content");

                        System.out.println("标题：" + title);
                        System.out.println("作者：" + author);
                        System.out.println("内容：" + content);
                        System.out.println("---------------");
                    }
                }
            }
        }
}

