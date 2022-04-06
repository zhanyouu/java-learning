package com.pattern.responsibility.jdk;

public interface Filter {
    void doFilter(Request req, Response res, FilterChain c);
}
