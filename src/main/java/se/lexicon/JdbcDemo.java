package se.lexicon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDateTime;


// 50 min in i videon


public class JdbcDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "321qaz";


    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to DB are successful");
            String selectStudent = "select * from student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectStudent);

            while (resultSet.next()) {
                int studentId = resultSet.getInt("id");
                String studentName = resultSet.getString("name");
                String groupName = resultSet.getString("class_group");
                LocalDateTime createDate = resultSet.getTimestamp("create_date").toLocalDateTime();


                System.out.println("id: " + studentId + ",Name " +  studentName + "GroupName: " + groupName + " Registrated " + createDate);

            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database:" + e.getMessage());
            e.printStackTrace();
        }
    }


}
