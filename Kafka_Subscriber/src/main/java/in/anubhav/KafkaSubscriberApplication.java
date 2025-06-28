package in.anubhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.anubhav.constant.AppConstants;

@SpringBootApplication
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC, groupId="group_ashokit_order")
	public void subscribeMsg(String order) {
	System.out.print("*** Msg Recieved From Kafka *** :: ");
	System.out.println(order);
	//logic
	} 

}
