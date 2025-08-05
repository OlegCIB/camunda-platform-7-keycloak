package org.cibseven.extension.keycloak.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.Ordered;

public class KeycloakConfigurationFilterRegistrationBean extends FilterRegistrationBean {

    public KeycloakConfigurationFilterRegistrationBean(KeycloakCockpitConfiguration keycloakCockpitConfiguration, String cibsevenWebappApplicationPath) {
        setFilter(new KeycloakCockpitConfigurationFilter(keycloakCockpitConfiguration));
        setOrder(Ordered.HIGHEST_PRECEDENCE);
        addUrlPatterns(cibsevenWebappApplicationPath + KeycloakCockpitConfigurationFilter.KEYCLOAK_OPTIONS_PATH);
    }
}
