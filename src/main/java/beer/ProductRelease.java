package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductRelease {
    @JsonProperty private String first_sale;
    @JsonProperty private List<Beer> items;
}

