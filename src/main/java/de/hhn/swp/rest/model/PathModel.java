package de.hhn.swp.rest.model;

public class PathModel {

    private final HTTPMethod method;

    private final String path, description;

    public PathModel(String path, String description, HTTPMethod method) {
        this.path = path;
        this.description = description;
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public String getPath() {
        return path;
    }

    public HTTPMethod getMethod() {
        return method;
    }

    public enum HTTPMethod {
        GET, POST, PUT, DELETE
    }
}
