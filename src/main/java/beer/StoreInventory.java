package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StoreInventory {
    @JsonProperty private Store store;
    @JsonProperty private List<Beer> items;
}