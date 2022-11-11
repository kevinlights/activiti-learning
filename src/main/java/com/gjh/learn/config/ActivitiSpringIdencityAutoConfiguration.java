package com.gjh.learn.config;

import com.google.common.collect.ImmutableList;
import org.activiti.api.runtime.shared.identity.UserGroupManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * created on 2022/11/11
 *
 * @author kevinlights
 */
@Configuration
public class ActivitiSpringIdencityAutoConfiguration {
    @Bean
    public UserGroupManager userGroupManager() {
        return new UserGroupManager() {
            @Override
            public List<String> getUserGroups(String username) {
                return ImmutableList.of("指定用户归属组");
            }

            @Override
            public List<String> getUserRoles(String username) {
                return null;
            }

            @Override
            public List<String> getGroups() {
                return null;
            }

            @Override
            public List<String> getUsers() {
                return null;
            }
        };
    }
}
