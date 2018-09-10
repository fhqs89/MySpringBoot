该项目组为测试学习spring-cloud微服务架构。
1.MySpringBoot为测试web项目，目前仅有一个接口 http://localhost:10000/test/method
2.EurekaServer为测试eureka服务器项目 http://localhost:1111/
3.RibbonService为测试ribbon负载均衡 可以启动多个不同端口的MySpringBoot，注册到EurekaService，
就可以通过http://localhost:9000/ribbon-service 来访问MySpringBoot的/test/method接口。

