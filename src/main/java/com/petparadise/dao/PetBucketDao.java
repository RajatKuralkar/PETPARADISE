//package com.petparadise.dao;
//
//import com.petparadise.entities.PetBucket;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface PetBucketDao extends JpaRepository<PetBucket,Long> {
//    @Query("select c from  c where c.orders is not null")
//    List<PetBucket> findAllCartNonValue();
//}
