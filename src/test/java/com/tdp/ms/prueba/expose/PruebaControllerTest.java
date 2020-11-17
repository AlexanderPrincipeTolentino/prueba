package com.tdp.ms.prueba.expose;

import java.util.HashMap;
import java.util.Map;

import com.tdp.genesis.core.constants.HttpHeadersKey;
import com.tdp.ms.prueba.model.PruebaRequest;
import com.tdp.ms.prueba.model.PruebaResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "20000")
public class PruebaControllerTest {

    @Autowired
    private WebTestClient webClient;

    private static Map<String, PruebaResponse> pruebaResponseMap = new HashMap<>();
    private static Map<String, PruebaRequest> pruebaRequestMap = new HashMap<>();

    @BeforeAll
    public static void setup() {
        pruebaResponseMap.put("get", new PruebaResponse("Hello world!"));
        pruebaResponseMap.put("post", new PruebaResponse("User created!"));
        pruebaRequestMap.put("post", new PruebaRequest("User"));
        pruebaRequestMap.put("empty", new PruebaRequest(""));
    }

    @Test
    public void indexGetTest() {
        webClient.get()
            .uri("/prueba/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header(HttpHeadersKey.UNICA_SERVICE_ID,"550e8400-e29b-41d4-a716-446655440000")
            .header(HttpHeadersKey.UNICA_APPLICATION,"genesis")
            .header(HttpHeadersKey.UNICA_PID,"550e8400-e29b-41d4-a716-446655440000")
            .header(HttpHeadersKey.UNICA_USER,"genesis")
            .header("ClientId","12122322")
            .exchange()
            .expectStatus().isOk()
            .expectBody(PruebaResponse.class)
            .isEqualTo(pruebaResponseMap.get("get"));
    }

    @Test
    public void indexPostTest() {
        webClient.post()
            .uri("/prueba/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header(HttpHeadersKey.UNICA_SERVICE_ID,"550e8400-e29b-41d4-a716-446655440000")
            .header(HttpHeadersKey.UNICA_APPLICATION,"genesis")
            .header(HttpHeadersKey.UNICA_PID,"550e8400-e29b-41d4-a716-446655440000")
            .header(HttpHeadersKey.UNICA_USER,"genesis")
            .body(BodyInserters.fromValue(pruebaRequestMap.get("post")))
            .exchange()
            .expectStatus().isEqualTo(HttpStatus.CREATED)
            .expectBody(PruebaResponse.class)
            .isEqualTo(pruebaResponseMap.get("post"));
    }

}
