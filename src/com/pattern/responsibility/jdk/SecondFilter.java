package com.pattern.responsibility.jdk;

public class SecondFilter implements Filter {
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器2 前置处理");
        // 先执行所有request再倒序执行所有response
        chain.doFilter(req, res);
        System.out.println("过滤器2 后置处理");
    }
}
