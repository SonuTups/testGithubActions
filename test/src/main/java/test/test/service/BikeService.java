package test.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.test.model.Bikes;
import test.test.repo.BikesRepo;

import java.util.List;

@Service
public class BikeService {

@Autowired
private BikesRepo bikesRepo;
    public Bikes saveBike(Bikes bike){
        return bikesRepo.save(bike);
    }

    public List<Bikes> getAllBikes(){
        return bikesRepo.findAll();
    }

}
