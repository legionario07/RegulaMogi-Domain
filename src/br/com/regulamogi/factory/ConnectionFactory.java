package br.com.regulamogi.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static Connection con = null;

//	private static String url = "jdbc:mysql://localhost/regulamogi?autoReconnect=true";
//	private static String usuario = "root";
//	private static String senha = "root";
        
        
        
        private static String url = "jdbc:mysql://omniatechnology.com.br:3306/omnitsge_regulamogi?useSSL=false";
	private static String usuario = "omnitsge_root";
	private static String senha = "brasilwork07";
//        
        

	public static Connection getConnection() {
		try {

			if (con == null || con.isClosed()) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(url, usuario, senha);

				} catch (Exception e) {
					System.out.println("N�o foi possivel conectar com o Banco de Dados");
					e.printStackTrace();

				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return con;
	}



	
}
