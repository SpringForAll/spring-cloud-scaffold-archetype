package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MainClass
 * TODO 请把"Bootstrap"改为组件-服务名的启动类名，如XxcYysApplication,XxcYysApp
 */
@SpringBootApplication(scanBasePackages = {"com.hikvision.ga.common.boot", "${package}"})
public class Bootstrap {
  
  public static void main(String[] args) {
    SpringApplication.run(Bootstrap.class, args);
  }

}
