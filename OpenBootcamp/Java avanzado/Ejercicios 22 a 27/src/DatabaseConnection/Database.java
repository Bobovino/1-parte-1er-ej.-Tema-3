package DatabaseConnection;

import java.sql.ResultSet;

public interface Database {
    void connect();
    void disconnect();
    ResultSet executeQuery(String query);
    int executeUpdate(String statement);
}
