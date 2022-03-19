package com.markerhub.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration //定义配置类
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan("com.markerhub.mapper") //指定要变成实现类的接口所在的包位置，然后包下面的所有接口在编译之后都会生成相应的实现类
public class MybatisPlusConfig {
    @Bean //对象实例化
    public PaginationInterceptor paginationInterceptor(){
        //PaginationInterceptor是一个分页插件
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
