package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductRelease {
    public String getFirst_sale() {
        return first_sale;
    }

    public List<Beer> getItems() {
        return items;
    }

    @JsonProperty private String first_sale;
    @JsonProperty private List<Beer> items;
}

