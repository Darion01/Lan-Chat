package chatapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDAO {
        public void create(String username, String message) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into users (username,message) values (?,?)")) {
            pstmt.setString(1, username);
            pstmt.setString(2,message);
            pstmt.executeUpdate();
        }
    }
}
