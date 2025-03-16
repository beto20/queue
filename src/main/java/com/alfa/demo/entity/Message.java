package com.alfa.demo.entity;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public class Message<T> {

    private final String id;
    private T body;
    private Map<Object, Object> headers;
    private final Instant timestamp;
    private Status status;
    private Priority priority;
    private int serie;

    public Message() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = Instant.now();
    }
    public Message(T body, Status status) {
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.timestamp = Instant.now();
        this.status = status;
    }
    public Message(T body, Status status, int serie) {
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.timestamp = Instant.now();
        this.status = status;
        this.serie = serie;
    }

    public Message(T body, Map<Object, Object> headers, Status status, int serie) {
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.headers = headers;
        this.timestamp = Instant.now();
        this.status = status;
        this.serie = serie;
    }

    public String getId() {
        return id;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Map<Object, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<Object, Object> headers) {
        this.headers = headers;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", body=" + body +
                ", headers=" + headers +
                ", timestamp=" + timestamp +
                ", status=" + status +
                ", serie=" + serie +
                '}';
    }
}
