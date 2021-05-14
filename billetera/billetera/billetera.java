package billetera;

import java.sql.*;
import beans.Billetera;
import beans.User;
import bbdd.Conexion;

public class billetera {
	
	public void selectUser() {
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT DOGE FROM BILLETERA WHERE USER='jesus';");
		try {
			if(resultado.next()) {
				String usuario = resultado.getString("user");
				User usuarioRecogido = new User();
			}
			} catch (Exception f) {
			System.out.println(f.getMessage());
		}
}
}