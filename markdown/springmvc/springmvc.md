# SpringMVC

### SpringMVC中有哪些注解
- Controller：用于声明这是一个控制层，SpringMVC中的Controller负责处理由DispatcherServlet 分发的请求。
- @RequestMapping：用来处理请求地址映射，可用在类或方法上。
- @PathVariable：用于将请求URL中的模板变量映射到功能处理方法的参数上，即取出uri模板中的变量作为参数。
- @RequestParam：用于在SpringMVC后台控制层获取参数，类似于request.getParameter（“name”）。
- @ResponseBody：用于将Controller的方法返回的对象，转换为指定格式，如json。
- @RequestBody：将请求体中的数据映射成对应的JavaBean对象。
- @RequestHeader：可以把Request请求的header部分的值绑定到方法的参数上。
- @CookiesValue：把Request header中关于cookie的值绑定到方法的参数上。
- @ModelAttribute：在controller方法调用前，先执行@ModelAttribute方法，可用于注解和方法参数中。

