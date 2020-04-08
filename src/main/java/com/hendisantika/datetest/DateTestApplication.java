package com.hendisantika.datetest;

import com.hendisantika.datetest.entity.RekapLive;
import com.hendisantika.datetest.repository.RekapLivaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

@SpringBootApplication
public class DateTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(DateTestApplication.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean
  public CommandLineRunner demo(RekapLivaRepository rekapLivaRepository) {
    Instant now = Instant.now(); // current date
    return (args) -> {
      for (int i = 1; i <= 10; i++) {
        Instant before = now.minus(Duration.ofDays(i));
        Date dateBefore = Date.from(before);
        rekapLivaRepository.save(
                new RekapLive("A00" + i, dateBefore, "KD00" + i, 50, 10, dateBefore));
      }
    };
  }
}
