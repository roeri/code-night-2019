package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Beer {
    @JsonProperty private int id;
    @JsonProperty private int sysid;
    @JsonProperty private String name;
    @JsonProperty private String alcohol_vol;
    @JsonProperty private String price;
    @JsonProperty private String producer;
    @JsonProperty private String country;
    @JsonProperty private int latest;
    @JsonProperty private int yesterday;
    @JsonProperty private String trend;
}

