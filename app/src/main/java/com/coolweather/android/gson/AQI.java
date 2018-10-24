package com.coolweather.android.gson;

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        @Override
        public String toString() {
            return "aqi:"+aqi+"pm25:"+pm25;
        }
    }

    public AQICity getCity() {
        return city;
    }

    public void setCity(AQICity city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "city["+city.toString()+"]";
    }
}
