package hc.application.config;/**
 * Created by jarvis on 15/1/10.
 */

import hc.autoconf.*;
import hc.autoconf.annotations.EnableClusterHttpSession;
import hc.autoconf.annotations.EnablePlatformAuthMenuInit;
import hc.autoconf.annotations.EnablePlatformConfInit;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author songjiawei@supcon.com
 */
@Configuration
@Import({
//        PlatformOrmConfiguration.class,
        PlatformConfImplConfiguration.class,
        PlatformRedisCacheConfiguration.class,
//        PlatformConfConsumerConfiguration.class,
        PlatformConfClientConfiguration.class,
        PlatformAuthImplConfiguration.class,
        PlatformSafetyConfiguration.class,
        PlatformAuthControllerConfiguration.class,
        PlatformAuthLoginControllerConfiguration.class,
        PlatformIndexControllerConfiguration.class,
        PlatformJournalConfiguration.class,
        PlatformConfControllerConfiguration.class
})
@EnablePlatformConfInit
@EnablePlatformAuthMenuInit
@EnableClusterHttpSession
public class AppConfiguration {

}
