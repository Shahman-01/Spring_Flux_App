package shah.flux.catalizator.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import shah.flux.catalizator.domain.Message;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}
