package apps.ucu.edu.ua.forever.controller;
import apps.ucu.edu.ua.forever.model.Flower;
import apps.ucu.edu.ua.forever.service.FlowerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v")
public class FlowerController {

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flower")
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.createFlower(flower);
    }
}
