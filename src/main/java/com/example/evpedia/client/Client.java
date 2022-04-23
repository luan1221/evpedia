package com.example.evpedia.client;

import com.example.evpedia.repositories.LocationRepository;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;


@Component
public class Client {

    private final LocationRepository locationRepository;

    private HttpClient client;

    public Client(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
        client = HttpClient.newHttpClient();
    }

    public void sendRequest(String uri) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

}
