
package com.example.tugas_besar.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BukuModels {

    private String status;
    private String message;
    private Integer totalResult;
    private List<ResultBuku> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResult = totalResult;
    }

    public List<ResultBuku> getResults() {
        return results;
    }

    public void setResults(List<ResultBuku> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
