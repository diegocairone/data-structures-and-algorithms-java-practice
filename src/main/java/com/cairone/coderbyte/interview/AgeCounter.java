package com.cairone.coderbyte.interview;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;

public class AgeCounter {

    public static class JsonBodyHandler<T> implements HttpResponse.BodyHandler<T> {
        private final Class<T> type;

        public JsonBodyHandler(Class<T> type) {
            this.type = type;
        }

        @Override
        public HttpResponse.BodySubscriber<T> apply(HttpResponse.ResponseInfo responseInfo) {
            return HttpResponse.BodySubscribers.mapping(
                    HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8),
                    body -> new Gson().fromJson(body, type)
            );
        }
    }

    public class JsonResponse {
        String data;
    }

    public static void main(String[] args) {

        String url = "https://coderbyte.com/api/challenges/json/age-counting";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        int count = 0;
        int ageThreshold = 60;

        try {
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            String body = response.body();
//
//            Gson gson = new Gson();
//            JsonResponse jsonResponse = gson.fromJson(body, JsonResponse.class);
///
//            String data = jsonResponse.data;
            HttpResponse<AgeCounter.JsonResponse> response = httpClient.send(
                    request,
                    new JsonBodyHandler<>(JsonResponse.class)
            );

            String data = response.body().data;
            String[] keyPairs = data.split(", ");

            for (String keyPair : keyPairs) {
                if (keyPair.startsWith("key=")) {
                    String value = keyPair.split("=")[1];
                    int age = Integer.valueOf(value);
                    if (age >= ageThreshold) count++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count: " + count);
    }
}
