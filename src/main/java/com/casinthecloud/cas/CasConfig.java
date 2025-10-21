package com.casinthecloud.cas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.Topic;

@Configuration
public class CasConfig {

    @Bean
    public Topic redisTicketRegistryMessageTopic() {
        return new ChannelTopic("RandomTopicName");
    }
}
