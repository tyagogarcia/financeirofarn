package org.bootstrap.project.conf;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.github.javarch.jsf.config.JavaServerFacesConfig;
import com.github.javarch.persistence.orm.hibernate.conf.DriverManagerDataSourceConfig;
import com.github.javarch.persistence.orm.hibernate.conf.H2DataSourceConfig;
import com.github.javarch.persistence.orm.hibernate.conf.HibernateConfig;

@Configuration
@ComponentScan( basePackages = {"org.bootstrap"},
		excludeFilters= { @ComponentScan.Filter( Configuration.class ) } )
@Import({H2DataSourceConfig.class,
		DriverManagerDataSourceConfig.class,
		HibernateConfig.class,
		JavaServerFacesConfig.class})
@ImportResource({ "classpath*:/applicationContext-security.xml"})
public class AppConfig {

	 
}
