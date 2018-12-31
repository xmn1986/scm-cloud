一、消息总线方式通知模块自动更新git远程仓库
1、对应的模块pom添加依赖
   <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-bus-amqp</artifactId>
    </dependency>
2、bootstrap.yml添加rabbitmq的配置
   spring:
        rabbitmq:
            host: 10.200.131.93
            port: 5672
            username: scm
            password: scmDEV999
3、依赖了git配置参数的controller类添加注解@RefreshScope   