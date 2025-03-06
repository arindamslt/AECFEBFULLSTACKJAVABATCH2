package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    @Query(
    		nativeQuery = true,
    		value="SELECT O.OID,O.ODT,O.FID,F.FNAME,O.OQTY,F.PRICE,F.PRICE*O.OQTY TOTALCOST,O.UNAME FROM ORDER_DTLS O JOIN FOOD F ON(O.FID=F.FID)"
    				
    		
    	 )
	public List billing();
}
