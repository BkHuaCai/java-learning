# Spring

### Spring中有哪些注解
**声明标注注解：**
- @Service：用于标注业务层的注解。
- @Controller:用于标注控制层的注解。
- @Repository：用于标注数据访问组件，即DAO组件。
- @Component：泛指组件，当组件不好归类的时候可以使用Component。<p>
被上面四个注解标注的类，都会进入Spring容器中进行管理。


**bean注入的注解:**

- @Autowired：最常用的bean自动注入标签，按bytype自动注入，默认情况下必须要求依赖对象必须存在，
如果要允许null值，可以设置它的required属性为false，如：@Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解指定name进行使用。
- @Resource：作用相当于@Autowired，按byname自动注入。
- @Value：为属性注入值。


**配置类相关注解:**
- @Configuration：声明当前类为配置类。
- @Bean：注解在方法上，声明当前方法返回值为Bean。
- @ComponentScan：用于对Component进行扫描。
- @Import：用于加载其他配置类


**切面相关注解:**
- @Aspect：声明这是一个切面。
- @Before：前置通知。
- @After：后置通知。
- @AfterReturning：返回通知。
- @AfterThrowing：异常通知。
- @Around：环绕通知。
- @pointcut:定义切点。
