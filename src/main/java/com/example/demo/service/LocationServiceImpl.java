package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationrepo;

    @Override
    public LocationEntity createLocation(LocationEntity le) {
        return locationrepo.save(le);
    }

    @Override
    public List<LocationEntity> getall() {
        return locationRepo.findAll();
    }
}
