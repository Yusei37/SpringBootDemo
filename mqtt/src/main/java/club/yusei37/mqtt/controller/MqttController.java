package club.yusei37.mqtt.controller;

import club.yusei37.mqtt.client.MqttPushClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yusei on 2018/9/6
 */
@RestController
public class MqttController {

    @Autowired
    private MqttPushClient mqttPushClient;

    @RequestMapping("/hello")
    @ResponseBody
    public String sendHello(){
        String kdTopic = "topic1";
        mqttPushClient.publish(0, false, kdTopic, "15345715326");
        mqttPushClient.subscribe(kdTopic);
        return "123";
    }
}
