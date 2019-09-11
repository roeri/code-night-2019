package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductReleaseList {
    public List<ProductRelease> getRelease() {
        return release;
    }

    @JsonProperty private List<ProductRelease> release;
}
