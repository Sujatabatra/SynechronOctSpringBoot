package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
	
	@Query("from Item where itemName=:name")
	Item getItemByName(@Param("name")String itemName);

}
