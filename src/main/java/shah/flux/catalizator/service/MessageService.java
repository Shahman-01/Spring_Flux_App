package shah.flux.catalizator.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import shah.flux.catalizator.domain.Message;
import shah.flux.catalizator.repo.MessageRepo;

import java.util.List;

@Service
public class MessageService {
	private final MessageRepo messageRepo;


	public MessageService(MessageRepo messageRepo) {
		this.messageRepo = messageRepo;
	}

	public Flux<Message> list() {
		return messageRepo.findAll();
	}

	public Mono<Message> addOne(Message message) {
		return messageRepo.save(message);
	}
}
