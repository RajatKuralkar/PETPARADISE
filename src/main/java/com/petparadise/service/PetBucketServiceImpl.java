//package com.petparadise.service;
//
//import com.petparadise.dao.OrdersDao;
//import com.petparadise.dao.PetBucketDao;
//import com.petparadise.dao.PetsDao;
//import com.petparadise.entities.PetBucket;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PetBucketServiceImpl implements PetBucketService {
//
//    @Autowired
//    private PetBucketDao petBucketDao;
//
//    @Autowired
//    private OrdersDao ordersdao;
//
//    @Autowired
//    private PetsDao productsdao;
//
//    @Autowired
//    private ModelMapper modelmapper;
//    @Override
//    public List<PetBucket> displayAll() {
//        return petBucketDao.findAllCartNonValue();
//    }
//
//}
