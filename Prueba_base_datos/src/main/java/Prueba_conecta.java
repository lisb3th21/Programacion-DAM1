import java.sql.*;


public class Prueba_conecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//crear conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
			//crear objeto statement
			Statement miStatement= miConexion.createStatement();
			
			//ejecutar sql
			ResultSet miResulset= miStatement.executeQuery("SELECT * FROM beer;");
			//recorer el resultado 
			while (miResulset.next()) {
				System.out.println(miResulset.getString("name")+ " | "+ miResulset.getString("brewer"));
			}
			
		}catch(Exception e){
			System.out.print("No se ha conseguido conectarse");
			e.printStackTrace();
		}
	}

}
