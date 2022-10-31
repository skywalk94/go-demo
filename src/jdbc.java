import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) throws Exception {
//        注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1";
        String root = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, root, password);

//        定义sql
        String sql = "UPDATE account SET money=money+500 WHERE name='张三'";

//        获取执行sql对象
        Statement stmt = conn.createStatement();

//        执行sql
        int count = stmt.executeUpdate(sql);
//        处理结果
        System.out.println(count);

//        释放资源
        stmt.close();
        conn.close();
    }
}
