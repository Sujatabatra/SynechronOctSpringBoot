package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

	@Modifying
	@Query("UPDATE Item set itemName=:name where itemId=:id")
	void updateName(@Param("id")int id,@Param("name")String iName);
}
