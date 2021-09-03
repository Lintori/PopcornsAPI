package com.lintori.rebyu.Repository;
import com.lintori.rebyu.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository <Item, String> {
    
}
