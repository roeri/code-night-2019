package beer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Store {
    @JsonProperty private int id;
    @JsonProperty private int country_id;
    @JsonProperty private String address;
    @JsonProperty private String city;
    @JsonProperty private String county;
    @JsonProperty private String lat;
    @JsonProperty private String lng;
    @JsonProperty private String max_imp_stamp;

    public int getId() {
        return id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getMax_imp_stamp() {
        return max_imp_stamp;
    }
}