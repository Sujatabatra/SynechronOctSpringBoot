package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;
import com.sujata.util.ItemRowMapper;


@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Item> getAllRecords() {
		String QUERY="select * from Items";
		List<Item> items=jdbcTemplate.query(QUERY, new ItemRowMapper());
		return items;
	}

	@Override
	public boolean addRecord(Item item) {
		String QUERY="insert into items values(?,?,?,?)";
		int rows=jdbcTemplate.update(QUERY, item.getItemId(),item.getItemName(),item.getQuantity(),item.getPrice());
		return rows>0;
	}

	@Override
	public boolean deleteRecord(int id) {
		String QUERY="delete from items where ItemId=?";
		int rows=jdbcTemplate.update(QUERY, id);
		return rows>0;
	}

	@Override
	public boolean updateRecord(int id, Item newItem) {
		String QUERY="UPDATE items set ItemName=?,quantity=?,price=? where ItemId=?";
		int rows=jdbcTemplate.update(QUERY, newItem.getItemName(),newItem.getQuantity(),newItem.getPrice(),id);
		return rows>0;
	}

	@Override
	public Item getRecord(int id) {
		String QUERY="select * from items where ItemId=?";
		Item item=jdbcTemplate.queryForObject(QUERY,new Object[]{id}, new ItemRowMapper());
		return item;
	}

}
