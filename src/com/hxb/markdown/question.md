###1、AOP的专业术语包括Aspect、Joinpoint、Pointcut、Advice、Target Object、Proxy和Weaving，对于这些专业术语的解释，具体如下：
<ul>
<li>（1）Aspect（切面）：在实际应用中，切面通常是指封装的用于横向插入系统功能（如事务、日志等）的类，如图3-1中的Aspect。该类要被Spring容器识别为切面，需要在配置文件中通过bean元素指定。</li>
<li>（2）Joinpoint（连接点）：在程序执行过程中的某个阶段点，它实际上是对象的一个操作，例如方法的调用或异常的抛出。在Spring AOP中，连接点就是指方法的调用。</li>
<li>   （3）Pointcut（切入点）：是指切面与程序流程的交叉点，即那些需要处理的连接点，如图3-2所示。通常在程序中，切入点指的是类或者方法名，如某个通知要应用到所有以add开头的方法中，那么所有满足这一规则的方法都是切入点。
</li>
<li>   （4）Advice（通知/增强处理）：AOP框架在特定的切入点执行的增强处理，即在定义好的切入点处所要执行的程序代码。可以将其理解为切面类中的方法，它是切面的具体实现。
</li>
<li>   （5）Target Object（目标对象）：是指所有被通知的对象，也被称为被增强对象。如果AOP框架采用的是动态的AOP实现，那么该对象就是一个被代理对象。
</li>
<li>   （6）Proxy（代理）：将通知应用到目标对象之后，被动态创建的对象。
</li>
<li>   （7）Weaving（织入）：将切面代码插入到目标对象上，从而生成代理对象的过程。
</li>

</ul>
   
   
   
 ###  2、Spring中的通知按照在目标类方法的连接点位置，可以分为以下5种类型：
 <ul>
 <li>  （1）org.aopalliance.intercept.MethodInterceptor（环绕通知）
        在目标方法执行前后实施增强，可以应用于日志、事务管理等功能。</li>
 <li>  （2）org.springframework.aop.MethodBeforeAdvice（前置通知）
        在目标方法执行前实施增强，可以应用于权限管理等功能。</li>
 <li>
   （3）org.springframework.aop.AfterReturningAdvice（后置通知）
   在目标方法执行后实施增强，可以应用于关闭流、上传文件、删除临时文件等功能。</li>
 <li>
   （4）org.springframework.aop.ThrowsAdvice（异常通知）
   在方法抛出异常后实施增强，可以应用于处理异常记录日志等功能。</li>
 <li>
   （5）org.springframework.aop.IntroductionInterceptor（引介通知）
   在目标类中添加一些新的方法和属性，可以应用于修改老版本程序（增强类）</li>
 </ul>
 
 
 
 
   
   
