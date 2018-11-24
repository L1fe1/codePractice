package base.database;

import java.sql.*;

public class PreparedStmtExample {
    public static void main(String args[]) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice", "root", "123456");
        PreparedStatement preStatement = conn.prepareStatement("select distinct name from sc where cno=?");
        preStatement.setString(1, "1");

        ResultSet result = preStatement.executeQuery();

        while(result.next()){
            System.out.println("Loan Type: " + result.getString("sno"));
        }
    }
}
