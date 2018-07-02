package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap
 */
@SpringBootApplication(scanBasePackages = {"com.spring4all.scaffold", "${package}"})
public class Bootstrap {

  public static void main(String[] args) {
    SpringApplication.run(Bootstrap.class, args);
  }

}
