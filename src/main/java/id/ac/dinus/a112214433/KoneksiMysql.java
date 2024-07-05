package id.ac.dinus.a112214433;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Kelas pembantu database
 */
public class KoneksiMysql {
  /** URL jdbc database */
  String url;
  /** nama user database */
  String usr;
  /** password user database */
  String pwd;
  /** nama database */
  String dbn;

  /**
   * Konstruktor singkat
   *
   * @param dbn {@link dbn}
   */
  public KoneksiMysql(String dbn) {
    this.url = "jdbc:mysql://localhost/" + dbn;
    this.usr = "root";
    this.pwd = "";
  }

  /**
   * Konstruktor rinci
   *
   * @param host host database
   * @param user {@link usr}
   * @param pass {@link pwd}
   * @param dbn {@link dbn}
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
    @SuppressWarnings("unused")
    Connection c = kon.getConnection();
  }

}
