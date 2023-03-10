package shah.flux.catalizator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import shah.flux.catalizator.domain.Message;

@RestController
@RequestMapping("/controller")
public class MainController {
	@GetMapping
	public Flux<Message> list(
			@RequestParam(defaultValue = "0") Long start,
			@RequestParam(defaultValue = "3") Long count
	) {
		return Flux
				.just(
						"Hello reactive!",
						"More then one",
						"Third post",
						"Fourth post"
				)
				.skip(start)
				.take(count)
				.map(Message::new);
	}
}
