package edu.icet.crm.service;

import edu.icet.crm.model.User;

public interface UserService {
    public boolean login(User user);
    public String register(User user);
}
