package com.hccs.advweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.hccs.advweb.util.DatabaseUtil;

public class CustomerList {
	private ArrayList<Customer> cusList = null;

	public ArrayList<Customer> getCusList() {
		try {
			cusList = new ArrayList<Customer>();
			Connection conn = DatabaseUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from customer");
			while (rs.next()) {
				Customer customer = new Customer();
				String name = rs.getString("cus_name");
				String email = rs.getString("cus_email");
				String subject = rs.getString("cus_subject");
				String message = rs.getString("cus_message");
				customer.setCusEmail(email);
				customer.setCusName(name);
				customer.setCusSubject(subject);
				customer.setCusMessage(message);
				cusList.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cusList;
	}

	public void setCusList(ArrayList<Customer> cusList) {
		this.cusList = cusList;
	}
	
	public static void addCustomer(Customer customer){
		try {
			Connection conn = DatabaseUtil.getConnection();
			String sql = "INSERT INTO CUSTOMER (cus_name,cus_email,cus_subject,cus_message) VALUES (?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, customer.getCusName());
			st.setString(2, customer.getCusEmail());
			st.setString(3, customer.getCusSubject());
			st.setString(4, customer.getCusMessage());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public CustomerList() {
		// TODO Auto-generated constructor stub
	}

}
