package com.logistics.exception;

public class UserNotExistException extends RuntimeException {

    private static final long serialVersionUID = 7440796745767071688L;

    private String id;
    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
