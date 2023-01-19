package com.example.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.nio.charset.StandardCharsets;

public class MqttMain {
    public static void main(String[] args) {
        String url       = "tcp://broker-internal.iderms.ai:1883";
//        String url       = "tcp://localhost:1883";
        String client_id = "mqtt-test";
        String username = "iderms-api";
        String passwd = "718ba61c52fc";

        String topic = "iderms/event/ftp-v2";
//        String topic = "topic";

        String msg = "test msg";

        //Receive message from Mqtt not Machine
        MQTT ReadFromOtherMQTT = new MQTT(url, client_id, username, passwd);
        ReadFromOtherMQTT.init(topic);
        ReadFromOtherMQTT.publish(msg, 2);
        ReadFromOtherMQTT.disconnect();

        System.exit(0);
//        Thread.interrupted();
    }
}
