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

    public int getId() {
        return id;
    }

    public int getSysid() {
        return sysid;
    }

    public String getName() {
        return name;
    }

    public String getAlcohol_vol() {
        return alcohol_vol;
    }

    public String getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public String getCountry() {
        return country;
    }

    public int getLatest() {
        return latest;
    }

    public int getYesterday() {
        return yesterday;
    }

    public String getTrend() {
        return trend;
    }
}

