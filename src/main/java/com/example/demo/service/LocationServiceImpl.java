package com.example.demo.service;

public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return Locationrepo.save(le);
    }
    public List<LocationEntity> getall() {
        return Locationrepo.findAll();
    }
}