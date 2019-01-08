# SpringBoot

## 一、入门简介

关键字`微服务`

## 二、HelloWorld

```java
public static void main(String[] args) {
   SpringApplication.run(Springboot01HelloWorldApplication.class, args);
}
```

主方法用来启动



```java
@SpringBootApplication
```

此注解包含多个注解 如：

```java
@SpringBootConfiguration
@EnableAutoConfiguration
```

而对于Controller层

```Java
@RestController
```

使用该注解便自带了@ResponseBody

## 三、Jackson注解

```java
@JsonProperty("ppd") //修改返回时的键值
private String id;
private String name;
@JsonIgnore //返回时不返回
private String password;
private int sex;
@JsonInclude(JsonInclude.Include.NON_NULL) //为空时不返回
private String phone;
@JsonFormat(pattern = "yyyy-MM-DD hh:mm:ss" ,locale = "zh",timezone = "GMT+8") //日期格式
private Date createTime;
```

## 四、目录结构

