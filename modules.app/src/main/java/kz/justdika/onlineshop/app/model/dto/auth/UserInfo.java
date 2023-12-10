package kz.justdika.onlineshop.app.model.dto.auth;

import kz.justdika.onlineshop.app.model.enums.Roles;

import java.util.List;

public class UserInfo {
    public Integer userId;
    public String name;
    public List<Roles> roles;
}
