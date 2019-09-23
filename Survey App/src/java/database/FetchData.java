package database;

import datasource.UserDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FetchData {

    public static void insertData(UserDataSource userDataSource) throws SQLException, FileNotFoundException {

        Connection connection = CreateConnection.getCon();
     //   File img = new File(userDataSource.getImage());
       // FileInputStream fileInputStream = new FileInputStream(img);
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Login_info values(?,?,?,?,?)");
        preparedStatement.setString(1, userDataSource.getName());
        preparedStatement.setString(2, userDataSource.getPassword());
        preparedStatement.setString(3, userDataSource.getMobile_Num());
        preparedStatement.setString(4, userDataSource.getEmail());
        preparedStatement.setString(5, userDataSource.getGender());
      //  preparedStatement.setBinaryStream(6, fileInputStream);

        preparedStatement.execute();

    }
}
