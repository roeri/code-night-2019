package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductReleaseList {
    @JsonProperty private List<ProductRelease> release;
}
