package io.pivotal.ecosystem.simple;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.stereotype.Repository;

import java.util.Map;

@org.springframework.stereotype.Repository
interface Repo {

    @RequestLine("GET /forecast/q/zmw:{zip}.1.99999.json")
    @Headers("Content-Type: application/json")
    Map<Object, Object> getForecast(@Param("zip") String zip);
}