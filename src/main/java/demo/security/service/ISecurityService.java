package demo.security.service;

public interface ISecurityService {
    String findLoginUsername();
    void login(String username, String password);
}
