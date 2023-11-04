
> 教程来源：[黑马程序员Java设计模式详解，全网最全23种Java设计模式](https://www.bilibili.com/video/BV1Np4y1z7BU?p=2&spm_id_from=pageDriver)

本文摘自本人的CSDN博文：[https://luzhenyu.blog.csdn.net/article/details/122311416](https://luzhenyu.blog.csdn.net/article/details/122311416)

# 前言
>2022-01-04

又是久违的学习编程内功的时候了！我个人是很喜欢学习这种通用基础知识的，虽然没有学习应用技术来的见效快，但是很值得去思考、揣摩、修炼。

研一开学以来做了很多项目。因为项目需要也接触了不少的新技术，终于让我觉得我之前所积累的各种内功（数据结构、计算机网络、汇编、各种编程思想......）是很有用的。内功越好，学习能力就越强，对新技术的理解能力也越强。同样是完成某一个项目的代码，我的开发思路、代码实现都要比别人强！

如今，终于开始设计模式的学习了，以前或多或少接触过一些，但是还没有真正系统性的学习过。

从今天开始，一天一个设计模式，争取把它啃下来！


# 后记
>2022-01-27

学完了整个课程，首先评价一下课程，黑马这套设计模式课程，**前中期讲的很好，中后期开始慢慢模糊**...最后的手写简单 Spring 让人眼前一亮，很不错。（不过让人眼前一亮的是对 Spring 的讲解思路，而不是对设计模式的运用....）

如果是初探设计模式的新手，任何课程完整的学习结束都是会有巨大的收货的。

对我来说，这门课确实让我学到了不少编程思想，但是还远远不够，我认为后续真正的熟练还需要以后不停的阅读代码、博客、在项目中使用，来积累，设计模式这个坑算是开启了。


这里顺便说两句我对这些课程的看法，在我看来，这些内功课程没有直接性的作用，相当于一种 “被动技能”，虽然也不能说学过了一定在某方面会变强，但我认为积累的越多，终有一天会喷发，目前重要的是 “扎根”。

我不认为追求各种框架、新颖的技术是合理的，其实很多技术都是我在开始做项目前，临时看了几天就上手做项目了。而让我有这样的能力的原因，就是平时对 “基础内功” 的积累。所谓的框架不过是招式，内力越深厚，招式的运用基本都是上手就能用。

好，差不多就说到这了，继续看不到终点的茫茫学习路....

# 目录
##   设计模式概述、UML
博客地址：[设计模式概述、UML](https://luzhenyu.blog.csdn.net/article/details/122292204)
* 设计模式概述
* UML，类与类之间关系
关联关系
聚合关系
组合关系
依赖关系
继承关系
实现关系

##   软件设计原则
博客地址：[软件设计原则](https://luzhenyu.blog.csdn.net/article/details/122303847)
* **开闭原则**：对拓展开放，对修改封闭。
* **里式代换原则**：任何基类可以出现的地方，子类一定可以出现，反之不一定。
* **依赖倒转原则**：高层模块不应该依赖低层模块，两者都应该依赖其抽象。
* **接口隔离原则**：客户端不应该被迫依赖于它不使用的方法，一个类对另一个类的依赖应该建立在最小的接口上。
* **迪米特法则**：只和你的直接朋友交谈，不跟 “陌生人” 说话
Talk only to your immediate friends and not to strangers
* **合成复用原则**：尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。

##   创建型模式
###  单例模式
博客地址：[创建型模式 - 单例模式](https://luzhenyu.blog.csdn.net/article/details/122308030)
* 单例模式的实现：
饿汉式 1：静态变量
饿汉式 2：静态代码块
懒汉式 1：线程不安全
懒汉式 2：线程安全
懒汉式 3：双重检查锁🚀
懒汉式 4：静态内部类🚀
饿汉式 3：枚举🚀
* 存在的问题
序列化破坏单例
反射破坏单例
* JDK 源码 - Runtime 类

###   工厂模式
博客地址：[创建型模式 - 工厂模式](https://luzhenyu.blog.csdn.net/article/details/122318746)
* **简单工厂模式**
  扩展 - 静态工厂
* **工厂方法模式**
* 抽象工厂模式
* 扩展：简单工厂 + 配置文件
* JDK 源码 - Collection.iterator

###  原型模式
博客地址：[创建者模式 - 原型模式](https://luzhenyu.blog.csdn.net/article/details/122339858)
* 浅克隆
* 深克隆
实现 1：文件流 + 对象流
实现 2：字节数组流 + 对象流

###  建造者模式
博客地址：[创建者模式 - 建造者模式](https://luzhenyu.blog.csdn.net/article/details/122341864)
* 建造者模式的实现
* 拓展 - 使用建造者模式创建对象

##   结构型模式
###  代理模式
博客地址：[结构型模式 - 代理模式](https://luzhenyu.blog.csdn.net/article/details/122362769#518__404)
* 静态代理
* 动态代理
JDK 动态代理
CGLib 动态代理

###  适配器模式
博客地址：[结构型模式 - 适配器模式](https://luzhenyu.blog.csdn.net/article/details/122392881)
* 类适配器模式
* 对象适配器模式
* 接口适配器模式
* JDK 源码：Reader 与 InputStream

###  装饰者模式
博客地址：[结构型模式 - 装饰者模式](https://luzhenyu.blog.csdn.net/article/details/122579712)
* JDK 源码：IO 流的包装类
* 代理和装饰者的区别

###  桥接模式
博客地址：[结构型模式 - 桥接模式](https://luzhenyu.blog.csdn.net/article/details/122582393)

###  外观模式
博客地址：[结构型模式 - 外观模式](https://luzhenyu.blog.csdn.net/article/details/122583731)
* Tomcat 源码

###  组合模式
博客地址：[结构型模式 - 组合模式](https://luzhenyu.blog.csdn.net/article/details/122603130)

###  享元模式
博客地址：[结构型模式 - 享元模式](https://luzhenyu.blog.csdn.net/article/details/122605478)
* JDK 源码 - Integer
##   行为型模式
###  模板方法模式
博客地址：[行为型模式 - 模板方法模式](https://luzhenyu.blog.csdn.net/article/details/122621356)
* JDK 源码 - InputStream

###  策略模式
博客地址：[行为型模式 - 策略模式](https://luzhenyu.blog.csdn.net/article/details/122623421)
* JDK 源码 - Comparator

###  命令模式
博客地址：[行为型模式 - 命令模式](https://luzhenyu.blog.csdn.net/article/details/122632508)
* JDK 源码 - Runnable

###  职责链模式
博客地址：[行为型模式 - 职责链模式](https://luzhenyu.blog.csdn.net/article/details/122636960)
* JavaWeb 源码 - FilterChain

###  	状态模式
博客地址：[行为型模式 - 状态模式](https://luzhenyu.blog.csdn.net/article/details/122651139)

###  观察者模式
博客地址：[行为型模式 - 观察者模式](https://luzhenyu.blog.csdn.net/article/details/122659050)
* JDK 提供的实现 - Observable、Observer

###  中介者模式
博客地址：[行为型模式 - 中介者模式](https://luzhenyu.blog.csdn.net/article/details/122668902)

###  迭代器模式
博客地址：[《设计模式详解》行为型模式 - 迭代器模式](https://luzhenyu.blog.csdn.net/article/details/122672907)
* JDK 源码 - Iteraotr

###  访问者模式
博客地址：[《设计模式详解》行为型 - 访问者模式](https://luzhenyu.blog.csdn.net/article/details/122674414)
>变量被声明时的类型叫做变量的**静态类型**（也被叫做明显类型）；
>而变量所引用的对象的真实类型又叫做变量的**实际类型**。
比如 `Map map = new HashMap()` ，map 变量的静态类型是 `Map` ，实际类型是 `HashMap` 。

根据对象的类型而对方法进行的选择，就是**分派 (Dispatch)**，分派又分为：
* **动态分派**：通过方法重写，运行时实现
* **静态分派**：通过方法重载，编译时实现
* **双分派**：结合以上两种方式

###  备忘录模式
博客地址：[行为型模式 - 备忘录模式](https://luzhenyu.blog.csdn.net/article/details/122685434)
* 黑箱备忘录模式
* 白箱备忘录模式

###  解释器模式
博客地址：[行为型模式 - 解释器模式](https://luzhenyu.blog.csdn.net/article/details/122686960)

##   自定义 Spring 框架
博客地址：[手写简单的 Spring 框架](https://luzhenyu.blog.csdn.net/article/details/122724689)
Spring IOC 相关接口：
* BeanFactory：定义了 IoC 容器的基本功能规范。
* BeanDefinition： 定义了 Bean 对象与配置文件中元素属性的映射。
* BeanDefinitionReader：定义对 Spring 配置文件中 Bean 的解析，并封装 BeanDefinition 对象。
* BeanDefinitionRegistry：注册中心的顶级接口，其子类实现中定义了容器，用来注册 BeanDefinition。

自定义 SpringIOC：
* 定义 Bean 相关的 pojo
PropertyValue 类
MutablePropertyValues 类
BeanDefinition 类
* 定义注册表相关类
BeanDefinitionRegistry 接口
SimpleBeanDefinitionRegistry 类
* 定义解析器相关类
BeanDefinitionReader 接口
XmlBeanDefinitionReader 类
* IOC 容器相关类
BeanFactory接口
ApplicationContext 接口
AbstractApplicationContext 类
ClassPathXmlApplicationContext 类
