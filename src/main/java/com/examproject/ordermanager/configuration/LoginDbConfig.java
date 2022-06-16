package com.examproject.ordermanager.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "loginEntityManagerFactory",
        transactionManagerRef = "loginTransactionManager", basePackages = {"com.examproject.ordermanager.repository.login"})
public class LoginDbConfig {

    @Bean(name = "loginDataSource")
    @ConfigurationProperties(prefix = "app.datasource.login")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "loginEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean loginEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("loginDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.examproject.ordermanager.model.login")
                .build();
    }

    @Bean(name = "loginTransactionManager")
    public PlatformTransactionManager loginTransactionManager(
            @Qualifier("loginEntityManagerFactory") EntityManagerFactory loginEntityManagerFactory) {
        return new JpaTransactionManager(loginEntityManagerFactory);
    }
}