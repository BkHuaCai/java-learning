# SpringBoot

### SpringBoot中有哪些注解
- @RestController：这个注解的意思相当于同时实现了@Controller和@ResponseBody
- @SpringBootApplication：该注解集合了@Configuration，@EnableAutoConfiguration，@ComponentScan三个注解
- @Scope：指定bean的作用域，默认singleton，其它包括prototype、request、session、globalSession