package club.yusei37.mqtt.config;

import club.yusei37.mqtt.client.MqttPushClient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Yusei on 2018/9/6
 */
@Component
@ConfigurationProperties(prefix = "mqtt")
@Setter
@Getter
public class MqttConfiguration {

    private String host;

    private String clientid;

    private String topic;

    private String username;

    private String password;

    private int timeout;

    private int keepalive;

    @Bean
    public MqttPushClient getMqttPushClient() {
        MqttPushClient mqttPushClient = new MqttPushClient();
        mqttPushClient.connect(host, clientid, username, password, timeout, keepalive);
        return mqttPushClient;
    }
}