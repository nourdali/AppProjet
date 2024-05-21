package com.example.tp3;

public class Service {
    private String ServiceName;
    private String ImageUrl;

    public Service(String serviceName, String imageUrl) {
        ServiceName = serviceName;
        ImageUrl = imageUrl;
    }

    public Service(){

    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
