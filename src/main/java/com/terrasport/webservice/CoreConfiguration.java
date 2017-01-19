package com.terrasport.webservice;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class } )
@MapperScan( value = CoreConfiguration.PACKAGE_DAO )
public class CoreConfiguration {

    public static final String   PACKAGE_DAO = "com.terrasport.webservice.core.dao";


    @Bean
    public SqlSessionFactory sqlSessionFactory( final DataSource dataSource ) throws Exception {
        final SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setFailFast( true );
        ssfb.setDataSource( dataSource );

        final PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        ssfb.setMapperLocations( resolver.getResources( "classpath*:mapper/**/*Mapper.xml" ) );

        final SqlSessionFactory ssf = ssfb.getObject();

        ssf.getConfiguration().setCacheEnabled( true );

        return ssf;
    }

    @Bean
    @ConfigurationProperties( prefix = "spring.datasource" )
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager( this.dataSource() );
    }
}
