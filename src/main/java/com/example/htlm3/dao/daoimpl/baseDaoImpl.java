package main.java.com.example.htlm3.dao.daoimpl;
import main.java.com.example.htlm3.dao.baseDao;

import java.sql.*;

public class baseDaoImpl implements baseDao {
    private static final String DB_URL = "jdbc:opengauss://192.168.60.200:5432/mydb_test?";
    private static final String USER = "my_gauss"; // 替换为你的数据库用户名
    private static final String PASSWORD = "my_gauss@123"; // 替换为你的数据库密码
    String driver = "org.opengauss.Driver";
    public PreparedStatement ps;
    public ResultSet rs;
    public Statement st;
    public Connection con = null;
    @Override
    public void openDb() throws SQLException, ClassNotFoundException {
        // 获取数据库连接
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void closeResource() throws SQLException {
        if(con!=null)
        {
            con. close();
        }
        if(ps!=null)
        {
            ps.close();
        }
        if(rs!=null)
        {
            rs.close();
        }
        if(st !=null){
            st.close();
        }
    }
    @Override
    public void openTransaction() throws SQLException, ClassNotFoundException {
        openDb();
        con.setAutoCommit(false);
    }

    @Override
    public void commitTransaction() throws SQLException {
        if (con !=null)
            con.commit();
    }

    @Override
    public void rollbackTransaction() throws SQLException {
        if (con !=null)
            con.rollback();
    }
}
