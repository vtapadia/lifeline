package org.jeevanrekha.code.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
public class DatabaseConfig implements EnvironmentAware {
    private final Logger log = LoggerFactory.getLogger(DatabaseConfig.class);

    private Environment environment;

    @Value("${db.use.ssl:false}")
    private boolean useSSL;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        URI dbUri = null;
        try {
            dbUri = new URI(environment.getProperty("DATABASE_URL"));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        String[] userInfo = dbUri.getUserInfo().split(":");
        String username = userInfo[0];
        String password = "";
        if (userInfo.length == 2) {
            password = userInfo[1];
        }
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        if (useSSL) {
            dbUrl = dbUrl + "?sslmode=require";
        }

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
