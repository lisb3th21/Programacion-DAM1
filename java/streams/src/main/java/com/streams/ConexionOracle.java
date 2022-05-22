package com.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;


public class ConexionOracle {
	
	private static final String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB1.localdomain";
	private static final String user="sys as SYSDBA";
	private static final String password="Oradoc_db1" ;

	public static void imprimirselect(){
		try{

			BufferedWriter writer = new BufferedWriter(new FileWriter("productos.txt"));
			Connection connection= DriverManager.getConnection(url, user, password);

			Statement statement =connection.createStatement();

			ResultSet resulset = statement.executeQuery("Select product_name from products");

			while (resulset.next()) {
				writer.write(resulset.getString("product_name")+ "\n");
			}
			writer.close();
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ConexionOracle.imprimirselect();
	}

}


