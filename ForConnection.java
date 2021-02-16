package com.serverside;

import java.sql.*;

public class ForConnection {

	static Connection con() throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dbUser","hello");
		return con;
	}

}
