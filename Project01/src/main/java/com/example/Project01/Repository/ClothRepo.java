package com.example.Project01.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Project01.Model.ClothStore;

import jakarta.transaction.Transactional;



public interface ClothRepo extends JpaRepository<ClothStore,Integer> 
{
	

@Query(value="select *from cloth_store",nativeQuery=true)
public List<ClothStore> getAllData();


@Query(value="select * from cloth_store where counters=:counters",nativeQuery=true)
public List<ClothStore>bygifts(@Param("counters")int counters);

@Query(value="select * from cloth_store where counters between ?1 and ?2",nativeQuery=true)
List<ClothStore> startEnd(@Param("start") int start,@Param("end")int end);

@Modifying
@Transactional
@Query(value="delete  from cloth_store where counters=?1 and gifts=?2",nativeQuery=true)
Integer deletecounter(@Param("counters")int counters,@Param("gifts")String gifts);


@Modifying
@Transactional
@Query(value="update cloth_store set coupon_cards where counters=?1 and gifts=?2",nativeQuery=true)
Integer updatecounter(@Param("gifts")ClothStore gifts);



//jpql Queries
@Query("select k from ClothStore k where Counters=?1")
public List<ClothStore>getDetails(@Param("Counters")int counters); 

@Query("select b from ClothStore b where Counters between ?1 and ?2")
public List<ClothStore> getbtw(@Param("Counters") int start,@Param("Counters")int end);

@Modifying
@Transactional
@Query("delete from ClothStore where Counters=?1")
public void deletejpql(@Param("counters") int counters);

@Modifying
@Transactional
@Query("update ClothStore c set c.gifts=:gifts where Counters=:Counters")
public void updateByQuery(@Param("gifts")String gifts,@Param("Counters")int counters);






}

