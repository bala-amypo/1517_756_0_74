@Restcontroller
public class LocationController {
    @Autowired
    LocationService locationservice;
    @PostMapping("/addlocation")
    public LocationEntity add (@RequestBody LocationEntity le) {
        return locationservice.createlocation(le);
    }
    @GetMapping("/showlocation")
    
}