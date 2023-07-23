package main.java.com.example.htlm3.dao.daoimpl;

import main.java.com.example.htlm3.dao.commentDao;
import main.java.com.example.htlm3.entity.Comment;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class commentDaoImpl extends baseDaoImpl implements commentDao {
    @Override
    public void addComment(Comment comment) throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT COUNT(*) AS total_rows FROM \"my_gauss\".\"Comment\"";
        ps = con.prepareStatement(sql);
        rs=ps.executeQuery();
        if(rs.next()){
            int i= rs.getInt("total_rows");
            i++;
            LocalDate currentDate = LocalDate.now();
            String sql1="INSERT INTO Comment (id,username,message)VALUES(?,?,?)";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,comment.getId());
            ps.setString(2,comment.getUsername());
            ps.setString(3,comment.getMessage());
        }
    }

    @Override
    public List<Comment> getComments() throws SQLException, ClassNotFoundException {
        openDb();
        String sql="SELECT * FROM \"my_gauss\".\"Comment\"";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        List<Comment> comments=new ArrayList<>();
        while (rs.next()){
            Comment comment=new Comment();
            comment.setId(rs.getInt("id"));
            comment.setMessage(rs.getString("message"));
            comment.setUsername(rs.getString("username"));
            comments.add(comment);
        }
        return comments;
    }
}
