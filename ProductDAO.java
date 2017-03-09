package com.javatpoint.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.javatpoint.bean.*;
import com.javatpoint.util.Database;

public class ProductDAO {
		private Connection connection;
		public ProductDAO(){
			connection=Database.getConnection();
		}
		public void ceckProduct(Product product){
			try {
			PreparedStatement ps=connection.prepareStatement("SELECT FROM prodotti WHERE product_id=?");
			ps.setString(1, product.getDescrizione());
			ps.setString(2, product.getName());
			ps.setString(3, product.getPosizione());
			ps.setInt(4, product.getCodice());
			ps.setInt(5, product.getProduct_Id());
			ps.setInt(6, product.getQuantita());
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				updateProduct(product);
			}else{
				addProduct(product);
			}
		} catch (Exception ex) {
			System.out.println("Error in check() -->" + ex.getMessage());
		}
	}
	public void addProduct(Product product){
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO prodotti(product_id,codice,name,posizione,quantità,descrizione)"
								+ "VALUES(?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int Save(Product p){
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement
					("INSERT INTO prodotti(product_id,codice,name,posizione,quantità,descrizione) "
							+ "VALUES(?,?,?,?,?,?)");
			ps.setString(1, p.getDescrizione());
			ps.setString(2, p.getName());
			ps.setString(3, p.getPosizione());
			ps.setInt(4, p.getCodice());
			ps.setInt(5, p.getProduct_Id());
			ps.setInt(6, p.getQuantita());
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	public static int Update(Product p){
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement
					("UPDATE prodotti SET product_id=?,SET codice=?,SET name=?,"
							+ "SET posizione=?,SET quantità=?,SET descrizione=? "
							+ "WHERE product_id=?");
			ps.setString(1, p.getDescrizione());
			ps.setString(2, p.getName());
			ps.setString(3, p.getPosizione());
			ps.setInt(4, p.getCodice());
			ps.setInt(5, p.getProduct_Id());
			ps.setInt(6, p.getQuantita());
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	public static int Delete(Product p){
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement
					("DELETE FROM prodotti WHERE product_id=?");
			//ps.setString(1, p.getDescrizione());
			//ps.setString(2, p.getName());
			//ps.setString(3, p.getPosizione());
			//ps.setInt(4, p.getCodice());
			ps.setInt(5, p.getProduct_Id());
			//ps.setInt(6, p.getQuantita());
			status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	public static List<Product> getAllRecords(){
		List<Product> list=new ArrayList<Product>();  
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement
					("SELECT FROM prodotti");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Product p=new Product();
				p.setProduct_Id(rs.getInt("product_id"));
				p.setCodice(rs.getInt("codice"));
				p.setName(rs.getString("name"));
				p.setPosizione(rs.getString("posizione"));
				p.setQuantita(rs.getInt("quantita"));
				p.setDescrizione(rs.getString("descrizione"));
				list.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	public static Product getRecordById(int product_id){
		Product p=null;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement
					("SELECT FROM prodotti WHERE product_id=?");
			ps.setInt(1, product_id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				p.setProduct_Id(rs.getInt("product_id"));
				p.setCodice(rs.getInt("codice"));
				p.setName(rs.getString("name"));
				p.setPosizione(rs.getString("posizione"));
				p.setQuantita(rs.getInt("quantita"));
				p.setDescrizione(rs.getString("descrizione"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;
	}
}
