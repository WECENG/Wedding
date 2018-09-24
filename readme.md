关于springboot支持jsp的配置步骤
    1.SpringBoot类继承SpringBootServletInitializer(经测试，这一步可省略)
    2.路径映射配置ViewResolver
    @Bean
        public ViewResolver viewResolver(){
            InternalResourceViewResolver view=
                    new InternalResourceViewResolver();
            view.setContentType("utf-8");
            view.setSuffix(".jsp");
            view.setPrefix("/WEB-INF/jsp/");
            return view;
        }
    3.依赖jar包
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>jstl</artifactId>
        </dependency>
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>javax.servlet-api</artifactId>
          <version>4.0.0</version>
          <scope>provided</scope>
        </dependency>
        <!--加入该jar包，不然springboot不支持jsp-->
        <dependency>
          <groupId>org.apache.tomcat.embed</groupId>
          <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
    4.注意：不要引入其他视图层的相关依赖jar包（例如thymeleaf）
            ，避免覆盖jsp这个视图层的相关类
            
关于前端访问路径与后台设置路径不一致问题
    1.可能由于浏览器缓存导致

Js笔记
    1、获取标签属性值 Document.getElenmentById().value
    2、为属性赋值 XXX.innerHTML=???
    3、js修改a标签的href属性    XXX.href=???
    4、js为标签添加样式
                img.src="img/enemy1_fly_1.png";
                img.style.position="absolute";
                img.style.width="34px";
                img.style.height="24px";
                img.style.left=x+"px";
                img.style.top=y+"px";