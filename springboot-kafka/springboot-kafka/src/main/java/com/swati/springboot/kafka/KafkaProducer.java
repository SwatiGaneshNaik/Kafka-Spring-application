package com.swati.springboot.kafka;

import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}



	public void sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send("rb", message);
	}
}
