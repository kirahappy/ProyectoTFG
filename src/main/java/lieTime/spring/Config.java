package lieTime.spring;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import lieTime.repository.MentiraRepository;
import lieTime.service.MentiraService;

@Configuration
public class Config {

	@Bean
	public MentiraService mentiraService(MentiraRepository mentiraRepository) {
		return new MentiraService(mentiraRepository);
	}
}
