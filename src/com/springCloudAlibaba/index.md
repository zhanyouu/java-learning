##SpringCloudAlibaba学习笔记-简介
###1、服务与发现-Nacos
###2、实现负载均衡-Ribbon（客户端负载），区别nginx负载（服务器端负载）
####能够实现服务的负载均衡、包括全局配置和细粒度配置，其中负载均衡策略包括（1、轮训；2、权重；3、随机；4、自定义（优先向相同集群实例发送请求））
###3、服务容错-Sentinel
####能够实现微服务的容错处理机制，其中主要包括熔断、限流、和降级。只需要将微服务注册到sentinel服务器中，可通过配置的方式实现。
###4、RestTemplate实现HTTP远程调用
####RestTemplate能够整合Ribbon和sentinel，实现容错和负载均衡。
###5、声明式HTTP客户端-Feign
####Feign是一种微服务间调用的http请求组件，能够实现服务的熔断、限流和降级的错误处理，还能通过拦截器进行对请求的处理（如未请求添加token、参数校验等信息）
###6、消息驱动的微服务-Spring Cloud Alibaba RocketMQ
####RocketMQ是一款消息队列组件。能够结合Stream进行生成和消费消息。
###7、API网关-Spring Cloud Gateway
###8、微服务的用户认证与授权
####API网关一般都是用来进行验证和授权，然后转发到对应的微服务（需要注册到Nacos）
###9、wii（需要注册到Nacos）
####实现异构微服务间的融合（在API网关的基础上做改进）
###10、开发组件
####ZipKin（整合过Sleuth）：分布式链路追踪，能够通过界面分析微服务间链路调用耗时。
####ELK:Elasticsearch+Kibana能够实现日志的收集和可视化分析
[学习手记地址](https://www.imooc.com/t/1863086#Articl)