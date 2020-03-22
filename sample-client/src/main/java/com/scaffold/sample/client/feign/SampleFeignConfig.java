package com.scaffold.sample.client.feign;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import okhttp3.ConnectionPool;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * 自定义配置
 * @author leiwa
 */
@Configuration
public class SampleFeignConfig {


    /**
	 *feign的超时时间
     */
    @Bean
    @ConditionalOnMissingBean(Request.Options.class)
    public Request.Options feignRequestOptions() {
        Request.Options options = new Request.Options(3000, 60000);
        return options;
    }

    /**
      *feign配置连接池
      */
    @Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
    Retryer feignRetryer() {
		return Retryer.NEVER_RETRY;
	}

	@Bean
	public okhttp3.OkHttpClient okHttpClient() {
		okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder()
				.readTimeout(3, TimeUnit.SECONDS)
				.connectTimeout(200, TimeUnit.MILLISECONDS)
				.writeTimeout(5, TimeUnit.SECONDS)
				.connectionPool(new ConnectionPool(100 , 30, TimeUnit.SECONDS));
		return clientBuilder.build();
	}
}
