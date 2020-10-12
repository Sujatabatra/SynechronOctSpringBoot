package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Item;

public class ItemRowMapper implements RowMapper<Item> {
	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item=new Item();
		item.setItemId(rs.getInt("ItemId"));
		item.setItemName(rs.getString("ItemName"));
		item.setQuantity(rs.getInt("quantity"));
		item.setPrice(rs.getInt("price"));
		return item;
	}

}
