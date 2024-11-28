package quiz2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection connection;

    public static Connection bukaKoneksi() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL, username, dan password
            String url = "jdbc:mysql://localhost:3306/sportstore";
            String username = "root";
            String password = "";

            // Membuka koneksi ke database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal: " + e.getMessage());
        }

        return connection;
    }

    public static void main(String[] args) {
        // Uji koneksi
        bukaKoneksi();
    }
}
