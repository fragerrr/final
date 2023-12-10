package kz.justdika.onlineshop.app.model.enums;

public enum Roles {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    public final String title;

    Roles(String title){
        this.title = title;
    }
}
