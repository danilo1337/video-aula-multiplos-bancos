package com.algaworks.multidb.config;

import javax.sql.DataSource;

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

import com.algaworks.multidb.repository.auth.UsuarioRepository;

@Configuration
@EnableJpaRepositories(
		basePackageClasses = UsuarioRepository.class,
		entityManagerFactoryRef = "authEntityManager",
		transactionManagerRef = "authTransactionManager")
public class AuthDbConfig {

	@Bean
	@ConfigurationProperties(prefix = "auth.datasource")
	public DataSource authDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean authEntityManager(
			EntityManagerFactoryBuilder builder,
			@Qualifier("authDataSource") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.algaworks.multidb.model.auth")
				.build();
	}
	
	@Bean
    public PlatformTransactionManager authTransactionManager(
            final @Qualifier("authEntityManager") LocalContainerEntityManagerFactoryBean authEntityManagerFactory) {
        return new JpaTransactionManager(authEntityManagerFactory.getObject());
    }
	
}
