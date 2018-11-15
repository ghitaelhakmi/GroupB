package org.mql.platform.business.impl;

import org.mql.platform.business.AuthenticationService;
import org.mql.platform.models.User;
import org.springframework.stereotype.Service;

@Service
public class DefaultAuthenticationService implements AuthenticationService {

  @Override
  public User login(String username, String password) {
    
    return null;
  }
}
