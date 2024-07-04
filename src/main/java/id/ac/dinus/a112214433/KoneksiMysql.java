package id.ac.dinus.a112214433;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Kelas pembantu database
 */
public class KoneksiMysql {
  String url, usr, pwd, dbn;

  /**
   * @param dbn nama database yang akan digunakan
   */
  public KoneksiMysql(String dbn) {
    this.url = "jdbc:mysql://localhost/" + dbn;
    this.usr = "root";
    this.pwd = "";
  }

  /**
   * @param dbn nama database yang akan digunakan
   */
  public KoneksiMysql(String host, String user, String pass, String dbn) {
    this.url = "jdbc:mysql://" + host + "/" + dbn;
    this.usr = user;
    this.pwd = pass;
  }

  /**
   * @return koneksi sql baru
   */
  public Connection getConnection() {
    Connection con = null;
    try {
      // Class.forName("com.mysql.jdbc.Driver");
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(this.url, this.usr, this.pwd);
    } catch (ClassNotFoundException e) {
      System.out.println("Error #1 : " + e.getMessage());
      System.exit(0);
    } catch (SQLException e) {
      System.out.println("Error #2 : " + e.getMessage());
      System.exit(0);
    }
    return con;
  }

  /**
   * Tidak digunakan
   */
  public static void main(String args[]) {
    KoneksiMysql kon = new KoneksiMysql("pbo");
    Connection c = kon.getConnection();
  }

}
