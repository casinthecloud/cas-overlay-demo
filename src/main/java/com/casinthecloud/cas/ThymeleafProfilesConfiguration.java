package com.casinthecloud.cas;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.core.env.Environment;

@AutoConfiguration
public class ThymeleafProfilesConfiguration {

    @Bean("profiles")
    public ProfilesHelper profiles(Environment environment) {
        return new ProfilesHelper(environment);
    }

    public static class ProfilesHelper {
        private final Environment environment;

        public ProfilesHelper(Environment environment) {
            this.environment = environment;
        }

        public List<String> all() {
            return Arrays.asList(environment.getActiveProfiles());
        }

        public boolean has(String profile) {
            return all().contains(profile);
        }

        public boolean hasAny(String... profileNames) {
            return Arrays.stream(profileNames).anyMatch(this::has);
        }
    }
}