package in.anubhav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.anubhav.constant.AppConstants;
import in.anubhav.model.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public String addMsg(Order order) {

		// publish msg to kafka topic
		kafkaTemplate.send(AppConstants.TOPIC, order);

		return "Msg Published To Kafka Topic";
	}

}
