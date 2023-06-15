package dk.addvanced.docker;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class BuildInfoConfiguration {

    private final BuildProperties buildProperties;

    public BuildInfoConfiguration(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @PostConstruct
    public void init() {
        printVersion();
    }

    public void printVersion() {
        log.info("Application Version: {}", buildProperties.getVersion());
    }
}
