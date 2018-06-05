package io.cursor.demo.config;

import ch.qos.logback.core.db.DriverManagerConnectionSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class JavaConfig{

    @Value("$test.url")
    private String url;

    @Value("$test.username")
    private String username;

    @Value("$password")
    private String password;

    @Value("$test.driverClassName")
    private String driverClassName;

    @Bean
    public DataSource postgresDataSource() {
        DriverManagerDataSource dc = new DriverManagerDataSource();

        dc.setDriverClassName(driverClassName);
        dc.setUrl(url);
        dc.setUsername(username);
        dc.setPassword(password);

        return dc;
    }

}
