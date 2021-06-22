package at.technikumwien;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// see http://localhost:8080/resources/cars

@RestController
@RequestMapping("/resources/cars")
public class CarResource
{
    @Autowired
    private CarRepo carRepo;

    @GetMapping
    public List<Car> retrieveAll()
    {

        return carRepo.findAll();
    }

}
