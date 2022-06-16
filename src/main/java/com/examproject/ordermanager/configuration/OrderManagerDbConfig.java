package com.examproject.ordermanager.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "dataEntityManagerFactory",
        transactionManagerRef = "dataTransactionManager", basePackages = {"com.examproject.ordermanager.repository.data"})
public class OrderManagerDbConfig {

    @Primary
    @Bean(name = "dataDataSource")
    @ConfigurationProperties(prefix = "app.datasource.data")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dataEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean dataEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("dataDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.examproject.ordermanager.model.data")
                .build();
    }

    @Primary
    @Bean(name = "dataTransactionManager")
    public PlatformTransactionManager dataTransactionManager(
            @Qualifier("dataEntityManagerFactory") EntityManagerFactory dataEntityManagerFactory) {
        return new JpaTransactionManager(dataEntityManagerFactory);
    }
}