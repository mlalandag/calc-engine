package com.pryzintul.calcengine;

import com.pryzintul.calcengine.services.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.zeebe.client.api.response.ActivatedJob;
import io.zeebe.client.api.worker.JobClient;
import io.zeebe.spring.client.EnableZeebeClient;
import io.zeebe.spring.client.annotation.ZeebeWorker;

import java.time.Instant;

@EnableZeebeClient
@SpringBootApplication
public class CalcEngineApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(CalcEngineApplication.class, args);
	}

	@ZeebeWorker(type = "evaluate", name = "evaluate-worker")
	public void evaluate(final JobClient client, final ActivatedJob job) {
		Integer result = calculatorService.evaluate(??);
		logger.info("Result = " + result);
		client.newCompleteCommand(job.getKey()).send().join();
	}

}
