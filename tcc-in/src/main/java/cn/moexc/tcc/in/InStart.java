package cn.moexc.tcc.in;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudSecondaryConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@Import(SpringCloudSecondaryConfiguration.class)
public class InStart {
    public static void main(String[] args){
        SpringApplication.run(InStart.class, args);
    }
}
