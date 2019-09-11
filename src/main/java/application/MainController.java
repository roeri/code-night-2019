package application;

import beer.ProductRelease;
import beer.ProductReleaseList;
import beer.StoreInventory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class MainController {

    private final RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/")
    public String index() {
        return "Uppe och snurrar!\n";
    }

    @RequestMapping("/uppgift/1")
    public Object uppgift1() {
        StoreInventory storeInventory = restTemplate.getForObject("https://systembevakningsagenten.se/api/json/1.0/inventoryForStore.json?id=1337", StoreInventory.class);
        return storeInventory;
    }
}