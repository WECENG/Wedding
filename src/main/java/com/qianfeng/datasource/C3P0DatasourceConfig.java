package com.qianfeng.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class C3P0DatasourceConfig {
    @Bean
    public ComboPooledDataSource c3p0Datasource()throws PropertyVetoException {
        ComboPooledDataSource dataSource =
                new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setUser("root");
        dataSource.setPassword("510183");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/wedding?"
                + "useUnicode=true&useJDBCCompliantTimezoneShift=true"
                + "&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        dataSource.setMaxPoolSize(50);
        dataSource.setInitialPoolSize(5);
        return dataSource;
    }
}
