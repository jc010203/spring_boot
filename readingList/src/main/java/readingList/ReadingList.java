package readingList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ReadingList extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {
        SpringApplication.run(ReadingList.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addRedirectViewController("/","/readingList");
    }
}
